package com.example.dsakotlin

fun main() {

    fun singleNumber(nums: IntArray): Int {
        var result = 0

        for(i in nums){
            result = result xor i
        }
        return result
    }
    val nums = intArrayOf(2,2,1,1,5)
    println(singleNumber(nums))
//
//    val n = 8
//    var count = 0
//    for(i in 1..n){
//        if(n%i != 0){
//            if(gcdis(n, i) !=1){
//                count+=1
//            }
//        }
//    }
//    println(count)
//}
//fun gcdis(first: Int, last: Int): Int {
//
//    if(first == 0){
//        return last
//    }
//    if(last == 0){
//        return first
//    }
//    if(first == last){
//        return first
//    }
//    if(first > last){
//        return gcdis(first-last , last)
//    }
//    return gcdis(first , last - first)
}
