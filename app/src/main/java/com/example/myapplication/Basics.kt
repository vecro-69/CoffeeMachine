package com.example.myapplication

import java.time.temporal.TemporalAmount

data class CoffeeDetails (
    val sugarCount: UInt,
    val userName: String,
    val cupSize: String,
    val creamAmount: UInt
)

fun main() {
    //val dogDaisy = Dog("Daisy")
    //dogDaisy.age = 2u
    //dogDaisy.bark()

    // Call Function
    val coffeeDetails = askForCoffeeDetails()
    makeCoffee(coffeeDetails)
}

fun askForCoffeeDetails(): CoffeeDetails {
    println("What is your name?: ")
    val userName = readln()
    println("How many pieces of sugar do you want?: ")
    val sugarCount = readln().toUInt()
    println("What shall be the size of the coffee?: ")
    val cupSize = readln()
    println("How much cream do you want?: ")
    val creamAmount = readln().toUInt()

    return CoffeeDetails(sugarCount, userName, cupSize, creamAmount)
}

// Define Function
fun makeCoffee(coffeeDetails: CoffeeDetails) {
    when (coffeeDetails.sugarCount) {
        1u -> {
            println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.userName}. Cup size is ${coffeeDetails.cupSize} and it contains ${coffeeDetails.creamAmount} pieces of cream.")
        }
        0u -> {
            println("Coffee with no sugar for ${coffeeDetails.userName}. Cup size is ${coffeeDetails.cupSize} and it contains ${coffeeDetails.creamAmount} pieces of cream.")
        }
        else -> {
            println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.userName}. Cup size is ${coffeeDetails.cupSize} and it contains ${coffeeDetails.creamAmount} pieces of cream.")
        }
    }

}