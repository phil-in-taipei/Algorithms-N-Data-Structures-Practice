import linkedList.LinkedList

fun main() {
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing linked list")
    val linkedList = LinkedList(head = null, tail = null)
    println("-----------------------------------------------------------------------------------------------------------")
    println("Adding 3 items")
    linkedList.add(1)
    linkedList.add(2)
    linkedList.add(3)
    println("-----------------------------------------------------------------------------------------------------------")
    println("These are the items in the linked list")
    linkedList.printAll()
    println("-----------------------------------------------------------------------------------------------------------")
    println("This is the length of the linked list: ${linkedList.length()}")
    println("-----------------------------------------------------------------------------------------------------------")
    println("It contains 2: ${linkedList.contains(2)}")
    println("-----------------------------------------------------------------------------------------------------------")
    println("It contains 4: ${linkedList.contains(4)}")
    println("-----------------------------------------------------------------------------------------------------------")
    println("It contains 1: ${linkedList.contains(1)}")
    println("-----------------------------------------------------------------------------------------------------------")
    println("It contains 3: ${linkedList.contains(3)}")
    println("-----------------------------------------------------------------------------------------------------------")
    println("This is the node with data of 1: ${linkedList.get(1).toString()}")
    println("-----------------------------------------------------------------------------------------------------------")
    println("This is the node with data of 0: ${linkedList.get(0).toString()}")
    println("-----------------------------------------------------------------------------------------------------------")
    println("Attempting to insert data")
    linkedList.insertAt(0, 4)
    println("-----------------------------------------------------------------------------------------------------------")
    println("These are the items in the linked list")
    linkedList.printAll()
    println("-----------------------------------------------------------------------------------------------------------")
    println("Attempting to remove data")
    linkedList.remove(2)
    println("-----------------------------------------------------------------------------------------------------------")
    println("These are the items in the linked list")
    linkedList.printAll()
    println("-----------------------------------------------------------------------------------------------------------")
    println("Attempting to remove data")
    linkedList.remove(0)
    println("-----------------------------------------------------------------------------------------------------------")
    println("These are the items in the linked list")
    linkedList.printAll()
    println("-----------------------------------------------------------------------------------------------------------")
    println("Linked list length: ${linkedList.length()}")
    println("-----------------------------------------------------------------------------------------------------------")

}