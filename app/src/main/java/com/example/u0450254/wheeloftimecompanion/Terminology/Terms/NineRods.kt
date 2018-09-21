package com.example.u0450254.wheeloftimecompanion.Terminology.Terms

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


class NineRods: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Nine Rods of Dominion"

        val terminfo = findViewById<TextView>(R.id.termInfo)

        var string1 = SpannableString("\n     The Nine Rods of Dominion were regional govenors in the Age of Legends.\n\n")

        var string2 = SpannableString("History\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 7, 0)

        var string3 = SpannableString("     Lews Therin Telamon, in his position of First Among Servants in the Hall of Servants, was able to summon the Rods to meet with him\n\n")

        terminfo.setTextColor(Color.WHITE)

        terminfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>0))
        {
            terminfo.text = TextUtils.concat(string1,string2,string3)
        }
    }
}