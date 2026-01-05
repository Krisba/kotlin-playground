package main.kotlin.c02_OOP

fun main() {
    val car = Tesla("Cybertruck", "Red")

    car.startEngine()
}

interface Engine {
    fun startEngine()
}

class Tesla(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("Tesla is starting the engine")
    }
}

class Motorbike(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("The motorbike is starting the engine")
    }
}

class Train(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("The train is starting the engine")
    }
}