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

table_Rarray_sum = {}
table_Rarray_max = {}
tinit = 0

tinit = time.time()
Rarray_sum(array_generator(5))
table_Rarray_sum["5"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_sum(array_generator(10))
table_Rarray_sum["10"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_sum(array_generator(15))
table_Rarray_sum["15"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_sum(array_generator(20))
table_Rarray_sum["20"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_sum(array_generator(25))
table_Rarray_sum["25"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_sum(array_generator(30))
table_Rarray_sum["30"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_sum(array_generator(35))
table_Rarray_sum["35"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_sum(array_generator(40))
table_Rarray_sum["40"] = [(time.time() - tinit)]

tinit = time.time()
Rarray_max(array_generator(5))
table_Rarray_max["5"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_max(array_generator(10))
table_Rarray_max["10"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_max(array_generator(15))
table_Rarray_max["15"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_max(array_generator(20))
table_Rarray_max["20"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_max(array_generator(25))
table_Rarray_max["25"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_max(array_generator(30))
table_Rarray_max["30"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_max(array_generator(35))
table_Rarray_max["35"] = [(time.time() - tinit)]
tinit = time.time()
Rarray_max(array_generator(40))
table_Rarray_max["40"] = [(time.time() - tinit)]

tinit = time.time()
Rfibonacci(5)
table_Rfibonacci["5"] = [(time.time() - tinit)]
tinit = time.time()
Rfibonacci(10)
table_Rfibonacci["10"] = [(time.time() - tinit)]
tinit = time.time()
Rfibonacci(15)
table_Rfibonacci["15"] = [(time.time() - tinit)]
tinit = time.time()
Rfibonacci(20)
table_Rfibonacci["20"] = [(time.time() - tinit)]
tinit = time.time()
Rfibonacci(25)
table_Rfibonacci["25"] = [(time.time() - tinit)]
tinit = time.time()
Rfibonacci(30)
table_Rfibonacci["30"] = [(time.time() - tinit)]
tinit = time.time()
Rfibonacci(35)
table_Rfibonacci["35"] = [(time.time() - tinit)]
tinit = time.time()
Rfibonacci(40)
table_Rfibonacci["40"] = [(time.time() - tinit)]

#Iarray_sum(array_generator(5))
#Iarray_sum(array_generator(10))
#Iarray_sum(array_generator(15))
#Iarray_sum(array_generator(20))
#Iarray_sum(array_generator(25))
#Iarray_sum(array_generator(30))
#Iarray_sum(array_generator(35))
#Iarray_sum(array_generator(40))
