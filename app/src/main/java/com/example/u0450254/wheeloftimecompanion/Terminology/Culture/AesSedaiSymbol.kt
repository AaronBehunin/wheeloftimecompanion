package com.example.u0450254.wheeloftimecompanion.Terminology.Culture

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class AesSedaiSymbol: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())



        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisImage = findViewById<ImageView>(R.id.termImage)

        thisImage.setImageResource(R.drawable.aessedaisymbol)

        thisTitle.text = "Aes Sedai Symbol"

        val terminfo = findViewById<TextView>(R.id.termInfo)

        val string1 = SpannableString("\n     The ancient symbol of the Aes Sedai has long been associated with the Aes Sedai of the Age of Legends.\n\n")
        val string1_1 = SpannableString("     The ancient symbol of the Aes Sedai has long been associated with the Aes Sedai of the Age of Legends. " +
                "Lews Therin Telamon has this symbol sewn to his cloak before his death.\n\n")
        terminfo.setTextColor(Color.WHITE)

        if (progress.book==1&&progress.chapter==0)
        {
            terminfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>0))
        {
            terminfo.text = string1_1
        }
    }
}