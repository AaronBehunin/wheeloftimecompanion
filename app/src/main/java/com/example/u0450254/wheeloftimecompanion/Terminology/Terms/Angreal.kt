package com.example.u0450254.wheeloftimecompanion.Terminology.Terms

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.RelativeSizeSpan
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


class Angreal: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Angreal"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        val thisImage = findViewById<ImageView>(R.id.termImage)


        val string1 = SpannableString("\n     Angreal are objects which allow those who can channel to draw more of the One Power than they normally could without harming themselves in the process.\n\n")

        val string2 = SpannableString("Description\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 11, 0)

        val string6 = SpannableString("     The knowledge of their construction was lost during the Breaking of the World\n\n")

        val string9 = SpannableString("List of Angreal\n\n")
        string9.setSpan(RelativeSizeSpan(2f), 0, 15, 0)

        val string10 = SpannableString("     This is a list of angreal used by individuals at certain points in time.\n\n")

        val string11 = SpannableString("Female Alignment\n\n")
        string11.setSpan(RelativeSizeSpan(1.5f), 0,16,0 )

        val string12 = SpannableString("A dark ivory carving of a woman in flowing robes, used by Moiraine Damodred.\n\n")
        terminfo.setTextColor(Color.WHITE)

        if (progress.book>1||progress.book==1&&progress.chapter>8)
        {
            thisImage.setImageResource(R.drawable.angreal)
        }


        if (progress.book==1&&progress.chapter<=8)
        {
            terminfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>8))
        {
            terminfo.text = TextUtils.concat(string1,string2,string6,string9,string10,string11,string12)
        }
    }
}