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

class Green : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Green"

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     The Green is a common name for the communal gathering area present in many villages throughout the Westlands.\n\n")
        val string1_2 = SpannableString("\n     The Green is a common name for the communal gathering area present in many villages throughout the Westlands. Due to the cultural differences between countries and regions, village greens can serve a multitude of purposes, most notably celebrations of the end of winter and the gathering of a harvest.\n\n")

        val string2 = SpannableString("The Green in Emond's Field\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 26, 0)

        val string3 = SpannableString("     The Green in the village of Emond's Field is a broad expanse covered with thick grass in the middle of the community. On its western boundary, visitors will notice the Winespring flowing forth from a low stone outcropping. The spring is the headwater for the Winespring Water which meanders eastward through the Green where it is spanned by two low railed footbridges. The Winespring Inn sits on the east side of the Green next to the Wagon Bridge and the North Road. The Old Road lies nearby on the other side of the bridge.\n\n")

        val string4 = SpannableString("Economics and Trade.\n\n")
        string4.setSpan(RelativeSizeSpan(1.5f), 0, 20, 0)

        val string5 = SpannableString("     The Green is an important location in Emond's Field where local farmers sell their harvests, usually wool and Tabac, to visiting merchants from Baerlon.  As a function of his office, Mayor Brandelwyn al'Vere observes all commerce that occurs on the Green to ensure a fair marketplace is provided for all parties.\n\n")

        val string8 = SpannableString("Bel Tine\n\n")
        string8.setSpan(RelativeSizeSpan(1.5f), 0, 8, 0)

        val string9 = SpannableString("     The Green is the focus of the annual Bel Tine celebration marking the first day of spring. The day before the festival, village women old enough to wear a Braid will erect in the middle of the Green a trimmed ten foot tall trunk of fir called the Spring Pole. Village men who pass by the Green will pretend not to notice what is occuring. On the morning of Bel Tine, village men will act suprised to find the Spring Pole and at noon women will dance around it while decorating it with ribbons as unmarried men sing. In the afternoon villagers will feast while contests of archery, sheepshearing, rope tugging, weight tossing, dancing, singing, fiddle playing, puzzle solving, and riddling are held on the Green. In the evening young girls with newly braided hair and young men of marriageable age are invited to dance together around the Spring Pole.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=1)
        {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisInfo.text = TextUtils.concat(string1_2,string2,string3,string4,string5,string8,string9)
        }
    }
}