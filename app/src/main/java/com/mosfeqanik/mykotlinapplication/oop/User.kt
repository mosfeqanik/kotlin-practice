package com.mosfeqanik.mykotlinapplication.oop

data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Denis")
//    val name = user1.name
//    println(name)
//    user1.name = "Michael"
    val user2 = User(1, "Michael")
//    println(user1.equals(user2))
    println(user1 == user2)
    println("User Details : $user1")
    var updatedUser = user1.copy()
    println("User Details : $updatedUser")
    updatedUser = user1.copy(2)
    println("User Details : $updatedUser")
    updatedUser = user1.copy(name = "Denis Panu")
    println("User Details : $updatedUser")
    println("User Details1 : ${updatedUser.component1()}")
    println("User Details2 : ${updatedUser.component2()}")

    val (id, name) = updatedUser
    println("updated user id is ${id}")
    println("updated user name is ${name}")

}

