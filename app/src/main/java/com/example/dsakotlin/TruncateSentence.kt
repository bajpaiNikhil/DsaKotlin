package com.example.dsakotlin

fun main() {
    fun truncateSentence(s: String, k: Int): String {
        val listIs  = s.split(" ")
        //println(listIs)
        if(listIs.size <=k)
            return listIs.joinToString(" ")
        return listIs.subList(0,k).joinToString(" ")
    }
    val s = "What is the solution"
    val k = 4

    println(truncateSentence(s , k))
}