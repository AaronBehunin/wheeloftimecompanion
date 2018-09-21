package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


/*
 * Created by u0450254 on 5/18/2018.
 */


class Tarendrelle: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisMap = findViewById<ImageView>(R.id.locImage)

        thisTitle.text = "Tarendrelle"

        var thisInfo = findViewById<TextView>(R.id.landInfo)

        var string1 = SpannableString("\n     The River Tarendrelle is a major waterflow that marks the northern and eastern boundaries of the Two Rivers region. It is known locally as the Taren River.\n\n")

        var string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2.0f),0,9,0)

        var string3 = SpannableString("     The river begins at the roots of the Mountains of Mist where it is fed by upstream tributaries. " +
                "From there the river continues to widen and after several miles passes the town of Taren Ferry on its southern riverbank. " +
                "The river continues east before changing course to the southeast where it passes the Waterwood and The Mire. " +
                "Eventually the waterflow merges with the larger River Manetherendrelle, which is known locally as the White River.\n\n")

        var string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2.0f),0,7,0)

        var string5 = SpannableString("     In the middle years of the Trolloc Wars, two bridges spanning the Tarendrelle River played a major role during the final defense of Manetheren at the Battle of the Tarendrelle River. " +
                "At the time, Manetheren faced an overwhelming force of Shadowspawn attempting to penetrate the eastern boundary of the nation and invade the Manetheren heartland. " +
                "Joined by local farmers, shepherds, and woodsmen, the soldiers of Manetheren fought for over ten days near the banks of the river to forestall the invasion in the hopes of being saved by reinforcements that ultimately would never arrive. " +
                "Ultimately, the army of Manetheren was defeated at the banks of the Terendrelle and its remnants forced into a fighting retreat ending with a final defeat at the Battle of Aemon's Field.\n\n")


        thisInfo.setTextColor(Color.WHITE)
        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=9)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5)
        }

    }
}