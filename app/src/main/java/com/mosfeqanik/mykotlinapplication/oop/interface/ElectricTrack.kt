package com.mosfeqanik.mykotlinapplication.oop.`interface`

class ElectricTrack(maxSpeed: Double, name: String, brand: String, batteryLife: Double) :
    Track(name, maxSpeed) {

    var chargeType = "Type1"
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on ELECTRICITY")

    }

     override fun drive(): String {
        return "Drove for $range KM on ELECTRICITY"
    }

    override fun brake() {
        super.brake()
        println("print in ElectricTrack")
    }


    }