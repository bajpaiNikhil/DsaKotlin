package com.example.dsakotlin

fun main() {
    fun runningSum(nums: IntArray): IntArray {
        var sumIs = 0
        for(i in nums.indices){
            sumIs += nums[i]
            nums[i] = sumIs
        }
        return nums

    }

    println(runningSum(intArrayOf(1,2,3,4)).contentToString())

}