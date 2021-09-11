package com.example.dsakotlin


fun main() {
    fun gcdis(first: Int, last: Int): Int {

        if(first == 0){
            return last
        }
        if(last == 0){
            return first
        }
        if(first == last){
            return first
        }
        if(first > last){
            return gcdis(first-last , last)
        }
        return gcdis(first , last - first)
    }

    fun findGCD(nums: IntArray): Int {
        nums.sort()
        println(nums.contentToString())
        
        return gcdis(nums.first() , nums.last())
    }

    val nums = intArrayOf(7,5,6,8,3)
    println(findGCD(nums))
}
