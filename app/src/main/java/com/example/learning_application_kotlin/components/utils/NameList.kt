package com.example.learning_application_kotlin.components.utils

import kotlin.random.Random

fun getRandomName(): String {
    val list = listOf("John", "Bob", "Rufus", "Mikhail", "Maxwell")

    val random = Random
    val randomValue = random.nextInt(from = 0, until = list.size - 1)

    return list[randomValue]
}

fun getRandomProf(): String {
    val list = listOf("Cleaner", "Coach", "Consultant", "Cook", "Courier")

    val random = Random
    val randomValue = random.nextInt(from = 0, until = list.size - 1)

    return list[randomValue]
}