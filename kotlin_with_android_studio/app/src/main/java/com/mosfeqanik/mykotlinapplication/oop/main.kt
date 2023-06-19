package com.mosfeqanik.mykotlinapplication.oop

fun main() {
    val mobilePhone =
        MobilePhone(osName = "Android", brand = "samsung", model = "Galazy", objectbattery = 30)

    println(mobilePhone.chargeBattery())
}