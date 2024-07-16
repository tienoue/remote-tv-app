package com.tienoue.teleco

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListeAdapter(
    private val items: List<Pair<Pair<Int, String>, String>>,
    private val onItemClick: (String) -> Unit
) : RecyclerView.Adapter<ListeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_liste, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item.first.first, item.first.second, item.second)
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.image_view)
        private val titleTextView: TextView = itemView.findViewById(R.id.titre_text_view)

        init {
            itemView.setOnClickListener {
                onItemClick(items[adapterPosition].second)
            }
        }

        fun bind(imageRes: Int, titre: String, activityClassName: String) {
            imageView.setImageResource(imageRes)
            titleTextView.text = titre
        }
    }
}