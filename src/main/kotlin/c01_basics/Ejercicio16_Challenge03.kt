package main.kotlin.c01_basics

fun main() {
    var firstName = "Chris"
    var secondName = "David"
    var surname = null

    printNameLength(firstName)
    printNameLength(secondName)
    printNameLength(surname)
}

fun printNameLength(name: String?) {
    val message = name?.let {
        "Length is: ${it.length}"
    } ?: "Name is null"

    println(message)
}
