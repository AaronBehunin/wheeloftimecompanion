package com.example.u0450254.wheeloftimecompanion.Terminology.Culture

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class Braid : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Braid"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        val string1 = SpannableString("\n     Braided hair is a common occurrence in the Westlands, though in some cultures it holds a special social significance.\n\n")

        val string2 = SpannableString("Two Rivers\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 10, 0)

        val string3 = SpannableString("     In the Two Rivers district of western Andor, women of marriageable age fix their hair into a single braid which often extends down the length of their back. " +
                "In each village of the region, the local Women's Circle decides when a girl is mature enough to marry and fix her hair accordingly.\n\n")
        terminfo.setTextColor(Color.WHITE)

        if (progress.book==1&&progress.chapter<=2)
        {
            terminfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>2))
        {
            terminfo.text = TextUtils.concat(string1,string2,string3)
        }
    }
}