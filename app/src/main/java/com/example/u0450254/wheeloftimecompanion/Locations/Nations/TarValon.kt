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


/*
 * Created by u0450254 on 5/18/2018.
 */
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

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisSymbol = findViewById<ImageView>(R.id.Symbol)
        var thisCapital = findViewById<TextView>(R.id.capital)
        var thisType = findViewById<TextView>(R.id.typeofgov)
        var thisHead = findViewById<TextView>(R.id.Head)


        thisTitle.text = "Tar Valon"
        thisSymbol.setImageResource(R.drawable.whitetower)
        thisCapital.text = "Tar Valon"
        thisType.text = "Type: Democracy"
        thisHead.text = "Ruler: Siuan Sanche"
        var thisInfo = findViewById<TextView>(R.id.locinfo)

        var string1 = SpannableString("    A city on an island in the River Erinin.  The center of Aes Sedai power, and location of the Amyrlin Seat")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}