package com.example.dsakotlin

fun main() {

    fun sortArrayByParityII(nums: IntArray): IntArray {

        val odd = nums.filter { it%2!=0 }
        val even  = nums.filter{it%2==0}
        println("$odd  , $even")

        return even.zip(odd).flatMap { listOf(it.first , it.second)}.toIntArray()
    }

    val nums = intArrayOf(4,2,5,7)
    println(sortArrayByParityII(nums))

}