package com.example.u0450254.wheeloftimecompanion.Creatures.Monsters

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/23/2018.
 */
class Draghkar: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creatures)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        var thisPicture = findViewById<ImageView>(R.id.creaturePic)

        thisTitle.text = "Draghkar"

        val terminfo = findViewById<TextView>(R.id.creatureInfo)
        val string1  = SpannableString("\n     The Draghkar are Shadowspawn with leathery wings.\n\n")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1
    }
}