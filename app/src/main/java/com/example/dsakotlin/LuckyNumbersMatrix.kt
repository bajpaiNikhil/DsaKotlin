package com.example.dsakotlin

fun main() {

    fun luckyNumbers (matrix: Array<IntArray>): List<Int> {

        val rowMin = mutableListOf<Int>()
        val columnMax = mutableListOf<Int>()
        matrix.map {
            rowMin.add(it.minOrNull()!!)
        }
        for(i in matrix[0].indices){
            val cc = IntArray(matrix.size) {matrix[it][i]}.maxOrNull()
            println(cc)
            columnMax.add(cc!!)
        }
        println("$rowMin  , $columnMax ${rowMin.intersect(columnMax)}")
        return rowMin.intersect(columnMax).toList()

    }
//    val matrix  = arrayOf(intArrayOf(3,7,8)  , intArrayOf(9,11,13) , intArrayOf(15,16,17))
    val matrix  = arrayOf(intArrayOf(1,10,4,2)  , intArrayOf(9,3,8,7) , intArrayOf(15,16,17,12))
    println(luckyNumbers(matrix))

}

//[[1,10,4,2],[9,3,8,7],[15,16,17,12]]