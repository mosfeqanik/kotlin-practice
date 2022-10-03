package com.mosfeqanik.myfirstapp

fun main() {

    var name: String = "anik"
    println(name)
    name = "Mosfeq anik"
    println(name)
    var nullableName: String? = "Anan"
//    nullableName = null
    println(nullableName)
    var len2 = name.length
    var newNullableName = nullableName ?: "Guest"
    var len = newNullableName?.length
    println(nullableName!!.toLowerCase())
    newNullableName?.let { println(it.length) }

//    if(nullableName !=null){
//        var len2 = nullableName.length
//    }else{
//        null
//    }

}
