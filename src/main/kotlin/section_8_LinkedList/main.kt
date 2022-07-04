package section_8_LinkedList


fun main(){
    //How nodes work manually
    val node1 = Node(value =1)
    val node2 = Node(value =2)
    val node3 = Node(value =3)
    val node4 = Node(value =4)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    println("---------------------------------------")
    println(node1)
    println("---------------------------------------")
    println()

    // Using the LinkedList function to create a LinkedList(push operation)
    val linkedList = LinkedList<String>()
    linkedList.push("Emma")
    linkedList.push("Solo")
    linkedList.push("Tari")
    //append operation
    linkedList.append("Prosper")
    //insert OPERATION
    println("------------BEFORE INSERTION OPERATION---------------------------")
    println(linkedList)
    println(linkedList.size)

    val newValue = linkedList.findNodeAt(2)
    linkedList.insert("Tonkiri",newValue!!)

    println("----------------AFTER INSERTION OPERATION-----------------------")
    println(linkedList)
    println(linkedList.size)
    println("---------------------------------------")
    println("----------------AFTER POP OPERATION-----------------------")
    val poppedValue = linkedList.pop()
    println(linkedList)
    println(poppedValue)
    println(linkedList.size)
    println("---------------------------------------")
}