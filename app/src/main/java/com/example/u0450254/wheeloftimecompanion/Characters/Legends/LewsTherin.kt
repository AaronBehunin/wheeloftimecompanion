package com.example.u0450254.wheeloftimecompanion.Characters.Legends

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.view.MenuItem
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Launchers

class LewsTherin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        val launcher = Launchers(this)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisAge = findViewById<TextView>(R.id.Age)
        var thisAffil = findViewById<TextView>(R.id.Affiliation)
        var thisGender = findViewById<TextView>(R.id.Gender)
        var thisHeight = findViewById<TextView>(R.id.Height)
        var thisWeight = findViewById<TextView>(R.id.Weight)
        var thisHair = findViewById<TextView>(R.id.HairColor)
        var thisEye = findViewById<TextView>(R.id.EyeColor)
        var thisRank = findViewById<TextView>(R.id.Rank)

        var thisPortrat = findViewById<ImageView>(R.id.Portrat)

        thisTitle.text = "Lews Therin"
        thisAffil.text = " Affiliation: Legend"


        thisAge.text = " Age: ?(Deceased)"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Brown with White"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: General"

        thisPortrat.setImageResource(R.drawable.lews_therin)
        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("The Previous Dragon. Prevented The Dark One's return, but in the process tainted saiden and went mad killed all of his family and many friends, causing people to later rename him \"Lews Therin Kinslayer.\" Healed of his madness by Ishamael and horrified by his actions, he drew too much of the One Power and killed himself, causing the creation of Dragonmount and inadvertently diverting the river Erinin creating what is now known as the island of Tar Valon.")

        thisInfo.setTextColor(Color.WHITE)
        string1.setSpan(launcher.spanTheDarkOne, 31, 43, 0)
        string1.setSpan(launcher.spanSaiden, 81, 87, 0)
        string1.setSpan(launcher.spanIshamael, 229, 237, 0)
        string1.setSpan(launcher.spanTheOnePower,292, 301, 0)
        string1.setSpan(launcher.spanDragonmount, 346, 357, 0)
        string1.setSpan(launcher.spanTarValon, 447, 456, 0)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());



        if ((progress.book==1 && progress.chapter>0)||progress.book>1)
        {
            thisInfo.text = string1
        }


    }


}