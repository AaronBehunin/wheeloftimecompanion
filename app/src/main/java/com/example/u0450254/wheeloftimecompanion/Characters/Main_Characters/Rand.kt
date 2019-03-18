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

/*
 * Created by u0450254 on 5/18/2018.
 */
class Rand : AppCompatActivity() {


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

        thisTitle.text = "Rand al'Thor"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"


        thisAge.text = " Age: 20"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: 6'5"
        thisWeight.text = " Weight: 235 pounds"
        thisHair.text = " Hair Color: Red"
        thisEye.text = " Eye Color: Gray"
        thisRank.text = " Rank: Civilian"


        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Rand al'Thor is the main protagonist of the series.\n\n")

        val string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 10, 0)

        val string3 = SpannableString("    Rand al'Thor is a handsome, very tall and light-skinned. He has blue-gray eyes and dark reddish, unruly hair hanging just past his ears. Rand has a broad shouldered physique, although he is more slender and not as heavily built as his friend Perrin. He is strong and muscular from years of arduous farm work.\n\n")

        val string16 = SpannableString("Activities\n\n")
        string16.setSpan(RelativeSizeSpan(2f), 0, 10, 0)

        val string17 = SpannableString("From the Two Rivers\n\n")
        string17.setSpan(RelativeSizeSpan(1.5f), 0, 19, 0)

        val string18 = SpannableString("     On Winternight, 998 NE, Trollocs attacked Emond's Field.\n\n")
        val string18_1 = SpannableString("     On Winternight, 998 NE, Trollocs attacked Emond's Field. Rand, Perrin, Mat, Egwene and Thom Merrilin were led out of Emond's Field by Moiraine Sedai and her Warder, Lan Mandragoran." +
                " Thom was not a resident of the village, but a gleeman who happened to be in Emond's Field just then.\n\n")

        val string87 = SpannableString("Significant Possessions\n\n")
        string87.setSpan(RelativeSizeSpan(2f), 0, 23, 0)

        val string88 = SpannableString("Tam al'Thor's Sword\n\n")
        string88.setSpan(RelativeSizeSpan(1.5f), 0, 19, 0)

        val string89 = SpannableString("     The first sword Rand ever owned, given to him by Tam al'Thor on Winternight after the Trollocs attacked Emond's Field. It has herons on the hilt and blade.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());




        if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisPortrat.setImageResource(R.drawable.randeotw)
        }


        if (progress.book==1&&progress.chapter<=1)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=5)
        {
            thisInfo.text = TextUtils.concat(string1, string2, string3)
        }
        else if (progress.book==1&&progress.chapter<=10)
        {
            thisInfo.text = TextUtils.concat(string1, string2, string3,string16,string18,string87,string88,string89)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string16,string17,string18_1,string87,string88,string89)
        }

    }
}
