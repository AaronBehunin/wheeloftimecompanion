package com.example.u0450254.wheeloftimecompanion.Locations.Cities

import android.content.Context
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

/**
 * Created by u0450254 on 6/7/2018.
 */
class Baerlon: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val filename = "Progress"
        val fileContents = "1-1"
        openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Baerlon"

        var string1 = SpannableString("Baerlon is a town in Andor where the ores from the Mountains of Mist are transported for smelting.\n" +
                "\n" +
                "     Several other communities in the area have been ignored so the crown of Andor could hold on to this land, which is very important to the economy of Andor.\n" +
                "\n" +
                "     The town is surrounded by a log wall nearly twenty feet tall, with large gates that open only from sunup to sundown, a safety precaution followed because the city lies in the middle of the wilderness.")

        var thisInfo = findViewById<TextView>(R.id.termInfo)

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        thisInfo.text = TextUtils.concat(string1)
    }
}