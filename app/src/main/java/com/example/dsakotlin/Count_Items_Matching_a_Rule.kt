package com.example.dsakotlin

fun main() {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var itemCount = 0
        itemCount = items.count{
            println(it)
            it[when(ruleKey){
                "type" -> 0
                "color" -> 1
                else->2
            }] == ruleValue
        }
        return itemCount
    }
    val items = listOf(listOf("phone","blue","pixel"),
        listOf("computer","silver","lenovo"), listOf("phone","gold","iphone"))
    val ruleKey  = "type"
    val ruleValue  = "phone"
    //println(items)
    println(countMatches(items , ruleKey , ruleValue))

}

//[["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]]
//"type"
//"phone"