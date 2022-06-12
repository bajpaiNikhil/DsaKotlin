package com.example.dsakotlin

fun main(){
    var input:Int  =  readLine()?.toInt()!!
    //print("the data enter is $input")
    while(input>0){
        var globalMax = 1
        var currentMax: Int = 1
        var count:Int = 1
        val stringLength : Int = readLine()?.toInt()!!
        val stringIs : String = readLine()!!
        var unique = ""

        for( i in 0 until stringLength-1){
            //println("$i  , ${stringIs[i]} , ${stringIs[i+1]}")
            if(stringIs[i]==stringIs[i+1]){
                count+=1
                //println("$i  , ${stringIs[i]} , ${stringIs[i+1]} , $count")
                currentMax = count
                globalMax = globalMax.coerceAtLeast(currentMax)
                if(currentMax == globalMax){
                    unique+=stringIs[i]
                    println("$currentMax , $globalMax , $unique,$count")
                }

            }else{
                count=1
                currentMax = 1
                //println("count0 $i  , ${stringIs[i]} , ${stringIs[i+1]} , $count")
            }
        }
        if(globalMax==1){
            println("$globalMax ${stringIs.toList().sorted().distinct().joinToString("")} ")
        }
        else{
            println("$globalMax ${unique.toList().sorted().distinct().joinToString("")} ")
        }
        input--
    }
}

const val A = """
27
naqnqpnfnfafnnaanfnaaaffapp
31
uyuzzyuuyuyzyyjuzjuyuzjjjjuyuyj

"""
