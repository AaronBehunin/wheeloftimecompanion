package com.example.u0450254.wheeloftimecompanion.Locations.Nations

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


class Shienar: AppCompatActivity() {

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


        thisTitle.text = "Shienar"
        thisSymbol.setImageResource(R.drawable.shienar)
        thisCapital.text = "Fal Moran"
        thisType.text = "Type: Monarchy"
        thisHead.text = "Ruler: King Easar Togita"


        val locinfo = findViewById<TextView>(R.id.locinfo)
        val string1  = SpannableString("\n     Shienar is one of the four Borderland nations which lie on the threshold of the Great GreatBlight. It is the easternmost of the Borderlands, lying between the Spine of the World and Arafel. The sigil of Shienar is a swooping black hawk.\n\n")

        locinfo.text = string1

        locinfo.setTextColor(Color.WHITE)
    }
}