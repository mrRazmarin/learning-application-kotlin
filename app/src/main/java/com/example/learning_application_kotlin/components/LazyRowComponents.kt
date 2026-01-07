package com.example.learning_application_kotlin.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.learning_application_kotlin.R
import com.example.learning_application_kotlin.components.utils.RandomDataState
import com.example.learning_application_kotlin.components.utils.getDataAboutPerson

object LazyRowComponents {
    var isSelected: Boolean = false

    @Composable
    fun HorizontalCard() {
        val randomData: RandomDataState = getDataAboutPerson()

        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Center,
        ) {
            Card(
                modifier = Modifier
                    .padding(horizontal = 8.dp, vertical = 4.dp)
                    .clickable(
                        onClick = {
                            isSelected = true
                        }
                    ),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        modifier = Modifier.clip(CircleShape),
                        painter = painterResource(id = R.drawable.leo),
                        contentDescription = "Avatar",
                        alignment = Alignment.TopCenter,
                        contentScale = ContentScale.Fit
                    )
                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )
                    Text(
                        text = randomData.name.value,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(
                        modifier = Modifier
                            .height(5.dp)
                    )
                    Text(
                        text = randomData.prof.value,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }
    }
}