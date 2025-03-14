package com.example.urlshortenerandroid

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import android.widget.BaseAdapter

class ShortLinkAdapter(private val context: Context, private val links: List<ShortLink>) : BaseAdapter() {

    override fun getCount(): Int = links.size

    override fun getItem(position: Int): Any = links[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        val textView = view.findViewById<TextView>(R.id.shortLinkText)

        val shortLink = links[position]
        textView.text = "Сокращение: ${shortLink.shortUrl}"
        textView.setTextColor(ContextCompat.getColor(context, android.R.color.holo_blue_light))

        textView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(shortLink.fullUrl))
            context.startActivity(intent)
        }

        return view
    }
}
