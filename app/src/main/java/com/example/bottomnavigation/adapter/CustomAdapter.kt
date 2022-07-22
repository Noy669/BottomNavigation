package com.example.bottomnavigation.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.annotation.LayoutRes
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.bumptech.glide.Glide
import com.example.bottomnavigation.R
import com.example.bottomnavigation.User


class CustomAdapter(
     context: Context,
    @LayoutRes var resource: Int,
    var list: List<User>
) : ArrayAdapter<User>(context, resource, list) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater =
            (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)

        val rowView: View = inflater.inflate(resource, null, true)
        val name = rowView.findViewById<AppCompatTextView>(R.id.name_network)
        val image = rowView.findViewById<AppCompatImageView>(R.id.logo_network)

        name.text = list[position].name
        Glide.with(context).load(list[position].imageUrl).into(image)
        return rowView
    }

}
