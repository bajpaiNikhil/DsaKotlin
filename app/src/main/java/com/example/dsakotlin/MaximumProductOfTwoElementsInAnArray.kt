package com.example.dsakotlin

fun main() {
    fun maxProduct(nums: IntArray): Int {
        nums.sort()
        return ((nums.last()-1) * (nums[nums.lastIndex-1] - 1))
    }
    val nums = intArrayOf(3,7)
    println(maxProduct(nums))

}