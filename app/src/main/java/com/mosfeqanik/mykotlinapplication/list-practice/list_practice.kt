package com.mosfeqanik.mykotlinapplication.`list-practice`

fun main() {
    val months = listOf("january", "February", "March")
    val anyTypes = listOf("string", 1, 2, 3, true, false)
    println(anyTypes.size)
    println(anyTypes[3])

    val addionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "may", "june")
    println(addionalMonths)

    addionalMonths.addAll(newMonths)
    addionalMonths.add("nov")
    println(addionalMonths)
    val days = mutableListOf("Sun", "Mon", "tues", "Wed", "Thurs", "Fri")
    println(days)
    days.add("Sat")
    println(days)

    val daysupdate = mutableListOf<String>("sat", "Sun", "Mon", "tues", "Wed", "Thurs", "Fri")
    println(daysupdate)
    daysupdate.remove("sat")
    println(daysupdate)
    daysupdate.removeAt(2)
    println(daysupdate)
    val removeList = mutableListOf<String>("Thurs", "Fri")
    daysupdate.removeAll(removeList)
    println(daysupdate)


}