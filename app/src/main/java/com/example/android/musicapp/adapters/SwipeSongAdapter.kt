package com.example.android.musicapp.adapters

import androidx.recyclerview.widget.AsyncListDiffer
import com.example.android.musicapp.R
import com.google.android.material.textview.MaterialTextView

class SwipeSongAdapter : BaseSongAdapter(R.layout.swipe_item) {

    override val differ = AsyncListDiffer(this, diffCallback)

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        val tvPrimary : MaterialTextView = holder.itemView.findViewById(R.id.tvPrimary)
        holder.itemView.apply {
            val text = "${song.title} - ${song.artist}"
            tvPrimary.text = text

            setOnClickListener {
                onItemClickListener?.let { click ->
                    click(song)
                }
            }
        }
    }

}



















