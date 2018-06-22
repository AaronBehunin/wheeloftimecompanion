package com.example.u0450254.wheeloftimecompanion.Characters.Forsaken

/**
 * Created by u0450254 on 5/29/2018.
 */
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Launchers

/**
 * Created by u0450254 on 5/23/2018.
 */
class PadanFain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val launcher = Launchers(this)


        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisAge = findViewById<TextView>(R.id.Age)
        var thisAffil = findViewById<TextView>(R.id.Affiliation)
        var thisGender = findViewById<TextView>(R.id.Gender)
        var thisHeight = findViewById<TextView>(R.id.Height)
        var thisWeight = findViewById<TextView>(R.id.Weight)
        var thisHair = findViewById<TextView>(R.id.HairColor)
        var thisEye = findViewById<TextView>(R.id.EyeColor)
        var thisRank = findViewById<TextView>(R.id.Rank)

        thisTitle.text = "Padan Fain"
        thisAffil.text = " Affiliation: ?"


        thisAge.text = " Age: ?"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Black"
        thisEye.text = " Eye Color: Dark"
        thisRank.text = " Rank: Chosen"


        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("      A peddler that often visits the Two Rivers")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

            thisInfo.text = string1
    }
}