package com.example.u0450254.wheeloftimecompanion.Artifacts.Angreal

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

/*
 * Created by u0450254 on 5/23/2018.
 */
class TheRobedWoman: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artifact)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisImage = findViewById<ImageView>(R.id.artifactImage)
        var thisOwner = findViewById<TextView>(R.id.Owner)

        thisTitle.text = "The Robed Woman"
        thisOwner.text = "Owner: Moiraine"
        thisImage.setImageResource(R.drawable.angreal)

        val artinfo = findViewById<TextView>(R.id.artInfo)
        var string1 = SpannableString("\n    The robed woman angreal is an angreal used by Moiraine Damodred.\n\n")
        var string1_1 = SpannableString("\n     The robed woman angreal is an angreal used by Moiraine Damodred. It seems to be made from a smooth, dark ivory. It is a little statue of a woman in flowing robes, with long hair that falls about her shoulders.\n\n")

        var string3 = SpannableString("     The first time Moiraine used it to heal Rand al'Thor's father, Tam al'Thor, from a wound inflicted by a Trolloc weapon, a wound that would have otherwise been fatal.\n\n")
        artinfo.setTextColor(Color.WHITE)

        artinfo.setMovementMethod(LinkMovementMethod.getInstance())

        artinfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>8))
        {
            artinfo.text = TextUtils.concat(string1_1,string3)
        }
    }

}