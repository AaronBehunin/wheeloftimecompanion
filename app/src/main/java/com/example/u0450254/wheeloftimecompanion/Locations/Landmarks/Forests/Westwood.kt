package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests

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
 * Created by u0450254 on 5/18/2018.
 */


// next entry the dragon reborn 19

class Westwood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Westwood"

        var thisInfo = findViewById<TextView>(R.id.termInfo)

        var string1 = SpannableString("\n     The Westwood is a dense tangled forest that extends along the eastern foothills of the Mountains of Mist in the region known as the Two Rivers.\n\n")

        var string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 9, 0)

        var string3 = SpannableString("     The area is sparsely populated with only a handful of farms due to the difficulities of tilling the rocky soil. As a result, locals often refer to the area as \"hard-luck land.\" Additionally, the proximity of the Westwood to the Sand Hills promotes further negative superstitions about the forest and the already sparse homesteads dwindle away many miles short of the hills. The eastern edge of the Westwood runs adjacent to the Old Road and the North Road and some of it extends into the western limits of Emond's Field.\n\n")

        var string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2f), 0, 7, 0)

        var string5 = SpannableString("     Only recently has farming begun in the area and many stretches of the land remain entirely unexplored.\n\n")
        var string5_1 = SpannableString("     It is unknown how this land appeared during the Age of Legends. During the Breaking of the World insane male channelers raised the Mountains of Mist out of the shallows of a great western ocean and drove back the sea. The shoreline of the ocean was displaced to become the Sand Hills. Further to the east the displacements of rock dwindled to foothills typical for mountain ranges and produced the rocky land with outcrops for which the area is known.  \n\n")
        var string5_2 = SpannableString("     It is unknown how this land appeared during the Age of Legends. During the Breaking of the World insane male channelers raised the Mountains of Mist out of the shallows of a great western ocean and drove back the sea. The shoreline of the ocean was displaced to become the Sand Hills. Further to the east the displacements of rock dwindled to foothills typical for mountain ranges and produced the rocky land with outcrops for which the area is known. When the nation of Manetheren ruled the area, the tangled land was considered to be a strategic asset that would slow the advance of an approaching army to the nation's capital. After the fall of Manetheren, the Westwood became a wild and rugged area. Only recently has farming begun in the area and many stretches of the land remain entirely unexplored.\n\n")

        var string6 = SpannableString("The al'Thor Farm\n\n")
        string6.setSpan(RelativeSizeSpan(2f), 0, 16, 0)

        var string7 = SpannableString("    The Westwood contains the site of the al'Thor family farm. Tamlin al'Thor is one of the few farmers hardy enough to attempt farming in the area and his homestead lies a few miles west of Emond's Field. " +
                "His son, Rand al'Thor, was raised on this farm. Rand spent many days in his youth exploring the Westwood and the surrounding area with his friends Mat Cauthon and Perrin Aybara. The al'Thor family farm produces Tabac and wool in addition to cider and apple brandy from a small orchard. Every spring Tam sells casks of cider and brandy to Brandelwyn al'Vere, the proprietor of the Winespring Inn, in preparation for the annual Bel Tine festival.")

        var string7_1 = SpannableString("     The Westwood contains the site of the al'Thor family farm. Tamlin al'Thor is one of the few farmers hardy enough to attempt farming in the area and his homestead lies on the north side of the Quarry Road a few miles west of Emond's Field. His adoptive son, Rand al'Thor, was raised on this farm. Rand spent many days in his youth exploring the Westwood and the surrounding area with his friends Mat Cauthon and Perrin Aybara. The al'Thor family farm produces Tabac and wool in addition to cider and apple brandy from a small orchard. Every spring Tam sells casks of cider and brandy to Brandelwyn al'Vere, the proprietor of the Winespring Inn, in preparation for the annual Bel Tine festival.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        thisInfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string6,string7)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5_1,string6,string7)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>6))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5_1,string6,string7_1)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5_2,string6,string7_1)
        }
    }
}