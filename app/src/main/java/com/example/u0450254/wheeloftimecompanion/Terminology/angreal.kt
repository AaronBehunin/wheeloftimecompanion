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


class Angreal: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Angreal           "

        val terminfo = findViewById<TextView>(R.id.termInfo)
        terminfo.text = "     Angreal are objects which allow those who can channel to draw more of the One Power than they normally could without harming themselves in the process.\n" +
                "\n" +
                "     While all angreal offer this benefit, they do vary considerably in strength. The amount of additional Power to which they provide access is dependent on both the angreal's strength and the channeler's own strength in the Power. The stronger a channeler, the more Power an angreal provides.\n" +
                "\n" +
                "     Sa'angreal are like angreal, but much more powerful. All known angreal and sa'angreal can amplify either saidin or saidar; none are known to exist that can be used by both man and woman. One sa'angreal is known to amplify the True Power as well.\n" +
                "\n" +
                "     Most angreal are constructed with a buffer to protect the user from drawing too much of the Power.\n" +
                "\n" +
                "     All existing angreal are left over from the Age of Legends. The knowledge of their construction was lost during the Breaking of the World.\n\n"

        terminfo.setTextColor(Color.WHITE)
    }
}