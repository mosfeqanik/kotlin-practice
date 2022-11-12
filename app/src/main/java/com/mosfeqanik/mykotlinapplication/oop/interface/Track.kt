package com.mosfeqanik.mykotlinapplication.oop.`interface`

open class Track(val name: String, override val maxSpeed: Double) : Drivable {
    open var range: Double = 0.0
    fun extendRange(amount: Double) {
        if (amount > 0)
            range += amount
    }

//    override fun drive(): String {
//        return "driving the interface drive"
//    }
    override fun drive(): String = "driving the interface drive"

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }
}