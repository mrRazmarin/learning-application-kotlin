package com.example.learning_application_kotlin.components.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

data class RandomDataState (
    var counter: MutableIntState,
    val prof: MutableState<String>,
    val name: MutableState<String>
)

@Composable
fun getDataAboutPerson(): RandomDataState {
    return RandomDataState(
        counter = remember {
            mutableIntStateOf(0)
        },
        prof = remember {
            mutableStateOf(
                getRandomProf()
            )
        },
        name = remember {
            mutableStateOf(
                getRandomName()
            )
        }
    )
}