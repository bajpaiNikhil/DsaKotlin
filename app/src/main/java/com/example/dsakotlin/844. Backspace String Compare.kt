package com.example.dsakotlin

fun main() {

    val str1="xy#z"
    val str2="xyz#"
    println(backSpaceCompare(str1,str2))

}

fun backSpaceCompare(str1: String, str2: String): Any? {
    val str1Pointer = str1.length-1
    val str2Pointer = str2.length-1

    if (str1.length!=str2.length){
        return false
    }else{
        str1.getValidCharacter()

    }
    return str1
}

private fun String.getValidCharacter() {

}

