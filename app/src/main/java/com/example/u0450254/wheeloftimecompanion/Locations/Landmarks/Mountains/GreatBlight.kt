package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains

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

class GreatBlight : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Great Blight"

        val thisMap = findViewById<ImageView>(R.id.locImage)
        thisMap.setImageResource(R.drawable.blightmap)

        val  thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     The Great Blight is a corruption of the land in the north of the world, extending from Shayol Ghul.\n\n")

        val string5 = SpannableString("Geography\n\n")
        string5.setSpan(RelativeSizeSpan(2f), 0, 9, 0)

        val string6 = SpannableString("     The Great Blight lies north of the Westlands. The Mountains of Dhoom separate the Westlands from it.\n\n")

        val string7 = SpannableString("Places\n\n")
        string7.setSpan(RelativeSizeSpan(2f),0,6,0)

        val string8 = SpannableString("Shayol Ghul\n\n")
        string8.setSpan(RelativeSizeSpan(1.5f),0,11,0)

        val string9 = SpannableString("     Shayol Ghul lies in the Great Blight.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        if ((progress.book==1&&progress.chapter<=1))
        {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisInfo.text = TextUtils.concat(string1,string5,string6,string7,string8,string9)
        }
    }
}