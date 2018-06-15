package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


/*
 * Created by u0450254 on 5/18/2018.
 */
class TwoRivers : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val filename = "Progress"
        val fileContents = "1-1"
        openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The Two Rivers"

        var thisInfo = findViewById<TextView>(R.id.termInfo)

        var string1 = SpannableString("The Two Rivers is a region centrally-located in the Westlands which derives its name from the two rivers that mark its boundaries: the Taren River to the north and the White River to the south. It contains the villages of Taren Ferry, Deven Ride, Emond's Field, and Watch Hill, along with many independent farms.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        var string2 = SpannableString("Map")
        string2.setSpan(RelativeSizeSpan(2f), 0, 3, 0)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}