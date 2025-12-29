package main.kotlin.c02_OOP

// Create a class using another class. You can get functions and properties
// that the base class already has and add new ones in the new class

fun main() {
    val car = Car("BMW", "Red", 1, 4)
    val plane = Plane("Boeing", "White and blue", 4, 2)

    // I can use the functions of class Vehicle because we inherited them
    car.move()
    car.stop()

    plane.move()
    plane.stop()
}

open class Vehicle(val name: String, val color: String) {
    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name has stopped")
    }
}


class Car(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {
    // We can override the inherited functions
    override fun move() {
        super.move()
    }
}

class Plane(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {
    override fun move() {
        flying()
        super.move()
    }

    fun flying() {
        println("$name is flying")
    }
}