package com.example.u0450254.wheeloftimecompanion.Organizations

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/18/2018.
 */
class Warder : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val thisSymbol = findViewById<ImageView>(R.id.Symbol)

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisType = findViewById<TextView>(R.id.type)
        val thisHead = findViewById<TextView>(R.id.Headquarters)
        val thisAllign = findViewById<TextView>(R.id.Allignment)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)

        thisTitle.text = "Warders"
        thisType.text = "Type: Military"
        thisHead.text = "Headquarters: Tar Valon"
        thisAllign.text = "Allignemnt: Good"
        thisAffil.text = "Affiliation: Aes Sedai"

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        thisInfo.setTextColor(Color.WHITE)


        var string1 = SpannableString("\n     A Warder is a person, traditionally male, who is bonded by an Aes Sedai through the use of saidar to become her bodyguard and protector.\n\n")

        var string2 = SpannableString("     The Warder bond has distinct benefits for both parties. The Warder gains greater stamina and physical prowess, a greater capacity to resist evil, the ability to sense shadowspawn at a distance, and greater resistance to injury (totally aside from the proximity of his Aes Sedai, who is probably able to Heal his wounds using the Power). The Aes Sedai, for her part, gains a bodyguard, confidant and ally-in-schemes who is intrinsically linked to her and can be compelled, to a certain extent, through the bond. Both parties are able to sense the other's general location, physical well-being and, to some extent, emotional state\n\n")
        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1,string2)
        }
    }
}