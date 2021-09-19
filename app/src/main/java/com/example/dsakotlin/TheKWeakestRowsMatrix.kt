package com.example.dsakotlin

import kotlin.math.absoluteValue

fun main() {

    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {

        val lo : MutableMap<Int , Int> = HashMap()
        var j =0
        mat.forEach {
            lo[j] = it.count{a-> a==1}
            j++
        }
        val result = lo.toList().sortedBy { (_ , value) -> value}.toMap()
        return result.keys.toIntArray().copyOfRange(0,k)

    }
    val matrix  = arrayOf(intArrayOf(1,1,0,0,0) , intArrayOf(1,1,1,1,0) , intArrayOf(1,0,0,0,0) , intArrayOf(1,1,0,0,0) , intArrayOf(1,1,1,1,1))
    val k = 3
    println(kWeakestRows(matrix , k).contentToString())
}