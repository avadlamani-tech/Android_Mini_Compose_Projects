package com.example.android_mini_compose_projects.TabLayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.DownloadDone
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_mini_compose_projects.R

val recentListItems = listOf(
    RecentListItem(1, "apple", "Apple company", R.drawable.whatsapp_image_2024_09_18_at_1_25_48_pm__3_, isFav = true, isSaved = true),
    RecentListItem(2, "Facebook", "Meta", R.drawable.whatsapp_image_2024_09_18_at_1_25_48_pm__2_, isSaved = true),
    RecentListItem(3, "Starbucks", "Lorem ipsum", R.drawable.whatsapp_image_2024_09_18_at_1_25_48_pm, isSaved = true, isFav = true),
    RecentListItem(4, "Google", "Lorem ipsum", R.drawable.whatsapp_image_2024_09_18_at_1_25_48_pm__1_, isSaved = true),
    RecentListItem(5, "netflix", "Lorem ipsum", R.drawable.whatsapp_image_2024_09_18_at_1_25_47_pm, isSaved = true),
    RecentListItem(6, "Instagram", "Lorem ipsum", R.drawable.instagram_logo, isSaved = true, isFav = true)

)

sealed class TabScreen(
    val title: String,
    var icon: ImageVector,
    val screen: @Composable () -> Unit,

    ){
    object tab1 : TabScreen("Recent", Icons.Filled.AccessTime, screen = { RecentTab() })
    object tab2: TabScreen("Favourite", Icons.Filled.Favorite, screen = { FavouriteTab() })
    object tab3: TabScreen("Downloads", Icons.Filled.Download, screen = {DownloadTab() })


}

@Composable
fun FavouriteTab() {
    LazyColumn(
        verticalArrangement = Arrangement.Top
    ) {

       items(recentListItems) { item ->
           if(item.isFav) {
               RecentListItem(item)
           }
       }

    }
}

@Composable
fun RecentTab() {
    LazyColumn (
        verticalArrangement = Arrangement.Top

    ){
        items(recentListItems) { item ->
            RecentListItem(item)
        }
    }
}

@Composable
fun DownloadTab() {
    LazyColumn(
        verticalArrangement = Arrangement.Top
    ){
        items(recentListItems) { item ->
            if (item.isSaved){
                RecentListItem(item)
            }
        }
    }

}


@Composable
fun RecentListItem(item: RecentListItem) {
    Card(
       modifier = Modifier.padding(10.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 6.dp
    ){
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = item.image),
                contentDescription = "Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(size = 10.dp))

            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 15.dp)
                    .weight(2f)
            ){

                Text(
                    text = item.title,
                    style = TextStyle(
                        color = Color(0xFF5c5c5c),
                        fontWeight = FontWeight.W600,
                        fontSize = 16.sp


                    )
                )
                Text(text = item.subtitle,
                    style = TextStyle(
                        color = Color(0xFF5c5c5c),
                    )

                    )
            }
            IconButton(
                onClick = {}

            ){
                Icon(
                    imageVector = if (item.isFav) Icons.Outlined.Favorite else Icons.Outlined.FavoriteBorder,
                    contentDescription = "",
                    tint = Color(0xFFE93224)
                )
            }
            IconButton(
                onClick = {}
            ){
                Icon(
                    imageVector = if (item.isSaved) Icons.Outlined.DownloadDone else Icons.Filled.Download,
                    contentDescription = "",
                    tint = Color(0xFF757474)
                )
            }



            }
        }
    }


