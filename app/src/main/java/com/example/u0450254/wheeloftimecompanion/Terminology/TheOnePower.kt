package com.example.u0450254.wheeloftimecompanion.Terminology

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/23/2018.
 */
class TheOnePower: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The One Power"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1  = SpannableString("     The power drawn from the true source.  The vast majority of people are comepletely unable to channel, and even tinier number have the ability inborn.  Aes Sedai search for men with it in order to stop the terible things they inevitably do with the Power in their madness")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1
    }
}