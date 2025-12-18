package main.kotlin.c02_OOP

fun main() {
//    val instance = Database.getInstance()
//    val instance2 = Database.getInstance()
//    println(instance)
//    println(instance2)

// We print singleton
// It creates Database only once
    println(Database)
    println(Database)
}

//class Database private constructor() {
//    companion object {
//        private var instance: Database? = null
//
//        fun getInstance(): Database? {
//            if (instance == null) {
//                instance = Database()
//            }
//            return instance
//        }
//    }
//}

// Singleton with same function as the private class above
object Database {
    init {
        println("Database created")
    }
}