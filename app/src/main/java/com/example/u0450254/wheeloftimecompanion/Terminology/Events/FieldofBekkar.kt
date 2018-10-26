package com.example.u0450254.wheeloftimecompanion.Terminology.Events

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


class FieldofBekkar: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Field of Bekkar"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1 = SpannableString("\n     The Field of Bekkar - which some historical records have refered to as the Field of Blood - was the site of a battle between the army of Manetheren and forces of the Shadow during the middle years of the Trolloc Wars. " +
                "It occurred circa 1200 AB and resulted in a victory for the forces of Light.\n\n")

        var string2 = SpannableString("History\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,7,0)

        var string3 = SpannableString("     Little to nothing is known of the Battle at Bekkar. " +
                "The only reference to the confrontation appears in historical accounts of the Battle of the Tarendrelle River which was fought a week later. " +
                "Research conducted by Moiraine Damodred indicates that the Shadow feinted a campaign towards Bekkar in order to lure the soldiers of Manetheren into an overextended tactical position which could allow for a direct assault upon the Manetheren heartland by a concealed army of Shadowspawn. " +
                "When these plans were revealed, King Aemon al Caar al Thorin marched his army day and night from Bekkar to the Tarendrelle River in order to repulse the pending invasion.\n\n")

        var string4 = SpannableString("     The actual location of the Bekkar Battlefield is lost to time and legend. " +
                "Scraps of history indicate only that Aemon force-marched his army \"day and night\" on an extended multiple-day journey to the Tarendrelle River in eastern Manetheren.\n\n")

        var string5 = SpannableString("     Based upon these accounts, likely modern areas for the site of Bekkar are Ghealdan, Altara, Murandy, Andor, or the Caralain Grass. " +
                "Since fewer battles during the Trolloc Wars were fought in southern areas, the Caralain Grass is the most likely candidate for containing the battlefield. " +
                "If true, the battle would have taken place somewhere in the nation of Coremanda.\n\n")
        terminfo.setTextColor(Color.WHITE)

        if (progress.book==1&&progress.chapter<=9)
        {
            terminfo.text = string1
        }
        else if (progress.book>1 || (progress.book==1&&progress.chapter>9))
        {
            terminfo.text = TextUtils.concat(string1,string2,string4)
        }
    }
}