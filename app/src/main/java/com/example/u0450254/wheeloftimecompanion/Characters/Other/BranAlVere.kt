package com.example.u0450254.wheeloftimecompanion.Characters.Other

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


/*
 * Created by u0450254 on 5/18/2018.
 */
class BranAlVere : AppCompatActivity() {

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

        thisTitle.text = "Brandelwyn al'Vere"
        thisAffil.text = " Affiliation: Andor-The Two Rivers"

        thisAge.text = " Age: 61"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: Large"
        thisHair.text = " Hair Color: Grey"
        thisEye.text = " Eye Color: Brown"
        thisRank.text = " Rank: Mayor"

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("\n    Brandelwyn \"Bran\" al'Vere is the Mayor of Emond's Field, in the Two Rivers.  Egwene al'Vere is one of Bran and Marin's children.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        var string2 = SpannableString("Appearance\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        var string3 = SpannableString("     With sparse gray hair and a round face, he has the look of many innkeepers: wearing an apron that strains over his wide girth. Surprisingly, he walks lightly for a man of his size. On special occasions, he wears a silver medallion of scales, the symbol of the office of Mayor.\n\n")

        var string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,7,0)

        var string5 = SpannableString("     As the village Mayor and the head of the Village Council, people are always taking their problems to Bran for solving. He is also the owner of the Winespring Inn, which he runs with the help of his wife, Marin. The cellar of the inn contains many barrels of brandy and ale made by Bran, and sometimes apple cider or apple brandy made by Tam al'Thor, and delivered every year about Bel Tine.\n\n")
        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        var string6 = SpannableString("Activities\n\n")
        string6.setSpan(RelativeSizeSpan(2f),0,10,0)

        var string7 = SpannableString("     He is part of the Village council.\n\n")
        var string7_2 =SpannableString("     He is part of the Village council, which is in session when Padan Fain arrives.\n\n")

        thisInfo.text = string1


        if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string6,string7)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>3))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string3,string4,string5,string6,string7_2)
        }
    }
}