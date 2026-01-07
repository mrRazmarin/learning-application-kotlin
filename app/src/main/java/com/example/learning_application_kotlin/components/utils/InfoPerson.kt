package com.example.learning_application_kotlin.components.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.example.learning_application_kotlin.R

data class InfoPerson(
    var photo: MutableIntState,
    val name: MutableState<String>,
    var age: MutableIntState,
    var educations: SnapshotStateList<Education>
)

data class Education(
    val titleEducation: String
)


@Composable
fun initPerson(): InfoPerson {
    return InfoPerson(
        photo = remember {
            mutableIntStateOf(
                R.drawable.kat
            )
        },
        name = remember {
            mutableStateOf(
                getRandomName()
            )
        },
        age = remember {
            mutableIntStateOf(
                25
            )
        },
        educations = remember {
            mutableStateListOf(
                *getRandomTitleEducations().toTypedArray()
            )
        }
    )
}
