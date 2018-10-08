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

//complete

/*
 * Created by u0450254 on 5/23/2018.
 */
class HundredYearsWar: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "War of the Hundred Years"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1  = SpannableString("\n     The War of the Hundred Years was a devastating series of overlapping wars among constantly shifting alliances that erupted in the wake of the death of the High King, Artur Hawkwing, who had united all the Westlands as one Empire.\n\n")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1
    }
}