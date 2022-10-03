package com.mosfeqanik.myfirstapp

//Write a for loop that runs from 0 to 10000
//Once it's at 9001 it should write "IT'S OVER 9000!!!"
//
//Write a while loop that checks the humidity (not the humidityLevel).
// The variable humidityLevel starts at 80. The variable humidity is initialized with "humid".
// If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
//Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"
fun main() {
    // for loop
    print("0 to 10000 ->")
    for (num in 0..10000) {
        if (num == 9001) {
            print(" IT'S OVER 9000!!! ")
        }
    }
    var anikhumidityLevel = 80
    var anikhumidity = "humid"
    while (anikhumidityLevel <= 60) {
        anikhumidityLevel -= 5
    }
    print("it's comfy now")
    anikhumidity = "comfy"

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel-=5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
        }
    }

    for (x in 0..9) {
        for (y in 0..9) {
            println("Result = ${x * y}")
        }
    }

}
