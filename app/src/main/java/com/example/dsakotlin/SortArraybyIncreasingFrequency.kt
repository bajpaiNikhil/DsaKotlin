package com.example.dsakotlin

fun main() {

    fun frequencySort(nums: IntArray): IntArray {
        val numToFreq = HashMap<Int, Int>()
        for(num in nums){
            numToFreq[num] = 1 + (numToFreq[num] ?: 0)
        }

        return nums.sortedWith(compareBy({numToFreq[it]!!}, { -it })).toIntArray()
    }

    val nums = intArrayOf(-1,1,-6,4,5,-6,1,4,1)

    println(frequencySort(nums))

}