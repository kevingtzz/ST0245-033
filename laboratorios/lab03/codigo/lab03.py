#!/usr/bin/python
from Stack import Stack

def list_mult(list):
     """
     This function multiplies each numerical element in the entered list.
     :param list: list with numerical values.
     :returns: numerical value.
     """
     result = 1
     for value in list:
         result *= value
     return result

def smartInsert(list, data):
    """
    This method insert a non-repeated value in the entered list.
    :param list: list to enter data.
    :param data: value to compare and enter.
    """
    repeated = False
    for value in list:
        if value == data:
            repeated = True
    if repeated == False:
        list.append(data)

def get_order(orders, fridges):
    for order in orders:
        


fridges = Stack()
orders = []

for i in range(21):
    fridges.add((i, "Esta es la nevera No." + str(i)))

orders.append(["tienda de pedro", 5])
orders.append(["tienda de juan", 2])
orders.append(["tienda de arnulfo",4])
orders.append(["tienda de mateo", 7])
orders.append(["tienda de jose", 1])
orders.append(["tienda de carolina",1])
orders.append(["tienda de va der waals",2])
orders.append(["tienda de hugo", 2])
orders.append(["tienda de caterine",1])
fridges.printStack()
