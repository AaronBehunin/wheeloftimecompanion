package com.example.u0450254.wheeloftimecompanion.Locations.Cities

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


class EmondsField : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Emond's Field"

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val thisImage = findViewById<ImageView>(R.id.locImage)


        val string1 = SpannableString("\n     Emond's Field is a village of farmers and craftsmen centrally located in the Two Rivers district of western Andor.\n\n")

        val string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0,9,0)

        val string3 = SpannableString("     Emond's Field is located north of Deven Ride and south of Watch Hill at the intersection of the North Road and the Old Road. West from the village stretches the Quarry Road which passes through the Westwood and the Sand Hills to terminate at the Mountains of Mist. The community is the largest of the villages in the region and has been built surrounding a Green where a natural aquifer, the Winespring, flows continuously from a low stone outcropping. The Winespring is the headwater for the Winespring Water which flows east through the Green under two low railed footbridges, the Wagon Bridge, and passes adjacent to the Winespring Inn. From there the stream widens with willow trees dotting its banks, passes the mill owned by Jon Thane, and eventually splits into several flows in the Waterwood before draining into The Mire. While some villagers reside inside the community limits, others like Tamlin al'Thor live on outlying farms.\n\n")

        val string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2f), 0,7,0)

        val string5 = SpannableString("     In the years between the Breaking of the World and the Trolloc Wars the area around Emond's Field was governed by the storied nation of Manetheren. During the middle years of Trolloc Wars circa 1200 AB Manetheren was besieged by armies of Shadowspawn and waged a desperate battle for survival. The army of Manetheren was commanded by its king Aemon al Caar al Thorin who had failed to halt the Shadow from invading Manetheren during the Battle of the Tarendrelle River. His army was driven back until they were forced to wage a final desperate last stand at a field near the crossroads. Thus began the one-day Battle of Aemon's Field where the king perished along with his army.\n\n")

        val string6 = SpannableString("Government\n\n")
        string6.setSpan(RelativeSizeSpan(2f), 0,10,0)

        val string7 = SpannableString("     Like the other villages in the Two Rivers region, Emond's Field practices a form of gender-based bicameral government. Governance is split between the Village Council; a committee of men chaired by a mayor, and the Women's Circle; a gathering of women that are lead by a Wisdom.\n\n")

        val string8 = SpannableString("The Village Council\n\n")
        string8.setSpan(RelativeSizeSpan(1.5f), 0,19,0)

        val string9 = SpannableString("     The Council is comprised of exactly seven councilors and one mayor. Council meetings take place in the common room of the Winespring Inn and are chaired by the Mayor. Of the remaining seven councilors, six are residents of the village and one is a farmer from the countryside who speaks for the outlying farms. In the spring of 998 NE the members of the Village council were:\n\n")

        val string10 = SpannableString("Brandelwyn al'Vere, Mayor\nTamlin al'Thor\nCenn Buie\n\n")
        val string10_1 = SpannableString("Brandelwyn al'Vere, Mayor\nTamlin al'Thor\nCenn Buie\nJon Thane\nHaral Luhhan\nRowan Hurn\nSamel Crawe\n\n")

        val string11 = SpannableString("     Council business subjects are sensitive and not to be discussed outside council meetings.\n\n")
        val string11_1 = SpannableString("     Council business subjects are sensitive and not to be discussed outside council meetings.  In the extremely rare event that villagers or outlying farmers feel that their safety or security is at risk from outsiders, the council has been known to mobilize militias to patrol the surrounding area.\n\n")

        val string12 = SpannableString("The Women's Circle\n\n")
        string12.setSpan(RelativeSizeSpan(1.5f), 0,18,0)

        val string13 = SpannableString("     In Emond's Field the Village council is balanced by - and often at odd with - the equally important Women's Circle. The village Wisdom generally serves as the leader of the circle. Only the Wisdom is known at this time:\n\n")

        val string14 = SpannableString("Nynaeve al'Meara\n\n")

        val string17 = SpannableString("     The Circle convenes on a wide array of social issues such as when a young woman is of marriageable age and may Braid her hair.  Circle members are generally knowledgeable in weather and herblore and will advise men when to plant and harvest crops.\n\n")

        val string18 = SpannableString("Culture\n\n")
        string18.setSpan(RelativeSizeSpan(2f), 0,7,0)

        val string19 = SpannableString("Way of Life\n\n")
        string19.setSpan(RelativeSizeSpan(1.5f), 0,11,0)

        val string20 = SpannableString("     Inhabitants of the area live a lifestyle centered around agriculture and tradecraft. Men are usually farmers or masters of a trade skill. Folk are often distrustful of outsiders, evidenced when they occasionally refer to Taren Ferry men as \"sheepstealers\" or \"chickenthieves\" and keep a wary eye on visiting merchant caravans. Like all inhabitants of the Two Rivers, villagers of Emond's Field are known for a strong streak of stubbornness. " +
                "As a consequence they are a hardy folk unwilling to give up when times are tough.\n\n")

        val string21 = SpannableString("Gatherings and Feastdays\n\n")
        string21.setSpan(RelativeSizeSpan(1.5f), 0,24,0)

        val string22 = SpannableString("     Residents of Emond's Field celebrate different feastdays throughout the year.\n\n")

        val string23 = SpannableString("Bel Tine - Occurs during the spring equinox when winter first falls away. Community members will gather in a grand festival on the village Green, where contests are held and and unmarried adult villagers are encouraged to dance together around a Spring Pole. Bel Tine is a time for music, merrymaking, young love, and a celebration of the new spring season.\n\n")

        val string24 = SpannableString("The Annual Sheep Shear - Occurs in late spring. The entire community will gather in a meadow east of the village next to the Winespring Water where they wash and shear sheep. Wool is gathered and carefully weighed and folded. Great care is taken to make certain the right weight of wool is returned to its proper owners. Wool gathering is an extremely labor intensive task, so the entire community assists each other and families will often prepare potluck meals to share with others. Younger children will be enlisted to help carry water for sheep washing and teenagers will assist with animal herding.\n\n")

        val string26 = SpannableString("Economics and Trade\n\n")
        string26.setSpan(RelativeSizeSpan(2f), 0,19,0)

        val string27 = SpannableString("     The economy of Emond's Field depends primarily upon tabac farming and wool gathering. Guarded merchant caravans will journey to the village from Baerlon and Taren Ferry in order to purchase and return with these commodities along with smaller quantities of apple brandy. "+
                "As a function of his office to ensure a fair marketplace, Mayor al'Vere dons his badge of office while observing all transactions and weighing coins with a set of merchant's scales.\n\n")

        val string31 = SpannableString("     In addition to these commodities, the economy of Emond's Field also depends on the tradecraft of mill owner Jon Thane and thatcher Cenn Buie. The Mayor and his wife Marin al'Vere also enjoy occasional business as owners of the Winespring Inn.\n\n")
        val string31_1 = SpannableString("     In addition to these commodities, the economy of Emond's Field also depends on the tradecraft of blacksmith Haral Luhhan, mill owner Jon Thane, and thatcher Cenn Buie. The Mayor and his wife Marin al'Vere also enjoy occasional business as owners of the Winespring Inn.\n\n")

        val string32 = SpannableString("Recent EventsActivity\n\n")
        string32.setSpan(RelativeSizeSpan(2f), 0,13,0)

        val string33 = SpannableString("     For as long as anyone can remember Emond's Field has been a peaceful, isolated village, but recent events have led to dramatic changes.\n\n")

        val string34 = SpannableString("Winternight\n\n")
        string34.setSpan(RelativeSizeSpan(1.5f), 0,11,0)

        val string35 = SpannableString("     On Winternight of the year 998 NE, a force of about one hundred Trollocs raided Emond's Field. As a result a few people were killed, several more were wounded, and many buildings were damaged. Fortunately the Aes Sedai Moiraine Damodred and her Warder interceded and prevented more violence.\n\n")
        val string35_1 = SpannableString("     On Winternight of the year 998 NE, a force of about one hundred Trollocs raided Emond's Field. As a result a few people were killed, several more were wounded, and many buildings were damaged. Fortunately the Aes Sedai Moiraine Damodred and her Warder interceded and prevented more violence.  After these events, the Aes Sedai left with four young villagers (Rand al'Thor, Matrim Cauthon, Perrin Aybara, and Egwene al'Vere) and a gleeman named Thom Merrilin.\n\n")

        thisInfo.setTextColor(Color.WHITE)
        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book>1||(progress.book==1&&progress.chapter>1))
                {
                    thisImage.setImageResource(R.drawable.emonds_field)
                }


        if (progress.book==1&&progress.chapter<=1)
        {
                    thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=2)
        {

            thisInfo.text = TextUtils.concat(string1,string2,string3,string6,string7,string8,string9,string10,
                    string11,string12,string13,string14,string17,string18,string19,string20,
                    string21,string22,string23,string24,string26,string27,
                    string31)
        }
        else if (progress.book==1&&progress.chapter<=4)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string6,string7,string8,string9,string10_1,
                    string11,string12,string13,string14,string17,string18,string19,string20,
                    string21,string22,string23,string24,string26,string27,string31_1)
        }
        else if (progress.book==1&&progress.chapter<=7)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string6,string7,string8,string9,string10_1,
                    string11_1,string12,string13,string14,string17,string18,string19,string20,
                    string21,string22,string23,string24,string26,string27,string31)
        }
        else if (progress.book==1&&progress.chapter<=9)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string6,string7,string8,string9,string10_1,
                    string11_1,string12,string13,string14,string17,string18,string19,string20,
                    string21,string22,string23,string24,string26,string27,string31,
                    string32,string33,string34,string35)
        }
        else if (progress.book==1&&progress.chapter<=10)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string6,string7,string8,string9,string10_1,
                    string11_1,string12,string13,string14,string17,string18,string19,string20,
                    string21,string22,string23,string24,string26,string27,
                    string31,string32,string33,string35)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string6,string7,string8,string9,string10_1,
                    string11_1,string12,string13,string14,string17,string18,string19,string20,
                    string21,string22,string23,string24,string26,string27,
                    string31,string32,string33,string35_1)
        }
    }
}