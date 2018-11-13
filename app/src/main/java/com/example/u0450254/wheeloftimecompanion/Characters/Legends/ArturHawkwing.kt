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

class ArturHawkwing : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

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

        thisTitle.text = "Artur Hawkwing"
        thisAffil.text = " Affiliation: Legend"

        thisAge.text = " Age: 82(Deceased)"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: Tall"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Black"
        thisEye.text = " Eye Color: Dark"
        thisRank.text = " Rank: King"

        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Artur Paendrag Tanreall, better known in legend as Artur Hawkwing, is the king referred to in many legends who united all the lands west of the Spine of the World as a single Empire. " +
                "After uniting the lands, becoming High King, his subsequent death sparked the War of the Hundred Years. " +
                "His sign was a golden hawk in flight.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = TextUtils.concat(string1)
    }
}