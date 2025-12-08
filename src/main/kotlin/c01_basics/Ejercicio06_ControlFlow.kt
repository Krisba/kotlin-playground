package main.kotlin.c01_basics

fun main() {
    val a = 10
    val b = 20

    // If / else
    val max = if (a > b) a else b
    println("max = $max")

    // When (switch de Kotlin)
    val grade = 85
    val result = when (grade) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        else -> "C"
    }
    println("Grade result: $result")

    // Logical operators
    val isAdult = true
    val hasID = false
    println("Can enter = ${isAdult && hasID}")
}
