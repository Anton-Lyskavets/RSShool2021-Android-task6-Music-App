package com.example.android.musicapp.exoplayer

import android.support.v4.media.MediaMetadataCompat
import com.example.android.musicapp.entities.Song

fun MediaMetadataCompat.toSong(): Song? {
    return description?.let {
        Song(
            it.mediaId ?: "",
            it.title.toString(),
            it.subtitle.toString(),
            it.iconUri.toString(),
            it.mediaUri.toString()
        )
    }
}
