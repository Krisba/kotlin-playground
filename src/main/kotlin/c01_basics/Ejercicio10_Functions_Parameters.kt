package main.kotlin.c01_basics

fun main() {
    sendMessage("Alexa")

    // You can change parameter order if you declare it
    sendMessage(message = "Hello", name = "Alexa")
}

fun sendText() = "Some text"

// Default parameter
fun sendMessage(name: String, message: String = sendText()) {
    println("Name = $name and message $message")
}