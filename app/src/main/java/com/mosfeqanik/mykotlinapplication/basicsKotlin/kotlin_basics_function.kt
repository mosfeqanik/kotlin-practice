package com.mosfeqanik.myfirstapp

fun main() {
    myFunction()
    myFunction()
    println(addUp(3,5))
    var result = addUp(4,5)
    println("result $result")
    println(addUp(3,5))
    var avgresult = avg(6.4,8.4)
    println("$avgresult")
    println(avg(3.4,2.4))
}

fun myFunction() {
    println("Called from myFunction")
}

fun addUp(a: Int, b: Int): Int {
    return a + b
}
fun avg(a: Double, b: Double): Double {
    return (a+b) / 2
}