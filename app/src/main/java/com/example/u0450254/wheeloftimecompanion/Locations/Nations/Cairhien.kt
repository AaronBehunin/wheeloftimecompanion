package com.example.u0450254.wheeloftimecompanion.Locations.Nations

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class Cairhien: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nation)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisSymbol = findViewById<ImageView>(R.id.Symbol)
        val thisCapital = findViewById<TextView>(R.id.capital)
        val thisType = findViewById<TextView>(R.id.typeofgov)
        val thisHead = findViewById<TextView>(R.id.Head)

        thisTitle.text = "Cairhien"
        thisSymbol.setImageResource(R.drawable.cairhien)
        thisCapital.text = "Cairhien"
        thisType.text = "Type: Monarchy"
        thisHead.text = "Ruler: ?"

        val locinfo = findViewById<TextView>(R.id.locinfo)
        val string1  = SpannableString("\n     Cairhien is a large country at the end of the Third Age in the east-central part of the Westlands. Cairhien's flag is a golden rising sun on a field of blue.\n\n")

        locinfo.text = string1

        locinfo.setTextColor(Color.WHITE)
    }
}