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

//next reference: eye of the world 13


class Illian: AppCompatActivity() {

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


        thisTitle.text = "Illian"
        thisSymbol.setImageResource(R.drawable.illian)
        thisCapital.text = "Illian"
        thisType.text = "Type: Hereditary Monarchy"
        thisHead.text = "Ruler: King Mattin Stepaneos den Balgar"


        val locinfo = findViewById<TextView>(R.id.locinfo)
        var string1  = SpannableString("\n     Illian is a country that lies in the far south of the Westlands, to the west of Tear whose capital city bears the same name.\n\n")


        locinfo.text = string1

        locinfo.setTextColor(Color.WHITE)
    }
}