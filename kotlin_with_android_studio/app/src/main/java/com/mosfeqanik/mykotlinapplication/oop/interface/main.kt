package com.mosfeqanik.mykotlinapplication.oop.`interface`
fun main() {
    var audiA3 = Track("A3",200.0)
    val teslaS = ElectricTrack(240.0,"Smodel", "Tesla", 85.0)
    teslaS.drive()
    teslaS.brake()
    audiA3.brake()

}