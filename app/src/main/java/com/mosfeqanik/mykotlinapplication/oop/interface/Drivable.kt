package com.mosfeqanik.mykotlinapplication.oop.`interface`

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("the drivable is breaking")
    }
}