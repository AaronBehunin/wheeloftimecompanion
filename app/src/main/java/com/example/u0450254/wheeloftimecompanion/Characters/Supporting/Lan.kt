package com.example.u0450254.wheeloftimecompanion.Characters.Supporting

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
class Lan : AppCompatActivity() {

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

        thisTitle.text = "al'Lan Mandragoran"
        thisAffil.text = " Affiliation: ?"

        thisAge.text = " Age: 45"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: 6'5"
        thisWeight.text = " Weight: Muscular"
        thisHair.text = " Hair Color: Dark"
        thisEye.text = " Eye Color: Blue"
        thisRank.text = " Rank: ?"

        thisPortrat.setImageResource(R.drawable.lan)

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string2 = SpannableString("\n     Lan is Moiraine's bodyguard, though he appears more than that.\n\n")
        var string2_1 = SpannableString("\n     He is a Warder bonded to Moiraine Damodred\n\n")

        var string3 = SpannableString("Appearance\n\n")
        string3.setSpan(RelativeSizeSpan(2f),0,10,0)

        var string4 = SpannableString("     Lan is often described as having a face of stone and chilling blue eyes. He is very tall with shoulder-length hair graying at the temples, held back by a leather headband. He wears the color-shifting cloak, and uses a sword as a weapon.\n\n")
        var string4_1 = SpannableString("     Lan is often described as having a face of stone and chilling blue eyes. He is very tall with shoulder-length hair graying at the temples, held back by a leather headband. He wears the color-shifting Warder cloak, and uses a sword as a weapon.\n\n")

        var string5 = SpannableString("Personality\n\n")
        string5.setSpan(RelativeSizeSpan(1.5f),0,11,0)

        var string6 = SpannableString("     His impassive face reveals little of his emotions.\n\n")

        var string13 = SpannableString("Activities\n\n")
        string13.setSpan(RelativeSizeSpan(2f),0,10,0)

        var string15 = SpannableString("     Moiraine and Lan arrive in the Two Rivers.  They find Rand al'Thor, Matrim Cauthon and Perrin Aybara.\n\n")
        var string15_1 = SpannableString("     Moiraine and Lan are in the Two Rivers. They find Rand al'Thor, Matrim Cauthon and Perrin Aybara. Shortly after their arrival, Trollocs attack the Two Rivers, and the group is forced to flee.\n\n")
        thisInfo.setTextColor(Color.WHITE)


        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string2

        if (progress.book>1||(progress.book==1&&progress.chapter>2))
        {
            thisInfo.text = TextUtils.concat(string2,string3,string4,string5,string6,string13,string15)
        }


        if (progress.book>1||(progress.book==1&&progress.chapter>7))
        {
            thisRank.text = "Rank: Warder"
            thisInfo.text = TextUtils.concat(string2_1,string3,string4_1,string5,string6,string13,string15)
        }

        if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            thisInfo.text = TextUtils.concat(string2_1,string3,string4_1,string5,string6,string13,string15_1)
        }
    }
}