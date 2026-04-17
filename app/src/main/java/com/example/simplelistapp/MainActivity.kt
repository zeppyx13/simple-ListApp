package com.example.simplelistapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val dataList = listOf(
            ListItem("Nasi Goreng", R.drawable.nasi),
            ListItem("Mie Ayam", R.drawable.mie),
            ListItem("Bakso", R.drawable.bakso),
            ListItem("Sate Ayam", R.drawable.sate),
            ListItem("Ayam Goreng", R.drawable.ayam)
        )

        val adapter = ListAdapter(dataList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}