package com.example.dsakotlin

import androidx.core.graphics.rotationMatrix

fun main() {

    fun minOperations(nums: IntArray): Int {

        var count = 0
        for(i in 0 until nums.size-1){
            if(nums[i]>=nums[i+1]){
                println("${nums[i]}  , ${nums[i+1]} , ${nums[i]-nums[i+1] + 1}")
                val dif =  (nums[i] - nums[i+1]) +1
                count+=dif
                nums[i+1] += dif
            }
        }

        return count

    }

    var  nums = intArrayOf(1,1,1)
    println(minOperations(nums))
}