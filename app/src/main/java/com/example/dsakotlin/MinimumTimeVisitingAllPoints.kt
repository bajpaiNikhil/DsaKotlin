package com.example.dsakotlin

import kotlin.math.abs


fun main() {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {

        var result = 0

        for(i in 1 until points.size){
            //println("${points[i-1].contentToString()} , ${points[i].contentToString()}")
            var currentPoint = points[i-1]
            var nextPoint    = points[i]

            var distance1 = currentPoint[0] - nextPoint[0]
            //println("$distance1 , ${currentPoint[0]} , ${nextPoint[0]}")
            var distance2 = currentPoint[1] - nextPoint[1]
            //println("$distance2 , ${currentPoint[1]} , ${nextPoint[1]}")
            result += abs(distance1).coerceAtLeast(abs(distance2))
        }


        return result

    }

    var pointsIs = arrayOf(intArrayOf(1,1) , intArrayOf(3,4) , intArrayOf(-1,0))
    println(minTimeToVisitAllPoints(pointsIs))
}