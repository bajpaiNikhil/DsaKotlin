package com.example.dsakotlin

fun main() {

    fun countNegatives(grid: Array<IntArray>): Int {

        //var flatGrid  = grid.flatMap { it.asIterable() }.count{a -> a<=0}
        return grid.flatMap { it.asIterable() }.count{a -> a<=0}
    }
    var grid = arrayOf(intArrayOf(4,3,2,-1) , intArrayOf(3,2,1,-1) , intArrayOf(1,1,-1,-2) , intArrayOf(-1,-1,-2,-3))
    println(countNegatives(grid))

}