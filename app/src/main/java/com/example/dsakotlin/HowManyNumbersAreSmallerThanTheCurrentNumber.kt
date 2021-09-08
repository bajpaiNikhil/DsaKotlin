package com.example.dsakotlin

fun main() {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {

        val countArray = IntArray(nums.size)
        var count= 0
        for(i in nums.indices){
            for(j in nums.indices){
                if(i!=j && nums[i]>nums[j]){
                    count+=1
                    //println(count)
                }
                //println(count)
            }
            countArray[i]=count
            count=0
            //println("${countArray.contentToString()}")
        }
        return countArray


        //Great approach do have a look
//        val count = IntArray(101)
//        val res = IntArray(nums.size)
//
//        for (element in nums) {
//            count[element]++
//        }
//        println(count.contentToString())
//
//        for (i in 1..100) {
//            count[i] += count[i - 1]
//        }
//        println(count.contentToString())
//
//        for (i in nums.indices) {
//            if (nums[i] == 0) res[i] = 0 else res[i] = count[nums[i] - 1]
//            println(res.contentToString())
//        }
//
//        return res
    }


    val nums = intArrayOf(8,1,2,2,3)
    println(smallerNumbersThanCurrent(nums).contentToString())
}