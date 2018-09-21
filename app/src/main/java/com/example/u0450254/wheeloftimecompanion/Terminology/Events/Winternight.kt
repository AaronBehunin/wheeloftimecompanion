package com.example.u0450254.wheeloftimecompanion.Terminology.Events

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/31/2018.
 */


class Winternight: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Winternight"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1 = SpannableString("\n     Winternight is a holiday marking the last day of winter.\n\n")
        var string1_1 = SpannableString("\n     Winternight is a holiday marking the last day of winter. " +
                "While the weather is still frequently cold, it is heavily anticipated due to the Bel Tine celebrations that take place the following day. " +
                "Winternight is a time for visiting friends and family and exchanging gifts.\n\n")

        var string2 = SpannableString("The Winternight Attack\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 22, 0)

        var string3 = SpannableString("     In 998 NE, Winternight held special and tragic significance for the village of Emond's Field in the Two Rivers, when Trollocs and at least one Myrddraal attacked. " +
                "Their attack failed due both to the customs of Winternight in the Two River's area, and to the fortuitous presence of an Aes Sedai, Moiraine Damodred, and her Warder, Lan Mandragoran. ")
        var string3_1 = SpannableString("     In 998 NE, Winternight held special and tragic significance for the village of Emond's Field in the Two Rivers, when Trollocs and at least one Myrddraal attacked. " +
                "Their attack failed due both to the customs of Winternight in the Two River's area, and to the fortuitous presence of an Aes Sedai, Moiraine Damodred, and her Warder, Lan Mandragoran. " +
                "Following the attack they took several young residents of the village away for their own protection, although many villagers, fearing the Aes Sedai of their stories and legends, were suspicious of their true motives.")

        terminfo.setTextColor(Color.WHITE)

        if (progress.book==1&&progress.chapter<=1)
        {
            terminfo.text = string1
        }
        else if ((progress.book==1&&progress.chapter<=7))
        {
            terminfo.text = string1_1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter<=10))
        {
            terminfo.text = TextUtils.concat(string1_1,string2,string3)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            terminfo.text = TextUtils.concat(string1_1,string2,string3_1)
        }
    }
}