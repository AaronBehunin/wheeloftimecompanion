package com.example.u0450254.wheeloftimecompanion.Terminology.Terms

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/31/2018.
 */


class Angreal: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Angreal"

        val terminfo = findViewById<TextView>(R.id.termInfo)

        var string1 = SpannableString("\n     Angreal are objects which allow those who can channel to draw more of the One Power than they normally could without harming themselves in the process.\n\n")

        var string2 = SpannableString("Description\n\n")

        var string6 = SpannableString("     The knowledge of their construction was lost during the Breaking of the World\n\n")

        var string9 = SpannableString("List of Angreal\n\n")

        var string10 = SpannableString("     This is a list of angreal used by individuals at certain points in time.\n\n")

        var string11 = SpannableString("Female Alignment\n\n")

        var string12 = SpannableString("A dark ivory carving of a woman in flowing robes, used by Moiraine Damodred.\n\n")
        terminfo.setTextColor(Color.WHITE)

        terminfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>8))
        {
            terminfo.text = TextUtils.concat(string1,string2,string6,string9,string10,string11,string12)
        }
    }
}