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

}