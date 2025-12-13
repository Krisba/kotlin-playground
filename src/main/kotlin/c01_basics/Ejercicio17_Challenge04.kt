package main.kotlin.c01_basics

fun main() {
    login("admin", "3333")
    login("employee", "1234")
    login("admin", "1234")
}

fun login(user: String?, password: String?): Boolean {
    val correctUsername = "admin"
    val correctPass = "1234"

    if (user == correctUsername && password == correctPass) {
        println("Login successful")
        return true
    } else {
        println("Login failed")
        return false
    }
}
