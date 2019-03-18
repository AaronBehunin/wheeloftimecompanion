package com.example.u0450254.wheeloftimecompanion.Characters.Supporting

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
class Moiraine : AppCompatActivity() {

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

        thisTitle.text = "Moiraine Damodred"
        thisAffil.text = " Affiliation: ?"

        thisAge.text = " Age: 42"

        thisGender.text = " Gender: Female"
        thisHeight.text = " Height: 5'2\""
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Brown"
        thisEye.text = " Eye Color: Brown"
        thisRank.text = " Rank: ?"



        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     A Visitor to the Two Rivers.\n\n")
        val string1_1 = SpannableString("\n     An Aes Sedai.\n\n")

        val string4 = SpannableString("Appearance\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string5 = SpannableString("     When she arrives in Emond's Field she is described as having dark hair, hanging in ringlets. She looks the same age as Nynaeve, but with large, dark eyes that belong to a much older woman. This is the first mention of the ageless look. She is relatively short, standing at 5'2\", and has a melodious voice. She wears a sky-blue velvet cloak with vines and flowers along the edges in thick silver embroidery, a golden woven belt and a dark blue dress slashed with cream. She wears a Great Serpent ring on the second finger of her left hand.\n\n")

        val string25 = SpannableString("Activities\n\n")
        string25.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string33 = SpannableString("     She journeyed to the town of Emond's Field in the Two Rivers region of Andor.\n\n")
        val string33_1 = SpannableString("     She journeyed to the town of Emond's Field in the Two Rivers region of Andor. On Winternight, Trollocs invaded the Two Rivers region.\n\n")
        val string33_2 = SpannableString("     She journeyed to the town of Emond's Field in the Two Rivers region of Andor. On Winternight, Trollocs invaded the Two Rivers region. After the attack, she and Lan persuaded the three boys -- Rand al'Thor, Matrim Cauthon and Perrin Aybara -- plus Thomdril Merrilin, Egwene al'Vere to leave Emond's Field and head for the safety of the White Tower.\n\n")

        thisInfo.setTextColor(Color.WHITE)
        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book>1||(progress.book==1&&progress.chapter>2))
        {
            thisPortrat.setImageResource(R.drawable.moiraine)
        }

        if (progress.book==1&&progress.chapter<=2)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=7)
        {
            thisInfo.text = TextUtils.concat(string1,string4,string5,string25,string33)
        }
        else if (progress.book==1&&progress.chapter<=10)
        {
            thisRank.text = " Rank: Aes Sedai"
            thisInfo.text = TextUtils.concat(string1_1,string4,string5,string25,string33,string33_1)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            thisInfo.text = TextUtils.concat(string1_1,string4,string5,string25,string33,string33_2)
        }
    }
}