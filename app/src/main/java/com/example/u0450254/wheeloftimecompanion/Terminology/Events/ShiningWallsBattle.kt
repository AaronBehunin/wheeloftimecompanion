package com.example.u0450254.wheeloftimecompanion.Terminology.Events

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


class ShiningWallsBattle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Battle of the Shinging Walls"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        val string1 = SpannableString("\n     The Battle of the Shining Walls was the final and decisive battle of the Aiel War.\n\n")
        terminfo.setTextColor(Color.WHITE)

        terminfo.text = string1
    }
}