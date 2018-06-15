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
class Forsaken : AppCompatActivity() {

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

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("     Name given to thirteen of the most powerful Aes Sedai ever known, who went over to the Dark One during the War of the Shadow in return for the promise of immortality.  According to both legend and fragmentary records, they were imprisoned along with the Dark One when his prison was resealed."+
                "  Their names are still used to frighten children")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}