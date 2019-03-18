package com.example.u0450254.wheeloftimecompanion.Characters.Supporting

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
class TamAlThor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisAge = findViewById<TextView>(R.id.Age)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)
        val thisGender = findViewById<TextView>(R.id.Gender)
        val thisHeight = findViewById<TextView>(R.id.Height)
        val thisWeight = findViewById<TextView>(R.id.Weight)
        val thisHair = findViewById<TextView>(R.id.HairColor)
        val thisEye = findViewById<TextView>(R.id.EyeColor)
        val thisRank = findViewById<TextView>(R.id.Rank)

        val thisPortrat = findViewById<ImageView>(R.id.Portrat)

        thisTitle.text = "Tamlin al'Thor"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: ?"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Gray"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Civilian"



        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Tamlin al'Thor is the father of Rand al'Thor. He lives on a farm in the Westwood near Emond's Field, where he raised Rand from a baby.\n\n")

        val string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string3 = SpannableString("     He has a thick chest and a lined face. His hair is gray with sprinkles of black. He is described as being solid in virtually every conceivable way.\n\n")

        val string5 = SpannableString("History\n\n")
        string5.setSpan(RelativeSizeSpan(2f),0,7,0)

        val string8 = SpannableString("     He returned to the Two Rivers with his wife and the baby, whom he named Rand. There he settled on an outlying farm.\n\n")

        val string9 = SpannableString("     Kari al'Thor died before she could see her son grow up, and Tam never remarried, despite the best efforts of the Women's Circle.\n\n")

        val string10 = SpannableString("     During Rand's childhood, Tam taught him the trick of \"the flame and the void\". The technique, though meditative in nature and not combat oriented, helped Rand to improve his archery skills." +
                " He joined the Emond's Field Village Council, and was known to be a respectable, thoughtful council member. At an annual sheep-shearing, he told the children of the village the story of the War of Power and the Dragon.\n\n")

        val string11 = SpannableString("Activities\n\n")
        string11.setSpan(RelativeSizeSpan(2f),0,10,0)

        val string12 = SpannableString("Attack on the Two Rivers\n\n")
        string12.setSpan(RelativeSizeSpan(1.5f),0,24,0)

        val string13 = SpannableString("     In 998 NE, after a particularly hard winter, many interesting things happened to the isolated community. First, there were surprising visitors, a supposed noblewoman and her guard, who served to entertain the public at large by their very presence.\n\n")
        val string13_1 = SpannableString("     In 998 NE, after a particularly hard winter, many interesting things happened to the isolated community. First, there were surprising visitors, a supposed noblewoman and her guard, who served to entertain the public at large by their very presence. Second, there was an expected visitor, the gleeman Thom Merrilin, who had been hired to perform after Winternight, on Bel Tine.\n\n")
        val string13_2 = SpannableString("     In 998 NE, after a particularly hard winter, many interesting things happened to the isolated community. First, there were surprising visitors, a supposed noblewoman and her guard, actually an Aes Sedai and her Warder, who served to entertain the public at large by their very presence. Tam recognized her for what she was, though it is not known if he let this on to the council. Second, there was an expected visitor, the gleeman Thom Merrilin, who had been hired to perform after Winternight, on Bel Tine.\n\n")

        val string14 = SpannableString("     These happy events were marred somewhat by strange news from the outside world, from the peddler Padan Fain. Fain told of a false Dragon, and panic set in among the villagers. Tam supported a plan to arrange patrols, believing it would calm heads and control improbable influxes of refugees. These precautions were extraordinarily wise, though not for those reasons which had been established.\n\n")

        val string15 = SpannableString("     A Trolloc army had assembled in the Two Rivers. On Winternight, the army attacked Emond's Field, including that of Tam and his adopted son.\n\n")
        val string15_1 = SpannableString("     A Trolloc army had assembled in the Two Rivers. On Winternight, the army attacked Emond's Field, and specifically the homes of three candidates, including that of Tam and his adopted son.\n\n")

        val string16 = SpannableString("     Tam had sensed the danger, however. When Trollocs literally came to his doorstep, Tam was prepared, armed with his old heron-mark blade. He fought bravely, with all of his skill, but he was out of practice and had never fought Trollocs before. He received a small wound across his ribs. However, the wound wrapped him in a deadly fever.\n\n")
        val string16_1 = SpannableString("     Tam had sensed the danger, however. When Trollocs literally came to his doorstep, Tam was prepared, armed with his old heron-mark blade. He fought bravely, with all of his skill, but he was out of practice and had never fought Trollocs before. He received a small wound across his ribs. However, the wound was made by a tainted blade and wrapped him in a deadly fever.\n\n")

        val string17 = SpannableString("     His son treated it as well as he could and dragged him all the way back to the village to see the Wisdom Nynaeve al'Meara. In his feverish state, babbling to people who were not present, Tam had accidentally told Rand everything - Laman's Pride, about the Aiel War, and the circumstances surrounding his adoption.\n\n")

        val string18 = SpannableString("     Tam suffered a brush with death when the Trolloc blade wounded him. Nynaeve could not do anything. Moiraine Damodred, the Aes Sedai who had arrived the previous day, aided the Two Rivers folk in their fight against the Trollocs.\n\n")
        val string18_1 = SpannableString("     Tam suffered a brush with death when the tainted Trolloc blade wounded him. Nynaeve could not do anything, and he only survived due to Healing from Moiraine Damodred, the Aes Sedai who had arrived the previous day, and aided the Two Rivers folk in their fight against the Trollocs.\n\n")

        val string19 = SpannableString("     The following day, Tam woke to find out that his son was leaving with the Aes Sedai. He took this stoically, and gifted Rand with his heron-mark blade.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());



        if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisPortrat.setImageResource(R.drawable.tamalthor)
        }

        if (progress.book==1&&progress.chapter<=1)
        {
            thisInfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=2)
        {
            thisInfo.text = TextUtils.concat(string1,string2, string3, string5, string10)
        }
        else if (progress.book==1&&progress.chapter<=3)
        {
            thisInfo.text = TextUtils.concat(string1,string2, string3, string5, string8, string9, string10,string11,string13)
        }
        else if (progress.book==1&&progress.chapter<=4)
        {
            thisInfo.text = TextUtils.concat(string1,string2, string3, string5, string8, string9, string10,string11,string13,string14)
        }
        else if (progress.book==1&&progress.chapter<=5)
        {
            thisInfo.text = TextUtils.concat(string1,string2, string3, string5, string8, string9, string10,string11,string13_1,string14)
        }
        else if (progress.book==1&&progress.chapter<=6)
        {
            thisInfo.text = TextUtils.concat(string1,string2, string3, string5, string8, string9, string10,string11,string13_1,string14,string15,string16)
        }
        else if (progress.book==1&&progress.chapter<=7)
        {
            thisInfo.text = TextUtils.concat(string1,string2, string3, string5, string8, string9, string10,string11,string13_1,string14,string15,string16,string17)
        }
        else if (progress.book==1&&progress.chapter<=8)
        {
            thisInfo.text = TextUtils.concat(string1,string2, string3, string5, string8, string9, string10,string11,string12,string13_2,string14,string15,string16,string17,string18)
        }
        else if (progress.book==1&&progress.chapter<=9)
        {
            thisInfo.text = TextUtils.concat(string1,string2, string3, string5, string8, string9, string10,string11,string13_2,string14,string15_1,string16_1,string17,string18_1)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1,string2, string3, string5, string8, string9, string10,string11,string13_2,string14,string15_1,string16_1,string17,string18_1,string19)
        }
    }
}
