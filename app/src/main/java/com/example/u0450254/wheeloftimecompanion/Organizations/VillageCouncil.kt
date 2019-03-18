package com.example.u0450254.wheeloftimecompanion.Organizations

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class VillageCouncil: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisType = findViewById<TextView>(R.id.type)
        val thisHead = findViewById<TextView>(R.id.Headquarters)
        val thisAllign = findViewById<TextView>(R.id.Allignment)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)

        thisTitle.text = "Village Council"
        thisType.text = "Type: Small Government"
        thisHead.text = "Headquarters: The Two Rivers"
        thisAllign.text = "Allignemnt: Neutral"
        thisAffil.text = "Affiliation: The Two Rivers"


        val terminfo = findViewById<TextView>(R.id.charinfo)
        val string1  = SpannableString("\n     In the Two Rivers district of western Andor the villages of Taren Ferry, Watch Hill, Emond's Field, and Deven Ride hold themselves politically independent and practice a form of gender-based bicameral government. The Village Council of each community is an all-male eight-member committee.\n\n")
        val string1_1  = SpannableString("\n     In the Two Rivers district of western Andor the villages of Taren Ferry, Watch Hill, Emond's Field, and Deven Ride hold themselves politically independent and practice a form of gender-based bicameral government. The Village Council of each community is an all-male eight-member committee. " +
                " Each council is headed by a Mayor and serves as one of the eight members.\n\n")

        val string2 = SpannableString("     Village councilors establish economic policy with merchants, peddlers, and the councils of other communities. The primary function of the Mayor in this regard is to ensure a fair marketplace for all participants transacting within a village's sphere of influence.\n\n")
                terminfo.setTextColor(Color.WHITE)

        val string2_2 = SpannableString("     Village councilors establish economic policy with merchants, peddlers, and the councils of other communities. The primary function of the Mayor in this regard is to ensure a fair marketplace for all participants transacting within a village's sphere of influence. " +
                "In extremely rare cases, councils have sent out patrols if villages believe they are being victimized by outsiders seeking to steal property from locals.\n\n")

        val string3 = SpannableString("     The power of the Village Council in each community is balanced by - and often at odds with -the equally important Women's Circle.  Each Circle is headed by a Wisdom who serves for life.\n\n")
        terminfo.setMovementMethod(LinkMovementMethod.getInstance())


        if (progress.book==1&&progress.chapter<=1)
        {
            terminfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=4)
        {
            terminfo.text = TextUtils.concat(string1_1,string2,string3)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>4))
        {
            terminfo.text = TextUtils.concat(string1_1,string2_2,string3)
        }
    }
}