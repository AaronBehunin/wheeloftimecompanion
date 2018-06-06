/**
 * Created by u0450254 on 5/31/2018.
 */


package com.example.u0450254.wheeloftimecompanion.Organizations

import android.app.Activity
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

/**
 * Created by u0450254 on 5/31/2018.
 */

class Aiel: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val filename = "Progress"
        val fileContents = "1-1"
        openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        var  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisType = findViewById<TextView>(R.id.type)
        var thisHead = findViewById<TextView>(R.id.Headquarters)
        var thisAllign = findViewById<TextView>(R.id.Allignment)
        var thisAffil = findViewById<TextView>(R.id.Affiliation)

        var thisSymbol = findViewById<ImageView>(R.id.Symbol)

        thisTitle.text = "Aiel"
        thisType.text = "Type: Countrymen"
        thisHead.text = "Headquarters: Aiel Waste"
        thisAllign.text = "Allignment: Neutral"
        thisAffil.text = "Affiliation: Independent"

        thisSymbol.setImageResource(R.drawable.aiel)

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("The Aiel (pronounced: eye-EEL) are a race of people who live between the \"wetlanders\" in the Westlands and the Sharans in the east, in a desert which the Aiel call the Three-fold Land and which everyone else calls the Aiel Waste. They have earned a reputation as exceptionally skilled warriors; little else is known about them in the wider world. Physically, Aiel can be recognized through their unusual height, characteristic pale eyes and light-colored hair, as well as their distinctive clothing."
        )

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}