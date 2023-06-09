package com.akagami.example2.androidexercise

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    //val listmod= mutableListOf<String>()
    //listmod.add("gallos")
    // Filter even numbers
    val evenNumbers = numbers.filter(predicate={ it % 2 == 0 })
    println("Even numbers: $evenNumbers")

    // Filter numbers greater than 5
    val numbersGreaterThan5 = numbers.filter { it > 5 }
    println("Numbers greater than 5: $numbersGreaterThan5")

    // Filter numbers that are divisible by 3
    val numbersDivisibleBy3 = numbers.filter { it % 3 == 0 }
    println("Numbers divisible by 3: $numbersDivisibleBy3")
}