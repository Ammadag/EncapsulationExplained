package com.example.learningtasks.encapsulationExample1



/**
 * This program demonstrates the concept of encapsulation in Kotlin.
 * Encapsulation is a fundamental principle of object-oriented programming
 * that restricts access to certain components of an object, making them
 * accessible only through well-defined interfaces.
 *
 * In this example, we create a simple BankAccount class to illustrate
 * how encapsulation works. The class has a private variable Balance,
 * which represents the balance of the account. The class provides
 * public methods to deposit, withdraw, and get the balance of the account.
 *
 * Class: BankAccount
 * - Private variable Balance: This variable stores the balance of the bank account.
 * - Method deposit(amount: Double): Adds the specified amount to the balance if the amount is positive.
 * - Method withdraw(amount: Double): Deducts the specified amount from the balance if the amount is positive
 *   and less than the current balance.
 * - Method getBalance(): Returns the current balance of the account.
 *
 * Main Function:
 * - Creates an instance of BankAccount with an initial balance of 1000.0.
 * - Deposits 300.0 to the account and prints the updated balance.
 * - Withdraws 400.0 from the account and prints the updated balance.
 * - Prints the final balance of the account.
 */
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
