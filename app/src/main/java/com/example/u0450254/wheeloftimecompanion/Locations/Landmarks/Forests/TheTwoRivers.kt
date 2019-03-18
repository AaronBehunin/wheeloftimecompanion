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


class TheTwoRivers : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The Two Rivers"

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     The Two Rivers is a region centrally-located in the Westlands which derives its name from the two rivers that mark its boundaries: the Taren River to the north and the White River to the south. It contains the villages of Taren Ferry, Deven Ride, Emond's Field, and Watch Hill, along with many independent farms.\n\n")

        val string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 9, 0)

        val string3 = SpannableString("     The Two Rivers is a geographically insulated region in western Andor. The Mountains of Mist stretch along its western limits and in addition to the two major rivers that form its northern and southern boundaries, a treacherous fen known as The Mire blocks travelers who might approach from the east. Just to the west of The Mire is a large forest known as the Waterwood which serves as drainage for the Winespring Water flowing from Edmond's Field. West of the village communities is a dense forest known as the Westwood which extends along the western edge of the district next to the Sand Hills - a geographic anomaly near the foothills of the mountains.\n\n")

        val string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2f), 0, 7, 0)

        val string5 = SpannableString("     In the years following the Breaking of the World the land that would one day be known as the Two Rivers was the lush and verdant heartland of the storied nation of Manetheren. Its capital city was located high and secure in the peaks of the Mountains of Mist just to the west of modern day Deven Ride.\n\n")

        val string6 = SpannableString("     When the Trolloc Wars began circa 1000 AB, Manetheren for years fought valiantly to repulse invasions of Shadowspawn aimed at its allies. For this Manetheren became known as a \"Thorn to the Dark One's foot and a bramble to his hand\" " +
                "During the middle years of the wars the nation was ruled by King Aemon al Caar al Thorin and his queen Eldrene ay Ellan ay Carlan. Aemon had always come to the aid of allies under attack and his final victory occurred circa 1200 AB at a place known as the Field of Bekkar. Aemon marched his army back to his homeland and engaged the shadow in a titanic multiple-day struggle that came to be known as the Battle of the Tarendrelle River. Ultimately the shadow overran Manetheren and the nation was destroyed.\n\n")

        val string8 = SpannableString("Government\n\n")
        string8.setSpan(RelativeSizeSpan(2f), 0, 10, 0)

        val string9 = SpannableString("     All communities in the Two Rivers practice a form of gender-based bicameral government. In each village governance is officially controlled by a Village Council consisting entirely of men. Each council is headed by a mayor. " +
                "Additionally, a second ruling body called the Women's Circle controls matters as well. The Women's Circle is headed by a Wisdom who serves for life. Political control of each community exists as an ongoing willful struggle between Village Councils and Women's Circles.\n\n")

        val string10 = SpannableString("Culture\n\n")
        string10.setSpan(RelativeSizeSpan(2f), 0, 7, 0)

        val string11 = SpannableString("     Inhabitants of the Two Rivers typically live a lifestyle centered around farming and tradecraft. Adult women wear their hair in a braid and a young girl from the Two Rivers is allowed to braid her hair only when the local Women's Circle determines that she is of marriageable age. Men are usually farmers or masters of a trade skill. Every spring the people in the three lower villages hold a Bel Tine festival on their village greens where contests are held and unmarried adult villagers are encouraged to dance together around a Spring Pole. Villagers typically marry in their late teens or early twenties. A young woman who is interested in a young man may attempt to show her interest by placing flowers in his hair during Bel Tine. "+
                "All inhabitants of the Two Rivers are known for a strong streak of stubbornness.  As a consequence they are a hardy folk unwilling to give up even when times are tough. While on the surface it may seem to outsiders that the conflict between Village Councils and Women's Circles is forever ongoing, villagers are actually fiercely loyal to each other.\n\n")

        val string12 = SpannableString("Economics and Trade\n\n")
        string12.setSpan(RelativeSizeSpan(2f), 0, 20, 0)

        val string13 = SpannableString("     The Two Rivers economy depends primarily upon tabac farming and wool gathering. Merchant caravans will journey to the area from Baerlon and Taren Ferry during certain times of the year in order to purchase and return with Tabac and wool. Commerce takes place upon each village's green and, as a function of their offices to ensure a fair marketplace, each village Mayor observes all transactions. In addition to these commodities, the economy also depends upon the tradecraft of various people throughout the area.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book==1&&progress.chapter<=1)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=9)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string8,string9,string10,string11,string12,string13)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string6,string8,string9,string10,string11,string12,string13)
        }
    }
}