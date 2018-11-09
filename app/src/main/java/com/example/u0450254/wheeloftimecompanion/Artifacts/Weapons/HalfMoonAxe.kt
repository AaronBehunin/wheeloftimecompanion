package com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons

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

class HalfMoonAxe: AppCompatActivity() {

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

        thisTitle.text = "Half-Moon Axe"
        thisOwner.text = "Owner: Perrin"
        thisImage.setImageResource(R.drawable.halfmoonaxe)

        val artinfo = findViewById<TextView>(R.id.artInfo)
        val string1  = SpannableString("\n     The half-moon axe carried by Perrin Aybara was made by Haral Luhhan, the blacksmith of Emond's Field. " +
                "It has a wide, half-moon shaped blade on one side, balanced by a thick metal spike on the other.\n\n")

        val string2 = SpannableString("Origin\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0,6,0)

        val string3 = SpannableString("     Master Luhhan forged the axe for a merchant's guard, but the guard refused to pay the agreed price. " +
                "Master Luhhan would accept no less, so it stayed at the smithy. " +
                "When he noticed Perrin practicing with the axe, Master Luhhan gave it to him, and Perrin took the axe with him when he left the Two Rivers after the Winternight attack.\n\n")
        artinfo.setTextColor(Color.WHITE)

        artinfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=10)
        {
            artinfo.text = string1
        }
        else if(progress.book>1 ||(progress.book==1&&progress.chapter>10))
        {
            artinfo.text = TextUtils.concat(string1, string2, string3)
        }
    }
}