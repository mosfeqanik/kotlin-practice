package com.mosfeqanik.mykotlinapplication.oop

class MobilePhone(osName: String, brand: String, model: String, objectbattery: Int) {
    var classBattery: Int = objectbattery
    fun chargeBattery(): Int {

        if (this.classBattery < 100) {
            val chargeNeeded: Int = 100 - this.classBattery
            return chargeNeeded
        }
        return 0
    }

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}