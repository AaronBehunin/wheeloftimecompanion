    package com.example.u0450254.wheeloftimecompanion.Terminology.Culture

    import android.graphics.Color
    import android.os.Bundle
    import android.support.v7.app.AppCompatActivity
    import android.text.SpannableString
    import android.text.method.LinkMovementMethod
    import android.widget.TextView
    import com.example.u0450254.wheeloftimecompanion.Progress
    import com.example.u0450254.wheeloftimecompanion.R

    /*
     * Created by u0450254 on 5/23/2018.
     */
    class Gleeman: AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.terminology)

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            var progressFile = openFileInput("Progress")

            val inputString = progressFile.bufferedReader().use { it.readText() }

            val splits = inputString.split("-")

            val progress = Progress(splits[0].toInt(), splits[1].toInt())

            var thisTitle = findViewById<TextView>(R.id.Title)

            thisTitle.text = "Gleeman"

            val terminfo = findViewById<TextView>(R.id.termInfo)
            var string1  = SpannableString("\n    A gleeman is an entertainer, often traveling between towns, villages, inns and taverns.\n\n")
            var string1_1 = SpannableString("\n     A gleeman is an entertainer, often traveling between towns, villages, inns and taverns. They are expected to be masterful story tellers as well as acrobatic, and typically wear a cloak made of many colorful patches. Most skilled gleemen can play one sort of instrument or another, some examples are flute, or if more skillful, harp.\n\n")

            terminfo.setTextColor(Color.WHITE)

            terminfo.setMovementMethod(LinkMovementMethod.getInstance())

            terminfo.text = string1

            if (progress.book>1||(progress.book==1&&progress.chapter>1))
            {
                terminfo.text = string1_1
            }
        }
    }