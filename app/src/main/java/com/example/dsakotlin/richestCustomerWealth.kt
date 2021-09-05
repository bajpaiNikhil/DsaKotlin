package com.example.dsakotlin

import androidx.core.graphics.createBitmap

fun main() {

    fun maximumWealth(accounts: Array<IntArray>): Int {

        //println(accounts.contentDeepToString())
        var currentSum = 0
        var maxSum = 0
        for(i in accounts){
            currentSum = i.sum()
            //println(currentSum)
            if(currentSum > maxSum){
                //println("here current sum is $currentSum")
                maxSum = currentSum
            }else{
                currentSum = i.sum()
            }
            //println(i.contentToString())
            println("$currentSum , $maxSum")
        }
        return maxSum
    }
//    [[2,8,7],[7,1,3],[1,9,5]]
    val matrix : Array<IntArray> = arrayOf(intArrayOf(2,8,7) , intArrayOf(7,1,3) , intArrayOf(1,9,5))
//    [[1,5],[7,3],[3,5]]
//    val matrix : Array<IntArray> = arrayOf(intArrayOf(1,5) , intArrayOf(7,3) , intArrayOf(3,5))
    //println(matrix.contentDeepToString())
    println(maximumWealth(matrix))
}