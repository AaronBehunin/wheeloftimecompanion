package com.example.u0450254.wheeloftimecompanion.Terminology.Culture

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/31/2018.
 */


class AesSedaiSymbol: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Aes Sedai Symbol"

        val terminfo = findViewById<TextView>(R.id.termInfo)

        var string1 = SpannableString("\n     The ancient symbol of the Aes Sedai has long been associated with the Aes Sedai of the Age of Legends.\n\n")
        var string1_1 = SpannableString("     The ancient symbol of the Aes Sedai has long been associated with the Aes Sedai of the Age of Legends. " +
                "Lews Therin Telamon has this symbol sewn to his cloak before his death.\n\n")
        terminfo.setTextColor(Color.WHITE)

        terminfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>0))
        {
            terminfo.text = string1_1
        }
    }
}