package com.mosfeqanik.mykotlinapplication.oop.inheritance

fun main() {
    val audioA3 = Car("A3")
    val teslaS = ElectricCar("Smodel", "Tesla", 85.0)

//    var objl: Any
    teslaS.chargeType="Type2"
    teslaS.extendRange(200.0)

    audioA3.drive(200.0)
    teslaS.drive(200.0)
    teslaS.drive()
    teslaS.drive(200.0)


}