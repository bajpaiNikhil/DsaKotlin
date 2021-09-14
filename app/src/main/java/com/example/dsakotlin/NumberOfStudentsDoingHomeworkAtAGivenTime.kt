package com.example.dsakotlin

fun main() {

    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {

        var count = 0
        val a = startTime.zip(endTime){ a ,b -> if(queryTime in a..b){
            count+=1
        }
        }
        return count
    }

    val sT = intArrayOf(9,8,7,6,5,4,3,2,1)
    val eT = intArrayOf(10,10,10,10,10,10,10,10,10)
    val qT = 5

    println(busyStudent(sT,eT,qT))
}