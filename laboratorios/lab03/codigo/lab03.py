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


class Bank:
    """
    Simulation of four bank queues attended by two employeesself.
    Args:
        list (queue1): A list of clients representing a queue.
        list (queue2): A list of clients representing a queue.
        list (queue3): A list of clients representing a queue.
        list (queue4): A list of clients representing a queue.
    """
    def __init__(self, queue1, queue2, queue3, queue4):
        self.queue1 = queue1
        self.queue2 = queue2
        self.queue3 = queue3
        self.queue4 = queue4

    def attend(self):
        """
        representation of the behavior of the rows of the bank
        to be served by two employees.
        Args:
            None.
        Returns:
            void.
        """
        while True:
            if len(self.queue1) != 0:
                print ("1 attends to " + self.queue1.pop(0))
            elif len(self.queue2) != 0:
                print ("1 attends to " + self.queue2.pop(0))

            if len(self.queue3) != 0:
                print ("2 attends to " + self.queue3.pop(0))
            elif len(self.queue4) != 0:
                print ("2 attends to " + self.queue4.pop(0))

            if len(self.queue2) != 0:
                print ("1 attends to " + self.queue2.pop(0))
            elif len(self.queue1) != 0:
                print ("1 attends to " + self.queue1.pop(0))

            if len(self.queue4) != 0:
                print ("2 attends to " + self.queue4.pop(0))
            elif len(self.queue3) != 0:
                print ("2 attends to " + self.queue3.pop(0))

            if len(self.queue3) == 0 and len(self.queue4) == 0:
                if len(self.queue1) >= len(self.queue2) and len(self.queue1) != 0:
                    self.queue3.append(self.queue1.pop())
                elif len(self.queue2) != 0:
                    self.queue3.append(self.queue2.pop())

            if len(self.queue1) == 0 and len(self.queue2) == 0:
                if len(self.queue3) >= len(self.queue4) and len(self.queue3) != 0:
                    self.queue2.append(self.queue3.pop())
                elif len(self.queue4) != 0:
                    self.queue3.append(self.queue4.pop())

            if len(self.queue1)+len(self.queue2)+len(self.queue3)+len(self.queue4) == 0:
                break
