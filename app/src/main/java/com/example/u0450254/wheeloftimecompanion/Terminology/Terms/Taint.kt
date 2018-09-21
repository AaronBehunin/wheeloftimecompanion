package com.example.u0450254.wheeloftimecompanion.Terminology.Terms

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/23/2018.
 */
class Taint: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Taint"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        val string1  = SpannableString("\n     The Dark One tainted saidin as a counterstroke to the acts of Lews Therin Telamon and the Hundred Companions. " +
                "The taint placed on saidin instantly drove all members of the Hundred Companions mad, and doomed all other male channelers to insanity and slow death. " +
                "All the ancient male Aes Sedai eventually went mad and tore the world apart, causing the Breaking and ending the Age of Legends.\n\n")

        val string2 = SpannableString("     The taint is described as being like an \"oily slick\" surrounding the \"clear water\" that is saidin.\n\n")
        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>0))
        {
            terminfo.text = TextUtils.concat(string1,string2)
        }
    }
}