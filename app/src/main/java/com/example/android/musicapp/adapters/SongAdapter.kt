package com.example.android.musicapp.adapters

import android.widget.ImageView
import androidx.recyclerview.widget.AsyncListDiffer
import com.bumptech.glide.RequestManager
import com.example.android.musicapp.R
import com.google.android.material.textview.MaterialTextView
import javax.inject.Inject

class SongAdapter @Inject constructor(
    private val glide: RequestManager
) : BaseSongAdapter(R.layout.list_item) {

    override val differ = AsyncListDiffer(this, diffCallback)

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        val tvPrimary: MaterialTextView = holder.itemView.findViewById(R.id.tvPrimary)
        val tvSecondary: MaterialTextView = holder.itemView.findViewById(R.id.tvSecondary)
        val ivItemImage: ImageView = holder.itemView.findViewById(R.id.ivItemImage)

        holder.itemView.apply {
            tvPrimary.text = song.title
            tvSecondary.text = song.artist
            glide.load(song.bitmapUri).into(ivItemImage)

            setOnClickListener {
                onItemClickListener?.let { click ->
                    click(song)
                }
            }
        }
    }
}



















