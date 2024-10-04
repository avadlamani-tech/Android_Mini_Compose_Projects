package com.example.android_mini_compose_projects.TabLayout

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TtsAnnotation
import com.example.android_mini_compose_projects.R

val recentListItems = listOf(
    RecentListItem(1, "apple", "Apple company", R.drawable.whatsapp_image_2024_09_18_at_1_25_48_pm__3_, isFav = true, isSaved = true),
    RecentListItem(2, "Facebook", "Meta", R.drawable.whatsapp_image_2024_09_18_at_1_25_48_pm__2_, isSaved = true, isFav = true),
    RecentListItem(3, "Starbucks", "Lorem ipsum", R.drawable.whatsapp_image_2024_09_18_at_1_25_48_pm, isSaved = true, isFav = true),
    RecentListItem(4, "Google", "Lorem ipsum", R.drawable.whatsapp_image_2024_09_18_at_1_25_48_pm__1_, isSaved = true, isFav = true),
    RecentListItem(5, "netflix", "Lorem ipsum", R.drawable.whatsapp_image_2024_09_18_at_1_25_47_pm, isFav = true, isSaved = false),
    RecentListItem(6, "Instagram", "Lorem ipsum", R.drawable.InstagramLogo, isSaved = true, isFav = true)

)

sealed class TabScreen(
    val title: String,
    val icon: ImageVector,
    val screen: @Composable () -> Unit,

){
    object tab1 : TabScreen("Recent", Icons.Filled.AccessTime, screen = { RecentTab() })
    object tab2: TabScreen("Favourite", Icons.Filled.Favorite, screen = { FavouriteTab() })
    object tab3: TabScreen("Downloads", Icons.Filled.Download, screen = {DownloadTab() })


}

@Composable
fun FavouriteTab() {
    LazyColumn(
        verticalArrangement =
    )
}