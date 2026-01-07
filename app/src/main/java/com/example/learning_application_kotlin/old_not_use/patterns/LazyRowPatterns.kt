package com.example.learning_application_kotlin.old_not_use.patterns

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.learning_application_kotlin.old_not_use.components.LazyRowComponents
import com.example.learning_application_kotlin.old_not_use.components.TextExpandComponents
import com.example.learning_application_kotlin.old_not_use.utils.initPerson

@Composable
fun LazyRowPatterns() {
    LazyRow(
        modifier = Modifier
            .systemBarsPadding()
            .fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        items(20) {
            LazyRowComponents.HorizontalCard()
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun LazyColumnsCards() {
    LazyColumn(
        modifier = Modifier
            .systemBarsPadding()
            .fillMaxSize(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
       items(10) {
           TextExpandComponents.VerticalCard(initPerson())
           Spacer(modifier = Modifier.height(8.dp))
       }
    }
}