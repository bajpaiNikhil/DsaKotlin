package com.example.dsakotlin

fun main() {
    fun decode(encoded: IntArray, first: Int): IntArray {

        val resultArray = IntArray(encoded.size+1)
        resultArray[0] = first
        for(i in encoded.indices){
            resultArray[i+1] = resultArray[i] xor encoded[i]
        }

        return resultArray
    }

    val encoded = intArrayOf(6,2,7,3)
    val first = 4

    println(decode(encoded , first).contentToString())
}