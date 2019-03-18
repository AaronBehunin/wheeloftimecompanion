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


class OldRoad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Old Road"

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n    The Old Road is a road located in the Two Rivers.\n\n")

        val string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 9, 0)

        val string3 = SpannableString("     The Old Road begins in Emond's Field at the Wagon Bridge which spans the Winespring Water next to the village Green. " +
                "From there the road passes south out of the community limits and runs adjacent to the Westwood. " +
                "After several miles the Old Road terminates at the village green in Deven Ride. " +
                "On the north side of the Wagon Bridge the same route becomes the North Road. " +
                "Although outsiders often find it odd that the continuous road through Emond's Field changes names on either side of the Wagon Bridge, villagers accept the convention without question.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=1)
        {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3)
        }
    }
}