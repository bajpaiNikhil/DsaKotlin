package com.example.dsakotlin

import kotlin.math.abs

fun main() {

    fun sortedSquares(nums: IntArray): IntArray {

        val numSquare = nums.map { abs(it*it)}
        println(numSquare)
        var result = IntArray(nums.size)
        var left = 0
        var right = numSquare.size-1
        var currentPosition = 0
        while (left <= right){
            if(numSquare[left] > numSquare[right]){
                result[currentPosition] = numSquare[left]
                left++
            }else{
                result[currentPosition] = numSquare[right]
                right--
            }
            currentPosition+=1
        }
        result.reverse()
        return result
    }
    val nums = intArrayOf(-7,-3,2,3,11)
    println(sortedSquares(nums).contentToString())

}