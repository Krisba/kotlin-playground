package main.kotlin.c01_basics

fun main() {
//    for (i in 1..10) {
//        println("i = $i")
//    }

//    for (i in 1 until 10) {
//        println(i)
//    }

//    for (i in 10 downTo 1) {
//        println(i)
//    }

//    for (i in 1 until 10 step 2) {
//        println(i)
//    }

    for (i in 0..10) {
        if (i in 3..8) {
            continue
        }
        println(i)
    }
}