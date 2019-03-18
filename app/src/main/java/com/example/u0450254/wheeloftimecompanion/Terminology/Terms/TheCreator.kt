package com.example.u0450254.wheeloftimecompanion.Terminology.Terms

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class TheCreator: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The Creator"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        val string1  = SpannableString("\n     The Creator is the name given to the entity who created the universe, the Wheel of Time and reality itself.\n\n")

        val string1_1 = SpannableString("\n     The Creator is the name given to the entity who created the universe, the Wheel of Time and reality itself.  It is suggested that The Creator imprisoned the Dark One, its antithesis, at the moment of Creation.\n\n")

        val string2 = SpannableString("     Virtually nothing is known of The Creator. He is not worshiped as a god in the traditional sense, although his name and the term \"the Light\" appear to be interchangeable.\n\n")
        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=1)
        {
            terminfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            terminfo.text = TextUtils.concat(string1_1,string2)
        }
    }
}