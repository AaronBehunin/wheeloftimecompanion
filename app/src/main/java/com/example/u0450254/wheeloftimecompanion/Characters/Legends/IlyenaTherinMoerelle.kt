package com.example.u0450254.wheeloftimecompanion.Characters.Legends

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import android.widget.*

class IlyenaTherinMoerelle : AppCompatActivity() {


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

        thisTitle.text = "Ilyena Therin Moerelle"
        thisAffil.text = " Affiliation: Legend"

        thisAge.text = " Age: ?(Deceased)"

        thisGender.text = " Gender: Female"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Blonde"
        thisEye.text = " Eye Color: "
        thisRank.text = " Rank: ?"


        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Ilyena Moerelle Dalisar, nicknamed \"Ilyena Sunhair\" because of her red-gold tresses, was a woman of the Age of Legends. Her name changed to Ilyena Therin Moerelle after she married Lews Therin Telamon.\n\n")

        val string3 = SpannableString("     Very little is known about her other than that she was Lews Therin's wife during the Age of Legends and that she loved conversations and hosting guests. " +
                "She was killed along with all of her children by Lews Therin when he went mad, earning him the epithet of \"Kinslayer.\"\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = TextUtils.concat(string1)
        if (progress.book==1&&progress.chapter<=0)
        {
            thisInfo.text=string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>0))
        {
            thisInfo.text = TextUtils.concat(string1,string3)
        }

    }
}