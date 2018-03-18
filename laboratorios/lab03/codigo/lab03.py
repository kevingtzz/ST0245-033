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

def balance(list):
    """
    This method calculates the optimal position for the
    symbolic placement of a pivot in a list, in
    such a way that the lateral summations are equitable.
    :param list: Python list
    """
    sum = 0
    sumaux = 0
    for value in list:
        sum += value
    for index in range(0,len(list)):
        sumaux += list[index]
        if sumaux >= sum/2:
            print ("The pivot must be on " + str(index) + " position.")
            break

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

def get_order(client, fridges):
    sales = []
    for order in client:
        frid  = []
        for fridge in range(0,order[1]):
            if fridges.empty():
                frid.append("pending order")
            else:
                frid.append(fridges.pop())
        sales.append((order[0],frid))
    return sales



fridges = Stack()
client = []

for i in range(21):
    fridges.add((i, "Esta es la nevera No." + str(i)))

client.append(["tienda de pedro", 5])
client.append(["tienda de juan", 2])
client.append(["tienda de arnulfo",4])
client.append(["tienda de mateo", 7])
client.append(["tienda de jose", 1])
client.append(["tienda de carolina",1])
client.append(["tienda de va der waals",2])
client.append(["tienda de hugo", 2])
client.append(["tienda de caterine",1])

print (get_order(client, fridges))

"""
list1 = [10,20,5,3,20,10]
list2 = [10,2,4,8]
list3 = [10,2,5,2,11]

balance(list1)
balance(list2)
balance(list3)
"""
