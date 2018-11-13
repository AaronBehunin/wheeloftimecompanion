package com.example.u0450254.wheeloftimecompanion.Characters.Legends

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import android.widget.*

class GreenMan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisPortrat = findViewById<ImageView>(R.id.Portrat)
        val thisAge = findViewById<TextView>(R.id.Age)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)
        val thisGender = findViewById<TextView>(R.id.Gender)
        val thisHeight = findViewById<TextView>(R.id.Height)
        val thisWeight = findViewById<TextView>(R.id.Weight)
        val thisHair = findViewById<TextView>(R.id.HairColor)
        val thisEye = findViewById<TextView>(R.id.EyeColor)
        val thisRank = findViewById<TextView>(R.id.Rank)

        thisTitle.text = "Green Man"
        thisAffil.text = " Affiliation: Legend"

        thisAge.text = " Age: Ancient"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: Tall"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Green"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: ?"


        thisPortrat.setImageResource(R.drawable.greenman)
        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     A forest creature mentioned in many stories and legends.")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = TextUtils.concat(string1)
    }
}