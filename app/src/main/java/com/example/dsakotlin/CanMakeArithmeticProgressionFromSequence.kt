package com.example.dsakotlin


fun main() {

    fun canMakeArithmeticProgression(arr: IntArray): Boolean {

        arr.sort()
        val d = arr[1]-arr[0]
        for(i in 2 until arr.size){
            println(i)
            if(arr[i]-arr[i-1] != d)
                return false
        }
        return true
    }

    val arr = intArrayOf(1,2,3)
    println(canMakeArithmeticProgression(arr))

}