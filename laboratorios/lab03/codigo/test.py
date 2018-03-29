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

#:::::::::::::::::::::::::      Balance       :::::::::::::::::::::::::::::#
list1 = [10,20,5,3,20,10]
list2 = [10,2,4,8]
list3 = [10,2,5,2,11]

balance(list1)
balance(list2)
balance(list3)

#::::::::::::::::::::::::::::Start-End (Correct order):::::::::::::::::::::::#
print (start_end("This_is_a[Beiju_]_text_[[]][][]Happy_birthday_to_Tsinghua_University"))

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
