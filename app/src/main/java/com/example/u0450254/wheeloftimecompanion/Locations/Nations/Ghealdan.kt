package com.example.u0450254.wheeloftimecompanion.Locations.Nations

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.RelativeSizeSpan
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class Ghealdan: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nation)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisSymbol = findViewById<ImageView>(R.id.Symbol)
        val thisCapital = findViewById<TextView>(R.id.capital)
        val thisType = findViewById<TextView>(R.id.typeofgov)
        val thisHead = findViewById<TextView>(R.id.Head)


        thisTitle.text = "Ghealdan"
        thisSymbol.setImageResource(R.drawable.ghealdan)
        thisCapital.text = "Jehannah"
        thisType.text = "Type: Hereditary Monarchy"
        thisHead.text = "Ruler: King Johanin"


        val locinfo = findViewById<TextView>(R.id.locinfo)
        val string1  = SpannableString("\n     Ghealdan is a relatively small country that lies along the feet of the Mountains of Mist to the north of Amadicia and northwest of Altara.\n\n")


        val string11 = SpannableString("History\n\n")
        string11.setSpan(RelativeSizeSpan(2f), 0, 7, 0)

        val string14 = SpannableString("     In late 997 NE, Ghealdan suffered severe losses when a false Dragon rose to power and rampaged across the country.\n\n")

        locinfo.setTextColor(Color.WHITE)

        if (progress.book==1&&progress.chapter<=3) {
            locinfo.text = string1
        }
        else if (progress.book>1 || (progress.book == 1 && progress.chapter>3))
        {
            locinfo.text = TextUtils.concat(string1,string11,string14)
        }
    }
}