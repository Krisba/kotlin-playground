package main.kotlin.c02_OOP

// Create a class that will represent a bank account of a person and the class
// will have three properties: Account Name, Balance, Transactions (mutable list)
// Create functions for deposit and withdrawal

fun main() {
    val account = MoneyAccount("Chris")

    account.deposit(2000)
    account.withdraw(1000)

    account.deposit(200)
    account.withdraw(500)

    account.printAccountInfo()
}

class MoneyAccount(val accountName: String) {
    private var balance = 0 // We don't want to access the balance outside the class
    private val transactions = mutableListOf<String>()

    fun deposit(amount: Int) {
        balance += amount
        transactions.add("Deposit: $amount")
    }

    fun withdraw(amount: Int) {
        if (amount > balance) {
            println("Insufficient funds")
            return
        }
        balance -= amount
        transactions.add("Withdrawal: $amount")
    }

    fun printAccountInfo() {
        println("Account name: $accountName")
        println("Balance: $balance")
        println("Transactions:")
        transactions.forEach { println(it) }
    }
}