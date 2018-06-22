package com.example.u0450254.wheeloftimecompanion.Characters.Supporting

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
class Lan : AppCompatActivity() {

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

        val thisPortrat = findViewById<ImageView>(R.id.Portrat)

        thisTitle.text = "al'Lan Mandragoran"
        thisAffil.text = " Affiliation: ?"

        thisAge.text = " Age: 45"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: 6'5"
        thisWeight.text = " Weight: Muscular"
        thisHair.text = " Hair Color: Dark"
        thisEye.text = " Eye Color: Blue"
        thisRank.text = " Rank: ?"

        thisPortrat.setImageResource(R.drawable.lan)

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("Lan is Moiraine's bodyguard, though he appears more than that.")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}