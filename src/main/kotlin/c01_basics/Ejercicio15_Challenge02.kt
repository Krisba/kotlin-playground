package main.kotlin.c01_basics

fun main() {
    var evenNumberCount = 0
    var oddNumberCount = 0

    for (i in 1..100) {
        if (isEven(i)) {
            evenNumberCount++
        } else {
            oddNumberCount++
        }
    }
    println("PARES $evenNumberCount")
    println("IMPARES $oddNumberCount")
}

fun isEven(number: Int): Boolean {
    return (number % 2) == 0
}