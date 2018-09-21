package com.example.u0450254.wheeloftimecompanion.Terminology.Events

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
class TrollocWars: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Trolloc Wars"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1  = SpannableString("\n     The Trolloc Wars were a series of sustained conflicts fought between humanity and Shadowspawn between 1000 and 1350 AB.\n\n")

        var string1_1 = SpannableString("\n     The Trolloc Wars were a series of sustained conflicts fought between humanity and Shadowspawn between 1000 and 1350 AB. The Shadow armies comprised mostly Trollocs, hence the name for the conflict.\n\n")

        var string1_2 = SpannableString("\n     The Trolloc Wars were a series of sustained conflicts fought between humanity and Shadowspawn between 1000 and 1350 AB. The Shadow armies comprised mostly Trollocs, hence the name for the conflict, although Myrddraal, Draghkar, and most other forms of Shadowspawn are believed to have played major roles as well.\n\n")

        var string9 = SpannableString("The Fall of Manetheren\n\n")
        string9.setSpan(RelativeSizeSpan(2f), 0, 22, 0)
        var string10 = SpannableString("     The armies of Manetheren became famous during this period, with King Thorin and his grandson and successor Aemon achieving great victories over the Shadow with the new tactics. But the Shadow also gained renewed confidence at this time with the emergence of a commander who called himself Ba'alzamon.\n\n")

        var string11 = SpannableString("     Ba'alzamon led the Shadow forces in assaulting Manetheren directly, attempting to penetrate into the Manetheren heartland by crossing the River Tarendrelle while the armies of Manetheren were engaged elsewhere. According to legend, King Aemon al Caar al Thorin marched his army day and night and beat the army of the Shadow to a strategically important bridge. Thus began the Battle of the Tarendrelle River, where the forces of Manetheren held their ground for ten days, awaiting relief forces that had been promised but would never arrive. Eventually, King Aemon's forces were broken and he was forced into a fighting retreat across the heartland of Manetheren ending with a final last stand at the Battle of Aemon's Field where the remaining defenders perished. Eldrene, the king's Aes Sedai wife and queen, felt the severing of their bond the moment he perished. Driven mad with grief, she drew deeply upon the Source and unleashed a vast wave of the One Power that routed the army of Shadowspawn but also utterly destroyed the capital of Manetheren.\n\n")
        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1

        if (progress.book==1&&progress.chapter>4)
        {
            terminfo.text = string1_1
        }
        if (progress.book==1&&progress.chapter>8)
        {
            terminfo.text = string1_2
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            terminfo.text = TextUtils.concat(string1_2,string9,string10,string11)
        }




    }
}