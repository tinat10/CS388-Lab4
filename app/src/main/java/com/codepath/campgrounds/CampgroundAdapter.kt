package com.codepath.campgrounds

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

private const val TAG = "CampgroundAdapter"

class CampgroundAdapter(private val context: Context) :
    RecyclerView.Adapter<CampgroundAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_campground, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // TODO: Get the individual campground and bind to holder
    }

    override fun getItemCount() = 0 // Fix me!

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        // TODO: Create member variables for any view that will be set

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(campground: Campground) {
            // TODO: Set item views based on views and data model

        }

        override fun onClick(v: View?) {
            // TODO: Get selected campground


            // TODO: Navigate to Details screen and pass selected campground

        }
    }
}
