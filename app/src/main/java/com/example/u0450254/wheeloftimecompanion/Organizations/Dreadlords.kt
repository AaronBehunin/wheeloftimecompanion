package com.example.u0450254.wheeloftimecompanion.Organizations

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class Dreadlords : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisSymbol = findViewById<ImageView>(R.id.Symbol)
        val thisType = findViewById<TextView>(R.id.type)
        val thisHead = findViewById<TextView>(R.id.Headquarters)
        val thisAllign = findViewById<TextView>(R.id.Allignment)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)

        thisTitle.text = "Dreadlords"
        thisType.text = "Type: Military"
        thisHead.text = "Headquarters: Shayol Ghul"
        thisAllign.text = "Allignemnt: Evil"
        thisAffil.text = "Affiliation: The Dark One"


        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n    Dreadlords were men and women able to channel the One Power that went to the Shadow during the Trolloc Wars.\n\n")
        val string1_1 = SpannableString("\n     Dreadlords were men and women able to channel the One Power that went to the Shadow during the Trolloc Wars. " +
                "They acted as battle commanders, overlords of the Trolloc forces, above the Myrddraal in chain of command.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())


        if (progress.book == 1 && progress.chapter <= 8) {
            thisInfo.text = string1
        }
        else if (progress.book > 1 || (progress.book == 1 && progress.chapter>8)) {
            thisInfo.text = string1_1
        }
    }
}