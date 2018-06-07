package com.example.u0450254.wheeloftimecompanion.Terminology

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/31/2018.
 */


class AgeofLegends: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Age of Legends"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        terminfo.text = "The Age of Legends, also called the Second Age, is the name given to the time preceding the Time of Madness and the Breaking of the World. During this time, channelers were far more common and Aes Sedai - trained channelers, both male and female - were able to make angreal, sa'angreal, and ter'angreal, and sometimes held important civic positions. Channelers also appeared to be much more powerful in general, evidenced by the fact that they were able to do a lot more individually with the One Power and that all of the Forsaken are much, much more powerful individually than today's Aes Sedai. One of the most powerful institutions in the world was the Hall of Servants, to which all channelers were accountable. The most respected, influential and accomplished Aes Sedai in the Hall was Lews Therin Telamon, also called the Dragon by his followers. Additionally, with the sole exception of Elan Morin Tedronai, he was also the most powerful of the Aes Sedai."

        terminfo.setTextColor(Color.WHITE)
    }
}