package com.example.u0450254.wheeloftimecompanion.Characters.Forsaken

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import android.widget.*

class Ishamael : AppCompatActivity() {

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

        val thisPortrat = findViewById<ImageView>(R.id.Portrat)

        thisTitle.text = "Ishamael"
        thisAffil.text = " Affiliation: Forsaken"

        thisAge.text = " Age: ?"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Black"
        thisEye.text = " Eye Color: Red"
        thisRank.text = " Rank: Chosen"



        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Ishamael, previously known as Elan Morin Tedronai, is the most powerful of the Forsaken and their de facto leader during the War of Power.\n\n")

        val string2 = SpannableString("History\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,7,0)

        val string3 = SpannableString("Age of Legends\n\n")
        string3.setSpan(RelativeSizeSpan(1.5f),0,14,0)

        val string8 = SpannableString("     After the seals were placed and saidin was tainted, Ishamael arrived at Lews Therin's home and discovered to his surprise and delight that Lews Therin had murdered his entire family. " +
                "After having a mostly one-sided conversation with the insane Lews Therin, Ishamael Healed him so that he understood what he had done. " +
                "This realization caused Lews Therin to commit suicide, leaving a furious Ishamael to wait for him to be reborn.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book>1 ||(progress.book==1&&progress.chapter>0))
        {
            thisPortrat.setImageResource(R.drawable.elan_morin_tedronai)
        }

        if (progress.book==1 && progress.chapter<=0)
        {
            thisInfo.text = TextUtils.concat(string1)
        }
        else if (progress.book>1 ||(progress.book==1&&progress.chapter>0))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string8)
        }
    }
}



