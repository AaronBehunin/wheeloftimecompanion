package com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/23/2018.
 */
class MoirainesStaff: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artifact)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisImage = findViewById<ImageView>(R.id.artifactImage)
        var thisOwner = findViewById<TextView>(R.id.Owner)

        thisTitle.text = "Moiraines Staff"
        thisOwner.text = "Owner: Moiraine"


        val artinfo = findViewById<TextView>(R.id.artInfo)
        var string1  = SpannableString("\n     The vine-carved staff is a staff that belonged to Moiraine Damodred.\n\n")
        var string1_1 =  SpannableString("\n     The vine-carved staff is a staff that belonged to Moiraine Damodred. " +
                "It is carved in vines and flowers. " +
                "She uses it as a walking staff.\n\n")
        var string1_2 = SpannableString("\n     The vine-carved staff is a staff that belonged to Moiraine Damodred. " +
                "It is carved in vines and flowers. " +
                "She uses it as a walking staff. " +
                "She uses it multiple times when fighting or channeling.\n\n")

        artinfo.setTextColor(Color.WHITE)

        artinfo.setMovementMethod(LinkMovementMethod.getInstance())

        artinfo.text = string1

        if (progress.book == 1 && progress.chapter<=2)
        {
            artinfo.text = string1
        }
        else if (progress.book == 1 && progress.chapter <= 9)
        {
            artinfo.text = string1_1
        }
        else if (progress.book >1 ||(progress.book == 1 &&progress.chapter >9))
        {
            artinfo.text = string1_2
        }
    }
}