package main.kotlin.c01_basics

fun main() {
    var option = 2

    when (option) {
        1 -> showNumbers()
        2 -> showEvenNumbers()
        3 -> countOddNumbers()
        0 -> println("Exit")
        else -> println("Invalid option")
    }
}

fun showNumbers() {
    // Show numbers from 1 to 10
    for (i in 1..10) {
        println(i)
    }
}

fun showEvenNumbers() {
    // Show even numbers from 1 to 20
    for (i in 20 downTo 1 step 2) {
        println(i)
    }
}

fun countOddNumbers() {
    // show odd numbers from 1 to 50
    // Count total
    var totalOddNumbers = 0

    for (i in 1..50) {
        if (isOddNumber(i)) {
            totalOddNumbers++
        }
    }
    println(totalOddNumbers)
}

fun isOddNumber(number: Int): Boolean {
    return (number % 2) != 0
}
