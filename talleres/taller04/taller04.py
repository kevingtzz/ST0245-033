#!/usr/bin/python
import random

def array_generator(len):
    """Generador de arrays"""
    array = [0] * len
    for i in range(len):
        array[i] = random.randrange(0,100)

    return array

def array_sum(array, sum = 0):
    """Suma elementos de el arreglo que reciba"""
    for element in array:
        sum += element

    return sum

def multiplication_tables(n):
    for i in range(1,n + 1):
        for j in range(1,n + 1):
            print str(i) + " * " + str(j) + " = " + str(i*j)
        print "--------------------"
