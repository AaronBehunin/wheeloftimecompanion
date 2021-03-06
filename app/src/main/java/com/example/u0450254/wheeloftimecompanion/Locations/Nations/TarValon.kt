package com.example.u0450254.wheeloftimecompanion.Locations.Nations
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


class TarValon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nation)

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
        val thisCapital = findViewById<TextView>(R.id.capital)
        val thisType = findViewById<TextView>(R.id.typeofgov)
        val thisHead = findViewById<TextView>(R.id.Head)


        thisTitle.text = "Tar Valon"
        thisSymbol.setImageResource(R.drawable.whitetower)
        thisCapital.text = "Tar Valon"
        thisType.text = "Type: Democracy"
        thisHead.text = "Ruler: Siuan Sanche"
        val thisInfo = findViewById<TextView>(R.id.locinfo)

        val string1 = SpannableString("\n     Tar Valon is a city located on an island on the River Erinin, within sight of Dragonmount. It is the center of Aes Sedai power and is also the second largest, most populous city in the Westlands.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}