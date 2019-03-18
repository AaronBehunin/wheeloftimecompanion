package com.example.u0450254.wheeloftimecompanion.Organizations

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class Forsaken : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisSymbol = findViewById<ImageView>(R.id.Symbol)
        val thisType = findViewById<TextView>(R.id.type)
        val thisHead = findViewById<TextView>(R.id.Headquarters)
        val thisAllign = findViewById<TextView>(R.id.Allignment)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)

        thisTitle.text = "Forsaken"
        thisType.text = "Type: One Power Users"
        thisHead.text = "Headquarters: Shayol Ghul"
        thisAllign.text = "Allignemnt: Evil"
        thisAffil.text = "Affiliation: The Dark One"


        thisSymbol.setImageResource(R.drawable.forsaken)

        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n    The Forsaken were channelers who served the side of the Shadow in the War of Power.\n\n")

        val string2 = SpannableString("     Although during the War of Power there were dozens of Forsaken leading the armies of the Shadow, as time passed, the term \"Forsaken\" came to refer to only the thirteen most powerful among them, who were caught in the sealing and imprisoned with the Dark One. The horrific deeds of each were remembered long after their disappearance. In the Third Age, these thirteen were such infamous symbols of the Shadow that mothers would use stories of their exploits to frighten children.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=1)
        {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisInfo.text = TextUtils.concat(string1,string2)
        }
    }
}