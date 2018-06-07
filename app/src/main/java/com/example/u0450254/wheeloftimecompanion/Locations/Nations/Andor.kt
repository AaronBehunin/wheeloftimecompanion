/**
 * Created by u0450254 on 5/31/2018.
 */


package com.example.u0450254.wheeloftimecompanion.Locations.Nations

import android.app.Activity
import android.content.Context
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

/**
 * Created by u0450254 on 5/31/2018.
 */

class Andor: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nation)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val filename = "Progress"
        val fileContents = "1-1"
        openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisCapital = findViewById<TextView>(R.id.capital)
        var thisGov = findViewById<TextView>(R.id.typeofgov)
        var thisHead = findViewById<TextView>(R.id.Head)

        var thisSymbol = findViewById<ImageView>(R.id.Symbol)

        thisTitle.text = "Andor"
        thisCapital.text = "Capital: Caemlyn"
        thisGov.text = "Type of Government:  Matriarchal Monarchy"
        thisHead.text = "Head of State: Morgase Trakand"

        thisSymbol.setImageResource(R.drawable.andor)

        var string1 = SpannableString("     Andor is a country in the heart of the Westlands. It is the largest and most populous country in the West. After the Borderlands, it also has the largest and most well-trained army.\n\n"+

        "     Formerly a province under gubernatorial rule, it was declared a sovereign nation, and is the oldest and largest of the nations formed after Artur Hawkwing's empire collapsed.\n\n")

        var string2 = SpannableString("History\n\n     Pre-Imperial\n\n     During the first millennium after the Breaking, the territory of Andor was held by two of the Ten Nations, Manetheren in the west and Coremanda in the east. The city of Hai Caemlyn was founded as one of Coremanda's major strongholds, a large city close to the River Erinin, which was important for trade. During the Trolloc Wars both kingdoms were destroyed.\n" +
                "\n" +
                "     After the conclusion of the wars, the kingdoms of Farashelle, Aldeshar, and Caembarin arose out of the ruins of the two older kingdoms. Aldeshar and Caembarin, named for its capital at the rebuilt city of Caemlyn, were two of the most militarily powerful nations of their time and sent armies against the false Dragon Guaire Amalasan in the War of the Second Dragon, although it was actually King Artur Paendrag Tanreall, known as Artur Hawkwing, of the small kingdom of Shandalle, east of Caembarin, who defeated Amalasan. Caembarin attacked Shandalle a few months later and Aldeshar followed suit the following year, allegedly due to the manipulations of the Amyrlin Seat, Bonwhin Meraighdin. During the Consolidation, Hawkwing conquered Caembarin early in his campaign, but Aldeshar did not fully surrender until FY 963, the last nation to be added to his growing Empire.\n\n")

        string2.setSpan(RelativeSizeSpan(2f), 0, 7, 0)
        string2.setSpan(RelativeSizeSpan(1.5f), 14, 30, 0)


        var string3 = SpannableString("     Imperial history\n\n     Blaming King Joal Ramedar of Aldeshar for the murder of his wife, Amaline Paendrag Tagora, three years previously, Hawkwing put Ramedar to death and scattered the people of Aldeshar across the Empire. This period of rage, the Black Years, ended after Hawkwing's aborted invasion of the Aiel Waste and his marriage to the lady Tamika.\n\n"+
        "     Hawkwing set about organizing his Empire into provinces. The Imperial Province of Andor was created early on, spanning the central regions of the Empire. The precise borders of Andor Province are unknown, but Caemlyn was the ruling city. The first governor was Jeorad Manyard (who was more interested in creating a translation of The Prophecies of the Dragon), but his rule did not last long. Displaying regret for his harsh treatment of Aldeshar, Hawkwing permitted its people to return home and appointed Endara Casalain, King Ramedar's daughter, as the Imperial Governor of Andor in FY 967.\n\n"+
                "     In FY 975 Hawkwing's armies besieged Tar Valon, a siege that was to last for the remaining lifespan of the Empire. Endara's daughter, Ishara Casalain, began a romance with General Souran Maravaile, the commander of the siege, in the early FY 990s.\n\n")

        string3.setSpan(RelativeSizeSpan(1.5f), 5, 21, 0)

        var string4 = SpannableString("     Declaration of sovereignty\n\n" +
                "     After the death of Artur Hawkwing in FY 994, Ishara and the new Amyrlin Seat, Deane Aryman, persuaded Souran Maravaile to lift the siege of Tar Valon. Ishara and Souran returned to Andor and married. Endara withdrew any claim to the governorship or crown and swore fealty to Ishara. Ishara declared herself the first Queen of Andor, establishing an unbroken bloodline of female rulers.\n\n")

        string4.setSpan(RelativeSizeSpan(1.5f), 5, 31, 0)

        var string5 = SpannableString("Early Andoran Traditions\n\n" +
                "     Many of Andor's traditions were established during these early years. Unlike many nobles of the time, Queen Ishara knew that no one ruler would be able to take control of Hawkwing's entire empire. Instead, she focused on controlling only what she could. As a result, Andor began only with the capital city of Caemlyn and the small surrounding villages. Cautious expansion marked the reigns of the early queens of Andor.\n" +
                "\n" +
                "     The tradition of Andor is that only a queen must sit on the Lion Throne of Andor, and wear the Rose Crown. However, it wasn't always intended that a queen would rule - it happened that the sons of Andor's first two Queens were killed, and so their daughters became queens. After this it became tradition that a queen would rule. The eldest daughter is known as the Daughter-Heir, and is always sent to Tar Valon to study. The eldest brother of the Daughter-Heir is sworn to protect her with his life, and is prepared from an early age to take control of Andor's army. He is given the title First Prince of the Sword. If the Daughter-Heir does not have a brother, another man is appointed to the post.\n" +
                "\n" +
                "     If a Queen does not have a daughter, then another successor is appointed, judged by the number of blood ties she can establish to Ishara. Four times in Andor's history this method has been disputed, leading to the Succession Wars\n\n.")


        string5.setSpan(RelativeSizeSpan(2f), 0, 25, 0)

        var string6 = SpannableString("Military Strength\n\n" +
                "     Andor is a powerful nation, with a substantial army consisting of the Queen's Guards and the standing armies maintained by the individual noble houses, who are also able to call upon huge levies in times of crisis. The maximum military strength of Andor has been estimated at almost 200,000 men, although many would be barely-trained levies.\n" +
                "\n" +
                "     Through history, Andor has been under almost constant pressure from neighboring countries. Andor and Cairhien have been to war more times than any two countries except for Tear and Illian. Often-lawless Murandy, south of Andor, is the source of many border incursions which the Queen's Guards must fend off; conversely, the Andoran forces at the Murandian border have resulted in Andor having a strong hand in Murandian politics. The Children of the Light have always had a reason to dislike Andor, as the Daughter-Heir always studies in the White Tower.\n" +
                "\n" +
                "     Andor's strength comes from its wealth. Much of this is generated in the Mountains of Mist, far to the west of central Andor. Gold, silver, iron, and copper are extracted from the rich mines in these mountains. Most of this metal is refined in the smelters near the mines.\n" +
                "\n" +
                "     The strength which must be expended to retain the valuable mines in the Mountains of Mist means that other outlying regions of Andor have been virtually forgotten. A good example of this is the Two Rivers, where few even realize they are part of a larger kingdom. One well-known town in the far west of Andor is Whitebridge, so named for the large bridge which crosses the River Arinelle into the town.")

        string6.setSpan(RelativeSizeSpan(2f), 0, 17, 0)


        var thisInfo = findViewById<TextView>(R.id.locinfo)

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance())

        thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string6)
    }
}