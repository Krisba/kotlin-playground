package main.kotlin.c02_OOP

fun main() {
    val user1 = User("Chris", "David", 30)
    val user2 = User("Chris", "David", 30)

    // if we override the equals function it returns true, else false
    println(user1 == user2)
    // toString function
    println(user1)
}

//class User(var firstName: String, var lastName: String, var age: Int) {
//
//    override fun equals(other: Any?): Boolean {
//        if (this === other) {
//            return true
//        }
//
//        if (other is User) {
//            return this.firstName == other.firstName
//                    && this.lastName == other.lastName
//                    && this.age == other.age
//        }
//
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//
//    override fun toString(): String {
//        return "User first name: $firstName, last name:  $lastName, age: $age"
//    }
//}

// By putting the data keyword, all the logic we did above is going to be already implemented
data class User(var firstName: String, var lastName: String, var age: Int)
