package com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class ColorShiftCloak: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artifact)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisImage = findViewById<ImageView>(R.id.artifactImage)
        val thisOwner = findViewById<TextView>(R.id.Owner)

        thisTitle.text = "Color-Shifting Cloak"
        thisOwner.text = "Owner: Lan"
        thisImage.setImageResource(R.drawable.colorshiftcloak)

        val artinfo = findViewById<TextView>(R.id.artInfo)
        val string1 = SpannableString("\n     Color-shifting cloaks are special garments that seem to mimic the surrounding landscape and serve as camouflage.\n\n")

        val string2 = SpannableString("     The cloaks tend to invoke a disturbing feeling on people who see them while they are moving, and while stationary the wearer blends in nearly perfectly with the background.\n\n")

        artinfo.setTextColor(Color.WHITE)

        artinfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book == 1 && progress.chapter <=2 )
        {
            artinfo.text = string1
        }
        else if (progress.book >1 ||(progress.book == 1 && progress.chapter > 2 ))
        {
            artinfo.text = TextUtils.concat(string1,string2)
        }

    }
}