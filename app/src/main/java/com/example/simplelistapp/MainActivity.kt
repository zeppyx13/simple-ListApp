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
            ListItem("Nasi Goreng", R.drawable.nasi, "Makanan khas Indonesia dari nasi yang digoreng dengan bumbu."),
            ListItem("Mie Ayam", R.drawable.mie, "Mie goreng dengan rempah-rempah khas Indonesia."),
            ListItem("Bakso", R.drawable.bakso, "Makanan khas Indonesia yang terbuat dari daging sapi yang digoreng dengan minyak goreng."),
            ListItem("Sate Ayam", R.drawable.sate, "Makanan khas Indonesia yang terbuat dari daging ayam yang dimasak dengan bumbu kacang." ),
            ListItem("Ayam Goreng", R.drawable.ayam, "Makanan khas Indonesia yang terbuat dari daging ayam yang digoreng dengan minyak goreng.")
        )

        val adapter = ListAdapter(dataList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}