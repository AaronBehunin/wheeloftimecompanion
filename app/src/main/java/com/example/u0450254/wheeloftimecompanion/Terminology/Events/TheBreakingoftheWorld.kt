package com.example.u0450254.wheeloftimecompanion.Terminology.Events

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

class TheBreakingoftheWorld: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The Breaking of the World"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        val string1  = SpannableString("\n     The Breaking of the World, also known as the Time of Madness, was a period when male Aes Sedai destroyed much of the world, ending the Age of Legends, and heralding the beginning of the Third Age.\n\n")

        val string6 = SpannableString("During the Breaking\n\n")
        string6.setSpan(RelativeSizeSpan(2f),0,19,0)

        val string7 = SpannableString("     In their insanity, the male Aes Sedai used the One Power to destroy mountains and raise new ones, to drain oceans and flood dry land. Cities were wiped out and civilization completely collapsed during this time, only re-establishing itself in primitive form after the last of the male Aes Sedai were dead.\n\n")

        val string19 = SpannableString("After the Breaking\n\n")
        string19.setSpan(RelativeSizeSpan(2f),0,18,0)

        val string21 = SpannableString("     Much of the world was completely changed, and most of the world's population died in the upheaval. The glorious civilization of the Age of Legends had disappeared in three hundred years of blood and fire.\n\n")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=3)
        {
            terminfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            terminfo.text = TextUtils.concat(string1,string6,string7,string19,string21)
        }
    }
}