package com.mosfeqanik.mykotlinapplication.Typecasting

import kotlin.math.floor

fun main() {
    val stringList: List<String> = listOf("Denis", "Frank", "Micheal", "Garry")
    val mixedTypeList: List<Any> = listOf("Denis", 31, 5, "Micheal", 70.5, "Garry")
    for (value in mixedTypeList) {
        if (value is Int) {
            println("Integer: '$value'")
        } else if (value is Double) {
            println("Double: '$value' with Floor Value ${floor(value)}")
        } else if (value is String) {
            println("String: '$value' of length ${value.length}")
        } else {
            println("Unknown type")
        }
    }
    //Alternatively
    for (value in mixedTypeList) {
        when (value) {
            is Int -> println("Integer: '$value'")
            is Double -> println("Double: '$value' with Floor Value ${floor(value)}")
            is String -> println("String: '$value' of length ${value.length}")
            else -> println("Unknown type")
        }
    }

    //SMART CAST
    val obj1: Any = "I have a Dream"
    if (obj1 !is String) {
        println("Not a string")
    } else {
        println("String is ${obj1}")
        println("Found a String of length ${obj1.length}")
    }

    val str1: String = obj1 as String
    println(str1.length)

//    val obj2: Any = 1337
//    val str2: String = obj2 as String
//    println(str2)

    val obj3: Any = 1337
    val str3: String? = obj3 as? String
    println(str3)

}