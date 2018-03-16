#!/usr/bin/python

class Stack():
    """This class represent an stack"""
    def __init__(self):
        self.items = []

    def add(self, value):
        self.items.append(value)

    def pop(self):
        if self.empty():
            return None
        return self.items.pop()

    def empty(self):
        if len(self.items) == 0:
            return True
        return False

    def printStack(self):
        """
        this method print the stack.
        """
        print (self.items)

    def size(self):
        return len(self.items)
