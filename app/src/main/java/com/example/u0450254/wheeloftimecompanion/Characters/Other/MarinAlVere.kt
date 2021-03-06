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
class MarinAlVere : AppCompatActivity() {

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

        thisTitle.text = "Marin al'Vere"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: 58"

        thisGender.text = " Gender: Female"
        thisHeight.text = " Height: 5'4"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Graying"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Civilian"

        val thisPortrat = findViewById<ImageView>(R.id.Portrat)

        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Marin al'Vere lives in Emond's Field with her husband Bran and their younger children. Mistress al'Vere is also the mother of Egwene al'Vere.\n\n")

        val string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string3 = SpannableString("     Slender and motherly, with a thick gray braid, Marin is a handsome woman.\n\n")

        val string4 = SpannableString("Activities\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string5 = SpannableString("     As the best cook in the village, she fills that role in helping Bran run the Winespring Inn.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());



        if (progress.book>1||(progress.book==1&&progress.chapter>2))
        {
            thisPortrat.setImageResource(R.drawable.marinalvere)
        }

        if (progress.book==1&&progress.chapter<=2)
        {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>2))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5)
        }
    }
}