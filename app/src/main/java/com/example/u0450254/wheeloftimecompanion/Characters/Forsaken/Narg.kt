package com.example.u0450254.wheeloftimecompanion.Characters.Forsaken

/**
 * Created by u0450254 on 5/29/2018.
 */

//done
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Launchers

/**
 * Created by u0450254 on 5/23/2018.
 */
class Narg : AppCompatActivity() {

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

        thisTitle.text = "Narg"
        thisAffil.text = " Affiliation: Trolloc"


        thisAge.text = " Age: ?"


        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: 8 feet"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: ?"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Footsoldier"


        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("\n     Narg is an eight foot tall Trolloc that has a wolf's muzzle and goat hooves.\n\n")

        var string2 = SpannableString("Activities\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        var string3 = SpannableString("     He is one of the Trollocs who attack the al'Thor farm. " +
                "He hides in Rand and Tam's house pretending to be dead, waiting for someone to return. " +
                "He then attempts to talk Rand into coming with him to see the Myrddraal. " +
                "He attacks Rand and is impaled on Tam's sword.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());


        thisInfo.text = string1

        if (progress.book>1 || (progress.book == 1&&progress.chapter>5))
        {
            thisAge.text = " Age: ?(deceased)"
            thisInfo.text = TextUtils.concat(string1, string2, string3)
        }
    }
}