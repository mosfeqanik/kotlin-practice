package com.mosfeqanik.mykotlinapplication.oop.abstract_example

fun main() {
    val human = Human(
        "Denis", "Russia",
        70.0, 28.0
    )
    val elephant = Elephant(
        "Rosy", "India",
        5400.0, 25.0
    )
    human.displayDetails()
    elephant.displayDetails()
    human.run()
    elephant.run()

    human.breath()
    elephant.breath()

}