/**
 * Created by u0450254 on 6/1/2018.
 */
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
 * Created by u0450254 on 5/18/2018.
 */
class Perrin : AppCompatActivity() {

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

        thisTitle.text = "Perrin Aybara"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"


        thisAge.text = " Age: 20"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: 6'3"
        thisWeight.text = " Weight: 240 pounds"
        thisHair.text = " Hair Color: Brown"
        thisEye.text = " Eye Color: Brown"
        thisRank.text = " Rank: Civilian"



        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Perrin Aybara is one of the main protagonists in the series.\n\n")

        val string4 = SpannableString("Appearance and Personality\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0, 26,0)

        val string5 = SpannableString("     He is stocky, strong, with thick, curly brown hair, and his eyes a deep, dark brown.\n\n")

        val string6 = SpannableString("     Perrin has wide shoulders and strong arms gained from his hours working as a blacksmith's apprentice. He is tall, being only half a head shorter than Rand al'Thor.\n\n")

        val string7 = SpannableString("     Perrin is typically very gentle and slow to anger. Due to his naturally great strength, he learned while he was still a young boy to restrain himself so as not to inadvertently harm others. This restraint extends to his mindset as well, and he typically says only what he thinks needs to be said and nothing more. He also takes great care before speaking, making sure his thoughts are well formed and complete before opening his mouth. This carefulness, combined with his bear-like stature, often gives others the impression that he is somewhat slow of wit.\n\n")

        val string9 = SpannableString("Youth\n\n")
        string9.setSpan(RelativeSizeSpan(1.5f),0, 5,0)

        val string10 = SpannableString("     Perrin was trained to be a blacksmith before being forced to leave Emond's Field with Moiraine Damodred and his friends.\n\n")


        val string53 = SpannableString("The Axe and the Hammer\n\n")
        string53.setSpan(RelativeSizeSpan(1.5f),0, 22,0)

        val string54 = SpannableString("     The night Perrin left the Two Rivers, he received his signature weapon: a moon-bladed hand axe Master Luhhan had crafted for a Merchant Guard who then would not pay for it.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            thisPortrat.setImageResource(R.drawable.perrin)
        }



        if (progress.book==1&&progress.chapter<=3)
        {
            thisInfo.text = string1
        }

        else if (progress.book>1||(progress.book==1&&progress.chapter<=10))
        {
            thisInfo.text = TextUtils.concat(string1,string4,string5,string6,string7)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            thisInfo.text = TextUtils.concat(string1,string4,string5,string6,string7,string9,string10,string53,string54)
        }

    }
}