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
class Thom : AppCompatActivity() {

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

        thisTitle.text = "Thom Merrilin"
        thisAffil.text = " Affiliation: Andor"

        thisAge.text = " Age: ?"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: Tall"
        thisWeight.text = " Weight: Thin"
        thisHair.text = " Hair Color: White"
        thisEye.text = " Eye Color: Blue"
        thisRank.text = " Rank: Master Gleeman"



        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Thomdril \"Thom\" Merrilin is a gleeman and, formerly, a court bard.\n\n")

        val string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string3 = SpannableString("     He is fairly old, and has a gnarled face, shaggy white hair, and blue eyes. He is tall, with stooped shoulders. He wears a cloak that is described by Bran al'Vere as having more patches than cloak and more colors than you can think of. " +
                "It is also described as quite thick, having odd, baggy sleeves and big pockets. His snowy hair and long mustaches make him appear older than he probably is, given his spryness. " +
                "He is frequently portrayed as smoking a pipe.\n\n")

        val string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,7,0)

        val string5 = SpannableString("     Not much of his early life is known.\n\n")

        val string7 = SpannableString("Activities\n\n")
        string7.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string8 = SpannableString("Escape from the Two Rivers\n\n")
        string8.setSpan(RelativeSizeSpan(1.5f),0,26,0)

        val string9 = SpannableString("     With his Bardic talents giving him more than the requisite skills, he became a gleeman and journeyed across the land, performing in inns and villages, sometimes for pay, sometimes just for supper and a bed. He just so happened to arrive in Emond's Field late on the same night Moiraine Damodred arrived.\n\n")
        val string9_1 = SpannableString("     With his Bardic talents giving him more than the requisite skills, he became a gleeman and journeyed across the land, performing in inns and villages, sometimes for pay, sometimes just for supper and a bed. He just so happened to arrive in Emond's Field late on the same night Moiraine Damodred arrived, and was present on the very next night when Trollocs attacked.\n\n")
        val string9_2 = SpannableString("     With his Bardic talents giving him more than the requisite skills, he became a gleeman and journeyed across the land, performing in inns and villages, sometimes for pay, sometimes just for supper and a bed. He just so happened to arrive in Emond's Field late on the same night Moiraine Damodred arrived, and was present on the very next night when Trollocs attacked. After the four young people decided to leave for Tar Valon with Moiraine who by then had revealed herself as Aes Sedai, he went with Rand al'Thor, Mat Cauthon, Perrin Aybara, and Egwene al'Vere.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book>1||(progress.book==1&&progress.chapter>4))
        {
            thisPortrat.setImageResource(R.drawable.thom)
        }


        if (progress.book==1&&progress.chapter<=4)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=7)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string7,string9)
        }
        else if (progress.book==1&&progress.chapter<=10)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string7,string8,string9_1)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string7,string8,string9_2)
        }
    }
}