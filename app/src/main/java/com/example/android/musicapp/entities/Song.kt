package com.example.android.musicapp.entities

data class Song(
    var id: String = "",
    var title: String = "",
    var artist: String = "",
    var bitmapUri: String = "",
    var trackUri: String = "",
    var duration: Long = -1
)