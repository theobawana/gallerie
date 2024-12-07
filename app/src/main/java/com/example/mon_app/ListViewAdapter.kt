package com.example.mon_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

data class ListItem(val image: Int, val name: String, val className: String, val nationality: String)

class ListViewAdapter(private val context: Context, private val items: List<ListItem>) : BaseAdapter() {

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

        val item = items[position]
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val nameTextView: TextView = view.findViewById(R.id.item_name)
        val classTextView: TextView = view.findViewById(R.id.item_class)
        val nationalityTextView: TextView = view.findViewById(R.id.item_nationality)

        imageView.setImageResource(item.image)
        nameTextView.text = item.name
        classTextView.text = item.className
        nationalityTextView.text = item.nationality

        return view
    }
}
