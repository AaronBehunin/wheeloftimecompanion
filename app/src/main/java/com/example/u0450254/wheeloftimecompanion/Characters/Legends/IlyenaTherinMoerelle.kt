package com.example.u0450254.wheeloftimecompanion.Characters.Legends

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.view.MenuItem
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Launchers

class IlyenaTherinMoerelle : AppCompatActivity() {


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
        var thisPortrat = findViewById<ImageView>(R.id.Portrat)
        var thisAge = findViewById<TextView>(R.id.Age)
        var thisAffil = findViewById<TextView>(R.id.Affiliation)
        var thisGender = findViewById<TextView>(R.id.Gender)
        var thisHeight = findViewById<TextView>(R.id.Height)
        var thisWeight = findViewById<TextView>(R.id.Weight)
        var thisHair = findViewById<TextView>(R.id.HairColor)
        var thisEye = findViewById<TextView>(R.id.EyeColor)
        var thisRank = findViewById<TextView>(R.id.Rank)

        thisTitle.text = "Ilyena Therin Moerelle"
        thisAffil.text = " Affiliation: Legend"

        thisAge.text = " Age: ?(Deceased)"

        thisGender.text = " Gender: Female"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Blonde"
        thisEye.text = " Eye Color: "
        thisRank.text = " Rank: ?"


        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("\n     Ilyena Moerelle Dalisar, nicknamed \"Ilyena Sunhair\" because of her red-gold tresses, was a woman of the Age of Legends. Her name changed to Ilyena Therin Moerelle after she married Lews Therin Telamon.\n\n")

        var string3 = SpannableString("     Very little is known about her other than that she was Lews Therin's wife during the Age of Legends and that she loved conversations and hosting guests. " +
                "She was killed along with all of her children by Lews Therin when he went mad, earning him the epithet of \"Kinslayer.\"\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = TextUtils.concat(string1)

        if (progress.book>1||(progress.book==1&&progress.chapter>0))
        {
            thisInfo.text = TextUtils.concat(string1,string3)
        }

    }
}