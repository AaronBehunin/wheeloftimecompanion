package com.example.u0450254.wheeloftimecompanion.Creatures

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/23/2018.
 */
class Trolloc: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creatures)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisPicture = findViewById<ImageView>(R.id.creaturePic)

        thisPicture.setImageResource(R.drawable.trollocs)

        thisTitle.text = "Trolloc"

        val terminfo = findViewById<TextView>(R.id.creatureInfo)
        var string1  = SpannableString("     Creatures of The Dark One, created during the War of the Shadow." +
                "Huge in stature, vicious in the extreme, they are a twisted blend of animal and human stock, and kill for the pure pleasure of killing." +
                "Sly, deceitful and treacherous, they can be trusted only by those they fear.")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1

    }
}