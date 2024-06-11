package com.example.myapplication

fun main() {
    println("What is your name?: ")
    val userName = readln()
    println("How many pieces of sugar do you want?: ")
    val sugarCount = readln().toUInt()

    // Call Function
    makeCoffee(userName, sugarCount)
}

// Define Function
fun makeCoffee(userName : String, sugarCount : UInt) {
    when (sugarCount) {
        1u -> {
            println("Coffee with $sugarCount spoon of sugar for $userName.")
        }
        0u -> {
            println("Coffee with no sugar for $userName.")
        }
        else -> {
            println("Coffee with $sugarCount spoons of sugar for $userName.")
        }
    }

}