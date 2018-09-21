package com.example.u0450254.wheeloftimecompanion.Organizations

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/23/2018.
 */
class HundredCompanions: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Hundred Companions"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1  = SpannableString("\n   The Hundred Companions were a group of one hundred thirteen young male Aes Sedai from the Age of Legends.\n\n")
        var string2  = SpannableString("     The Dark One's counterstroke, rendered the Companions instantly mad. During the following years, they and all other male Aes Sedai broke the world.\n\n")
                 terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            terminfo.text = TextUtils.concat(string1,string2)
        }
    }
}
