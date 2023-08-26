package com.example.dsakotlin

fun main() {

    val str1="ab#c"
    val str2="ad#c"
    println(backSpaceCompare(str1,str2))

}

fun backSpaceCompare(str1: String, str2: String): Any? {
    var str1Pointer = str1.length-1
    var str2Pointer = str2.length-1

    if (str1.length!=str2.length){
        return false
    }else{
        while ((str1Pointer>=0) or (str2Pointer >=0)){
            val validCharacter1 = getValidCharacter(str1,str1Pointer)
            val validCharacter2 = getValidCharacter(str2,str2Pointer)

            println("$validCharacter1 , $validCharacter2")
            if ((validCharacter1 < 0) and (validCharacter2<0)){
                return true
            }
            if ((validCharacter1 < 0) or (validCharacter2<0)){
                return false
            }
            if(str1[validCharacter1] != str2[validCharacter2]){
                return false
            }
            str1Pointer-=1
            str2Pointer-=1
        }
        return true
    }
}

fun getValidCharacter(str1: String, strPointer: Int): Int {
    var backSpaceCount = 0
    var strPointerIs = strPointer
    while (strPointerIs>=0){
        if (str1[strPointerIs]=='#'){
            backSpaceCount+=1
        }else if (backSpaceCount>0){
            backSpaceCount-=1
        }else{
            break
        }
        strPointerIs-=1
    }
    return strPointerIs
}