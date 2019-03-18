package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads

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

class QuarryRoad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Quarry Road"
        val thisImage = findViewById<ImageView>(R.id.locImage);

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     The Quarry Road is a rock-strewn track that lies near Emond's Field in the Two Rivers region.\n\n")

        val string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 9, 0)

        val string3 = SpannableString("     The road proceeds due west from Emond's Field, passes through the Westwood and the Sand Hills, and terminates somewhere near the roots of the Mountains of Mist. The al'Thor family farm is located on the north side of the Quarry Road a few miles west of Emond's Field.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisImage.setImageResource(R.drawable.quarryroad)
        }


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