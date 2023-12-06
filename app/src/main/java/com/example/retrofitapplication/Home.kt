package com.example.retrofitapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberImagePainter
import com.example.retrofitapplication.model.Item

@Composable
fun HomeScreen()
{
    val homeViewModel= viewModel(modelClass = HomeViewModel::class.java)
    val data by homeViewModel.dataState.collectAsState()

    LazyColumn{
        items(data){item: Item ->
            Card(item = item)

        }

    }
}
@Composable
fun Card(item : Item)
{
    Card(
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp)
            .fillMaxSize()
    )
    {
        Column {


            Column(modifier = Modifier.padding(10.dp)) {

                Text(text = item.appName, fontWeight = FontWeight.Bold)
                Text(text = item.developerUpdateDate, maxLines = 2, overflow = TextOverflow.Ellipsis)
                Text(text = item.packageName, overflow = TextOverflow.Ellipsis,fontWeight = FontWeight.Bold)

            }

        }

    }


}
