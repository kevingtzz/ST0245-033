#!/usr/bin/python

def Iarray_sum(array):
    """(list) -> int
    returns the sum of all values in the list."""
    return __Iarray_sum_aux(array, 0, 0)

def __Iarray_sum_aux(array, index, sum):
    if index == len(array):
        return sum
    sum = sum + array[index]
    return __Iarray_sum_aux(array, index+1, sum)
