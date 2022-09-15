package com.example.e_goal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import androidx.recyclerview.widget.RecyclerView.ViewHolder as ViewHolder1


class SavingAdapter : RecyclerView.Adapter<SavingAdapter.ViewHolder>() {

    var SaveitemTitles = arrayOf(
        "SChool Fees",
        "University Fees",
        "Hospital emergency",
        "SChool Fees",
        "University Fees",
        "Hospital emergency",
        "SChool Fees",
        "University Fees",
        "Hospital emergency"
    )

    var SaveDetails = arrayOf(

        "Jason Kiptoo emergency",
        "SChool Fees",
        "University Fees",
        "Hospital emergency",
        "SChool Fees",
        "University Fees",
        "Hospital emergency",
        "SChool Fees",
        "University Fees"
    )
    var image = intArrayOf(
        R.drawable.rzn1,
        R.drawable.kali,
        R.drawable.depo,
        R.drawable.rzn5,
        R.drawable.rzn4,
        R.drawable.rzn6,
        R.drawable.rzn6,
        R.drawable.rzn3,
        R.drawable.rzn7,


        )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var SaveTitle: TextView
        var SaveDetails: TextView
        var SaveImage: CircleImageView


        init {
            SaveTitle = itemView.findViewById(R.id.item_title)
            SaveDetails = itemView.findViewById(R.id.item_details)
            SaveImage = itemView.findViewById(R.id.item_image)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.reasonsrecv, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.SaveTitle.text = SaveitemTitles[position]
        holder.SaveDetails.text = SaveDetails[position]
        holder.SaveImage.setImageResource(image[position])

//        holder.SaveImage.setImageResource(Imag)

    }

    override fun getItemCount(): Int {
        return SaveitemTitles.size
    }


}