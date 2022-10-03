package com.mosfeqanik.myfirstapp

fun main() {
    // for loop
    print("1 to 10 ->")
    for (num in 1..10){
        print(" $num ")
    }
    println("")
    print("1 until 10 ->")
    for(i in 1 until 10){
        print(" $i ")
    }
    println("")
    print("10 down to 1 ->")
    for (i in 10 downTo 1){
        print(" $i ")
    }
    println("")
    print("10 down to 1 step 2 ->")
    for (i in 10 downTo 1 step 2){
        print(" $i ")
    }
    println()
    print("same 10 down to 1 step 2 ->")
    for (i in 10 .downTo(1).step(2)){
        print(" $i ")
    }
}
