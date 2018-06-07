package com.example.u0450254.wheeloftimecompanion.Locations.Nations

import android.app.Activity
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

/**
 * Created by u0450254 on 5/31/2018.
 */

class Arafel: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nation)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val filename = "Progress"
        val fileContents = "1-1"
        openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisCapital = findViewById<TextView>(R.id.capital)
        var thisGov = findViewById<TextView>(R.id.typeofgov)
        var thisHead = findViewById<TextView>(R.id.Head)

        var thisSymbol = findViewById<ImageView>(R.id.Symbol)

        thisTitle.text = "Arafel"
        thisCapital.text = "Capital: Shol Arbela"
        thisGov.text = "Type of Government:  Monarchy"
        thisHead.text = "Head of State: Paitar Nachiman"

        thisSymbol.setImageResource(R.drawable.arafel)

        var string1 = SpannableString( "\n     Arafel is one of the four Borderland nations which lie on the threshold of the Great Blight, sitting between Kandor to the west and Shienar to the east. Arafel's flag is made up of three white roses on a field of red, quartered with three red roses on a field of white.\n" +
                "\n")



        var string2 = SpannableString("Geography\n" +
                "     Arafel stretches from Kandor to the River Mora, which marks its border with Shienar.\n" +
                "\n")
        string2.setSpan(RelativeSizeSpan(2f), 0,9, 0 )

        var string3 = SpannableString("History\n" +
                "     The nation of Arafel was formed early in the War of the Hundred Years. The governors of Hawkwing's five northern provinces met and agreed to form stable nations to preserve the peace and defend against the Blight. Mahira Svetanya was the first Queen of Arafel.\n" +
                "\n")
        string3.setSpan(RelativeSizeSpan(2f), 0,7, 0 )

        var string4 = SpannableString("Government\n" +
                "     Arafel is a monarchy. The throne is currently held by King Paitar Nachiman; his sister Kiruna is an Aes Sedai of the Green Ajah. The throne is located in the capital, Shol Arbela.\n" +
                "\n")

        string4.setSpan(RelativeSizeSpan(2f), 0,10, 0 )

        var string5 = SpannableString("Fashion and Culture\n" +
                "     The Arafellin people often wear bells in their hair which jingle merrily when shaken.\n" +
                "\n" +
                "      Siuan Sanche mentions that the Arafellin are a fiery people with strange ideas about honor and debts. It is not uncommon for an Arafellin to ask for punishment as a means of restoring their honor.")



        string5.setSpan(RelativeSizeSpan(2f), 0, 19, 0)


        var thisInfo = findViewById<TextView>(R.id.locinfo)

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        thisInfo.text = TextUtils.concat(string1,string2, string3,string4)
    }
}