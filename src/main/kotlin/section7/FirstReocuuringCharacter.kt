package section7

//QUESTION: Given an array tell me the first reoccurring character
fun main(){
    println(firstReoccurringCharacter(listOf(1,2,3,4,5,6,7,8,2)))
    println(hashTableFirstReoccurringCharacter(listOf(1,2,3,4,5,6,7,8,2)))
}
fun firstReoccurringCharacter(array: List<Int>): Int{
    val hashSet = HashSet<Int>()
    if(array.isEmpty()) return 0
    for (i in array.indices) {
        hashSet.add(array[i])
     for (j in i + 1 until array.size)  {
         if (hashSet.contains(array[j])) return array[i]
     }
//        for (j in i + 1 until array.size) {
//            if (array[i] == array[j]) {
//                return array[i]
//            }
//        }
    }
    return 0
}
  fun hashTableFirstReoccurringCharacter(array: List<Int>): Int {
      val hashSet = HashSet<Int>()
      if (array.isEmpty()) return 0
      for (i in array.indices) {
          hashSet.add(array[i])
      for (j in i + 1 until array.size) {
          if (hashSet.contains(array[j])) return array[i]
          }
      }
      return 0
  }