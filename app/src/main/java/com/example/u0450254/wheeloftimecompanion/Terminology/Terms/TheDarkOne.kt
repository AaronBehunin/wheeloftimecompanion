package com.example.u0450254.wheeloftimecompanion.Terminology.Terms

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class TheDarkOne: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The Dark One"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        val string1  = SpannableString("\n     The Dark One is a primordial, sapient, cosmic force of evil in the universe.\n\n")

        val string1_1 = SpannableString("     The Dark One is a primordial, sapient, cosmic force of evil in the universe. The Dark One's goal is to break the spirits and hearts of whatever sapient beings he can influence, and, if freed from his prison, eventually to remake Creation in his own image.\n\n")
        val string1_2 = SpannableString("     The Dark One is a primordial, sapient, cosmic force of evil in the universe. The Dark One's goal is to break the spirits and hearts of whatever sapient beings he can influence, and, if freed from his prison, eventually to remake Creation in his own image. " +
                "He is said to have been imprisoned by the Creator at the beginning of time.\n\n")
        val string2 = SpannableString("True Name\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 9, 0)

        val string3 = SpannableString("      His true name is Shai'tan, although many people believe that speaking that name will bring misfortune to the speaker, which is why he is referred to as the Dark One.  However, there are many other alternative names for him, such as:\n\n")

        val string6 = SpannableString("Shepherd of hte Night\n")
        val string7 = SpannableString("Great Lord of the Dark\n\n")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter==0)
        {
            terminfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=1)
        {
            terminfo.text = TextUtils.concat(string1_1,string2,string3,string7)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            terminfo.text = TextUtils.concat(string1_2,string2,string3,string6,string7)
        }
    }
}
