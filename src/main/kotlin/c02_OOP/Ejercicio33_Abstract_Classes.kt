package main.kotlin.c02_OOP

fun main() {
}

abstract class ModernVehicle() {
    abstract fun move()

    abstract fun stop()
}

class Truck(var name: String, var color: String, val engines: Int, val doors: Int): ModernVehicle() {
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

}