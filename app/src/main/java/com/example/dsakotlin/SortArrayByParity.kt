package com.example.dsakotlin

fun main() {

    fun sortArrayByParity(nums: IntArray): IntArray {
        //solving this by creating an new array is easy

        // Two pointer approach

        var left = 0
        var right = nums.size - 1

        while(left<right){
            if(nums[left] % 2 == 0){
                left+=1
                println(nums[left])
            }
            else{
                if(nums[right] % 2 !=0){
                    right-=1
                }
                if(nums[right] %2 ==0){
                    nums[left] = nums[right].also { nums[right] =nums[left] }
                    left+=1
                    right-=1
                }
            }
        }
        return nums

    }
    val nums = intArrayOf(3,1,2,4)
    println(sortArrayByParity(nums).contentToString())

}