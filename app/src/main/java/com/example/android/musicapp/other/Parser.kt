package com.example.android.musicapp.other

import android.content.Context
import com.beust.klaxon.Klaxon
import com.example.android.musicapp.entities.Song

private const val PLAYLIST = "playlist.json"

class Parser(
    private val context: Context
) {
    fun getPlaylist(): List<Song> {
        val stringPlaylist = context.assets
            .open(PLAYLIST)
            .bufferedReader()
            .use { it.readText() }
        return Klaxon()
            .parseArray<Song>(stringPlaylist)?.toList() ?: emptyList()
    }
}

