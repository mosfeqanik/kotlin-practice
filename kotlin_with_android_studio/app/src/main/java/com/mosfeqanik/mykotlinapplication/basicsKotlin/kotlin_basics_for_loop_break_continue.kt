package com.mosfeqanik.myfirstapp

fun main() {
    for (i in 1 until  20){

        if (i/2==5){
            break
        }
        print("$i ")
    }
    println("")
    for (i in 1 until  20){

        if (i/2==5){
            continue
        }
        print("$i ")
    }
}
