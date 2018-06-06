package com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters

import android.app.Activity
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


/**
 * Created by u0450254 on 5/18/2018.
 */
class Rand : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val filename = "Progress"
        val fileContents = "1-1"
        openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        var  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisAge = findViewById<TextView>(R.id.Age)
        var thisAffil = findViewById<TextView>(R.id.Affiliation)
        var thisGender = findViewById<TextView>(R.id.Gender)
        var thisHeight = findViewById<TextView>(R.id.Height)
        var thisWeight = findViewById<TextView>(R.id.Weight)
        var thisHair = findViewById<TextView>(R.id.HairColor)
        var thisEye = findViewById<TextView>(R.id.EyeColor)
        var thisRank = findViewById<TextView>(R.id.Rank)

        var thisPortrat = findViewById<ImageView>(R.id.Portrat)

        thisTitle.text = "Rand al'Thor"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"


        thisAge.text = " Age: 20"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: 6'5"
        thisWeight.text = " Weight: 235 pounds"
        thisHair.text = " Hair Color: Red"
        thisEye.text = " Eye Color: Gray"
        thisRank.text = " Rank: Civilian"

        thisPortrat.setImageResource(R.drawable.randeotw)

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("Rand al'Thor is the main protagonist of the series.")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}
