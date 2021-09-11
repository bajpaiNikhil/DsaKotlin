package com.example.dsakotlin


fun main() {
    fun maxProductDifference(nums: IntArray): Int {
        val sortedNums = nums.sorted()
        val sizeOfNums = nums.size
        println(sortedNums)

        return (sortedNums.last()*sortedNums[sizeOfNums-2]) - (sortedNums[0]*sortedNums[1])
    }

    val nums = intArrayOf(5,6,2,7,4)
    println(maxProductDifference(nums))
}