#!/usr/bin/python

class Nodo():
    def __init__(self, obj=None, nxt = None):
        self.obj = obj
        self.nxt = nxt
        self.indx = indx

    def __str__(self):
        return "" + self.obj

class Lsimple():
    def __init__(self):
        self.first_Node = None
        self.last_Node = None

    def __void(self):
        return self.fisrt_Node == None

    def insert(self, element):
        if self.__void() == True:
            self.fisrt_Node = self.last_Node = Nodo(element)
        else:
            aux = self.last_Node
            self.last_Node = aux.nxt = Nodo(element)

    def print_list(self):
        aux = self.fisrt_Node
        while aux != None:
            print(aux.element)
            aux = aux.nxt

lista = Lsimple()
lista.insert(2)
lista.insert(5)
lista.insert(8)
lista.insert(345)
lista.insert(76453)
lista.print_list()
