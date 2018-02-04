#!/usr/bin/python
import math

class Counter():
    """counter."""
    x = 0;

    def increase(self):
        self.x = self.x + 1

    def increments(self):
        return self.x

    def toString(self):
        print str(self.x)
        
counter = Counter()

con = range(10)
for i in con:
    counter.increase()
    counter.toString()
