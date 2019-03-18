package com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters

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

/**
 * Created by u0450254 on 6/1/2018.
 */
class Nynaeve : AppCompatActivity() {

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

        thisTitle.text = "Nynaeve al'Meara"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"


        thisAge.text = " Age: 25"

        thisGender.text = " Gender: Female"
        thisHeight.text = " Height: 5'4"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Brown"
        thisEye.text = " Eye Color: Brown"
        thisRank.text = " Rank: Wisdom"



        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Nynaeve al'Meara is one of the main female protagonists of the series. She is the Wisdom of Emond's Field.\n\n")


        val string4 = SpannableString("Appearance\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0, 10,0)

        val string5 = SpannableString("     Nynaeve is typically described as having dark eyes and a long dark braid, which she often yanks in times of exasperation. She is also described as being relatively short and slim, standing at 5'4\". She is said to be very pretty, even beautiful. She has big eyes, although not as large as Egwene al'Vere's eyes. She looks younger than she actually is.\n\n")

        val string8 = SpannableString("History\n\n")
        string8.setSpan(RelativeSizeSpan(2f),0, 7,0)

        val string9 = SpannableString("    Nynaeve was the very young village Wisdom at the time Moiraine Sedai and her Warder Lan Mandragoran arrived.\n\n")
        val string9_1 = SpannableString("     Several years older than the rest of the Emond's Fielders who left after Winternight, Nynaeve was the very young village Wisdom at the time Moiraine Sedai and her Warder Lan Mandragoran arrived.\n\n")

        val string12 = SpannableString("     She was able to deal with both the Village Council and the Women's Circle due to her forceful personality.\n\n")

        val string13 = SpannableString("Personal Qualities\n\n")
        string13.setSpan(RelativeSizeSpan(2f),0, 18,0)

        val string14 = SpannableString("Personality\n\n")
        string14.setSpan(RelativeSizeSpan(1.5f),0, 11,0)

        val string15 = SpannableString("     Nynaeve is an extremely passionate individual. She is alternately the model of self righteous assuredness and a woman who is self-effacing and in doubt. Nynaeve is also shown to have quite a temper, pulling her braid to vent her anger, an expression that quickly became well known by anyone who spends time in her company.\n\n")

        val string29 = SpannableString("Special Abilities\n\n")

        val string30 = SpannableString("     In addition to being a great Healer and renowned Wisdom, she can also predict the weather (both physical and metaphorical) and has done this ever since she could remember. This is a passive Talent known in the Two Rivers as Listening to the Wind. It is claimed by all Wisdoms, though most cannot.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            thisPortrat.setImageResource(R.drawable.nynaeve)
        }

        if (progress.book==1&&progress.chapter<=3)
        {
            thisInfo.text = string1
        }

        else if (progress.book==1&&progress.chapter<=10)
        {
            thisInfo.text = TextUtils.concat(string1,string4,string5,string8,string9,string12,string13,string14,string15,string29,string30)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            thisInfo.text = TextUtils.concat(string1,string4,string5,string8,string9_1,string12,string13,string14,string15,string29,string30)
        }
    }
}