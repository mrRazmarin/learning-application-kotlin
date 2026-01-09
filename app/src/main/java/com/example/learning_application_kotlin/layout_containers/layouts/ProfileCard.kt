package com.example.learning_application_kotlin.layout_containers.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.learning_application_kotlin.ui.theme.DefaultColors

@Composable
fun Code() {

    Box(
        modifier = Modifier
            .systemBarsPadding()
            .fillMaxSize()
            .background(color = DefaultColors.MuchDarker)
    ) {
        CardAnything()
    }
}

@Composable
fun CardAnything() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, 16.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation()
    ) {
        RowInfo()
    }
}

@Composable
fun RowInfo(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField()
    }
}

@Composable
fun Switcher(checkedChange: MutableState<Boolean>) {
    Switch(
        modifier = Modifier
            .padding(10.dp),
        checked = checkedChange.value,
        onCheckedChange = {
            checkedChange.value = it
        }
    )
}

@Composable
fun TextField() {
    val checkedChange = rememberSaveable {
        mutableStateOf(true)
    }

    Switcher(checkedChange)

    Text(
        text = if (checkedChange.value) "isOn" else "isOff",
        modifier = Modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}










