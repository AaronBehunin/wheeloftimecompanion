package com.example.u0450254.wheeloftimecompanion.Locations.Cities

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class PaaranDisen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Paaran Disen"

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     Paaran Disen was the greatest city in the Age of Legends, considered to be the \"crown jewel\" of all the cities, and the location of the Hall of Servants.\n\n")

        val string2 = SpannableString("     This beautiful city was presumably destroyed in the Breaking of the World, leaving little to nothing of its one-time grandeur.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());


        if (progress.book==1&&progress.chapter<=3) {
            thisInfo.text = string1
        }
        else if (progress.book > 1 || (progress.book == 1 && progress.chapter > 3)) {
            thisInfo.text = TextUtils.concat(string1, string2)
        }
    }
}