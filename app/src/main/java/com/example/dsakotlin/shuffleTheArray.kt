package com.example.dsakotlin

fun main() {


    fun shuffle(nums: IntArray, n: Int): IntArray {

        val arrayOne = nums.copyOfRange(0,n)
        val arrayTwo = nums.copyOfRange(n , nums.size)
        val result = IntArray(nums.size)

        val resultArray  = arrayOne zip arrayTwo
        var p = 0
        for(i in resultArray){
            result[p] = i.first
            result[p+1] = i.second
            p+=2
        }
        return result
    }
    val numsArray = intArrayOf(2,5,1,3,4,7)
    val n = 3
    println(shuffle(numsArray , n).contentToString())
}