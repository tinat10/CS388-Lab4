package com.codepath.campgrounds

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


private const val TAG = "CampgroundAdapter"

class CampgroundAdapter(private val context: Context) :
    RecyclerView.Adapter<CampgroundAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_campground, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val campground = campgrounds[position]
//        holder.bind(campground)
    }

    override fun getItemCount() = 0 // Fix me!

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

//        private val imageView = itemView.findViewById<ImageView>(R.id.campgroundImage)
//        private val nameTextView = itemView.findViewById<TextView>(R.id.campgroundName)
//        private val locationTextView = itemView.findViewById<TextView>(R.id.campgroundLocation)

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(campground: Campground) {

        }

        override fun onClick(v: View?) {
            // TODO: Get selected campground


            // TODO: Navigate to Details screen and pass selected campground

        }
    }
}
