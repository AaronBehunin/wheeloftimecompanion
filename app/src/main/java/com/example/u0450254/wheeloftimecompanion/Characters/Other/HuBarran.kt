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
class HuBarran : AppCompatActivity() {

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

        thisTitle.text = "Hu Barran"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: ?"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: Lanky"
        thisHair.text = " Hair Color: ?"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Civilian"

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("\n     Hu Barran is one of the stablemen at the Winespring Inn. \n\n")
        var string1_1 = SpannableString("\n     Hu Barran is one of the stablemen at the Winespring Inn. His brother is Tad.\n\n")

        var string4 = SpannableString("Activities\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,10,0)

        var string5 = SpannableString("     When Rand and Tamlin al'Thor come to Emond's Field, Hu and Tad take Bela and the wagon to the Whiespring Inn's stable.\n\n")
        var string5_5 = SpannableString("     When Rand and Tamlin al'Thor come to Emond's Field, Hu and Tad take Bela and the wagon to the Whiespring Inn's stable. " +
                "As the al'Thors are leaving, Tam briefly speaks with the brothers.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book==1&&progress.chapter <=2)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter <=4)
        {
            thisInfo.text = TextUtils.concat(string1_1,string4,string5)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter >4))
        {
            thisInfo.text = TextUtils.concat(string1_1,string4,string5_5)
        }
    }
}