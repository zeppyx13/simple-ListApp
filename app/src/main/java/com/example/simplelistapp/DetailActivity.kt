package com.example.simplelistapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val name = intent.getStringExtra("name") ?: "No Name"
        val image = intent.getIntExtra("image", 0)
        val desc = intent.getStringExtra("desc") ?: "No Description"

        val tvDetail = findViewById<TextView>(R.id.tvDetail)
        val imgDetail = findViewById<ImageView>(R.id.imgDetail)
        val tvDesc = findViewById<TextView>(R.id.tvDesc)

        tvDetail.text = name
        tvDesc.text = desc

        if (image != 0) {
            imgDetail.setImageResource(image)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}