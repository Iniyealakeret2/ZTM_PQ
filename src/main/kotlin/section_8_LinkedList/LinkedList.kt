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

    /** ADDING VALUES TO END LINKEDLIST */
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

    /** ADDING VALUES TO A NODE LINKEDLIST */
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
    // STEP 5.b(function to insert the found Node atbthat index)
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

}