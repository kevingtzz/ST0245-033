#!/usr/bin/python
from lab03 import *
from LinkedList import *

print(":::::::::::::::::::::::::::list_mult test::::::::::::::::::::::::::::::\n")
list = [1,2,3,4]
print (list_mult(list))
print ("\n")

print(":::::::::::::::::::::::::::smartInsert test:::::::::::::::::::::::::\n")
list = [1,2,3,4,5,6,7,8,9]
smartInsert(list, 10)
smartInsert(list, 11)
smartInsert(list, 9)
smartInsert(list, 7)
smartInsert(list, 0)
print (list)
print ("\n")

print ('::::::::::::::::::::::::::Fridges Orders::::::::::::::::::::::::::::\n')

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
print ("\n")

print(":::::::::::::::::::::::::      Balance       :::::::::::::::::::::::::::::\n")
list1 = [10,20,5,3,20,10]
list2 = [10,2,4,8]
list3 = [10,2,5,2,11]

balance(list1)
balance(list2)
balance(list3)
print ("\n")

print("::::::::::::::::::::::::::::Start-End (Correct order):::::::::::::::::::::::\n")

print (start_end("This_is_a[Beiju_]_text_[[]][][]Happy_birthday_to_Tsinghua_University"))
print ("\n")

print("::::::::::::::::::::::::::::Circular LinkedList Implementation::::::::::::::\n")

lista = LinkedList()
lista.add_start("addstart")
lista.append("append")
lista.append("append2")
lista.add_start("addstart2")
lista.insert(3, 'insert')
lista.delete_end()
lista.delete_start()
lista.delete(0)
print (lista.get(1))
lista.add_start(1)
lista.append(234)
lista.append(52345)
lista.append(8)
lista.append(344)
lista.append(523)
lista.append(8869)
print (lista.contains(8))
print (lista.contains(5))
print (lista.contains("append"))
print(lista.__str__())
print ("\n")

print("::::::::::::::::::::::::::::::::1.7 (Bank queues):::::::::::::::::::::::::::\n")

fila1 = ["kevin", "carolina", "david", "yorman", "cana", "yasuri", "Laura"]
fila2 = ["miguel", "pipe", "flor", "jeffrey", "Pamela"]
fila3 = ["alejo", "soda", "cesar", "jose", "mateo", "coco", "luis", "andrea", "Camila"]
fila4 = ["manuela", "chicle", "bladimir", "Rogelio", "Ramon"]
test = Bank(fila1, fila2, fila3, fila4)
test.attend()
