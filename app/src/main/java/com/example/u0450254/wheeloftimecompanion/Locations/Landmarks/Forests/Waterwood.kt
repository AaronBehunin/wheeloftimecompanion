package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests

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

class Waterwood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Waterwood"

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     The Waterwood is the name given to the wooded floodplain located in the eastern area of the Two Rivers region.\n\n")

        val string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 9, 0)

        val string3 = SpannableString("     The Waterwood stands adjacent to The Mire and is bounded by the Tarendrelle and Manetherendrelle rivers. In addition to being a floodplain, it is fed by continuous flows from the Winespring Water which branch and divide in the area. As a result, travelers to the Waterwood encounter a bewildering tangle of ponds, streams, and willow trees. " +
                "Consistent flooding from the Winespring Water prevents farming in the Waterwood. It is also the area where Rand al'Thor learned to swim.\n\n")

        val string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2f), 0, 7, 0)

        val string5 = SpannableString("     During the final years of the Trolloc Wars a conflict known as the Battle of the Tarendrelle River was fought east of the Waterwood between the Army of Manetheren and a vast host of Shadowspawn. " +
                "After his army was defeated, King Aemon was forced into a fighting retreat ending at a crossroads that would come to be known as Aemon's Field. The subsequent Battle of Aemon's Field resulted in the annihilation of the Army of Manetheren and ended with the death of the king.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());


        if (progress.book==1&&progress.chapter<=1)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=9)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5)
        }
    }
}