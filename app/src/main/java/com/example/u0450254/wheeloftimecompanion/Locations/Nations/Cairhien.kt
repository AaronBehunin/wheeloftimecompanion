package com.example.u0450254.wheeloftimecompanion.Locations.Nations

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/31/2018.
 */


//next enrty the great hunt 25
class Cairhien: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nation)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisSymbol = findViewById<ImageView>(R.id.Symbol)
        var thisCapital = findViewById<TextView>(R.id.capital)
        var thisType = findViewById<TextView>(R.id.typeofgov)
        var thisHead = findViewById<TextView>(R.id.Head)

        thisTitle.text = "Cairhien"
        thisSymbol.setImageResource(R.drawable.cairhien)
        thisCapital.text = "Cairhien"
        thisType.text = "Type: Monarchy"
        thisHead.text = "Ruler: ?"

        val locinfo = findViewById<TextView>(R.id.locinfo)
        var string1  = SpannableString("\n     Cairhien is a large country at the end of the Third Age in the east-central part of the Westlands. Cairhien's flag is a golden rising sun on a field of blue.\n\n")

        locinfo.text = string1

        locinfo.setTextColor(Color.WHITE)
    }
}