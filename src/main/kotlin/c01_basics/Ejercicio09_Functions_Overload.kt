package main.kotlin.c01_basics

fun main() {
    val max = getMax(5, 9, c = 100)
    println(max)
}

fun getMax(a: Int, b: Int): Int {
    // val max = if (a > b) a else b
    // return max

    // Same function different expression
    return if (a > b) a else b
}

// Single expression
// Function overload
fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}