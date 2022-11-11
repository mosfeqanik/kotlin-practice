package com.mosfeqanik.mykotlinapplication.oop

fun main() {
    var carDetails = car()
    carDetails.owner
    println(carDetails.owner)
    println("cardetails ${carDetails.myBrand}")
    carDetails.maxspeed = 200
    println("cardetails ${carDetails.maxspeed}")

//    carDetails.maxspeed = -2
//    println("cardetails ${carDetails.maxspeed}")
//      carDetails.myModel="m3"
//      because set is private
    println("car model is ${carDetails.myModel}")
}

class car() {
    lateinit var owner: String


    val myBrand: String = "BMW"
        get() {
            return field.toLowerCase()
        }
    var maxspeed: Int = 250
        //        get() = field
        set(value) {
            field =
                if (value > 0) value else throw java.lang.IllegalArgumentException("Maxspeed can not be below zero")
        }
    var myModel: String = "MS"
        private set

    init {
        owner = "ANIK"
        this.myModel = "m3"
    }
}