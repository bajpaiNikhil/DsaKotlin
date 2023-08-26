package com.example.dsakotlin

fun main() {

    val nums = intArrayOf(2,0)
    println(sortColors(nums))

}

fun sortColors(nums: IntArray): Any? {

    var leftPointer = 0
    var rightPointer = nums.size - 1
    var k = 0

    while (k<= rightPointer){
        when(nums[k] ){
            0-> {
                nums[leftPointer] = nums[k].also { nums[k]= nums[leftPointer] }
                leftPointer+=1
                k+=1
                println("0 ${nums.contentToString()} , ${leftPointer},$rightPointer,$k")
            }
            2->{
                nums[rightPointer] = nums[k].also { nums[k]= nums[rightPointer] }
                rightPointer-=1
                println("2 ${nums.contentToString()} , ${leftPointer},$rightPointer,$k")
            }
            1-> {
                k+=1
            }
        }
    }

//    for(k in nums.indices){
//        if (leftPointer!=rightPointer){
//            when(nums[k] ){
//                0-> {
//                    nums[leftPointer] = nums[k].also { nums[k]= nums[leftPointer] }
//                    leftPointer+=1
//                    println("0 ${nums.contentToString()} , ${leftPointer},$rightPointer,$k , $sizeIs")
//                }
//                2->{
//                    nums[rightPointer] = nums[k].also { nums[k]= nums[rightPointer] }
//                    rightPointer-=1
//                    println("2 ${nums.contentToString()} , ${leftPointer},$rightPointer,$k, $sizeIs")
//                }
//                1-> {
//                    k+=1
//                }
//            }
//        }
//    }
    return nums.contentToString()

}
