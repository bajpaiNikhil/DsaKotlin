package com.example.dsakotlin

fun main() {

    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {

        //Approach 1 traverse the array
//        var wordString1 = ""
//        var wordString2 = ""
//
//        for(i in word1){
//            wordString1+=i
//        }
//        for(i in word2){
//            wordString2+=i
//        }
//        return wordString1 == wordString2
        //join String

        return word1.joinToString("") ==word2.joinToString("")

    }
    val word1 = arrayOf("ab", "c")
    val word2 = arrayOf("a", "bc")
    println(arrayStringsAreEqual(word1 , word2))

}