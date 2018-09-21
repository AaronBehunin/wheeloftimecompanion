package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains

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


/*
 * Created by u0450254 on 5/18/2018.
 */


class MountainsofMist: AppCompatActivity() {

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

        thisTitle.text = "The Mountains of Mist"
        thisMap.setImageResource(R.drawable.mountainsofmistmap)

        var thisInfo = findViewById<TextView>(R.id.landInfo)

        var string1 = SpannableString("\n     The Mountains of Mist are a vast stretch of mountains that exist in the western region of the Westlands.\n\n")
        var string1_1 = SpannableString("\n     The Mountains of Mist are a vast stretch of mountains that exist in the western region of the Westlands. The range is so named due to its ever-cloud-capped peaks.\n\n")

        var string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 9, 0)

        var string3 = SpannableString("     The mountains begin south of the border between Arad Doman and Saldaea and extend for several hundred leagues to form the natural boundaries of four more nations; Andor, Tarabon, Ghealdan, and Amadicia. Many major rivers find their headwaters in the crags of the range, including the Taren River and the White River. Additionally, the range features the Sand Hills, a geographic anomaly that extends along its eastern limits.\n\n")

        var string3_1 = SpannableString("     The mountains begin south of the border between Arad Doman and Saldaea and extend for several hundred leagues to form the natural boundaries of four more nations; Andor, Tarabon, Ghealdan, and Amadicia. Many major rivers find their headwaters in the crags of the range, including the Taren River and the White River. Additionally, the range features the Sand Hills, a geographic anomaly that extends along its eastern limits. " +
               "Along with the Taren River, the White River, and The Mire, the mountains serve as an element of geography that promotes the isolation of the Two Rivers region.\n\n")

        var string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2f), 0, 7, 0)

        var string5 = SpannableString("The Breaking of the World\n\n")
        string5.setSpan(RelativeSizeSpan(1.5f), 0, 25, 0)

        var string6 = SpannableString("     Evidence suggests that the Mountains of Mist did not exist during the Age of Legends, when the area was covered by the shallows of a great ocean.\n\n")
        var string6_1 = SpannableString("     Evidence suggests that the Mountains of Mist did not exist during the Age of Legends, when the area was covered by the shallows of a great ocean. During the Breaking of the World, insane male Channelers raised the mountain range and drove back the sea. The disturbance of the adjacent shoreline would become the sand hills, and the rocks, ores, and minerals locked below the ocean floor were forced into enormous vertical displacements forging vast crags and peaks.\n\n")

        var string7 = SpannableString("Manetheren\n\n")
        string7.setSpan(RelativeSizeSpan(1.5f), 0, 10, 0)


        var string8 = SpannableString("     In the years following the breaking of the world, those who first settled the area discovered a great wealth of gold, silver, and iron that had long existed below the surface of the earth. In time settlements arose to exploit these riches which became cities and eventually birthed the nation of Manetheren. Manetheren founded it's capital near the headwaters of the Manetherendrelle River, high and secure in the safety of the surrounding peaks. " +
                "Doom came to the nation during the Trolloc Wars when Manetheren was destroyed following the Battle of the Tarendrelle River and the Battle of Aemon's Field.")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1


        if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisInfo.text = TextUtils.concat(string1_1,string2,string3,string4,string6)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            thisInfo.text = TextUtils.concat(string1_1,string2,string3,string4,string5,string6_1)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>4))
        {
            thisInfo.text = TextUtils.concat(string1_1,string2,string3_1,string4,string5,string6_1)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1_1,string2,string3_1,string4,string5,string6_1,string7,string8)
        }

    }
}