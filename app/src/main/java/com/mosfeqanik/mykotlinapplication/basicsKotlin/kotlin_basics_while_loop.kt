package com.mosfeqanik.myfirstapp

fun main() {
    var x = 10
    while (x <= 20) {
        println("while loop $x")
        x++
    }
    println("while loop is done")
    var start = 100
    while (start >= 90) {
        println("New while loop $start")
        start -= 2
    }
    println("while loop is done")
    x = 1
    do {
        x++
        println("do while loop $x")
    } while (x <= 20)
    println("do while loop done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold")
        roomTemp++
    if (roomTemp >= 20) {
        feltTemp = "comfy"
        println("it's $feltTemp now")
    }
//    person("ads","sad")
}
//class person(firstName: String, lastName: String) {
//    init {
//        println("$firstName $lastName")
//    }
//}