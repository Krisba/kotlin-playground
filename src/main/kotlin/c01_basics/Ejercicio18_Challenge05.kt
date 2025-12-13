package main.kotlin.c01_basics

fun main() {
    for (i in 1..50) {
        if (isDivisibleByThree(i) && isDivisibleByFive(i)) {
            println("FizzBuzz")
        } else if (isDivisibleByThree(i)) {
            println("Fizz")
        } else if (isDivisibleByFive(i)) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}

fun isDivisibleByThree(number: Int): Boolean {
    return (number % 3) == 0
}

fun isDivisibleByFive(number: Int): Boolean {
    return (number % 5) == 0
}
