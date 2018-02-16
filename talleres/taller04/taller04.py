#!/usr/bin/python
import random
import pylab as pl
import time

def array_generator(len):
    """List generator"""
    array = [0] * len
    for i in range(len):
        array[i] = random.randrange(0,100)

    return array

def array_sum(array, sum = 0):
    """Add the elements in the list"""
    for element in array:
        sum += element

    return sum

def multiplication_tables(n):
    for i in range(1,n + 1):
        for j in range(1,n + 1):
            print str(i) + " * " + str(j) + " = " + str(i*j)
        print "--------------------"

def insertion_sort(list):
    for index in range(len(list)):
        for j in range(index,0,-1):
            if list[j-1] > list[j]:
                tmp = list[j]
                list[j] = list[j-1]
                list[j-1] = tmp

def arrayMax(arr):
    return arrayMax_aux(arr, 0, 0)

def arrayMax_aux(arr, i, max):
    if i == len(arr):
        return max
    else:
        if arr[i] > max:
            max = arr[i]
        return arrayMax_aux(arr, i+1, max)

def groupSum_aux(list, start, target):
    if start >= len(list): return target == 0
    return groupSum_aux(list, start + 1, target - list[start]) \
            or groupSum_aux(list, start + 1, target)

def groupSum(list, target):
    return groupSum_aux(list, 0, target)

#----------------------------Fibonacci---------------------------------#

def fib_r(n):                             #Fibonacci recursivo
    if n <= 1: return n
    return fibonacci(n-1) + fibonacci(n-2)

def fib_i(n):               #Fibonacci iterativo
    a, b = 0, 1
    for i in range(n):
        a, b = b, a+b
        return a

X,Y,Z = [],[],[]

for i in range(30):
    X.append(i)
    t = time.time()
    Z.append(fibonacci(i))
    Y.append(time.time()-t)

print(Z) #sucession de Fibonacci
pl.xlabel('Numero de Fibonacci')
pl.ylabel('Tiempo de ejecucion')
pl.title('Fibonacci')
pl.plot(X,Y,'r') # n(Dominio) contra tiempo(Rango)
pl.legend(( 'Complejidad_recursion', ) )
pl.savefig("Fibor.png")  # produce a .png file
pl.show()
