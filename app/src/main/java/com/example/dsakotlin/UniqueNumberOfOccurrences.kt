package com.example.dsakotlin

fun main() {

    fun uniqueOccurrences(arr: IntArray): Boolean {

        val arrHashMap : MutableMap<Int , Int> = HashMap()

        for( i in arr){
            var count = arrHashMap[i]
            if(count == null) count=0
            arrHashMap[i] = count+1
        }
//        println(arrHashMap)
//        println(arrHashMap.values.distinct())
//        println("${arrHashMap.values.size} ${arrHashMap.values.distinct()} , ${arrHashMap.values.distinct().count()}" )
          return arrHashMap.values.size == arrHashMap.values.distinct().count()

    }

    val arr = intArrayOf(1,2)
    println(uniqueOccurrences(arr))

}