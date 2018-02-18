#!/usr/bin/python
import random
import sys
#import numpy as np

def array_generator(len):
    """List generator"""
    if 
    array = [0] * len
    for i in range(len):
        array[i] = random.randrange(0,100)

    return array








"""sys.setrecursionlimit(10000000)

def array_sum_aux(array, i, sum):
    """Add the elements in the list"""
    if i == len(array):
        return sum
    else:
        sum += array[i]
        return array_sum_aux(array, i + 1, sum)

def array_sum(array):
    """This method call array_sum_aux"""
    return array_sum_aux(array, 0, 0)

arr = array_generator(10000000)
print array_sum(arr)"""
