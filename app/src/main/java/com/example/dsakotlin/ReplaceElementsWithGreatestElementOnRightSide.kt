package com.example.dsakotlin

fun main() {

    fun replaceElements(arr: IntArray): IntArray {
        return arr
//
//        for(i in arr.indices){
//            val maxIs = arr.copyOfRange(i+1 ,arr.lastIndex+1)
//            //println(" .... ${maxIs.contentToString()} , ${arr[i]} , $i , ${arr.lastIndex}" )
//            arr[i] = maxIs.maxOrNull() ?: -1
//            println("${maxIs.contentToString()} , ${arr[i]} , $i , ${arr.lastIndex}" )
//        }
//        return arr
    }
        fun replaceElements1(arr: IntArray): IntArray {
            if (arr.size == 1) {
                arr[0] = -1
                return arr
            }
            var max = arr[arr.size - 1]
            var temp = 0
            for (i in arr.size - 2 downTo 0) {
                temp = arr[i]
                arr[i] = max
                max = max.coerceAtLeast(temp)
            }
            arr[arr.size - 1] = -1

            return arr
        }
    val array = intArrayOf(17,18,5,4,6,1)
    println(replaceElements1(array).contentToString())
}