package com.example.u0450254.wheeloftimecompanion.Organizations

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
class AesSedaiAgeofLegends : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisType = findViewById<TextView>(R.id.type)
        val thisSymbol = findViewById<ImageView>(R.id.Symbol)
        val thisHead = findViewById<TextView>(R.id.Headquarters)
        val thisAllign = findViewById<TextView>(R.id.Allignment)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)

        thisTitle.text = "Aes Sedai(Age of Legends)"
        thisType.text = "Type: One Power Users"
        thisHead.text = "Headquarters: ?"
        thisAllign.text = "Allignemnt: Good"
        thisAffil.text = "Affiliation: Independent"

        thisSymbol.setImageResource(R.drawable.aessedaisymbol)

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("\n     Aes Sedai, in the Old Tongue, means \"servants of all,\" and the Aes Sedai of the Age of Legends lived up to this definition.\n\n")

        var string2 = SpannableString("Organization of the Ancient Aes Sedai\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0, 37, 0)

        var string5 = SpannableString("Hall of Servants\n\n")
        string5.setSpan(RelativeSizeSpan(1.5f), 0, 16, 0)

        var string6 = SpannableString("     The Aes Sedai were governed by the Hall of Servants, headed by the First among Servants.\n\n")

        var string10 = SpannableString("Talents of the ancient Aes Sedai\n\n")
        string10.setSpan(RelativeSizeSpan(2f), 0, 32, 0)

        var string11 = SpannableString("     The Talent of Healing was much stronger during the Age of Legends. They could make angreal.\n\n")

        var string12 = SpannableString("The Collapse\n\n")
        string12.setSpan(RelativeSizeSpan(2f), 0, 12, 0)

        var string13 = SpannableString("     The Dragon, with the help of the Hundred Companions, sealed the Dark One and the Forsaken in his prison at Shayol Ghul, and the Dark One's final counterattack tainted saidin itself, eventually driving all male channelers mad. The female Aes Sedai could not control them, and the men rampaged across the known world, boiling oceans, raising mountains where there were none, killing countless innocents. This was the Breaking of the World.\n\n")

        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1

        if (progress.book==1&&progress.chapter>0)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string5,string6)
        }
        if (progress.book==1&&progress.chapter>3)
        {
            thisInfo.text = TextUtils.concat(string1,string2,string5,string6,
                    string12,string13)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>8))
        {
            thisInfo.text = TextUtils.concat(string1,string2,string5,string6,string10,
                    string11,string12,string13)
        }

    }
}