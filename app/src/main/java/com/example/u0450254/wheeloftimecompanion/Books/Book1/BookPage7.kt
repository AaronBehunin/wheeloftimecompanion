package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.R

class BookPage7 : AppCompatActivity() {

    var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bookpage_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val encounters = findViewById<TextView>(R.id.Encounters)
        val refs = findViewById<TextView>(R.id.References)


        encounters.setOnClickListener() {
            val intent = Intent(this, Activity7E::class.java)
            startActivity(intent)
        }
        refs.setOnClickListener() {
            val intent = Intent(this, Activity7R::class.java)
            startActivity(intent)
        }

    }
}