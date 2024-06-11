package com.example.myapplication

class Dog (private val name: String, var age: UInt = 0u) {
    init {
        bark()
    }

    fun bark() {
        println("Woof Woof. I am a dog and my name is $name. I am $age years old.")
    }
}