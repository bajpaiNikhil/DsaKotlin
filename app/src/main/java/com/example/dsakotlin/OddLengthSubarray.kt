package com.example.dsakotlin

fun main() {


    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var sum = 0
        val n: Int = arr.size
        for (i in 0 until n) {
            sum += arr[i] //always add current num
            var tempSum = arr[i]
            for (j in i + 1 until arr.size) {
                tempSum += arr[j] //add odd and even indexes to tempSum
                if ((j - i + 1) % 2 == 1) { // only add when index is odd such as 1,3,5 ...
                    sum += tempSum
                }
            }
        }
        return sum

    }

    val arr  = intArrayOf(1,4,2,5,3)
    println(sumOddLengthSubarrays(arr))
}