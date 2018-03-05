#!/usr/bin/python
import random
from matplotlib import pyplot as pl
import time

def array_generator(len):
    """(integer) -> list
    returns a list with length = integer entered"""
    array = [0] * len
    for i in range(len):
        array[i] = random.randrange(0,100)
    return array

def Rarray_sum(array):
    """(list) -> integer
    returns the sum of all values in the list recursively."""
    return __Rarray_sum_aux(array, 0, 0)

def __Rarray_sum_aux(array, index, sum):
    if index == len(array):
        return sum
    sum = sum + array[index]
    return __Rarray_sum_aux(array, index+1, sum)

def Iarray_sum(array):
    """(list) -> integer
    returns the sum of all values in the list iteratively."""
    sum = 0
    for i in array:
        sum = sum + i
    return sum

def Rarray_max(arr):
    """(list) -> integer
    returns the maximun value in the entered list recursively."""
    return __Rarray_max_aux(arr, 0, 0)

def __Rarray_max_aux(arr, i, max):
    if i == len(arr):
        return max
    else:
        if arr[i] > max:
            max = arr[i]
        return __Rarray_max_aux(arr, i+1, max)

def Iarray_max(array):
    """(list) -> integer
    return the maximun value in the entered list iteratively."""
    max = 0
    for element in array:
        if element > max:
            max = element
    return max


def Rfibonacci(n):
    """(integer) -> integer
    returns the nth value of Fibonacci recursively."""
    if n <= 1:
        return n
    return Rfibonacci(n-2) + Rfibonacci(n-1)

def Ifibonacci(n):
    """(integer) -> integer
    returns the nth values of Fibonacci iteratively."""
    a, b = 0, 1
    for i in range(n):
        a, b = b, a+b
    return a

def insertion_sort(array):
    """(list) -> List
    returns the same list but sorted ascending."""
    for index in range(len(array)):
        for j in range(index,0,-1):
            if array[j-1] > array[j]:
                tmp = array[j]
                array[j] = array[j-1]
                array[j-1] = tmp

def mergeSort(array):
    """(list) -> List
    returns the same list but sorted ascending."""
    if len(array)>1:
        M = len(array)//2
        Lhalf = array[:M]
        Rhalf = array[M:]

        mergeSort(Lhalf)
        mergeSort(Rhalf)

        i=0
        j=0
        k=0
        while i < len(Lhalf) and j < len(Rhalf):
            if Lhalf[i] < Rhalf[j]:
                array[k]=Lhalf[i]
                i=i+1
            else:
                array[k]=Rhalf[j]
                j=j+1
            k=k+1

        while i < len(Lhalf):
            array[k]=Lhalf[i]
            i=i+1
            k=k+1

        while j < len(Rhalf):
            array[k]=Rhalf[j]
            j=j+1
            k=k+1

table_Rarray_sum = {}
table_Rarray_max = {}
table_Rfibonacci = {}
table_Iarray_sum = {}
table_Iarray_max = {}
table_insertionSort = {}
table_mergeSort = {}

tinit = 0

for element in range(5, 40, 5):
    tinit = time.time()
    Rarray_sum(array_generator(element))
    table_Rarray_sum["With "+element] = [(time.time() - tinit)]

for element in range(5, 40, 5):
    tinit = time.time()
    Rarray_max(array_generator(element))
    table_Rarray_max["With "+element] = [(time.time() - tinit)]

for element in range(5, 40, 5):
    tinit = time.time()
    Rfibonacci(array_generator(element))
    table_Rfibonacci["With "+element] = [(time.time() - tinit)]

for element in range(5, 40, 5):
    tinit = time.time()
    insertionSort(array_generator(element))
    table_insertionSort["With "+element] = [(time.time() - tinit)]

for element in range(5, 40, 5):
    tinit = time.time()
    mergeSort(array_generator(element))
    table_mergeSort["With "+element] = [(time.time() - tinit)]
