from linked_list.linked_list import LinkedList


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
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
