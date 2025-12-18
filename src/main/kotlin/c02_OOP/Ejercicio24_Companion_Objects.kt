package main.kotlin.c02_OOP

fun main() {
// If we declare a companion object we don't need the instance of the class
//    val calculator = Calculator()
//    val result = calculator.sum(5, 10)
//    println("Result:  $result")

    val result = Calculator.sum(5, 10)
    println("Result:  $result")

    val maxVariable = Calculator.max
    println("Max variable:  $maxVariable")
}

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }

        var max = 100
    }
}