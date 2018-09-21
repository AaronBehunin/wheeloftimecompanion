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

/*
 * Created by u0450254 on 5/23/2018.
 */
class TheDragon: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The Dragon"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1  = SpannableString("\n     The Dragon is the title for the champion of the Light against the Dark One, and is always the reincarnation of a single particular soul.\n\n")

        var string1_1 = SpannableString("\n     The Dragon is the title for the champion of the Light against the Dark One, and is always the reincarnation of a single particular soul. He is reborn in the Age of Legends to combat the Shadow. " +
                "The Dragon of the Age of Legends was Lews Therin Telamon. The Prophecies of the Dragon as described in the Karaethon Cycle give vague impressions on the events that will follow after his coming.\n\n")

        var string3 = SpannableString("The Dragon Reborn\n\n")
        string3.setSpan(RelativeSizeSpan(2f), 0, 17, 0)

        var string4 = SpannableString("     The reincarnation of Lews Therin as the Dragon Reborn, is fated to both destroy and save the world. Prophecy says that he would break all bonds and bring suffering to the earth. It is commonly expected that in doing so he will also bring a new Breaking of the World. Due to Lews Therin Telamon's infamy, for better or for worse, the tale of the Dragon Reborn is known well even in remote villages.\n\n")

        var string6 = SpannableString("False Dragons\n\n")
        string6.setSpan(RelativeSizeSpan(2f), 0, 13, 0)

        var string7 = SpannableString("     Men who have declared themselves to be the Dragon Reborn but do not fulfill any prophecy are said to be false Dragons. This is often done for fame or glory, but in the end all have fallen from power.\n\n")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1

        if (progress.book==1&&progress.chapter>0)
        {
            terminfo.text = string1_1
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            terminfo.text = TextUtils.concat(string1_1,string3,string4,string6,string7)
        }

    }
}