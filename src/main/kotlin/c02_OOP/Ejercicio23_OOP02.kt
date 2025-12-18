package main.kotlin.c02_OOP

import main.kotlin.c01_basics.DefaultUser
import main.kotlin.c01_basics.SuperUser
import main.kotlin.c01_basics.User

fun main() {
    val user = DefaultUser("Alex", "Martinez", 23)
    val friend = DefaultUser("Jon", "Smith", 33)

    println("Name: ${user.name}")
    println("Name: ${friend.name}")
    println("\n")

    val user2 = User("Alex")

    println("Name: ${user2.name}")
    println("Last Name: ${user2.lastName}")
    println("Age: ${user2.age}")
    println("\n")

    val user3 = User("Mike", "Jordan")

    println("Name: ${user3.name}")
    println("Last Name: ${user3.lastName}")
    println("Age: ${user3.age}")
    println("\n")

    val user4 = SuperUser(name = "Christopher")
    val user5 = SuperUser(age = 30, name = "Ioana", lastName = "Dobby")

    println("Name: ${user4.name}")
    println("Last Name: ${user4.lastName}")
    println("Age: ${user4.age}")
    println("\n")
    println("Name: ${user5.name}")
    println("Last Name: ${user5.lastName}")
    println("Age: ${user5.age}")
}