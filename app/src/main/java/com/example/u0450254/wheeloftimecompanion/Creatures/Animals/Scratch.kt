package com.example.u0450254.wheeloftimecompanion.Creatures.Animals

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 7/10/2018.
 */
class Scratch: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creatures)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Scratch"

        val terminfo = findViewById<TextView>(R.id.creatureInfo)
        var string1  = SpannableString("\n     Scratch is a yellow cat owned by Brandelwyn al'Vere that lives in the Winespring Inn in Emond's Field.\n\n")
        var string3 = SpannableString("Activities\n\n")
        string3.setSpan(RelativeSizeSpan(2f), 0,10,0)

        var string4 = SpannableString("     Scratch usually sleeps in the common room of the Winespring Inn.\n\n")


        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1

        if (progress.book==1&&progress.chapter<=2)
        {
            terminfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>2))
        {
            terminfo.text = TextUtils.concat(string1,string3,string4)
        }

    }
}