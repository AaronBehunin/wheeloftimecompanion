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

/*
 * Created by u0450254 on 5/23/2018.
 */
class Void: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The Flame and the Void"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1  = SpannableString("\n     \"The Flame and the Void\" refers to the visualization of a flame in a void; all concerns - emotions, thoughts, even the concerns of life and death - are fed into the flame.\n\n")

        var string3 = SpannableString("Different Ways to the Void\n\n")
        string3.setSpan(RelativeSizeSpan(2f), 0, 26, 0)

        var string4 = SpannableString("     Rand al'Thor first learned the Flame and the Void from his father, Tam al'Thor. While in the Void, Rand excelled in archery.\n\n")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=1)
        {
            terminfo.text = string1
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            terminfo.text = TextUtils.concat(string1,string3,string4)
        }


    }
}