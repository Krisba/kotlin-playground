package main.kotlin.c02_OOP

fun main() {
    var bankAccounts = mutableListOf<BankAccount>()
    val myNewAccount = BankAccount("David")
    val mySecondaryAccount = BankAccount("Bazan")

    myNewAccount.deposit(5000)
    myNewAccount.withdraw(1400)
    myNewAccount.deposit(10000)
    myNewAccount.printStatement()

    bankAccounts.add(myNewAccount)

    mySecondaryAccount.deposit(7000)
    mySecondaryAccount.withdraw(100)
    mySecondaryAccount.deposit(200)
    mySecondaryAccount.printStatement()

    bankAccounts.add(mySecondaryAccount)

    val bankAdministration = Bank(bankAccounts)

    bankAdministration.createAccount("Caroline")

    bankAdministration.deposit("Caroline", 3000)
    bankAdministration.withdraw("Bazan", 1300)

    bankAdministration.transfer("David", "Caroline", 2000)

    bankAdministration.printBankReport()
}

class BankAccount(val owner: String) {

    private var balance = 0
    private val transactions: MutableList<String> = mutableListOf()

    fun deposit(amount: Int) {
        if (amount <= 0) {
            println("Invalid amount")
            return
        }

        balance += amount

        transactions.add("Deposit: $amount")
    }

    fun withdraw(amount: Int): Boolean {
        if (amount <= 0) {
            println("Invalid amount")
            return false
        }
        if (amount !in 1..balance) return false

        balance -= amount
        transactions.add("Withdrawal: $amount")
        return true
    }

    fun getBalance(): Int {
        return balance
    }

    fun printStatement() {
        var totalBalance = getBalance()

        println("Owner: $owner")
        println("Current balance: $totalBalance")
        println("Transactions $transactions")
    }
}

class Bank(private val accounts: MutableList<BankAccount> = mutableListOf()) {

    private fun findAccount(owner: String): BankAccount? {
        return accounts.find { it.owner == owner }
    }

    fun createAccount(owner: String): BankAccount {
        val existingAccount = findAccount(owner)
        if (existingAccount != null) {
            println("User already exists")
            return existingAccount
        }
        val newAccount = BankAccount(owner)
        accounts.add(newAccount)
        return newAccount
    }


    fun deposit(owner: String, amount: Int) {
        val accountToDeposit = findAccount(owner)
        if (accountToDeposit == null) {
            println("Account not found: $owner")
            return
        }
        accountToDeposit.deposit(amount)
    }


    fun withdraw(owner: String, amount: Int) {
        var accountToWithdraw = findAccount(owner)

        if (accountToWithdraw == null) {
            println("Account not found: $owner")
            return
        }

        val ok = accountToWithdraw.withdraw(amount)
        if (!ok) println("Insufficient funds or invalid amount")
    }

    fun transfer(fromOwner: String, toOwner: String, amount: Int) {
        if (amount <= 0) {
            println("Invalid amount")
            return
        }

        var senderAccount = findAccount(fromOwner)
        var receiverAccount = findAccount(toOwner)

        if (senderAccount == null || receiverAccount == null) {
            println("Transaction failed")
            return
        }

        if (!senderAccount.withdraw(amount)) {
            println("Insufficient funds or invalid amount")
            return
        }

        receiverAccount.deposit(amount)
    }

    fun printBankReport() {
        println("---- BANK REPORT ----")

        if (accounts.isEmpty()) {
            println("No accounts in the bank")
            return
        }

        var totalMoney = 0
        accounts.forEach {
            totalMoney += it.getBalance()
        }

        println("Total money in bank: $totalMoney")

        val richestAccount = accounts.maxByOrNull { it.getBalance() }
        if (richestAccount != null) {
            println("Account with highest balance:")
            println("${richestAccount.owner}: ${richestAccount.getBalance()}")
        }

        println("\nAccounts summary:")
        accounts.forEach {
            println("${it.owner} -> ${it.getBalance()}")
        }
    }

}