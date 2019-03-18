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
 * Created by u0450254 on 6/1/2018.
 */
class Egwene : AppCompatActivity() {

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

        thisTitle.text = "Egwene al'Vere"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: 17"

        thisGender.text = " Gender: Female"
        thisHeight.text = " Height: 5'2"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Brown"
        thisEye.text = " Eye Color: Brown"
        thisRank.text = " Rank: Civilian"



        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Ewgene al'Vere is one of the main female protagonists of the series.\n\n")

        val string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string3 = SpannableString("     She is described as beautiful, with large brown eyes, and long dark hair. She's very short, standing one span and two inches or about 5'2\".\n\n")
        val string4 = SpannableString("Personality\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,11,0)

        val string6 = SpannableString("     Egwene frequently acts in a manner that comes off as arrogant. She also, like many other women in the series, believes men to be foolish or blunt. Because of this, she usually gets her way.\n\n")

        val string16 = SpannableString("Family and Friends\n\n")
        string16.setSpan(RelativeSizeSpan(2f),0,18,0)

        val string17 = SpannableString("     Egwene is the youngest daughter of Marin al'Vere and Brandelwyn al'Vere, Mayor of Emond's Field.\n\n")

        val string18 = SpannableString("     Egwene grew up in Emond's Field with Rand al'Thor, Matrim Cauthon, Perrin Aybara and Nynaeve al'Meara. Though friends with all of them, she was particularly close with Rand, whom it was assumed she would marry when they both came of age. She also wished to become apprentice Wisdom to Nynaeve.\n\n")

        val string19 = SpannableString("Activities\n\n")
        string19.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string20 = SpannableString("Adventure\n\n")
        string20.setSpan(RelativeSizeSpan(1.5f),0,9,0)

        val string21 = SpannableString("   Winternight changed all that. When Trollocs invaded the Two Rivers region, Rand, Mat and Perrin were spirited away by Moiraine Sedai for their own protection; Egwene went with them, seeking \"adventure\".")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            thisPortrat.setImageResource(R.drawable.egwene)
        }


        if (progress.book==1&&progress.chapter <=3)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=10)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string6,string16,string17, string18)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            thisInfo.text = TextUtils.concat(thisInfo.text,string19,string20,string21)
        }
    }
}