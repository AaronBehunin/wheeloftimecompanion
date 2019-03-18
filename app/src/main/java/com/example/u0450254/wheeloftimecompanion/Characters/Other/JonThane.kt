package com.example.u0450254.wheeloftimecompanion.Characters.Other

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.SpannedString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class JonThane : AppCompatActivity() {

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

        thisTitle.text = "Jon Thane"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: ?"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: ?"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Civilian"

        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Jon Thane is a miller who lives in Emond's Field. His oldest son is Lem Thane.\n\n")

        val string2 = SpannableString("Appearance and Mannerisms\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,25,0)

        val string3 = SpannableString("     Master Thane is of average height and coloring for a Two Rivers man.\n\n")

        val string4 = SpannableString("Activities\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string5 = SpannedString("     On the day before Winternight in 998 NE he traveled to Emond's Field to meet with the rest of the Village Council in the The Winespring Inn.\n\n")
        val string5_1 = SpannedString("     On the day before Winternight in 998 NE he traveled to Emond's Field to meet with the rest of the Village Council in the The Winespring Inn. Later he was present with the Council when they conferred with Padan Fain regarding recent troubles in Ghealdan.\n\n")
        val string5_2 = SpannedString("     On the day before Winternight in 998 NE he traveled to Emond's Field to meet with the rest of the Village Council in the The Winespring Inn. Later he was present with the Council when they conferred with Padan Fain regarding recent troubles in Ghealdan. After Trollocs attack Emond's Field he led a night watch of militiamen guarding the community. The same night Jon sold Cloud, the horse that Rand rode out of Emond's Field, to Lan.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())



        if (progress.book==1&&progress.chapter<=2)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=3)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5)
        }
        else if (progress.book==1&&progress.chapter<=10)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5_1)
        }
        else if (progress.book==1&&progress.chapter>10)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5_2)
        }
    }
}