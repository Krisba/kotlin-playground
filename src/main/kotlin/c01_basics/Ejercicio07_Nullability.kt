package main.kotlin.c01_basics

fun main() {
    // Can't do this because all variables are non-nullable
    // val text: String = null

    val text: String? = "Name"

    // First we must check it is not null
    // println(text.length)

    // These two are the same
    if (text != null) println(text.length)
    println(text?.length)

    // Only if you know the variable is not null
    println(text!!.length)

   // ------

    // Elvis operator, checks nullability
    val text2: String = text ?: "Some text."
    println(text2)

    // -----

    // Let {}
    val name: String? = "Chris"

    name?.let {
        println("Length: ${it.length}")
    }

    // Throw exception
    val text3 = name ?: throw IllegalArgumentException("Name is null")
}