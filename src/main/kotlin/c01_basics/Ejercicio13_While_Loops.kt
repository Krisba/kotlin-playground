package main.kotlin.c01_basics

fun main() {
    var number = 0

//    while (number < 5) {
//        number++
//        println(number)
//
//        var i = 0
//
//        while (i < 5) {
//            i++
//            println("***$i")
//        }
//    }

//    do {
//        println(number)
//        number++
//    } while (number < 10)

//    while (number < 10) {
//        number++
//
//        if (number == 7) {
//            break
//        }
//        println(number)
//    }

    outer@ while (number < 5) {
        number++
        println(number)

        var i = 0

        while (i < 5) {
            if (i == 1) break@outer
            i++
            println("***$i")
        }
    }
}