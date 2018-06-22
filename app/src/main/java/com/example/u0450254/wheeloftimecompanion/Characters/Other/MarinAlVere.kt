package com.example.u0450254.wheeloftimecompanion.Characters.Other

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


/*
 * Created by u0450254 on 5/18/2018.
 */
class MarinAlVere : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val filename = "Progress"
        val fileContents = "1-1"
        openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisAge = findViewById<TextView>(R.id.Age)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)
        val thisGender = findViewById<TextView>(R.id.Gender)
        val thisHeight = findViewById<TextView>(R.id.Height)
        val thisWeight = findViewById<TextView>(R.id.Weight)
        val thisHair = findViewById<TextView>(R.id.HairColor)
        val thisEye = findViewById<TextView>(R.id.EyeColor)
        val thisRank = findViewById<TextView>(R.id.Rank)

        thisTitle.text = "Marin al'Vere"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: 58"

        thisGender.text = " Gender: Female"
        thisHeight.text = " Height: 5'4"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Graying"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Civilian"

        val thisPortrat = findViewById<ImageView>(R.id.Portrat)
        thisPortrat.setImageResource(R.drawable.marinalvere)

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("Wife of Bran al'Vere and with him ran The Winespring Inn. She has a motherly smile and kind eyes. She is known as the best cook in Emonds Field")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}