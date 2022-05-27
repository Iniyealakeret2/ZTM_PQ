package section4

fun main(){
    val array1 = listOf('a','b','c')
    val array2 = listOf('d','e','f')
    val array3 = listOf('h','i','c')
    println(commonItemsInTwoArrays(array1,array2))
    println(commonItemsInTwoArrays(array1,array3))
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

//Brute force solutions
fun commonItemsInTwoArrays(array1: List<Char>, array2: List<Char>): Boolean{
    for(i in array1){
        for(j in array2){
            if(i == j) return true
        }
    }
    return false
}
// This is O( a * b) because the arrays can be of different sizes
// optimal solutions
fun commonItemsInTwoArraysOptimal(array1: List<Char>, array2: List<Char>){

}