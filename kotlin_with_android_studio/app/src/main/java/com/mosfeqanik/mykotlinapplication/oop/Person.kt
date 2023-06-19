package com.mosfeqanik.mykotlinapplication.oop

fun main() {
    var a: Int
    myFunctionScope(a = 3)
    var person = Person()
    person.stateHobby()
    person.hobby = "to skateboard"
    person.stateHobby()

    var person2 = Person("2 Mosfeq", "Anik", 32)
    person2.age = 31
//    var person1 = OopMain(firstname = "3 john")
//    var person2 = OopMain(lastname = "Anik")
//    var Samsung_Galaxy_S20_Ultra =
//        MobilePhone(osName = "Android", brand = "Samsung", model = "Galaxy S20 Ultra")
//    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
//    val galaxyS20 = MobilePhone("Android", "Samsung", "Galaxy S20")
//    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

///
class Person constructor(firstname: String = "1 john", lastname: String = "doe") {
    //    Member Variables - Properties
    var age: Int? = null
    var hobby: String = "Watch Netflix"

    //Initializer Block
    init {
        println("name $firstname $lastname")
    }

    //Member secondary Constructor
    constructor(firstname: String, lastname: String, age: Int) : this(firstname, lastname) {
        this.age = age

        println("name $firstname $lastname & $age age")

    }

    //    Member Functions - Methods
    fun stateHobby() {
        println("My Hobby is $hobby")
    }
}

///scope and shadowing
fun myFunctionScope(a: Int) {
//    a=a
    var b = a
    println("$b")
}