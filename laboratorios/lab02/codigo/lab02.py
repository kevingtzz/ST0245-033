#!/usr/bin/python
import random
import time
import sys

sys.setrecursionlimit(1000000)

def array_generator(len):
    """
    Generates a list with random values
    :param len: (integer) lenght of the new array
    :returns: list
    """
    return [(int)(-100*random.random()+100) for e in range(len)]

def Rarray_sum(list):
    """
    Add all the values in the list recursively
    :param list: list
    :returns: Integer
    """
    return __Rarray_sum_aux(list, 0, 0)

def __Rarray_sum_aux(array, index, sum):
    if index >= len(array):
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

arr = array_generator(100000)
timeinit = time.time()
sum = Iarray_sum(arr)
alghttime = (time.time() - timeinit)
print (sum)
print (alghttime)

print ("---------------")
arrt = array_generator(10000)
timeinit = time.time()
sum = Rarray_max(arrt)
alghttime = (time.time() - timeinit)
print (sum)
print (alghttime)
