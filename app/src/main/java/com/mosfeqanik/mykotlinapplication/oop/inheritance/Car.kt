package com.mosfeqanik.mykotlinapplication.oop.inheritance

open class Car(val name: String) {
    open var range: Double = 0.0
    fun extendRange(amount: Double) {
        if (amount > 0)
            range += amount
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }
}