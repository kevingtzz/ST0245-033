#!/usr/bin/python
from lab03 import *

#:::::::::::::::::::::::::::list_mult test:::::::::::::::::::::::::::#
list = [1,2,3,4]
print (list_mult(list))
#:::::::::::::::::::::::::::smartInsert test:::::::::::::::::::::::::#
list = [1,2,3,4,5,6,7,8,9]
smartInsert(list, 10)
smartInsert(list, 11)
smartInsert(list, 9)
smartInsert(list, 7)
smartInsert(list, 0)
print (list)

#::::::::::::::::::::::::::Fridges Orders::::::::::::::::::::::::::::#
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
