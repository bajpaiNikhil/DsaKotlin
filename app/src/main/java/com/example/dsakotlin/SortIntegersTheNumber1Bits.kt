package com.example.dsakotlin

fun main() {

    fun sortByBits(arr: IntArray): IntArray {
        val arrMap : MutableMap<Int, MutableList<Int>> = HashMap()
        val result = arrayListOf<Int>()
        for(i in arr){
            arrMap.computeIfAbsent(i.countOneBits()){ArrayList()}.add(i)
        }

        println(arrMap)
        println(arrMap.values)
        for( i in arrMap.values){
            result+=i.sorted()
        }
        return result.toIntArray()
    }
    val arr = intArrayOf(1024,512,256,128,64,32,16,8,4,2,1)
    println(sortByBits(arr).contentToString())

}