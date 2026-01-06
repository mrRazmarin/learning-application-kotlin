package com.example.learning_application_kotlin.components.utils

data class InfoPerson(
    val name: String,
    var age: Int,
    var educations: MutableList<Education>
)

data class Education(
    val titleEducation: String
)
