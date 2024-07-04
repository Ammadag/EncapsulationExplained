package com.example.learningtasks


class BankAccount(private var Balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            Balance += amount
        }
    }

    fun withdraw(amount: Double) {
        if(amount > 0 && amount < Balance) {
            Balance -= amount

        }
    }

    fun getBalance(): Double {
        return Balance
    }
}


fun main() {
    val account = BankAccount(Balance = 1000.0)

    account.deposit(300.0)
    println("Deposited Amount = ${account.getBalance()}")
    account.withdraw(400.0)
    println("withdrawal Amount = ${account.getBalance()}")
    account.getBalance()
    println("Your Balance = ${account.getBalance()}")
}
