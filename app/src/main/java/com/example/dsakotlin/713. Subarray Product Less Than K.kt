package com.example.dsakotlin

fun main() {

    val nums = intArrayOf(1,2,3)
    val target = 0
    println(usingSlidingWindow(nums,target))
}
fun usingSlidingWindow(nums: IntArray, target: Int): Any {

    var windowStart = 0
    var windowProduct = 1
    var count = 0
    for( windowEnd in nums.indices){
        windowProduct*= nums[windowEnd]
        println("${nums.slice(windowStart..windowEnd)},$count")
        while (windowStart<= windowEnd && windowProduct >= target){

            println("in ${nums.contentToString()} ,${nums.slice(windowStart..windowEnd)} , $windowStart, ${nums[windowStart]} , $windowProduct, $windowEnd, ${nums[windowEnd]} ")

            println("${windowProduct/nums[windowStart]}")
            windowProduct /= nums[windowStart]
            windowStart+=1
//            println("in ${nums.contentToString()} ,${nums.slice(windowStart..windowEnd)} , $windowStart, ${nums[windowStart]} , $windowProduct, $windowEnd, ${nums[windowEnd]} ")
        }
        count += (windowEnd-windowStart+1)
//        println("${nums.slice(windowStart..windowEnd)}")
//        println("out ${nums.contentToString()},${nums.slice(windowStart..windowEnd)} , $windowStart, ${nums[windowStart]} , $windowProduct, $windowEnd, ${nums[windowEnd]} ")
//        count+=1
//        if(nums[windowEnd]!=target){
//            count+=1
//        }
    }
    return (count)
}
