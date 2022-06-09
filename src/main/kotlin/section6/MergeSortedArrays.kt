package section6

fun main(){
    val array1 = listOf(1,2,3,4)
    val array2 = listOf<Int>()
    println(mergerSortedArrays(array1, array2))


}
// QUESTION: Given two arrays that are sorted, can you merge these two arrays into one?

private fun mergerSortedArrays(array1: List<Int>, array2: List<Int>): List<Int> {
    val mergedArray = ArrayList<Int>()

    if (array1.isEmpty()) return array2
    if (array2.isEmpty()) return array1
    mergedArray.addAll(array1)
    mergedArray.addAll(array2)
    return mergedArray
}