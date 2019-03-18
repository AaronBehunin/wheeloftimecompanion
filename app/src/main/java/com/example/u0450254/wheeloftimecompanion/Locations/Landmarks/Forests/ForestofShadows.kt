package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


class ForestofShadows : AppCompatActivity() {

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

        thisTitle.text = "Forest of Shadows"
        thisMap.setImageResource(R.drawable.forestofshadowsmap)

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     The Forest of Shadows, is a large, impenetrable forest that lies between the Two Rivers and Ghealdan just east of the Mountains of Mist. It lies south of the White River and the village of Deven Ride.\n\n")
        val string1_1 = SpannableString("\n     The Forest of Shadows, is a large, impenetrable forest that lies between the Two Rivers and Ghealdan just east of the Mountains of Mist.  It lies south of the White River and the village of Deven Ride.  The river flows so fast it is almost uncrossable, and the forest is so overgrown, wild, and dangerous that people simply don't bother making the attempt to cross\n\n")
        val string1_2 = SpannableString("\n     The Forest of Shadows, or Great Blackwood, is a large, impenetrable forest that lies between the Two Rivers and Ghealdan just east of the Mountains of Mist. It lies south of the White River and the village of Deven Ride. Although it was once presumably possible to traverse the river and forest, as the whole region was once part of the kingdom of Manetheren, in modern times the river flows so fast it is almost uncrossable, and the forest is so overgrown, wild, and dangerous that people simply don't bother making the attempt.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());


        if (progress.book==1&&progress.chapter<=4)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=9)
        {
            thisInfo.text = string1_1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = string1_2
        }
    }
}