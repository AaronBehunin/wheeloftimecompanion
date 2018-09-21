package com.example.u0450254.wheeloftimecompanion.Locations.Nations

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.provider.ContactsContract
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.RelativeSizeSpan
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/31/2018.
 */

//next entry: lord of chaos P


class Manetheren: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nation)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisSymbol = findViewById<ImageView>(R.id.Symbol)
        var thisCapital = findViewById<TextView>(R.id.capital)
        var thisType = findViewById<TextView>(R.id.typeofgov)
        var thisHead = findViewById<TextView>(R.id.Head)


        thisTitle.text = "Manetheren"
        thisSymbol.setImageResource(R.drawable.manetheren)
        thisCapital.text = "Capital: Manetheren"
        thisType.text = "Type: Monarchy"
        thisHead.text = "Ruler: King Aemon al Caar al Thorin"


        val locinfo = findViewById<TextView>(R.id.locinfo)
        var string1  = SpannableString("\n     Manetheren was one of the Ten Nations which arose from the ashes of the Breaking of the World. It was destroyed circa 1200 AB amidst the upheavals of the Trolloc Wars.\n\n")

        var string2 = SpannableString("Geography\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0,9,0)

        var string3 = SpannableString("      Its capital city was also called Manetheren and was located in the mountains between the headwaters of the Tarendrelle and the Manetherendrelle.\n\n")

        var string5 = SpannableString("History\n\n")
        string5.setSpan(RelativeSizeSpan(2f), 0,7,0)

        var string6 = SpannableString("     Before the upheavals brought about by the Breaking of the World, the land that would eventually be Manetheren looked very different, with half of its landmass existing under the shallows of a great western ocean. During the Breaking, insane male channelers dramatically changed the face of the world; and in the process some of them raised the Mountains of Mist and drove back the sea. The result was a mountain range rich in mineral resources that had long been locked beneath an ocean floor.\n\n")

        var string10 = SpannableString("The Golden Age of Mantheren\n\n")
        string10.setSpan(RelativeSizeSpan(1.5f), 0,27,0)

        var string11 = SpannableString("    It is said that once completed the capital of Manetheren was a true marvel to behold and that Ogier stonemasons would come to the Mountain Home simply to stare at it in wonder.\n\n")

        var string14 = SpannableString("Government\n\n")
        string14.setSpan(RelativeSizeSpan(2f), 0,10,0)

        var string15 = SpannableString("     The records of the founding of Manetheren's government are lost to time and only scraps of history remain to shed light on the political structure of the nation. It is known that Manetheren was governed via a traditional monarchy though it is unclear if hereditary succession descended through male or female lines. Since as many queens are mentioned in historical records as kings, it is plausible that political heirs were firstborn children in general and not necessarily sons.\n\n")

        var string16 = SpannableString("Military\n\n")
        string16.setSpan(RelativeSizeSpan(1.5f), 0,8,0)

        var string17 = SpannableString("     The Army of Manetheren was perhaps the most significant military force in the Westlands during the millennium after the Breaking of the World. Its military would become renowned for its unflinching opposition to the Shadow, earning the moniker The Sword that could not be broken.\n\n")

        var string19 = SpannableString("Cities\n\n")
        string19.setSpan(RelativeSizeSpan(1.5f), 0,6,0)

        var string20 = SpannableString("     Manetheren engineers were accounted as some of the greatest in the world and worked alongside Ogier Stonemasons to build some of the most beautiful cities of the era. Most records naming the many cities of the nation have been lost or destroyed but one city of the era are known:")

        var string21 = SpannableString("Manetheren - The capital of the nation; Accounted as the most beautiful city in the world at the time. Manetheren was located in the Mountains of Mist just above the Manetherendrelle River.\n\n")

        var string25 = SpannableString("Fall of Manetheren\n\n")
        string25.setSpan(RelativeSizeSpan(2f), 0,18,0)

        var string26 = SpannableString("The Trolloc Wars\n\n")
        string26.setSpan(RelativeSizeSpan(1.5f), 0,16,0)

        var string27 = SpannableString("     During the early years of the wars Manetheren emerged as a staunch supporter of the Ten Nations, valiantly answering pleas for aid from embattled allies and fighting the Shadow at every turn. Wherever men fought the forces of the Dark One, the Red Eagle of Manetheren was always at the fore. For their perseverance and courage, the Army of Manetheren became known as a thorn to the Dark one's foot, and a bramble to his hand and Manetheren itself as the sword that could not be broken.\n\n")

        var string28 = SpannableString("     In the middle years of the wars, circa 1150 AB, Manetheren was ruled by King Thorin al Toren al Ban who had forged a close relationship with King Balwen Mayel of Aridhol. King Thorin worried that his ally was beginning to despair that the forces of Light might win and so sent a delegation to Aridhol headed by his son Prince Caar al Thorin al Toren to reinforce the tenets of the Compact of the Ten Nations. Unbeknownst to Thorin, King Balwen had fallen under the manipulations of a mysterious councilor named Mordeth who advised Balwen to murder the Manetheren delegation and imprison Prince Caar. Caar would eventually escape after suffering torture in Aridhol and King Thorin would send his army to exact vengeance. When the soldiers of Manetheren arrived at Aridhol's capital they found nothing living - the entire population having mysteriously disappeared. Sensing a great evil, the men of Manetheren named the place Shadar Logoth and shunned it ever after.\n\n")

        var string29 = SpannableString("     Later Manetheren came under attack by a vast Trolloc horde. Despite a valiant defense commanded by King Aemon al Caar al Thorin at the Battle of the Tarendrelle River, the Army of Manetheren was defeated and forced into a fighting retreat before perishing at a crossroads near the Mountain Home in a second engagement called the Battle of Aemon's Field. Queen Eldrene committed suicide with the One Power at this moment, destroying the invading Trolloc army and sending the remnants fleeing back across the Tarendrelle. However, Manetheren did not rise again during the war.\n\n")

        locinfo.setTextColor(Color.WHITE)

        locinfo.text = string1

        if (progress.book>1 || (progress.book==1&&progress.chapter>9))
        {
            locinfo.text = TextUtils.concat(string1,string2,string3,string5,string6,string10,
                    string11,string14,string15,string16,string17,string19,string20,
                    string21,string25,string26,string27,string28,string29)
        }
    }
}