#!/usr/bin/python

class ArrayList:

    __elements = []

    def __init__(self):
        self.__elements = []

    def size(self):
        return len(self.elements)

    def get(self, index):
        return __elements[index]

    def add(self, object):
        self.__elements.append(object)

    def addInIndex(self, index, object):
        self.__elements = __elements[:index+1]+[object]+__elements[index:]

arr = new ArrayList()
arr.add(23)
print arr
