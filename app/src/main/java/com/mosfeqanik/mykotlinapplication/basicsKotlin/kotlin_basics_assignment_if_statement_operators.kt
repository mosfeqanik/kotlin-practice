package com.mosfeqanik.myfirstapp

fun main() {

    ///If else statement
    var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2) {
        println("heightPerson1 is greater than heightPerson2")
    } else if (heightPerson1 == heightPerson2) {
        println("heightPerson1 is equal heightPerson2")
    } else {
        println("oops")
    }

    val age = 21
    if (age >= 21) {
        println("now you may drink in the us")
    } else if (age >= 18) {
        println("you may vote now")
    } else if (age >= 16) {
        println("you may drive now")
    } else {
        println("you're too young")
    }

    when (age) {
        in 21..15 -> println("now you may be drink in the US")
        !in 0..20 -> println("Not IN use")
        in 18..20 -> println("you may vote in us")
        16, 17 -> println("you may drive in us")
        else -> println("you're too young")
    }

    var personName = "Anik"
    if (personName == "Anik") {
        println("its Anik")
    }
    var season = 2
    when (season) {
        1 -> println("spring")
        2 -> println("Summer")
        3 -> {
            println("fail")
            println("Autumn")
        }
    }

    var month = 2
    when (month) {
        in 3..5 -> println("its between 3 and 5")
        in 6..8 -> println("its between 6 and 8")
        in 9..11 -> println("its between 9 and 11")
        in 12 downTo 2 -> println("its between 12 and 2")
        12, 2, 1 -> println("it is 12 ,2 or 1")
        else -> println("inValid number")
    }

    var x : Any = 13
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is an Double")
        is String -> println("$x is an String")
        else -> println("$x is none if the above")
    }

}
