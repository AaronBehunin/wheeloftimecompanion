package com.example.u0450254.wheeloftimecompanion.Terminology.Events

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class BelTine: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Bel Tine"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        val string1  = SpannableString("\n     Bel Tine, also known as Festival, is the Westlands celebration of spring's arrival.\n\n")
        val string1_1 = SpannableString( "\n     Bel Tine, also known as Festival, is the Westlands celebration of spring's arrival. It is not set to a specific date, and comes later in northern lands than in the south. As part of the celebration, huge bonfires are constructed in the center of town that are almost as big as a house. The women of the village erect a Spring Pole the day before the festival, and even though the men walking by can see it happening, they pretend to be surprised by it when they wake up on the morning of the Festival.\n\n")

        val string2 = SpannableString("     The night preceding Bel Tine is known as Winternight.\n\n")

        val string3 = SpannableString("     At noon on the day of Festival, unmarried women dance around the Spring Pole entwining it with ribbons while the unmarried men sing.\n\n")
        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=1)
        {
            terminfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            terminfo.text = TextUtils.concat(string1_1,string2,string3)
        }
    }
}