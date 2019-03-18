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

class SpineoftheWorld: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisMap = findViewById<ImageView>(R.id.locImage)

        thisTitle.text = "Spine of the World"
        thisMap.setImageResource(R.drawable.spineoftheworldmap)

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     The Spine of the World is a vast mountain range that stretches from the GreatBlight in the north to the Sea of Storms in the south, forming the eastern border of the Westlands and separating it from the Aiel Waste.\n\n")

        val string2 = SpannableString("Other Names:\n\nDragonwall")
        string2.setSpan(RelativeSizeSpan(2f),0,12,0)

        thisInfo.setTextColor(Color.WHITE)
        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book==1&&progress.chapter<=6)
        {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>6))
        {
            thisInfo.text = TextUtils.concat(string1,string2)
        }
    }
}