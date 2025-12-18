package main.kotlin.c01_basics

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

class DefaultUser(
    name: String,
    var lastName: String,
    var age: Int
) {
    var name: String

    init {
        if (name.lowercase().startsWith("a")) {
            this.name = name
        } else {
            this.name = "User"
            println("The name doesn't start with the letter 'a' or 'A'")
        }
    }
}

class User(
    var name: String,
    var lastName: String,
    var age: Int
) {
    constructor(name: String) : this(name, "LastName", 99) {
        println("2nd constructor")
    }

    constructor(name: String, lastName: String) : this(name, lastName, 99) {
        println("3rd constructor")
    }

    init {
        println("User: $name was created")
    }
}

class SuperUser(
    var name: String,
    var lastName: String = "David",
    var age: Int = 99
) {}