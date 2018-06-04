/**
 * Created by u0450254 on 6/1/2018.
 */
package com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 6/1/2018.
 */
class Egwene : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

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

        thisTitle.text = "Egwene al'Vere"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"


        thisAge.text = " Age: 17"

        thisGender.text = " Gender: Female"
        thisHeight.text = " Height: 5'2"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Brown"
        thisEye.text = " Eye Color: Brown"
        thisRank.text = " Rank: Civilian"

        thisPortrat.setImageResource(R.drawable.egwene)

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("Ewgene al'Vere is one of the main female protagonists of the series. She is a farmgirl from Edmonds Field and the mayors daughter")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}