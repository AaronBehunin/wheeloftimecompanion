package com.example.u0450254.wheeloftimecompanion.Locations.Nations

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/31/2018.
 */


class Ghealdan: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nation)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisSymbol = findViewById<ImageView>(R.id.Symbol)
        var thisCapital = findViewById<TextView>(R.id.capital)
        var thisType = findViewById<TextView>(R.id.typeofgov)
        var thisHead = findViewById<TextView>(R.id.Head)


        thisTitle.text = "Ghealdan"
        thisSymbol.setImageResource(R.drawable.ghealdan)
        thisCapital.text = "Jehannah"
        thisType.text = "Type: Hereditary Monarchy"
        thisHead.text = "Ruler: King Johanin"


        val locinfo = findViewById<TextView>(R.id.locinfo)
        var string1  = SpannableString("     Ghealdan is a relatively small country that lies along the feet of the Mountains of Mist to the north of Amadicia and northwest of Altara.")


        var string2 = SpannableString("Ghealdan is currently under seige by a false dragon")

        locinfo.text = string1

        if (progress.book>1 || (progress.book == 1 && progress.chapter>3))
        {
            locinfo.text = TextUtils.concat(string1,string2)
        }
        locinfo.setTextColor(Color.WHITE)
    }
}