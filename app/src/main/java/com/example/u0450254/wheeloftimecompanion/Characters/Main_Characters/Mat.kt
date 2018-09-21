package com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters

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
class Mat : AppCompatActivity() {

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

        thisTitle.text = "Matrim Cauthon"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: 20"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: 6'2"
        thisWeight.text = " Weight: 180 Pounds"
        thisHair.text = " Hair Color: Brown"
        thisEye.text = " Eye Color: Brown"
        thisRank.text = " Rank: Civilian"

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        thisPortrat.setImageResource(R.drawable.mat)

        var string1 = SpannableString("\n     Matrim Cauthon, usually simply called 'Mat', is one of the main characters of the series.\n\n")

        var string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0 ,10,0)

        var string3 = SpannableString("     He is as long-limbed as a stork, with a wiry body and brown eyes.\n\n")

        var string5 = SpannableString("Personality\n\n")
        string5.setSpan(RelativeSizeSpan(2f),0 ,11,0)


        var string6 = SpannableString("     Mat is often described as lazy, roguish, immature, tactless, and brazen.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        var string10 = SpannableString("Activities\n\n")
        string10.setSpan(RelativeSizeSpan(2f),0 ,10,0)

        var string11 = SpannableString("Meeting Moiraine\n\n")
        string11.setSpan(RelativeSizeSpan(1.5f),0 ,16,0)

        var string12 = SpannableString("     Mat was something of a black sheep in Emond's Field. Though he, Rand al'Thor, and Perrin Aybara got into trouble quite a bit, Mat was generally the force behind it.\n\n")

        var string13 = SpannableString("     A joker and a prankster.\n\n")
        var string13_1 = SpannableString("     A joker and a prankster. He was led away on Winternight by Moiraine Damodred with his friends.\n\n")

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1

        if(progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisInfo.text= TextUtils.concat(string1,string2,string3,string5,string6,string10,string12,string13)
        }
        if(progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            thisInfo.text= TextUtils.concat(string1,string2,string3,string5,string6,string10,string11,string12,string13_1)
        }
    }
}