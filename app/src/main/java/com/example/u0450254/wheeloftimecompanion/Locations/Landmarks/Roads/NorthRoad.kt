package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads

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


// next entry the dragon reborn 19

class NorthRoad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "North Road"

        var thisInfo = findViewById<TextView>(R.id.termInfo)

        var string1 = SpannableString("\n    The North Road is a road located in the Two Rivers.\n\n")

        var string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 9, 0)

        var string3 = SpannableString("     The North Road begins at the southern banks of the River Tarendrelle in the Taren Ferry community. " +
                "From there it passes south out of the town and runs adjacent to the Westwood. After several miles it passes the village limits of Watch Hill. " +
                "From there it continues south and terminates at the Wagon Bridge in Emond's Field next to the Winespring Inn and the village Green. " +
                "On the opposite side of the bridge the traveled-way continues to Deven Ride under a new name: the Old Road. " +
                "Although outsiders often find it odd that the continuous road through Emond's Field changes names on either side of the Wagon Bridge, villagers accept the convention without question.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=1)
        {
            thisInfo.text = string1
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3)
        }
    }
}