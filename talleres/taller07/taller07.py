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

    def size(self):
        aux = self.first_Node
        lenght = 0
        while aux != none:
            lenght += 1
            aux = aux.nxt
        return lenght

    def remove(self):
        aux = self.first_Node
        while aux.nxt =! self.last_Node:
            aux = aux.nxt
        aux.nxt = None
        self.last_Node = aux

    def contains(self):
        aux = self.fisrt_Node
        while aux != None:
            print(aux.element)
            aux = aux.nxt

    def max_value(self):
        return __max_value_aux(first_Node, first_Node.element)

    def __max_value_aux(self, node, max):
        if node.nxt == None:
            return max
        else:
            if node.nxt.element > max:
                max = node.nxt.element
        return __max_value_aux(node.nxt, max)
        
