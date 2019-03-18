package com.example.u0450254.wheeloftimecompanion.Creatures.Animals

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 7/10/2018.
 */
class Bela: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creatures)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisPortrat = findViewById<ImageView>(R.id.creaturePic)

        thisTitle.text = "Bela"


        val terminfo = findViewById<TextView>(R.id.creatureInfo)
        val string1  = SpannableString("\n     Bela is the shaggy brown mare owned by Tam al'Thor.\n\n")
        val string1_1 = SpannableString("\n     Bela is the shaggy brown mare owned by Tam al'Thor, ridden by Egwene al'Vere on Winternight 998 NE in her escape from the Two Rivers after Trollocs attacked Emond's Field seeking Rand, Mat, and Perrin.\n\n")
        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisPortrat.setImageResource(R.drawable.bela)
        }


        if (progress.book==1&&progress.chapter<=10)
        {
            terminfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            terminfo.text = string1_1
        }
    }
}