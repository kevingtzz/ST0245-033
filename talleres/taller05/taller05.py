#!/usr/bin/python
import random
from matplotlib import pyplot as pl
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
            print (str(i) + " * " + str(j) + " = " + str(i*j))
        print ("--------------------")

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

#-----------------------------GroupSum----------------------------------#

def groupSum_aux(list, start, target):
    if start >= len(list): return target == 0
    return groupSum_aux(list, start + 1, target - list[start]) \
            or groupSum_aux(list, start + 1, target)

def groupSum(list, target):
    return groupSum_aux(list, 0, target)

#----------------------------Fibonacci---------------------------------#

def fib_r(n):                             #Fibonacci recursivo
    if n <= 1: return n
    return fib_r(n-1) + fib_r(n-2)

def fib_i(n):                             #Fibonacci iterativo
    a, b = 0, 1
    for i in range(n):
        a, b = b, a+b
    return a

#------------------------------Graphycs--------------------------------#

def graph(function, n, name, color, X = [],Y = [],Z = []):
    #Enter the function to test in attribute "function"
    #Enter the number of iterations do you want to try in "n"
    #Enter the color of the plot like this red: 'r', blue: 'b'

    for i in range(n):
        X.append(i)
        t = time.time()
        Z.append(function(i))
        Y.append(time.time()-t)

    print(Z) #this print all i's fibonacci i a  list
    pl.xlabel("N'simo" +  name)
    pl.ylabel('Tiempo de ejecucion')
    pl.title(name)
    pl.plot(X,Y,color, label = name) # domain of x(n) vs time
    pl.legend()
    pl.savefig(name + ".png")  # produce a .png file
    pl.show()

tiempo = []
iteraciones = []
res = []

for i in range(20):
    array = array_generator(i)
    iteraciones.append(i)
    t = time.time()
    res.append(arrayMax(array))
    tiempo.append(time.time() - t)

print res
pl.xlabel("n array")
pl.ylabel("Tiempo de ejecucion")
pl.title("ArrayMax")
pl.plot(iteraciones, tiempo, 'r', label = "ArrayMax")
pl.legend((''))
pl.savefig("ArrayMax.png")
pl.show

graph(fib_i, 20, "fibonacci Iterativo", 'b')
