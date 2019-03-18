package com.example.u0450254.wheeloftimecompanion.Characters.Other

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


/*
 * Created by u0450254 on 5/18/2018.
 */
class PaetalCarr : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisPortrat = findViewById<ImageView>(R.id.Portrat)
        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisAge = findViewById<TextView>(R.id.Age)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)
        val thisGender = findViewById<TextView>(R.id.Gender)
        val thisHeight = findViewById<TextView>(R.id.Height)
        val thisWeight = findViewById<TextView>(R.id.Weight)
        val thisHair = findViewById<TextView>(R.id.HairColor)
        val thisEye = findViewById<TextView>(R.id.EyeColor)
        val thisRank = findViewById<TextView>(R.id.Rank)

        thisTitle.text = "Paet al'Carr"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: ?"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: ?"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Civilian"



        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Paet al'Caar is a Two Rivers resident.  His son is Wil al'Carr.\n\n")

        val string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string3 = SpannableString("     He has a long jaw.\n\n")

        val string4 = SpannableString("Activities\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string5 = SpannableString("     After the Trollocs first attack Emond's Field, he is part of the crowd that confronts Moiraine Damodred demanding she leave at once, even though she Healed his son's leg after the attack. He is the first to apologize to her.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());



        if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisPortrat.setImageResource(R.drawable.paet_alcarr)
        }

        if (progress.book==1&&progress.chapter<=9)
        {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5)
        }
    }
}