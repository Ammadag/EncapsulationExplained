package com.example.learningtasks

class Cars(private var make: String, private var model: Int, private var mileage: Int) {

    fun carMake(company: String) {
        make = company
    }

    fun carModel(year: Int) {
        val validYearsRange = 1990..2024
        if (year in validYearsRange)
            model = year
    }

    fun carDriven(miles: Int) {

        if (miles > 0) {
            mileage = miles
        }
    }

    fun getMake(): String {
        return make
    }

    fun getModel(): Int {
        return model
    }

    fun getMiles():Int{
        return mileage
    }
}


fun main() {

    val carDetails = Cars("Honda", 2000, 20000)

    carDetails.carMake("Suzuki")
    println("Car make is ${carDetails.getMake()}")

    carDetails.carModel(2010)
    println("Car Model is ${carDetails.getModel()}")

    carDetails.carDriven(30000)
    println("Card is Driven ${carDetails.getMiles()}KM")
}