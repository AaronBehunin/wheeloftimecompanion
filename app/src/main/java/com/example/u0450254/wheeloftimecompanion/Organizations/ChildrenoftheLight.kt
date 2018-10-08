package com.example.u0450254.wheeloftimecompanion.Organizations

import android.content.Context
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
class ChildrenoftheLight : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisType = findViewById<TextView>(R.id.type)
        val thisSymbol = findViewById<ImageView>(R.id.Symbol)
        val thisHead = findViewById<TextView>(R.id.Headquarters)
        val thisAllign = findViewById<TextView>(R.id.Allignment)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)

        thisTitle.text = "Children of the Light"
        thisType.text = "Type: Military"
        thisHead.text = "Headquarters: Amador"
        thisAllign.text = "Allignemnt: Evil"
        thisAffil.text = "Affiliation: Independent"

        thisSymbol.setImageResource(R.drawable.sunicon)

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("\n     The Children of the Light are an independent military organization dedicated to finding Darkfriends and rooting out evil and corruption wherever it may be found. " +
                "Their zeal in this endeavor often borders on the insane and makes them dangerous opponents.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}