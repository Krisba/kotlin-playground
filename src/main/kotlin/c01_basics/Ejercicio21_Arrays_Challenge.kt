package main.kotlin.c01_basics

// Create a function that will take as an argument an array of integers.
// Determine which number is the biggest number of that array and return it
// Do the opposite with another function
// Combine the functions in a single function

fun main() {
    val numbers = arrayOf(1, 2, 43, 546, 646, 788, 1244)

    val result = findMaxOrMin(numbers, true)

    println("The max value is ${result}")
}

fun findBiggestNumber(numbers: Array<Int>): Int? {
    return numbers.maxOrNull()
}

fun findLowestNumber(numbers: Array<Int>): Int? {
    return numbers.minOrNull()
}

fun findMaxOrMin(numbers: Array<Int>, findMax: Boolean): Int? {
    return if (findMax) {
        findBiggestNumber(numbers)
    } else {
        findLowestNumber(numbers)
    }
}
