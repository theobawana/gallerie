package com.example.mon_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class SubjectsAdapter(private val context: Context, private val items: List<SubjectItem>) : BaseAdapter() {

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.subject_list_item, parent, false)

        val item = items[position]
        val imageView: ImageView = view.findViewById(R.id.subject_image)
        val nameTextView: TextView = view.findViewById(R.id.subject_name)
        val niveauTextView: TextView = view.findViewById(R.id.subject_niveau)

        imageView.setImageResource(item.image)
        nameTextView.text = item.name
        niveauTextView.text = item.niveau

        return view
    }
}
