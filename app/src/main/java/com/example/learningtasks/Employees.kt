package com.example.learningtasks



/**
 * This program demonstrates the concept of encapsulation in Kotlin using an Employees class.
 * Encapsulation is a core principle of object-oriented programming that restricts direct access
 * to an object's data, allowing it to be accessed and modified only through defined methods.
 *
 * In this example, we create an Employees class to encapsulate the details of an employee.
 * The class has private variables for the employee's name, position, and salary. It provides
 * public methods to set and get these values.
 *
 * Class: Employees
 * - Private variable name: Stores the name of the employee.
 * - Private variable position: Stores the position of the employee.
 * - Private variable salary: Stores the salary of the employee.
 * - Method employeeName(eName: String): Sets the name of the employee.
 * - Method designation(ePosition: String): Sets the position of the employee.
 * - Method employeeSalary(eSalary: Int): Sets the salary of the employee.
 * - Method getName(): Returns the name of the employee.
 * - Method getPosition(): Returns the position of the employee.
 * - Method getSalary(): Returns the salary of the employee.
 *
 * Main Function:
 * - Creates an instance of Employees with initial values for name, position, and salary.
 * - Updates the employee's name, position, and salary using the setter methods.
 * - Prints the updated employee details using the getter methods.
 */

class Employees (private var name:String, private var position: String, private var salary: Int){

    fun employeeName(eName:String){

        name = eName

    }

    fun designation(ePosition:String){

        position = ePosition
    }

    fun employeeSalary(eSalary:Int){

        salary = eSalary
    }

    fun getName():String{

        return name
    }

    fun getPosition():String{

        return position
    }

    fun getSalary():Int{

        return salary
    }
}


fun main(){

    val employeeDetails = Employees("Khalid", "CTO", 30000)


    employeeDetails.employeeName("Amir")
    println("Employee Name is ${employeeDetails.getName()}")

    employeeDetails.designation("Developer")
    println("Employee Position is ${employeeDetails.getPosition()}")

    employeeDetails.employeeSalary(5000)
    println("Employee Salary is ${employeeDetails.getSalary()}")

}
