package com.example.u0450254.wheeloftimecompanion.Characters.Legends

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
class JainFarstrider : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

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

        thisTitle.text = "Jain Farstrider"
        thisAffil.text = " Affiliation: Malkieri"

        thisAge.text = " Age: ?(deceased)"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: ?"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Hero"

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("\n     Jain Farstrider, was an adventurer from the Borderlands. " +
                "His adventures are well known throughout the Westlands because of the book The Travels of Jain Farstrider. " +
                "He was a legend throughout the Westlands.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}