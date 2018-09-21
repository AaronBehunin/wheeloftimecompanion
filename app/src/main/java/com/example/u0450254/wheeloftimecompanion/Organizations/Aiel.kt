package com.example.u0450254.wheeloftimecompanion.Organizations

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/18/2018.
 */
class Aiel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val thisSymbol = findViewById<ImageView>(R.id.Symbol)

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisType = findViewById<TextView>(R.id.type)
        val thisHead = findViewById<TextView>(R.id.Headquarters)
        val thisAllign = findViewById<TextView>(R.id.Allignment)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)

        thisSymbol.setImageResource(R.drawable.aiel)


        thisTitle.text = "Aiel"
        thisType.text = "Type: Military"
        thisHead.text = "Headquarters: Aiel Waste"
        thisAllign.text = "Allignemnt: Neutral"
        thisAffil.text = "Affiliation: Independent"

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("\n     The Aiel are a race of people who live in a desert which everyone calls the Aiel Waste.\n\n")
        var string1_1 = SpannableString("\n     The Aiel are a race of people who live in a desert which everyone calls the Aiel Waste. They have earned a reputation as exceptionally skilled warriors. Aiel can be recognized through their unusual height, as well as their distinctive clothing.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>4))
        {
            thisInfo.text = string1_1
        }
    }
}