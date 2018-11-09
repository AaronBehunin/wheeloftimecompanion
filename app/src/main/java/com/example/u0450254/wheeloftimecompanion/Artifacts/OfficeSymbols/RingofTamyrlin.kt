package com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class RingofTamyrlin: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artifact)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisOwner = findViewById<TextView>(R.id.Owner)

        thisTitle.text = "The Ring of Tamyrlin"
        thisOwner.text = "Owner: Lews Therin Telamon"

        val artinfo = findViewById<TextView>(R.id.artInfo)
        val string1 = SpannableString("\n     The Ring of Tamyrlin was a ring from the Age of Legends worn by the leader of the Aes Sedai.\n\n")
        val string1_1 = SpannableString("\n     The Ring of Tamyrlin was a ring from the Age of Legends worn by the leader of the Aes Sedai. " +
                "It is known that Lews Therin Telamon wore the ring; however, no other wearers are known.\n\n")

        artinfo.setTextColor(Color.WHITE)

        artinfo.setMovementMethod(LinkMovementMethod.getInstance())

        artinfo.text = string1

        if (progress.book==1&&progress.chapter<=0)
        {
            artinfo.text = string1
        }
        else if (progress.book>1||(progress.book == 1 && progress.chapter>0))
        {
            artinfo.text = string1_1
        }
    }

}