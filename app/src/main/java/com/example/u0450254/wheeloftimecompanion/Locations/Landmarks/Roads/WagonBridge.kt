package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads
//complete

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod

import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


class WagonBridge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Wagon Bridge"

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n    The Wagon Bridge is one of three bridges that span the Winespring Water in Emond's Field. \n\n")
        val string1_1 = SpannableString("\n    The Wagon Bridge is one of three bridges that span the Winespring Water in Emond's Field. " +
                "Its name derives from the fact that it is the only bridge wide and stout enough to bear wagons. " +
                "It crosses the stream on the east side of the village Green next to the Winespring Inn.\n\n")

        val string2 = SpannableString("     The bridge marks the point where the North Road, coming down from Taren Ferry and Watch Hill, becomes the Old Road leading to Deven Ride. " +
                "Although outsiders often find it odd that the continuous road through Emond's Field is named differently on either side of the Wagon Bridge, villagers accept the convention without question.")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book==1&&progress.chapter<=1)
        {
            thisInfo.text = string1
        }
        else
        {
            thisInfo.text = TextUtils.concat(string1_1,string2)
        }
    }
}