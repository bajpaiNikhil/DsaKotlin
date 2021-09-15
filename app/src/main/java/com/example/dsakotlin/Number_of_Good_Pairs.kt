package com.example.dsakotlin

fun main() {

    fun numIdenticalPairs(nums: IntArray): Int {
        //Approach one simple two for loop
        var identicalCount = 0
        val size = nums.size
        for(i in nums.indices){
            for(j in i until size){
                if(nums[i] == nums[j] && i!=j ){
                    //println("${nums[i]} , ${nums[j]} , $i , $j")
                    identicalCount+=1
                }
            }
        }

        return identicalCount
    }
    val numsArray = intArrayOf(1,2,3,1,1,3)
    println(numIdenticalPairs(numsArray))


    fun numIdenticalPairs1(nums: IntArray): Int {

        // create a hashMap frequency of each element n and the count is n*(n-1)/2
        var identicalCount = 0
        val numsHashMap :  MutableMap<Int,Int> = HashMap()

        for( num in nums){
            var count = numsHashMap[num]
            if(count == null) count = 0
            numsHashMap[num] = count+1

        }
        println(numsHashMap)
        for(i in numsHashMap.values){
            println(i)
            identicalCount +=(i*(i-1))/2
            println(identicalCount)
        }

        return identicalCount
    }
    val numsArray1 = intArrayOf(1,1,1,1)
    println(numIdenticalPairs1(numsArray1))
}