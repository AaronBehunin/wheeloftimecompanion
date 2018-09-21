package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests

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


class SandHills: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Sand Hills"

        var thisInfo = findViewById<TextView>(R.id.landInfo)

        var string1 = SpannableString("\n     The Sand Hills are an abnormal geographic feature that extend along the eastern foothills of the Mountains of Mist.\n\n")

        var string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,9,0)

        var string3 = SpannableString("     The hills occur intermittently along the edge of the mountain range and are most prominent in the Two Rivers region where they lie to the west of; and adjacent to the Westwood. The Quarry Road passes through the hills on its way to the roots of the mountains.\n\n")

        var string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,7,0)

        var string5 = SpannableString("     The Sand Hills were once the shore of a vast western ocean during the Age of Legends.\n\n")
        var string5_1 = SpannableString("     The Sand Hills were once the shore of a vast western ocean during the Age of Legends. The shoreline was displaced and forced upwards during the Breaking of the World when insane male channelers raised the adjacent mountains and drove back the sea. Since the breaking, there has been no significant history related to the area.\n\n")

        var string6 = SpannableString("Artifacts\n\n")
        string6.setSpan(RelativeSizeSpan(2f),0,9,0)

        var string7 = SpannableString("     The desolate environment of the hills have led many inhabitants of the Two Rivers to come to the superstitious conclusion that exploration of the area causes bad luck.")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string6,string7)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5_1,string6,string7)
        }

    }
}