package com.example.dsakotlin

fun main() {

    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val resultArray = mutableListOf<Boolean>()
        val maxCandies = candies.maxOrNull()?:0
        println(maxCandies)
        for(i in candies.indices){
//            println("${candies[i]} , $i")
//            resultArray.add(i ,true)
            if(candies[i]+extraCandies >= maxCandies){
                resultArray.add(i,true)
            }else{
                resultArray.add(i,false)
            }
        }
        return resultArray
    }

    val candies  = intArrayOf(2,3,5,1,3)
    val etCandies  = 3

    println(kidsWithCandies(candies , etCandies))
}