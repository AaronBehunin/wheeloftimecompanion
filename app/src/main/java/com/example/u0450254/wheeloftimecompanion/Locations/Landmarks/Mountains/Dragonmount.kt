package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


/*
 * Created by u0450254 on 5/18/2018.
 */


// next entry the dragon reborn 19

class Dragonmount : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Dragonmount"

        var thisInfo = findViewById<TextView>(R.id.termInfo)

        var string1 = SpannableString("\n    Dragonmount is a volcanic mountain west of the island of Tar Valon, located between the rivers Erinin and Luan and dominating the otherwise flat plain between the two. " +
                "It is said to be perhaps the tallest mountain in the world, and is known to be several miles high at least.\n\n")

        var string2 = SpannableString("      It was created during the Breaking of the World, when Lews Therin Telamon killed himself after Ishamael Healed him from the insanity caused by the taint on saidin. " +
                "His return to sanity forced him to acknowledge what he had done to family and friends, and in utter despair, he began channeling massive amounts of the One Power. " +
                "He drew upon all that he could possibly channel, and then exceeded it, causing a bar of white-hot energy to descend from the sky. " +
                "This pillar struck Lews Therin and atomized him, but also struck the ground where he had been standing. " +
                "The blast, so hot as to flash-vaporize stone, tunneled into the mantle of the Earth and caused a volcanic eruption of gigantic proportions, creating Dragonmount.\n\n")

        var string3 = SpannableString("     This eruption caused a river that had been flowing through the area near the mountain to fork, creating an isle.")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        thisInfo.text = string1

        if ((progress.book==1&&progress.chapter<=0))
        {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>0))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3)
        }
    }
}