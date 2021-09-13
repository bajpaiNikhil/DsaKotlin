package com.example.dsakotlin

fun main() {

    fun findNumbers(nums: IntArray): Int {
        var count = 0
        nums.map { count += if(Math.abs(it).toString().length %2 == 0) 1 else 0 }
        return count
    }

    val nums = intArrayOf(555,901,-482,-1771)
    println(findNumbers(nums))

}