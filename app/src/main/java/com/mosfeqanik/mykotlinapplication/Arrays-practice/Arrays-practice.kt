package com.mosfeqanik.mykotlinapplication.`Arrays-practice`

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7)
//    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println(numbers.contentToString())
    for (element in numbers) {
        print("$element ")
    }
    for (element in numbers) {
        print("\nAfter adding 2 =${element + 2} \n")
    }
    println()
    println(numbers[4])
    numbers[4] = 3
    numbers[2] = 2
    numbers[1] = 3
    numbers[3] = 1
    println(numbers.contentToString())

    val numbersD = arrayOf(1.3, 2.2, 3.4, 4.7, 5.5, 6.6, 7.4)
//    val numbersD = doubleArrayOf(1.3, 2.2, 3.4, 4.7, 5.5, 6.6, 7.4)

    println(numbersD.contentToString())

    val days = arrayOf("Sun", "Mon", "tues", "Wed", "Thurs", "Fri", "Sat")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.3), Fruit("orange", 3.5))
    println(fruits.contentToString())

    for (fruit in fruits) {
        print("${fruit.name}\n")

    }
    for (index in fruits.indices) {
        println("${fruits[index].name} is in index $index")
    }

}

data class Fruit(val name: String, val price: Double)