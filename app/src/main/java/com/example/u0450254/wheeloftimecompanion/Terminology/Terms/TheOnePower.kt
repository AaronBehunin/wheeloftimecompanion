package com.example.u0450254.wheeloftimecompanion.Terminology.Terms

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

class TheOnePower: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The One Power"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        val string1  = SpannableString("\n     The One Power emanates from the True Source, which is made up of two complementary parts: saidin, the male half, and saidar, the female half.\n\n")

        val string35 = SpannableString("Organizations\n\n")
        string35.setSpan(RelativeSizeSpan(2f), 0, 13, 0)

        val string36 = SpannableString("     Aes Sedai was a term that was once used to describe both male and female channelers during the Age of Legends.\n\n")

        val string43 = SpannableString("The taint on saidin\n\n")
        string43.setSpan(RelativeSizeSpan(2f), 0, 19, 0)

        val string44 = SpannableString("     In the current age, the Dark One's taint on saidin causes male channelers, even those who survive the struggle to learn to channel safely, to inevitably go mad. " +
                "The taint came into being at the end of the Age of Legends, when Lews Therin Telamon and the Hundred Companions re-sealed the Dark One into his prison, but in the process, the Dark One unleashed a counterstroke, which caused saidin to become tainted, the taint driving the Hundred Companions and the Dragon immediately and irrevocably insane.\n\n")

        val string45 = SpannableString("     Within ten years, enough men had gone mad. The ensuing chaos and destruction caused the Breaking of the World or the Time of Madness.\n\n")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter==0)
        {
            terminfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=3)
        {
            terminfo.text = TextUtils.concat(string1,string43,string44)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            terminfo.text = TextUtils.concat(string1,string35,string36,string43,string44,string45)
        }
    }
}