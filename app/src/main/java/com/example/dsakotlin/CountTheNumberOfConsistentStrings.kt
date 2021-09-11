package com.example.dsakotlin

fun main() {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {

        for(i in words){
            var a = setOf<String>(i)
            println(a)

        }

        return 1
    }

    var allowed = "cab"
    var words  = arrayOf("cc","acd","b","ba","bac","bad","ac","d")

    println(countConsistentStrings(allowed , words))
}