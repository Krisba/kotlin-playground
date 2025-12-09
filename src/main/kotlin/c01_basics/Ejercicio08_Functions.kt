package main.kotlin.c01_basics

fun main() {
    sayHello("Chris", 30)

    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some data")
    } else {
        showMessage()
    }
}

fun sayHello(name: String, age: Int) {
    println("Hello $name! Your age is $age")
}

fun getData(data: String) {
    println("Your data is $data")
}

fun showMessage() {
    println("There is no internet connection")
}