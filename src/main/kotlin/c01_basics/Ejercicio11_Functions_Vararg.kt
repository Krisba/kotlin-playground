package main.kotlin.c01_basics

fun main() {
    println(sum(5, 6, 7, 10))
    println(sum(5, 6, 7, 10, 20))
}

fun sum(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}