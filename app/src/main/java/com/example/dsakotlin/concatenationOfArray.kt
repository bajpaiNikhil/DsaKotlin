package com.example.dsakotlin



fun main() {

    fun getConcatenation(nums: IntArray) : IntArray {
        val resultArray = IntArray(nums.size * 2)

//        println("2  ".repeat(2))
        for(i in nums.indices){
            println("$i  , ${nums[i]} ")
            resultArray[i] = nums[i]
            resultArray[nums.size + i] = nums[i]

        }
        return resultArray
    }
    println(getConcatenation(intArrayOf(1,2,3,4)).contentToString())
}
