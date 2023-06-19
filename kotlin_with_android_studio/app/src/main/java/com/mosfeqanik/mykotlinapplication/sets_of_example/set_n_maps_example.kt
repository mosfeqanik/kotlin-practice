package com.mosfeqanik.mykotlinapplication.sets_of_example

fun main() {
    val fruits = setOf("Orange", "Apple", "Grape", "Apple", "Orange")
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water melon")
    newFruits.add("pear")
    println(newFruits.toSortedSet())

    println(newFruits.elementAt(4))

    val dasOftheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "wednesday")
    println(dasOftheWeek[2])

    for (key in dasOftheWeek.keys) {
        print("$key in to  ${dasOftheWeek[key]}")
    }

    val fruitsMap =
        mapOf(
            "1 choice" to FruitDetails("apple", 2.5),
            "2 choice" to FruitDetails("mango", 4.5),
            "3 choice" to FruitDetails("orange", 4.5)
        )
    val newdaysOftheWeek=dasOftheWeek.toMutableMap()
    newdaysOftheWeek[4] = "Thursday"
    newdaysOftheWeek[5] = "Thursday"
    println()
    println("${newdaysOftheWeek.toSortedMap()} ")

}

data class FruitDetails(val name: String, val price: Double)