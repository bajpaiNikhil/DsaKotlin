package com.example.dsakotlin

import kotlin.math.max

fun main() {
    fun largestAltitude(gain: IntArray): Int {
        val heightsList = IntArray(gain.size+1)
        heightsList[0] = 0

        for(i in gain.indices){
            heightsList[i+1] = heightsList[i]+gain[i]
        }
        //println(heightsList.contentToString())
        return heightsList.maxOrNull()!!

    }
    var gain = intArrayOf(-4,-3,-2,-1,4,3,2)

    println(largestAltitude(gain))
}