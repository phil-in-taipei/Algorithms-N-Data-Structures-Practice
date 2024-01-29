package linkedList

class LinkedList(
    var head : Node?,
    var tail : Node?,
    //val maxLength : Int
) {

    fun add(data : Int) {
        val newNode = Node(data=data, next=null)
        if (head == null) {
            head = newNode
        } else {
            tail?.next = newNode
        }
        tail = newNode
    }

    fun contains(data: Int): Boolean {
        var currentNode = head
        while (currentNode != null) {
            if (currentNode.data == data) {
                return true
            }
            currentNode = currentNode.next
        }
        return false
    }

    fun get(data: Int): Node? {
        var currentNode = head
        while (currentNode != null) {
            if (currentNode.data == data) {
                return currentNode
            }
            currentNode = currentNode.next
        }
        return null
    }

    fun insertAt(index : Int, data : Int) {
        println("Insert at method called with index ($index) and data ($data)")
        val newNode = Node(data=data, next=null)
        if (index == 0) {
            newNode.next = head
            head = newNode
        } else {
            var currentIndex = 0
            var currentNode = head
            var previousNode : Node? = null
            while (currentIndex < index && currentNode != null) {
                previousNode = currentNode
                currentNode = currentNode.next
                currentIndex++
            }
            if (currentIndex == index) {
                newNode.next = currentNode
                previousNode!!.next = newNode
            }
        }
    }

    fun length(): Int {
        var length = 0
        var currentNode = head
        while(currentNode != null) {
            length++
            currentNode = currentNode.next
        }
        return length
    }

    fun printAll() {
        var currentNode = head
        while(currentNode != null) {
            println(currentNode.data)
            currentNode = currentNode.next
        }
    }

    fun remove(index : Int) {
        println("Remove method called with index ($index)")
        if (index == 0) {
            head = if (head?.next != null) {
                head!!.next
            } else {
                null
            }
        } else {
            var currentIndex = 0
            var currentNode = head
            var previousNode : Node? = null
            while (currentIndex < index && currentNode != null) {
                previousNode = currentNode
                currentNode = currentNode.next
                currentIndex++
            }
            if (currentIndex == index && currentNode != null) {
                previousNode!!.next = currentNode.next
            }
        }
    }

}