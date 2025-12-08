package main.kotlin.c01_basics

fun main() {
    var userName: String = "World"
    // Val cannot be reassigned
    userName = "Chris"

    var age: Int = 30

    println("Hello $userName, your age is $age")
}