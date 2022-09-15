package com.example.e_goal

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class ReasonAdapter : RecyclerView.Adapter<ReasonAdapter.ViewHolder>() {
///item titles
    var itemTitles = arrayOf(
        "Vacation",
        "College",
        "Expenses",
        "Emergency",
        "House",
        "Interest"
    )
    ///item details in array collection
    var itemDetails = arrayOf(
        "Your savings account isn't only for things you need—it can be for things you want, too. Saving up for a big purchase beforehand means you won't " +
                "pay extra in finance costs such as interest and fees, the way you would if you put these purchases on credit.",
        "It's important to have an emergency fund set aside " +
                "to cover unexpected expenses. Studies show that four in 10 adults in the U.S. would need to put an unexpected \$400 expense on a credit card or would need to borrow money " +
                "from family or friends to pay for it",
        "Sometimes, you know you'll have big expenses coming, even if you're not sure how much they'll be or when exactly they'll occur. To cover these, set up a sinking fund. ",
        "Don't neglect saving money for education, whether it's for yourself or your family. Higher education may improve career prospects, depending on the industry, but it comes at a cost. ",
        "Save To Maximize Interest Rates",
        "Save To Maximize Interest Rates",

        )

/////item for the picturess to be diplayed on the RECV
    private var item_images = intArrayOf(
        R.drawable.rzn1,
        R.drawable.rzn2,
        R.drawable.rzn3,
        R.drawable.rzn4,
        R.drawable.rzn5,
        R.drawable.depo,
        R.drawable.rzn7
    )


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: CircleImageView
        var textTitle: TextView
        var textDetails: TextView

        init {
            image = itemView.findViewById(R.id.item_image)
            textTitle = itemView.findViewById(R.id.item_title)
            textDetails = itemView.findViewById(R.id.item_details)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.reasonsrecv, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textTitle.text = itemTitles[position]
        holder.textDetails.text = itemDetails[position]

//        holder.image.setImageResource(item_image[position])


        holder.itemView.setOnClickListener { v: View ->


            Toast.makeText(v.context, "Clicked on ${itemTitles[position]} ", Toast.LENGTH_SHORT)
                .show()
        }
    }


    override fun getItemCount(): Int {
        return itemTitles.size
    }
}