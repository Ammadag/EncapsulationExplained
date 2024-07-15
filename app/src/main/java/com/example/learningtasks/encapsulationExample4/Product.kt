package com.example.learningtasks.encapsulationExample4


/**
 * This program demonstrates the concept of encapsulation in Kotlin using a Product class.
 * Encapsulation is a fundamental principle of object-oriented programming that restricts
 * direct access to an object's data and allows it to be accessed and modified only through
 * defined methods.
 *
 * In this example, we create a Product class to encapsulate the details of a product.
 * The class has private variables for the product's name and price. It provides public
 * methods to set and get these values.
 *
 * Class: Product
 * - Private variable name: Stores the name of the product.
 * - Private variable price: Stores the price of the product.
 * - Method productName(pname: String): Sets the name of the product.
 * - Method productPrice(pprice: Double): Sets the price of the product.
 * - Method getName(): Returns the name of the product.
 * - Method getPrice(): Returns the price of the product.
 *
 * Main Function:
 * - Creates an instance of Product with initial values for name and price.
 * - Updates the product's name and price using the setter methods.
 * - Prints the updated product details using the getter methods.
 */
class Product(private var name: String, private var price: Double) {

    fun productName(pname: String) {
        name = pname
    }

    fun productPrice(pprice: Double) {
        price = pprice
    }
    fun getName():String{
        return name
    }
    fun getPrice():Double{
        return price
    }
}

fun main(){

    val productDetails = Product("Watch", 300.0)

    productDetails.productName("Bag")
    println("Product Name is ${productDetails.getName()}")

    productDetails.productPrice(400.0)
    println("Product Price is ${productDetails.getPrice()}")
}