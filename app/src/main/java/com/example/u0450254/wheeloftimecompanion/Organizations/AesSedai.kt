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

class AesSedai : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisType = findViewById<TextView>(R.id.type)
        val thisSymbol = findViewById<ImageView>(R.id.Symbol)
        val thisHead = findViewById<TextView>(R.id.Headquarters)
        val thisAllign = findViewById<TextView>(R.id.Allignment)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)

        thisTitle.text = "Aes Sedai"
        thisType.text = "Type: One Power Users"
        thisHead.text = "Headquarters: Tar Valon"
        thisAllign.text = "Allignemnt: Good"
        thisAffil.text = "Affiliation: Independent"

        thisSymbol.setImageResource(R.drawable.aessedaisymbol)

        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Wielders of the One Power.  Since the Time of Madness, all surviving Aes Sedai are women. " +
                "Widely distrusted and feared, even hated, they are blamed by many for the Breaking of the World, and are generally thought to meddle in the affairs of other nations.")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}