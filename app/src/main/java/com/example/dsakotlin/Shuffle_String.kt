package com.example.dsakotlin

fun main() {

    fun restoreString(s: String, indices: IntArray): String {
        val resultArray = CharArray(s.length)
        indices.forEachIndexed{

            i,num -> resultArray[num] = s[i]
//            println("$i  , $num , ${s[i]}")
        }
//        println(resultArray.contentToString())
        return String(resultArray)
    }

    val givenString = "codeleet"
    val indices  = intArrayOf(4,5,6,7,0,2,1,3)
    println(restoreString(givenString, indices))

}