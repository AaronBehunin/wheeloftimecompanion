package com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols

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
class GreatSerpentRing: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artifact)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisOwner = findViewById<TextView>(R.id.Owner)
        var thisImage = findViewById<ImageView>(R.id.artifactImage)


        thisTitle.text = "The Ring of Tamyrlin"
        thisOwner.text = "Owner: Various"
        thisImage.setImageResource(R.drawable.greatserpentring)

        val artinfo = findViewById<TextView>(R.id.artInfo)
        var string1 = SpannableString("\n      It is a golden ring fashioned into the shape of a serpent biting its own tail, an ancient symbol of eternity and time itself.\n\n")

        artinfo.setTextColor(Color.WHITE)

        artinfo.setMovementMethod(LinkMovementMethod.getInstance())

        artinfo.text = string1
    }
}