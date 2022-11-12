package com.mosfeqanik.mykotlinapplication.oop.inheritance

class ElectricCar( name: String, brand: String, batteryLife: Double) :
    Car( name) {

    var chargeType = "Type1"
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on ELECTRICITY")

    }

    fun drive() {
        println("Drove for $range KM on ELECTRICITY")
    }
}