package com.example.learningtasks


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