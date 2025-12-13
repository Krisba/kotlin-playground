package main.kotlin.c01_basics

fun main() {
    val car1 = Car("    Tesla", "S Plaid", "Red", 4)

    println("Name: ${car1.name}")
    println("Model: ${car1.model}")
    println("Color: ${car1.color}")
    println("Doors: ${car1.doors}")

    car1.move()
    car1.stop()

    val car2 = Car("Ford", "Mustang", "Blue", 2)

    println("\n")
    println("Name: ${car2.name}")
    println("Model: ${car2.model}")
    println("Color: ${car2.color}")
    println("Doors: ${car2.doors}")

    car2.move()
    car2.stop()
}

class Car(
    name: String,
    var model: String,
    var color: String,
    var doors: Int
) {
    // We can pass the attribute as a variable too instead of
    // defining the property in the constructor. This is useful to manipulate
    // the value
    var name = name.trim()

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}