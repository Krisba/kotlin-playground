package main.kotlin.c02_OOP

fun main() {
    val success = Result.Success("SUCCESS")
    val error = Result.Success("FAILED")

    getData(error)
}

fun getData(result: Result) {
    when (result) {
        is Result.Success -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
    }
}

sealed class Result(val message: String) {

    fun showMessage() {
        println("Result $message")
    }

    class Success(message: String) : Result(message)

    sealed class Error(message: String) : Result(message) {
        class RecoverableError(exception: Exception, message: String): Error(message)
        class NonRecoverableError(exception: Exception, message: String): Error(message)
    }
}