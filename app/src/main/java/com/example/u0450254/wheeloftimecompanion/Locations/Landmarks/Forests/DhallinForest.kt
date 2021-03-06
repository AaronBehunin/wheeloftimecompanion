package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class DhallinForest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Dhallin Forest"

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     Dhallin Forest is a forest in Ghealdan.  The forest's location within Ghealdan is unknown.\n\n")
        val string1_1 = SpannableString("\n     Dhallin Forest is a forest in Ghealdan. Several battles were fought here between the false Dragon and the forces opposed to him. The forest's location within Ghealdan is unknown.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book==1&&progress.chapter<=3)
        {
            thisInfo.text = string1
        }
        else if (progress.book > 1 || (progress.book == 1 && progress.chapter > 3))
        {
            thisInfo.text = string1_1
        }
    }
}