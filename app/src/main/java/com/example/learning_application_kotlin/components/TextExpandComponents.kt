package com.example.learning_application_kotlin.components

import android.icu.number.Scale
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learning_application_kotlin.R
import com.example.learning_application_kotlin.components.utils.Education
import com.example.learning_application_kotlin.components.utils.InfoPerson

object TextExpandComponents {
    @Composable
    fun VerticalCard(infoPerson: InfoPerson) {

        var isExpand by remember {
            mutableStateOf(false)
        }

        val educationsList = remember {
            infoPerson
        }

        Card(
            modifier = Modifier
                .systemBarsPadding()
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(infoPerson.photo.value),
                    contentDescription = "Photo",
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .align(Alignment.CenterVertically),
                    contentScale = ContentScale.Crop
                )

                Column(
                    modifier = Modifier
                        .weight(3f)
                        .padding(10.dp)
                ) {
                    Text(
                        text = infoPerson.name.value,
                        fontWeight = FontWeight.Medium,
                        fontSize = 24.sp
                    )

                    Spacer(
                        modifier = Modifier
                            .height(8.dp)
                    )

                    Text(
                        text = infoPerson.age.intValue.toString(),
                        fontWeight = FontWeight.Normal,
                        fontSize = 18.sp
                    )

                    Spacer(
                        modifier = Modifier
                            .height(10.dp)
                    )

                    Text(
                        text = educationsList
                            .educations
                            .toMutableList()
                            .joinToString("\n")
                        {
                            it.titleEducation
                        },
                        fontSize = 16.sp,
                        maxLines = if (!isExpand) 1 else Int.MAX_VALUE
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {
                            isExpand = !isExpand
                        },
                        enabled = educationsList.educations.size > 1,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(64.dp),
                        shape = ButtonDefaults.elevatedShape
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.down_in_circle),
                            contentDescription = "Logo down button",
                            modifier = Modifier.size(64.dp)
                        )
                    }
                }
            }
        }
    }
}