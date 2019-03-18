package com.example.u0450254.wheeloftimecompanion.Characters.Other

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


/*
 * Created by u0450254 on 5/18/2018.
 */
class HaralLuhhan : AppCompatActivity() {

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

        thisTitle.text = "Haral Luhhan"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: 48"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: 6'5"
        thisWeight.text = " Weight: Large"
        thisHair.text = " Hair Color: ?"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Civilian"

        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n    Haral Luhhan is the Emond's Field blacksmith and also sits on the Village Council. Master Luhhan is married to Alsbet Luhhan.\n\n")

        val string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string3 = SpannableString("     His arms are nearly as large as most men's legs and are roped with muscle.\n\n")
        val string3_1 = SpannableString("     His arms are nearly as large as most men's legs and are roped with muscle. He is strong and brave, but pales at the sight of blood.\n\n")

        val string4 = SpannableString("Activities\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string5 = SpannableString("     He is part of the Village council, which is in session when Padan Fain arrives.\n\n")

        val string6 = SpannableString("     Perrin Aybara was apprenticed to Master Luhhan in his smithy since his youth.\n\n")

        val string7 = SpannableString("     Haral crafted the Half-moon axe which Perrin carries through most of the series.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());



        if (progress.book==1&&progress.chapter<=2)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=3)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string6)
        }
        else if (progress.book==1&&progress.chapter<=4)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string6)
        }
        else if (progress.book==1&&progress.chapter<=10)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3_1,string4,string5,string6)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3_1,string4,string5,string6,string7)
        }
    }
}