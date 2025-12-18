package main.kotlin.c02_OOP

fun main() {
    for (direction in Direction.values()) {
        println(direction)
    }

    println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.NORTH.name)

    Direction.EAST.printData()

    val direction = Direction.WEST

    when(direction) {
        Direction.WEST -> println("The direction is WEST")
        Direction.EAST -> println("The direction is EAST")
        Direction.SOUTH -> println("The direction is SOUTH")
        Direction.NORTH -> println("The direction is NORTH")
    }
}

// Fixed set of values
enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData() {
        println("Direction: $direction and distance: $distance")
    }
}