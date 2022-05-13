package com.example.foods

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foods.model.Region
import com.example.foods.ui.theme.Typography


@Composable
fun CustomItem(region: Region, navegarPantalla: (List<String>) -> Unit) {
    Row(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${region.id}",
            color = Color.Black,
            fontSize = Typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = region.name,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
        Button(onClick = { navegarPantalla(region.foods) }) {
            Text(
                text = region.name
            )
        }

    }
}

/*
@Composable
@Preview
fun CustomItemPreview(
) {
    val navegarPantalla: (String) -> Unit

    CustomItem(
        region = Region(
            id = 1,
            name = "Arequipa",
        ),
        navegarPantalla
    )
}*/
