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
class CennBuie : AppCompatActivity() {

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

        thisTitle.text = "Cenn Buie"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: 66"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: Thin"
        thisHair.text = " Hair Color: White"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Civilian"

        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n    Cenn Buie is a thatcher who lives in Emond's Field. He is known for griping about everything, and sometimes neglects his duties to complain. He sits on the Village Council.\n\n")

        val string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string3 = SpannableString("     A dark, gnarled, beady-eyed man.\n\n")

        val string4 = SpannableString("Activities\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string5 = SpannableString("     He is part of the Village council.\n\n")
        val string5_2 = SpannableString("    He is part of the Village council, which is in session when Padan Fain arrives.\n\n")

        val string6 = SpannableString("     After the Trollocs first attack Emond's Field, he confronts Moiraine Damodred with a crowd behind him, demanding she leave at once.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())



        if (progress.book==1&&progress.chapter>1)
        {
            thisPortrat.setImageResource(R.drawable.cenn_buie)
        }


        if (progress.book==1&&progress.chapter<=1)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=3)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5)
        }
        else if (progress.book==1&&progress.chapter<=9)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5_2)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5_2,string6)
        }

    }
}