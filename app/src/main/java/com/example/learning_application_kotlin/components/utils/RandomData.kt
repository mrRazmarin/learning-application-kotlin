package com.example.learning_application_kotlin.components.utils

import kotlin.random.Random

fun getRandomName(): String {
    val list = listOf("John", "Bob", "Rufus", "Mikhail", "Maxwell")

    val random = Random
    val randomValue = random.nextInt(from = 0, until = list.size)

    return list[randomValue]
}

fun getRandomProf(): String {
    val list = listOf("Cleaner", "Coach", "Consultant", "Cook", "Courier")

    val random = Random
    val randomValue = random.nextInt(from = 0, until = list.size)

    return list[randomValue]
}

fun getRandomTitleEducations(): List<Education> {
    val listEducations: List<String> = listOf("Computer Science", "Software Engineering",
        "Electrical Engineering", "Mechanical Engineering", "Civil Engineering",
        "Biomedical Engineering", "Physics", "Mathematics", "Statistics",
        "Chemistry", "Biology", "Biochemistry", "Neuroscience", "Psychology", "Economics",
        "Finance", "Business Administration", "Political Science", "Linguistics", "Architecture"
    )

    val setEducations: MutableSet<String> = mutableSetOf()

    var tempCounter: Int = Random.nextInt(1, listEducations.size)

    while(tempCounter > 0){
        val tempChoiceIndex: Int = Random.nextInt(0, listEducations.size - 1)

        val tempEducationChoiceFromList: String = listEducations[tempChoiceIndex]

        if (setEducations.contains(tempEducationChoiceFromList)) {
            continue
        } else {
            tempCounter--
            setEducations.add(tempEducationChoiceFromList)
        }
    }

    return setEducations.map { Education(it) }.toMutableList()
}