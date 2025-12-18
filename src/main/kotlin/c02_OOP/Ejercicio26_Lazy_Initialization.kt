package main.kotlin.c02_OOP

import main.kotlin.c01_basics.User

fun main() {
    val user1 = User("Chris")
    val user2 by lazy {
        User("User1", "lastName", 20)
    }

    println(user2.name)
}