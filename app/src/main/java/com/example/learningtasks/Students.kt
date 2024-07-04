package com.example.learningtasks


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
