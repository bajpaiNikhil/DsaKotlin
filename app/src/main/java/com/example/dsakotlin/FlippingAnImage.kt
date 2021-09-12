package com.example.dsakotlin

fun main() {
    fun flipAndInvertImage(image: Array<IntArray>): List<List<Int>> {

        image.map {
            println(it.contentToString())
            it.map { i-> if(i==1) 0 else 1 }.reversed() }
        println(image.contentDeepToString())

        return image.map { it.map { i-> i xor 1 }.reversed()}

    }

    val matrix = arrayOf(intArrayOf(1,1,0,0) , intArrayOf(1,0,0,1) ,intArrayOf(0,1,1,1) ,intArrayOf(1,0,1,0))
    println(flipAndInvertImage(matrix))
}