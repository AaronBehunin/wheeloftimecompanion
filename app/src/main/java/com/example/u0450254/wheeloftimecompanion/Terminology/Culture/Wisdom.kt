package com.example.u0450254.wheeloftimecompanion.Terminology.Culture

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class Wisdom: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Wisdom"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        val string1  = SpannableString("\n     Wisdom is a term used in the Two Rivers region of Andor to describe a village healer, found in many names as you cross the world but fairly constant in terms of occupation. They practice mastery of herbal remedies and are adept at treating illnesses and such.\n\n")
        val string2 = SpannableString("     The village Wisdom is the female counterpart to the village Mayor.")
        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=1)
        {
            terminfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            terminfo.text = TextUtils.concat(string1,string2)
        }
    }
}