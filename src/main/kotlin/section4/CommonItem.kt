package section4

fun main(){
    val array1 = listOf('a','b','c')
    val array2 = listOf('d','e','f')
    val array3 = listOf('h','i','c')
//    println("BRUTE FORCE")
//    println("---------------------")
//    println(commonItemsInTwoArrays(array1,array2))
//    println(commonItemsInTwoArrays(array1,array3))
    println("---------------------")
    println("OPTIMIZED WITH HASHSET")
    println(commonItemsInTwoArraysOptimalForEach(array1,array2))
    println(commonItemsInTwoArraysOptimalForEach(array1,array3))
}
// QUESTION: Given two arrays create a function that let user know(true/false)
// whether these two arrays contain any common items
// val array1 = listOf('a','b','c')
// val array2 = listOf('d','e','f') => return false
// val array1 = listOf('a','b','c')
// val array2 = listOf('c','g','h') => return true

//SOLUTION STEPS( from asking questions)
// we have two parameters -> arrays -> no size limit
// we return true or false

//QUESTION TO ASK
// can we always assume two input parameters, and will they always be arrays?

//Brute force solutions
fun commonItemsInTwoArrays(array1: List<Char>, array2: List<Char>): Boolean{
    for(i in array1){
        for(j in array2){
            if(i == j) return true
        }
    }
    return false
}
// This is O( a * b) because the arrays can be of different sizes, and it is a O(n^2)

// optimal solutions
fun commonItemsInTwoArraysOptimal(array1: List<Char>, array2: List<Char>): Boolean{
    //Checking if an input is not given(edge case)
    if (array1.isEmpty() || array2.isEmpty()) return false
    // create an hashSet
    val hashSet = HashSet<Char>()
    for (i in array1){
        hashSet.add(i)
    }
    println("$hashSet")
    for (j in array2){
        if (hashSet.contains(j)) return true
    }
    return false
}// Time complexity is O(a + b) => O(n)

// Using a foreach to solve the problem
fun commonItemsInTwoArraysOptimalForEach(array1: List<Char>, array2: List<Char>): Boolean{
    if (array1.isEmpty() || array2.isEmpty()) return false
    val hashSet = HashSet<Char>()
    array1.forEach { hashSet.add(it) }
    array2.forEach { if(hashSet.contains(it)) return true}
    return false
}