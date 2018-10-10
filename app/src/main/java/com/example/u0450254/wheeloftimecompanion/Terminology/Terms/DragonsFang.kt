package com.example.u0450254.wheeloftimecompanion.Terminology.Terms

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/31/2018.
 */


class DragonsFang : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Dragons Fang"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1 = SpannableString("\n     The Dragon's Fang is an ancient symbol, though its original meaning has been forgotten by present-day people.\n\n")

        var string2 = SpannableString("     Since the Breaking the Dragon's Fang has taken on an evil meaning. " +
                "A common use is to be scrawled on someone's door as an accusation of evil or as a curse. " +
                "Its origins are lost to common knowledge by the passing of years, but superstition still regards the Fang as an omen of evil or ill luck.")
        terminfo.setTextColor(Color.WHITE)


        if (progress.book==1 && progress.chapter<=7)
        {
            terminfo.text = string1
        }
        else if (progress.book>1 || (progress.book==1&&progress.chapter>7))
        {
            terminfo.text = TextUtils.concat(string1, string2)
        }
    }
}