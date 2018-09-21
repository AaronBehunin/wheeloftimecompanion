package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


/*
 * Created by u0450254 on 5/18/2018.
 */


class Mire : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Mire"

        var thisInfo = findViewById<TextView>(R.id.landInfo)

        var string1 = SpannableString("\n     The Mire is the name given to the lowland marsh located at the junction of the Tarendrelle and Manetherendrelle rivers.\n\n")

        var string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2.0f),0,9,0)

        var string3 = SpannableString("\n     The Mire is fed by continuous flows from the Winespring Water after they have branched and diverged in the Waterwood. " +
                "It is a typical swampy fen full of quicksands and bogs which are treacherous to travelers. " +
                "As a result it is uninhabited. Along with the Mountains of Mist and the Manetherendrelle River, The Mire is an untraversable element of geography that helps to promote the isolation of the Two Rivers region.\n\n")

        var string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2.0f),0,7,0)

        var string5 = SpannableString("\n     During the Trolloc Wars The Mire was seen as an excellent geographic feature that added value to the defense of Manetheren. " +
                "King Aemon al Caar al Thorin who used swamplands adjacent to the Tarendrelle to protect the right flanks of his army during the Battle of the Tarendrelle River.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book == 1 && progress.chapter <=4) {
            thisInfo.text = string1
        }
        else if (progress.book == 1 && progress.chapter<=9)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3)
        }
        else if (progress.book>1 ||(progress.book == 1 && progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5)
        }
    }
}