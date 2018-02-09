#!/usr/bin/python
import math

class Counter():
    """counter."""
    def __init__(self):
        self.__x = 0

    def increase(self):
        self.x = self.x + 1

    def increments(self):
        return self.x

    def toString(self):
        print str(self.x)
#
#counter = Counter()
#
#con = range(10)
#for i in con:
#    counter.increase()
#    counter.toString()
#
class Punto2D():
    """Representacion de punto en 2 dimenciones"""

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def get_x(self):
        return x

    def get_y(self):
        return y

    def radio_polar(self):
        return math.sqrt((x * x) + (y * y)

    def angulo_polar(self):
        return math.atan2(x / y)

    def dist_euclidiana(self, Punto2D other):
        dx = self.x - other.get_x()
        dy = self.y - other.get_y()
        return math.sqrt((dx * dx) + (dy * dy))
