package doublyLinkedList

class DoublyLinkedList(
    var head: DLLNode?,
    var tail: DLLNode?,
    var size: Int = 0
) {

    fun append(data: Int) {
        val newNode = DLLNode(data=data, next=null, previous=null)
        if (size == 0) {
            head = newNode
        } else {
            newNode.previous = tail
            tail?.next = newNode;
        }
        tail = newNode
        size++
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

    fun get(index: Int): Int? {
        if (index >= 0 && index <= size -1) {
            var currentIndex = 0
            var currentNode = head
            while (currentIndex < index && currentNode != null) {
                currentNode = currentNode.next
                currentIndex++
            }
            if (currentIndex == index && currentNode !=null) {
                return currentNode.data
            }
        }
        return null
    }

    fun insertAt(index: Int, data: Int) {
        if (index < 0 ||  index > size) {
            return
        } else if (index == size){
            this.append(data)
        } else if (index == 0) {
            this.prepend(data)
        } else {
            var currentNode = head
            var currentIndex = 0
            while (currentIndex < index && currentNode != null) {
                currentNode = currentNode.next
                currentIndex++
            }
            if (currentIndex == index && currentNode != null) {
                val newNode = DLLNode(data=data, next=currentNode, previous=currentNode.previous)
                currentNode.previous?.next = newNode
                currentNode.previous = newNode
                size++
            }
        }
    }

    fun prepend(data: Int) {
        val newNode = DLLNode(data=data, next=null, previous=null)
        if (size == 0) {
            tail = newNode
        } else {
            newNode.next = head
            head?.previous = newNode
        }
        head = newNode
        size++
    }

    fun printAll() {
        println("************LinkedList***************")
        if (size > 0) {
            var currentNode = head
            while(currentNode != null) {
                if (currentNode == head) {
                    println("*-*-*-*-*-Head*-*-*-*-*-*-*-")
                }
                println(currentNode.data)
                if (currentNode == tail) {
                    println("*-*-*-*-*-Tail*-*-*-*-*-*-*-")
                }
                currentNode = currentNode.next
            }
        } else {
            println("The Linked List is currently empty")
        }
        println("************LinkedList***************")
    }

    fun removeFrom(index: Int) {
        if (index < 0 || index > size - 1) {
            return
        } else if (index == 0) {
            head = head?.next
            head?.previous = null
            size--
        } else if (index == size -1) {
            tail?.previous?.next = null
            tail = tail?.previous
            size--
        } else {
            var currentIndex = 0
            var currentNode = head
            while (currentIndex < index && currentNode != null) {
                currentIndex++
                currentNode = currentNode.next
            }
            if (currentIndex == index && currentNode != null) {
                currentNode.previous?.next = currentNode.next
                currentNode.next?.previous = currentNode.previous
                size--
            }
        }
    }
}