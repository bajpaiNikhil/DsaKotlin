package com.example.dsakotlin

fun main() {
    fun buildArray(nums: IntArray): IntArray {

        val resultArray = IntArray(nums.size)

        for(i in nums.indices){
            resultArray[i] = nums[nums[i]]
        }
        return resultArray
    }

    println(buildArray(intArrayOf(5,0,1,2,3,4)).contentToString())
}