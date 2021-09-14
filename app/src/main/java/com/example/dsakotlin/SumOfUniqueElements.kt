package com.example.dsakotlin

fun main() {

    fun sumOfUnique(nums: IntArray): Int {

        val numsMap : MutableMap<Int,Int> = HashMap()

        for(i in nums){
            var count = numsMap[i]
            if(count ==null )count=0
            numsMap[i] = count+1
        }
        //println(numsMap)
        val keySum = numsMap.filterValues { it == 1 }.keys
        //println(keySum)
        return keySum.sum()
    }

    val nums = intArrayOf(1,2,3,2)
    println(sumOfUnique(nums))
}