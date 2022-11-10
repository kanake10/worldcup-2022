package com.example.worldcup2022.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.worldcup2022.models.Countries

@Composable
fun CountriesItem(countries: Countries) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(10.dp)
    ) {

        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = rememberImagePainter(countries.imageUrl),
                modifier = Modifier.fillMaxSize(),
                contentDescription = "countries flag image",
                contentScale = ContentScale.FillWidth
            )

            Text(
                text = countries.name!!,
                fontSize = MaterialTheme.typography.h5.fontSize,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }

    }
}