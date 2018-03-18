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
    """
    This function returns a list with the refrigerators sales
    that correspond to each client according to the order of the order;
    if there are no refrigerators, they will be assigned "pending"
    for further treatment.

    Args:
        client (list): customers[("customer name", number of fridges), ...]
        fridges (list): list of available fridges[("fridge description", fridge serial), ...]
    returns:
        list: [("customer's name", [fridges assigned, ...]), ...]
    """
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

def start_end(str):
    """
    This function reorders the string, correcting the errors caused by
    the expressions '[' and ']' that symbolize the
    "start" and "end" keys on a conventional keyboard.

    Args:
        str (str): any text to reorder
    returns:
        nstr (str): The text reordered
    """
    start = True
    index = 0
    lstr  = []
    nstr  = ""
    for char in str:
        if char == '[':
            start = True
            index = 0
            continue
        elif char == ']':
            start = False
            continue
        elif char != '[' and char != ']':
            if start:
                lstr.insert(index , char)
                index += 1
            else:
                lstr.append(char)
    for letter in lstr:
        nstr += letter
    return nstr
