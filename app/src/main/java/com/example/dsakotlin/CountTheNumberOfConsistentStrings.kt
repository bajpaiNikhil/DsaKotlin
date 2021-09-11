package com.example.dsakotlin

fun main() {
    fun CountIs(allowedSet: MutableSet<Char>, word: String): Boolean {
        for(w  in word){
            if(!allowedSet.contains(w)){
                return false
            }
        }
        println(word)
        return true
    }

    fun countConsistentStrings(allowed: String, words: Array<String>): Int {

        val allowedSet = mutableSetOf<Char>()
        for(c in allowed){
            allowedSet.add(c)
        }
        println(allowedSet)
        var count = 0
        for(word in words){
            if(CountIs(allowedSet,word)){
                count++
            }
        }
        return count
    }

    val allowed = "cad"
    val words  = arrayOf("cc","acd","b","ba","bac","bad","ac","d")

    println(countConsistentStrings(allowed , words))
}