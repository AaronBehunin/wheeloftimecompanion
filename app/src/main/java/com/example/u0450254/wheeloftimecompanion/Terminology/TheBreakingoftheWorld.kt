package com.example.u0450254.wheeloftimecompanion.Terminology

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
 * Created by u0450254 on 5/23/2018.
 */
class TheBreakingoftheWorld: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The Creator"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1  = SpannableString("     When Lews Therin Telamon and the Hundred Companions resealed the Dark One's prison, the counterstroke tainted saidin." +
                "Eventually every male Aes Sedai went insane.  In their madness these men, who could wield the One Power to a degree unknown, changed the face." +
                "  They caused great earthquakes, leveled bountain ranges, raised new mountains, lifted dry land where seas had been.  Many parts of the world were completely depopulated, and the survivors were scattered like dust on the wind\n\n")


        var string2 = SpannableString("Other Names\n\nThe Time of Madness")

        string2.setSpan(RelativeSizeSpan(2f),0,11,0)

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = TextUtils.concat(string1, string2)
    }
}