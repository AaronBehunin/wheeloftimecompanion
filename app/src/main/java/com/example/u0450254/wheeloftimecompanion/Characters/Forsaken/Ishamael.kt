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
class Ishamael : AppCompatActivity() {

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

        var thisPortrat = findViewById<ImageView>(R.id.Portrat)

        thisTitle.text = "Ishamael"
        thisAffil.text = " Affiliation: Forsaken"


        thisAge.text = " Age: ?"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Black"
        thisEye.text = " Eye Color: Red"
        thisRank.text = " Rank: Chosen"

        thisPortrat.setImageResource(R.drawable.elanmorintedronai)
        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("Leader of the Forsworn and champion to The Dark One.   After The Dark Ones seals were placed and saidin was tainted, Ishamael arrived at Lews Therin's home and discovered to his surprise and delight that Lews Therin had murdered his entire family. After having a mostly one-sided conversation with the insane Lews Therin, Ishamael healed him so that he understood what he had done. This realization caused Lews Therin to commit suicide, leaving a furious Ishamael to wait for him to be reborn.")

        thisInfo.setTextColor(Color.WHITE)

        string1.setSpan(launcher.spanTheDarkOne, 39, 51, 0)
        string1.setSpan(launcher.spanSaiden, 97, 103, 0)
        string1.setSpan(launcher.spanLewsTherin, 137, 150, 0)


        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());


        if ((progress.book==1 && progress.chapter>0)||progress.book>1)
        {
            thisInfo.text = string1
        }
    }
}



