package com.example.u0450254.wheeloftimecompanion.Creatures.Animals

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 7/10/2018.
 */
class Cloud: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creatures)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Cloud"

        val terminfo = findViewById<TextView>(R.id.creatureInfo)
        val string1  = SpannableString("\n    Cloud is a tall and gray horse, with black mane and tail.\n\n")
        val string1_1 = SpannableString("\n     Cloud is a tall and gray horse, with black mane and tail. " +
                "Rand al'Thor rode him when he fled the Two Rivers.\n\n")
        val string2 = SpannableString("     Cloud is very spirited as well as very fast. " +
                "He was purchased from Jon Thane, the miller, who would often race the horse against those belonging to merchants' guards. " +
                "Rand had never known the horse to lose.\n\n")


        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1

        if (progress.book==1&&progress.chapter<=10)
        {
            terminfo.text = string1
        }
        else if(progress.book>1 ||(progress.book == 1 && progress.chapter>10))
        {
            terminfo.text = TextUtils.concat(string1_1, string2)
        }
    }
}