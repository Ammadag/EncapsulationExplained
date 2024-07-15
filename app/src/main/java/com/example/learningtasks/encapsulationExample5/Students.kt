package com.example.learningtasks.encapsulationExample5




/**
 * This program demonstrates the concept of encapsulation in Kotlin using a Students class.
 * Encapsulation is a key principle of object-oriented programming that restricts direct access
 * to an object's data and allows it to be accessed and modified only through defined methods.
 *
 * In this example, we create a Students class to encapsulate the details of a student.
 * The class has private variables for the student's name and grade. It provides public methods
 * to set and get these values with specific validation.
 *
 * Class: Students
 * - Private variable name: Stores the name of the student.
 * - Private variable grade: Stores the grade of the student.
 * - Method studentName(sname: String): Sets the name of the student if the name length is between 6 and 12 characters.
 * - Method studentGrades(sgrade: String): Sets the grade of the student if the grade is one of the valid grades ("A", "B", "C", "D", "F").
 * - Method getStudentName(): Returns the name of the student.
 * - Method getStudentGrade(): Returns the grade of the student.
 *
 * Main Function:
 * - Creates an instance of Students with initial values for name and grade.
 * - Updates the student's name and grade using the setter methods with validation.
 * - Prints the updated student details using the getter methods.
 */

class Students(private var name: String, private var grade: String) {

    fun studentName(sname: String) {
        if (sname.length >= 6 && sname.length <= 12) {
            name = sname
        }
    }

    fun studentGrades(sgrade: String){
        val ValidGrade = setOf("A","B","C","D","F")
        if(sgrade in ValidGrade){
            grade = sgrade
        }
    }
    fun getStudentName():String{
        return name
    }

    fun getStudentGrade():String{
        return grade
    }
}

fun main(){

    val studentDetail = Students("Ali", "A")

    studentDetail.studentName("Aqeel")
    println("Student Name is ${studentDetail.getStudentName()}")

    studentDetail.studentGrades("B")
    println("Student Grade is ${studentDetail.getStudentGrade()}")
}
