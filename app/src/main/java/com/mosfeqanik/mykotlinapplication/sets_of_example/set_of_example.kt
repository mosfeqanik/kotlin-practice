package com.mosfeqanik.mykotlinapplication.sets_of_example

fun main(){
    val fruits = setOf("Orange","Apple","Grape","Apple","Orange")
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water melon")
    newFruits.add("pear")
    println(newFruits.toSortedSet())

    println(newFruits.elementAt(4))
}