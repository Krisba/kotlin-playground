package main.kotlin.c01_basics

fun main() {
    var number = 23

    val integerMaxValue = Int.MAX_VALUE
    val integerMinValue = Int.MIN_VALUE

    println("integer Min Value: $integerMinValue, integer Max Value: $integerMaxValue")

    // Larger number will need to be stored as Long type
    // Default type inferred is Int
    number = 2147483647

    val byteMaxValue: Byte = Byte.MAX_VALUE
    val byteMinValue: Byte = Byte.MIN_VALUE

    println("Byte Max value $byteMaxValue, Byte Min value: $byteMinValue")

    val shortMaxValue: Short = Short.MAX_VALUE
    val shortMinValue: Short = Short.MIN_VALUE

    println("Short Max value $shortMaxValue, Short Min value: $shortMinValue")

    val longMaxValue: Long = Long.MAX_VALUE
    val longMinValue: Long = Long.MIN_VALUE

    println("Long Max value $longMaxValue, Long Min value: $longMinValue")

    // Assign Long type with L
    val myNumber = 28L
}