package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads

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
 * Created by u0450254 on 5/18/2018.
 */


class WinespringInn: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisMap = findViewById<ImageView>(R.id.locImage)

        thisTitle.text = "Winespring Inn"

        var thisInfo = findViewById<TextView>(R.id.landInfo)

        var string1 = SpannableString("\n     The Winespring Inn is an inn in Emond's Field owned by Brandelwyn al'Vere.\n\n")
        var string1_1 = SpannableString("\n     The Winespring Inn is an inn in Emond's Field owned by Brandelwyn al'Vere. It stands on the east end of the Green beside the Wagon Bridge and adjacent to the Winespring Water. Bran's wife Marin is the inn's cook.\n\n")

        var string2 = SpannableString("     The first floor of the inn is constructed of river rock, though built upon a foundation of much older stone quarried from the Mountains of Mist. " +
                "The foundation continues south of the inn proper and represents the remnants of an older, larger structure. " +
                "A large oak now grows amidst these ruins and shades an area where, in the summertime, Bran a'Vere sets tables so villagers can drink, talk, and play Stones.\n\n"   )
        var string2_2 = SpannableString("     var string2 = SpannableString(\"     The first floor of the inn is constructed of river rock, though built upon a foundation of much older stone quarried from the Mountains of Mist. " +
                "The foundation continues south of the inn proper and represents the remnants of an older, larger structure built when Manetheren ruled the region. " +
                "A large oak now grows amidst these ruins and shades an area where, in the summertime, Bran a'Vere sets tables so villagers can drink, talk, and play Stones.\n\n")

        var string3 = SpannableString("     The second floor is whitewashed and extends out over the lower floor for the entire perimeter. The structure has a dozen chimneys and a red tiled roof that was the first non-thatched covering in Emond's Field. " +
                "Bran al'Vere lives with his family at the back of the second floor.\n\n")

        var string4 = SpannableString("     The Winespring Inn serves as the meeting place for the Village Council. Along with the village green, it is a primary focal point during annual Bel Tine festivals.\n\n")
                thisInfo.setTextColor(Color.WHITE)
        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book==1&&progress.chapter<1)
        {
            thisInfo.text = string1
        }
       else if (progress.book==1&&progress.chapter<9)
        {
            thisInfo.text = TextUtils.concat(string1_1,string2,string3,string4)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1_1,string2_2,string3,string4)
        }
    }
}