package com.example.dsakotlin

import kotlin.math.max

fun main() {
    fun countGoodRectangles(rectangles: Array<IntArray>): Int {
        val listOfRectanges = mutableListOf<Int>()
        rectangles.map {
            listOfRectanges.add(it.minOrNull()!!)
        }
        //println(listOfRectanges)

        return listOfRectanges.maxOrNull().let { max ->listOfRectanges.count{it==max} }
    }

    val rectangle = arrayOf(intArrayOf(2,3) ,intArrayOf(3,7) ,intArrayOf(4,3) ,intArrayOf(3,7))

    //val rectangle = arrayOf(intArrayOf(5,8) ,intArrayOf(3,9) ,intArrayOf(5,12) ,intArrayOf(27,5))
    println(countGoodRectangles(rectangle))
}