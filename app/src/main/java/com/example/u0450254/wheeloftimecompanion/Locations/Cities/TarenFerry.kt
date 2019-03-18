package com.example.u0450254.wheeloftimecompanion.Locations.Cities

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


class TarenFerry : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Taren Ferry"

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     Taren Ferry is a small town that lies on the northern boundary of the Two Rivers region.\n\n")


        val string8 = SpannableString("Culture\n\n")
        string8.setSpan(RelativeSizeSpan(2f), 0,7,0)

        val string9 = SpannableString("      Men from the town are well known as hagglers, tricksters and fast-talkers, leading other Two Rivers folk to distrust them and use pejorative terms like \"sheepstealer\" or \"chickenthief\"\" to describe them.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book==1&&progress.chapter<=1) {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book == 1&&progress.chapter>1))
        {
            thisInfo.text = TextUtils.concat(string1,string8,string9)
        }
    }
}