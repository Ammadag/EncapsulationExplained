package com.example.learningtasks


/**
 * This program demonstrates the concept of encapsulation in Kotlin using a Cars class.
 * Encapsulation is a fundamental principle of object-oriented programming that restricts
 * direct access to an object's data and allows it to be accessed and modified only through
 * defined methods.
 *
 * In this example, we create a Cars class to encapsulate the details of a car.
 * The class has private variables for the car's make, model, and mileage. It provides public
 * methods to set and get these values with specific validation.
 *
 * Class: Cars
 * - Private variable make: Stores the make (manufacturer) of the car.
 * - Private variable model: Stores the model year of the car.
 * - Private variable mileage: Stores the mileage of the car.
 * - Method carMake(company: String): Sets the make of the car.
 * - Method carModel(year: Int): Sets the model year of the car if it is within the valid range (1990-2024).
 * - Method carDriven(miles: Int): Sets the mileage of the car if the miles value is positive.
 * - Method getMake(): Returns the make of the car.
 * - Method getModel(): Returns the model year of the car.
 * - Method getMiles(): Returns the mileage of the car.
 *
 * Main Function:
 * - Creates an instance of Cars with initial values for make, model, and mileage.
 * - Updates the car's make, model, and mileage using the setter methods with validation.
 * - Prints the updated car details using the getter methods.
 */
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