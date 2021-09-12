package com.example.dsakotlin

fun main() {
    fun diagonalSum(mat: Array<IntArray>): Int {

        val diagonalElement = mutableListOf<Int>()
        val sizeMatrix = mat.size
        for(i in 0 until sizeMatrix){
            //println("${mat[i][i]} , ${mat[i][sizeMatrix-i-1]}")
            diagonalElement.add(mat[i][i])
            diagonalElement.add(mat[i][sizeMatrix-i-1])
        }
        //println(diagonalElement)
        return if(sizeMatrix % 2 != 0){
            diagonalElement.removeAt(sizeMatrix)
            diagonalElement.sum()
        }else{
            diagonalElement.sum()
        }
    }

    val matrix = arrayOf(intArrayOf(1,2,3) , intArrayOf(4,5,6) , intArrayOf(7,8,9))
    println(diagonalSum(matrix))
}