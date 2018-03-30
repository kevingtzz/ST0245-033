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


    def __empty(self):
        return self.cabeza == None


    def add_start(self, data):
        """
        Adds an element at the start of the
        LinkedList.
        :param data: The new Node data.
        :return: Void
        """
        if self.__empty():
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
        if self.__empty():
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
        """
        insert data in given index.
        :param index: Integer index.
        :param data: Anything.
        :returns: voidself.
        """
        if self.cabeza != None:
            current = self.cabeza
            for i in range(index-1):
                current = current.siguiente
            tmp = self.Node(data)
            current.anterior.siguiente = tmp
            tmp.anterior = current.anterior
            tmp.siguiente = current
            current.anterior = tmp
        else:
            self.cabeza = self.cola = self.Node(data)
            self.__CircularLink()


    def delete_end(self):
        """
        Deletes the last element on the
        LinkedList.
        :return: Void
        """
        if self.cabeza != None:
            self.cola.anterior.siguiente = self.cabeza
            self.cabeza.anterior = self.cola.anterior
            self.cola = self.cola.anterior
        else:
            print ("The list is empty")

    def delete_start(self):
        """
        Deletes the first element
        on the LinkedList.
        :return: Void
        """
        if self.cabeza != None:
            self.cabeza = self.cabeza.siguiente
            self.cabeza.anterior = self.cola
        else:
            print ("the list is empty.")

    def delete(self, index):
        """
        Deletes the element at position i.
        :param i: Element's index
        :return: Void
        """
        if self.__empty():
            print ("The list is empty.")
        else:
            current = self.cabeza
            for node in range(index):
                current = current.siguiente
                if current == self.cola:
                    self.delete_end()
                elif current == self.cabeza:
                    self.delete_start()
                else:
                    current.anterior.siguiente = current.siguiente
                    current.siguiente.anterior = current.anterior



    def get(self, index):
        """
        Returns the ith linked element.
        :param index:
        :return: Node
        """
        if self.__empty():
            return None
        current = self.cabeza
        for node in range(index):
            current = current.siguiente
        return current.data


    def contains(self, data):
        if self.__empty():
            return False
        current = self.cabeza
        while True:
            if current.data == data:
                return True
            current = current.siguiente
            if current == self.cola:
                break
        return False



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
