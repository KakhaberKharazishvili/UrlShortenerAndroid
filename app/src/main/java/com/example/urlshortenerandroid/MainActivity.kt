package com.example.urlshortenerandroid

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val links = mutableListOf<ShortLink>()
    private lateinit var adapter: ShortLinkAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fullUrlInput = findViewById<EditText>(R.id.fullUrlInput)
        val shortUrlInput = findViewById<EditText>(R.id.shortUrlInput)
        val addButton = findViewById<Button>(R.id.addButton)
        val listView = findViewById<ListView>(R.id.linksListView)

        adapter = ShortLinkAdapter(this, links)
        listView.adapter = adapter

        addButton.setOnClickListener {
            val fullUrl = fullUrlInput.text.toString().trim()
            val shortUrl = shortUrlInput.text.toString().trim()

            when {
                fullUrl.isEmpty() || links.any { it.fullUrl == fullUrl } -> {
                    addButton.text = "Неверная ссылка"
                }
                shortUrl.isEmpty() || links.any { it.shortUrl == shortUrl } -> {
                    addButton.text = "Сокращенная ссылка неверная"
                }
                else -> {
                    links.add(ShortLink(fullUrl, shortUrl))
                    adapter.notifyDataSetChanged()
                    addButton.text = "Готово"
                    fullUrlInput.text.clear()
                    shortUrlInput.text.clear()
                }
            }
        }
    }
}
