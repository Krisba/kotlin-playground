package main.kotlin.c01_basics

// Create an arbitrary range of numbers, go through the range
// and determine if a number is an even or an odd number.
// If the number is an odd number, skip that number.
// If the number is an even number, display it on the console.
// Count all the even numbers that are found in the range and display
// the total number of even numbers

fun main() {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber) {
        number++

        if (!isEvenNumber((number))) {
            continue
        }

        evenNumberCounter++
        println(number)
    }
    println("EVEN NUMBERS FOUND = $evenNumberCounter")
}

fun isEvenNumber(number: Int): Boolean {
    return (number % 2) == 0
}