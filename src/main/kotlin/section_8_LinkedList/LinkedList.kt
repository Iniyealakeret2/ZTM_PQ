package section_8_LinkedList

class LinkedList<T> {
    //STEP 2
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    var size: Int = 0
    //if the LinkedList is is Empty
    private fun isEmpty(): Boolean = size == 0
    //formatting the output
    override fun toString(): String {
        return if(isEmpty()) "Empty List" else "$head"
    }

    /** ADDING VALUES TO BEGINNING LINKEDLIST */
    // STEP 3 (PUSH OPERATION)
    //Adding a value at the front of the list is known as a push operation.
    //This is also known as head-first insertion
    fun push(value:T){
        head = Node(value = value, next = head)
        if (tail == null){
            tail = head
        }
         size++
    }

    /** ADDING VALUES TO END OF LINKEDLIST */
    //STEP 4(APPEND OPERATION)
    //This adds a value at the end of the list, which is known as tail-end insertion.
    fun append(value:T){
        if(isEmpty()){
            push(value)
            return
        }
        //create a new node
        tail?.next = Node(value = value)
        tail = tail?.next
        size++
    }

    /** ADDING VALUES TO A SPECIFIC NODE LINKEDLIST */
    //STEP 5 (INSERT OPERATION)
    //This operation inserts a value at a particular place in the list
    // STEP 5.a (find the index to insert)
    fun findNodeAt(index: Int): Node<T>?{
        // get the current node and current index
        var currentNode = head
        var currentIndex = 0
        while (currentNode != null && currentIndex < index){
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }
    // STEP 5.b(function to insert the found Node at that index)
    fun insert(value: T, afterNode: Node<T>): Node<T> {
        // checking if we have only one node in the list of
        if (tail == afterNode){
            append(value)
            return tail!!
        }
        // creating a new node
        val newNode = Node(value = value, next = afterNode.next)
        //setting our node value to the newNode
        afterNode.next = newNode
        size++
        return newNode
    }

    /** REMOVING VALUES LINKEDLIST OPERATIONS */

    /** ADDING VALUES TO A SPECIFIC NODE LINKEDLIST */
    //STEP 6 (POP OPERATION)
    //Removing a value at the front of the list is often referred to as pop.
    fun pop():T?{
        if(!isEmpty()) size--
        val result = head?.value //getting the value of head and returning it
        head = head?.next // moving the value of head down a node thereby eliminating the first value
        if (isEmpty()) tail = null
        return result
    }

    /** REMOVING THE LAST NODE IN A LINKEDLIST */
    //STEP 7 (REMOVELAST OPERATION)
    fun removeLast(): T?{
        val head = head ?: return null //If head is null, there’s nothing to remove, so you return null.
        if (head.next == null) return pop() // if the next node is null, then it is the tail.(just remove it)
        size -- // update the size of the list
        //You keep searching for the next node until current.next is null. This
        // signifies that current is the last node of the list (LINE 91 - 98)
        var prevNode = head
        var currentNode = head
        var nextNode = currentNode.next
        while (nextNode != null){
            prevNode = currentNode
            currentNode = nextNode
            nextNode = currentNode.next
        }
        //Since current is the last node, you disconnect it using the prev.next reference.
        // You also make sure to update the tail reference. ( LINE 101 - 102 )
        prevNode.next = null
        tail = prevNode
        return currentNode.value
    }

    /** ADDING VALUES TO A SPECIFIC NODE LINKEDLIST */
    //STEP 8 (REMOVEAFTER OPERATION)
    //You’ll first find the node immediately before the node you wish to remove and then unlink it
    fun removeAfter(node: Node<T>): T?{
        val result = node.next?.value // the value of the node to remove
        if (node.next == tail) tail = node // updating the tail reference if the node is the tail
        if (node.next != null) size--
        node.next = node.next?.next // getting the next value of the node that is just removed
        return result
    }
}