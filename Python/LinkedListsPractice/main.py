from linked_list.linked_list import LinkedList
from doubly_linked_list.double_linked_list import DoublyLinkedList

# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    print('-----------------------------------------------------------------------------------')
    print("Implementing a LinkedList object")
    print('-----------------------------------------------------------------------------------')

    linked_list = LinkedList()

    linked_list.add(100)
    linked_list.add(200)
    linked_list.add(300)
    linked_list.add(400)

    linked_list.insert_at(2, 250)

    linked_list.print_all()

    print('-----------------------------------------------------------------------------------')
    print(F"Returning index 0: {linked_list.get(0)}")
    print('------------------------------------------------------------------------------------')

    print('-----------------------------------------------------------------------------------')
    print(F"Returning index 1: {linked_list.get(1)}")
    print('------------------------------------------------------------------------------------')
    print('-----------------------------------------------------------------------------------')
    print(F"Returning index 2: {linked_list.get(2)}")
    print('------------------------------------------------------------------------------------')
    print(F"Returning index 3: {linked_list.get(3)}")
    print('------------------------------------------------------------------------------------')
    print(F"Returning index 4: {linked_list.get(4)}")

    print('-----------------------------------------------------------------------------------')
    print(F"Returning index 5: {linked_list.get(5)}")

    print('-----------------------------------------------------------------------------------')
    print(F"Returning index -1: {linked_list.get(-1)}")

    print('-----------------------------------------------------------------------------------')
    data_to_be_removed = linked_list.get(2)
    print(F"Removing index 2: {data_to_be_removed}")
    linked_list.remove_from(2)
    print('-----------------------------------------------------------------------------------')
    print(F"Contains {data_to_be_removed}: {linked_list.contains(data_to_be_removed)}")
    print('-----------------------------------------------------------------------------------')
    data_to_be_removed = linked_list.get(3)
    print(F"Removing index 3: {data_to_be_removed}")
    linked_list.remove_from(3)
    print('-----------------------------------------------------------------------------------')
    print(F"Contains {data_to_be_removed}: {linked_list.contains(data_to_be_removed)}")
    print('-----------------------------------------------------------------------------------')
    linked_list.print_all()
    print('-----------------------------------------------------------------------------------')
    print('-----------------------------------------------------------------------------------')
    print("Implementing a Doubly Linked List object")
    print('-----------------------------------------------------------------------------------')
    doubly_linked_list = DoublyLinkedList(10)
    doubly_linked_list.append(100)
    doubly_linked_list.append(200)
    doubly_linked_list.append(300)

    doubly_linked_list.prepend(75)
    print(F"This is the length: {doubly_linked_list.get_length()}")
    doubly_linked_list.print_all()
    print('-----------------------------------------------------------------------------------')
    doubly_linked_list.print_all_reverse()
    print(F"This is the length: {doubly_linked_list.get_length()}")
    print('-----------------------------------------------------------------------------------')

    print("This is the data at index 5: " + str(doubly_linked_list.get_data_at_index_or_null(5)))
    print('-----------------------------------------------------------------------------------')

    print("This is the data at index 0: " + str(doubly_linked_list.get_data_at_index_or_null(0)))
    print('-----------------------------------------------------------------------------------')

    print("This is the data at index 1: " + str(doubly_linked_list.get_data_at_index_or_null(1)))
    print('-----------------------------------------------------------------------------------')

    print("This is the data at index 2: " + str(doubly_linked_list.get_data_at_index_or_null(2)))
    print('-----------------------------------------------------------------------------------')

    print("This is the data at index 3: " + str(doubly_linked_list.get_data_at_index_or_null(3)))
    print(F"This is the length: {doubly_linked_list.get_length()}")
    print('-----------------------------------------------------------------------------------')
    print("Adding new node at index 4: 90")
    doubly_linked_list.insert_at(4, 90)
    print(F"This is the length: {doubly_linked_list.get_length()}")
    print('-----------------------------------------------------------------------------------')
    doubly_linked_list.print_all_reverse()
    print('-----------------------------------------------------------------------------------')
    print("Removing node at index 1")
    doubly_linked_list.remove(1)
    print(F"This is the length: {doubly_linked_list.get_length()}")
    print('-----------------------------------------------------------------------------------')
    doubly_linked_list.print_all()
    print('-----------------------------------------------------------------------------------')
    print("Removing node at index 3")
    doubly_linked_list.remove(3)
    print(F"This is the length: {doubly_linked_list.get_length()}")
    print('-----------------------------------------------------------------------------------')
    doubly_linked_list.print_all()
    print('-----------------------------------------------------------------------------------')