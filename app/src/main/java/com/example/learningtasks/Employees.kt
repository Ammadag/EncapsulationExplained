package com.example.learningtasks

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
