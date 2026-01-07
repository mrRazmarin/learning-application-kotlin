package com.example.learning_application_kotlin.old_not_use.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learning_application_kotlin.R
import com.example.learning_application_kotlin.old_not_use.utils.RandomDataState
import com.example.learning_application_kotlin.old_not_use.utils.getDataAboutPerson


object MainComponents {
    @Composable
    fun PersonCard() {
        val randomData: RandomDataState = getDataAboutPerson()

        Card(
            modifier = Modifier
                .statusBarsPadding()
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.leo),
                    contentDescription = "Avatar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape),
                    alignment = Alignment.Center
                )

                Column(modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1f),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = randomData.name.value,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = randomData.prof.value,
                        fontSize = 12.sp,
                        color = LocalContentColor.current.copy(alpha = 0.7f)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(
                            modifier = Modifier
                                .clip(CircleShape),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent
                            ),
                            onClick = {
                                randomData.counter.intValue++
                                if (randomData.counter.intValue == 10) {
                                    randomData.counter.intValue = 0
                                    Log.d("Click_on_button", "Returned to '0' in counter with name = '${randomData.name}'")
                                }
                                else
                                    Log.d("Click_on_button", "Click on plus button with name = '${randomData.name}' and counter = '${randomData.counter.intValue}'")
                            }

                        ) {
                            Image(
                                painter = painterResource(R.drawable.plus),
                                contentDescription = "Увеличить",
                                contentScale = ContentScale.Fit
                            )
                        }
                        Button(
                            modifier = Modifier
                                .clip(CircleShape),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent
                            ),
                            onClick = {
                                randomData.counter.intValue--
                                Log.d("Click_on_button", "Click on minus button with name = '${randomData.name.value}' and counter = '${randomData.counter.intValue}'")
                            },
                            enabled = randomData.counter.intValue > 0
                        ) {
                            Image(
                                painter = painterResource(R.drawable.minus),
                                contentDescription = "Уменьшить",
                                contentScale = ContentScale.Fit
                            )
                        }
                    }
                }
                Column(modifier = Modifier
                    .padding(end = 10.dp),
                    horizontalAlignment = Alignment.End
                ) {
                    Text(text = "${randomData.counter.intValue}")
                }
            }
        }
    }
}

