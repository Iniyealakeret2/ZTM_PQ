package section6

@OptIn(ExperimentalUnsignedTypes::class)
fun main(){
    val array1 = listOf(1,2,3,4)
    val array2 = listOf(0,0,0)

    val nums1 = IntArray(6)
    nums1[0] = 1
    nums1[1] = 2
    nums1[2] = 3
    nums1[3] = 0
    nums1[4] = 0
    nums1[5] = 0
    val m = 3
    val nums2 = IntArray(3)
    nums2[0] = 1
    nums2[1] = 2
    nums2[2] = 3
    val n = 3
    println(mergerSortedArrays(array1, array2))
    println(mergerSortedArrays2(nums1,m,nums2,n))

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

// LEETCODE QUESTION(You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
@OptIn(ExperimentalUnsignedTypes::class)
fun mergerSortedArrays2(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {

    var pointer = n + m - 1 // pointing to the end of nums1, which is n+m-1
    var pointer1 = m - 1 // pointing to the last element of nums1 array
    var pointer2 = n - 1 // pointing to the last element of nums2 array
    while (pointer1>=0 && pointer2>=0) {
        if (nums1[pointer1] > nums1[pointer2]){
            nums1[pointer] = nums1[pointer1]
            pointer1--
            pointer--
        }else{
            nums1[pointer] = nums2[pointer2]
            pointer2--
            pointer--
        }
    }
    while (pointer2 >=0){
        nums1[pointer] = nums2[pointer2]
        pointer2--
        pointer--
    }
}
