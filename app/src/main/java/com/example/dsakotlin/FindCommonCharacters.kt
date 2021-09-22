package com.example.dsakotlin

fun main() {

    fun commonChars(A: Array<String>): List<String> {

        val characters = Array(26) { IntArray(A.size) }
        for (i in A.indices)
            for (c in A[i])
                characters[c - 'a'][i]++
        return characters
            .withIndex()
            .map { (c, words) -> List(words.minOrNull()!!) { ('a' + c).toString() } }
            .flatten()
    }

    val words = arrayOf("bella","label","roller")
    println(commonChars(words))

}