package com.example.u0450254.wheeloftimecompanion.Terminology

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/23/2018.
 */
class Wisdom: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Wisdom"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1  = SpannableString("     In villages, a woman chosen by the Women's Circle to sit in the Circle for her knowledge of such things as healing and fortelling the weather, as well as for common good sense." +
                " A position of great responiblility and authority, both actual and implied.  She is generally considered the equal of the mayor, and in some villages his superior." +
                "Unlike the mayor, she is chosen for life, and it is very rare for a Wisdom to be removed from office before her death.")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1
    }
}