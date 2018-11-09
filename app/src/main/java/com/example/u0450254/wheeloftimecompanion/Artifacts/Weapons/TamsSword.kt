package com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class TamsSword: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artifact)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisImage = findViewById<ImageView>(R.id.artifactImage)
        val thisOwner = findViewById<TextView>(R.id.Owner)

        thisTitle.text = "Tam's Sword"
        thisOwner.text = "Owner: Tam"
        thisImage.setImageResource(R.drawable.tamsblade)

        val artinfo = findViewById<TextView>(R.id.artInfo)
        val string1  = SpannableString("\n     Tamlin al'Thor's sword is the first sword Rand ever owned.\n\n")
        val string1_1 =  SpannableString("\n     Tamlin al'Thor's sword is the first sword Rand ever owned, given to him by Tam al'Thor on Winternight after the Trollocs attacked Emond's Field.\n\n")


        artinfo.setTextColor(Color.WHITE)

        artinfo.setMovementMethod(LinkMovementMethod.getInstance())

        artinfo.text = string1

        if (progress.book == 1 && progress.chapter<=5)
        {
            artinfo.text = string1
        }
        else if (progress.book >1 || progress.book == 1 && progress.chapter>5)
        {
            artinfo.text = string1_1
        }
    }
}