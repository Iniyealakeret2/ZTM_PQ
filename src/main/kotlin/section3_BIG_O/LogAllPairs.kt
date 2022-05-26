package section3_BIG_O

fun main(){
    val numbers = listOf(1, 2, 3)
    println(logAllPairs(numbers))
}
// function to log all pairs
fun logAllPairs(list: List<Any>): List<Any> {
    val result = mutableListOf<Any>()
    for(i in list){
        for (j in list){
            result.add(i)
            result.add(j)
        }
    }
    return result
}