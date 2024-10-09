package com.example.android_mini_compose_projects.TabLayout

data class RecentListItem(
    val id: Int,
    val title: String,
    val subtitle: String,
    val image: Int,
    val isFav: Boolean = false,
    val isSaved: Boolean = false
)