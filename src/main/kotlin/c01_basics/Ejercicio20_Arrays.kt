package main.kotlin.c01_basics

fun main() {
    // Type inferred Array<String>
    val names = arrayOf("Jon", "Stephen", "Megan")

    val mixedElements = arrayOf(4, 5, 6, 7, "Name 1", 'a')

    names[0] = "Alex"
    println("First element: ${names[0]}")
    println("The size of the array is: ${names.size}")

    for (name in names) {
        println(name)
    }

    for (i in mixedElements) {
        if (i is Int) {
            println(i)
        }
    }
}