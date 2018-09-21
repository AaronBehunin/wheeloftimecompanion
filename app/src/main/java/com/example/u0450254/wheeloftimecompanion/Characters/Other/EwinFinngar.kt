package com.example.u0450254.wheeloftimecompanion.Characters.Other

import android.content.Context
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
class EwinFinngar : AppCompatActivity() {

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

        thisTitle.text = "Ewin Finngar"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: 14"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: Short"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: ?"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Civilian"

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("\n     Ewin Finngar is a teenager from Emond's Field in the Two Rivers.\n\n")
        var string1_1 = SpannableString("\n     Ewin Finngar is a teenager from Emond's Field in the Two Rivers. In his childhood he was a younger friend to Rand al'Thor and Matrim Cauthon; the later of whom would occasionally make Ewin the target of pranks and practical jokes.\n\n")

        var string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        var string3 = SpannableString("     Ewin is a short, highly excitable pudgy-faced fourteen-year-old.\n\n")

        var string4 = SpannableString("Activities\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,10,0)

        var string5 = SpannableString("     On the day before Bel Tine in 998 NE, Ewin became enamored with a mysterious female visitor to the village who arrived with a male companion. He rushed to the cellar of the Winespring Inn in order to gossip about these strangers to Mat and Rand. Ewin was later gifted a silver penny from the visitor and decided not to spend it.\n\n")
        var string5_1 = SpannableString("     On the day before Bel Tine in 998 NE, Ewin became enamored with a mysterious female visitor to the village who arrived with a male companion. He rushed to the cellar of the Winespring Inn in order to gossip about these strangers to Mat and Rand. Ewin was later gifted a silver penny from the visitor and decided not to spend it. That same day when Padan Fain arrived in Emond's Field, Ewin interrupted Fain's storytelling about Logain Ablar and was nearly cuffed by Cenn Buie who wanted him to remain silent while elders were speaking.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1


        if (progress.book>1||(progress.book==1&&progress.chapter>2))
        {
            thisInfo.text = TextUtils.concat(string1_1,string2,string3,string4,string5)

        }
        if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            thisInfo.text = TextUtils.concat(string1_1,string2,string3,string4,string5_1)
        }
    }
}