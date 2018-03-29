#!/usr/bin/python

class LinkedList:
    """
    Double linked circular list Implementation.
    @Author: Kevin Gutierrez
    """

    class Node:
        """
        Implementation of the
        LinkedList's node.
        """

        def __init__(self, data):
            """
            Creates a new Node.
            :param data: The node's data.
            """
            self.data  = data
            self.siguiente = None
            self.anterior  = None


    def __init__(self):
        """
        Creates a new LinkedList.
        Initializes the cabeza and cola node
        to None; and its size to 0.
        """
        self.cabeza = None
        self.cola   = None


    def empty(self):
        return self.cabeza == None


    def add_start(self, data):
        """
        Adds an element at the start of the
        LinkedList.
        :param data: The new Node data.
        :return: Void
        """
        if self.empty():
            self.cabeza = self.cola = self.Node(data)
        else:
            aux = self.Node(data)
            aux.siguiente = self.cabeza
            self.cabeza.anterior = aux
            self.cabeza = aux
        self.__CircularLink()


    def append(self, data):
        """
        Adds an element to the end of
        the list.
        :param data: The new Node data.
        :return: Void
        """
        if self.empty():
            self.cabeza = self.cola = self.Node(data)
        else:
            aux = self.Node(data)
            aux.anterior = self.cola
            self.cola.siguiente = aux
            self.cola = aux
        self.__CircularLink()


    def __CircularLink(self):
        self.cola.siguiente = self.cabeza
        self.cabeza.anterior = self.cola


    def insert(self, index, data):
        current = self.cabeza
        for i in range(index-1):
            current = current.siguiente
        tmp = self.Node(data)
        current.anterior.siguiente = tmp
        tmp.anterior = current.anterior
        tmp.siguiente = current
        current.anterior = tmp


    def delete_end(self):
        """
        Deletes the last element on the
        LinkedList.
        :return: Void
        """

    def delete_start(self):
        """
        Deletes the first element
        on the LinkedList.
        :return: Void
        """

    def delete(self, i):
        """
        Deletes the element at position i.
        :param i: Element's index
        :return: Void
        """


    def get(self, i):
        """
        Returns the ith linked element.
        :param index:
        :return: Node
        """


    def print_reversed(self):
        """
        Prints the list in reverse order.
        :return: Void
        """


    def __str__(self):

        if self.cabeza == None:
            return "[]"
        current = self.cabeza
        s = "[" + str(current.data)
        while True:
            if current != self.cola:
                current = current.siguiente
                s += ", " + str(current.data)
            else:
                break

        return s + "]"


    def __len__(self):
        return self.size

lista = LinkedList()
lista.add_start("addstart")
lista.append("append")
lista.append("append2")
lista.add_start("addstart2")
lista.insert(3, 'insert')

print(lista.__str__())
