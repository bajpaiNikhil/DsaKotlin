package com.example.dsakotlin

fun main() {

    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        target.sort()
        arr.sort()
        return target.contentEquals(arr)
    }
    val targetArray = intArrayOf(3,7,9)
    val arr = intArrayOf(3,7,11)
    println(canBeEqual(targetArray , arr))

}