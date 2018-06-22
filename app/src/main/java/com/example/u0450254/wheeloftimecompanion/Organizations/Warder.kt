package com.example.u0450254.wheeloftimecompanion.Organizations

import android.content.Context
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
 * Created by u0450254 on 5/18/2018.
 */
class Warder : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val filename = "Progress"
        val fileContents = "1-1"
        openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val thisSymbol = findViewById<ImageView>(R.id.Symbol)

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisType = findViewById<TextView>(R.id.type)
        val thisHead = findViewById<TextView>(R.id.Headquarters)
        val thisAllign = findViewById<TextView>(R.id.Allignment)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)

        thisTitle.text = "Warders"
        thisType.text = "Type: Military"
        thisHead.text = "Headquarters: TarValon"
        thisAllign.text = "Allignemnt: Good"
        thisAffil.text = "Affiliation: ?"

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("     An Elite group of warriors known for fighting Trollocs in the Waste.  Or so they say...")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}