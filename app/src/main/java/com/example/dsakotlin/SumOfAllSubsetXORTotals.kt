package com.example.dsakotlin

import kotlin.math.pow

fun main() {
    fun subsetXORSum(nums: IntArray): Int {

        val arraySize = nums.size
        var setBits = 0

        for(i in nums){
            setBits = setBits.or(i)
            //println(XorSum)
        }
        //println(setBits)

        return setBits * 2.0.pow(arraySize-1).toInt()
    }
    var nums = intArrayOf(3,4,5,6,7,8)
    println(subsetXORSum(nums))
}