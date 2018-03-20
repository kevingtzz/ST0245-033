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
            self.cabeza = self.cola = Node(data)
        else:
            aux = Node(data)
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
            self.cabeza = self.cola = Node(data)
        else:
            aux = Node(data)
            aux.anterior = self.cola
            self.cola.siguiente = aux
            self.cola = aux
        self.__CircularLink()

    def insert(self, data):
        aux = Node(data)
        for i

    def __CircularLink(self):
        self.cola.siguiente = self.cabeza
        self.cabeza.anterior = self.cola

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
        while current.next != None:
            current = current.next
            s += ", " + str(current.data)

        return s + "]"

    def __contains__(self, item):


    def __len__(self):
        return self.size

# --- Unit Tests
import unittest

class LinkedList_UnitTests(unittest.TestCase):

    linked_list = LinkedList()

    # Deletion

    def test_empty_linked_list(self):

        linked_list_1 = LinkedList()

        self.assertEqual(str(linked_list_1), "[]")

        linked_list_1.delete_end()
        self.assertEqual(str(linked_list_1), "[]")

        linked_list_1.add(5)

        self.assertEqual(str(linked_list_1), "[5]")

    def test_non_empty_linked_list(self):

        linked_list_1 = LinkedList()

        linked_list_1.add(6)
        linked_list_1.add_at_start(1)

        self.assertEqual(str(linked_list_1), "[1, 6]")

        linked_list_1.delete_end()

        self.assertEqual(str(linked_list_1), "[1]")

        linked_list_1.add_at_start(10)
        linked_list_1.delete_start()

        self.assertEqual(str(linked_list_1), "[1]")

        linked_list_1.add(15)
        linked_list_1.delete(0)

        self.assertEqual(str(linked_list_1), "[15]")

    # Insertion

    def test_insertion(self):

        linked_list_1 = LinkedList()

        linked_list_1.add_at_start(100)

        self.assertEqual(str(linked_list_1), "[100]")

        linked_list_1.add_at_start(200)
        linked_list_1.delete_end()

        self.assertEqual(str(linked_list_1), "[200]")

        linked_list_1.add(300)
        linked_list_1.add(500)
        linked_list_1.add_at_start(-100)

        self.assertEqual(str(linked_list_1), "[-100, 200, 300, 500]")

suite = unittest.TestLoader().loadTestsFromTestCase(LinkedList_UnitTests)
unittest.TextTestRunner(verbosity=2).run(suite)
