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


class WomensCircle: AppCompatActivity() {

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

        thisTitle.text = "Women's Circle"
        thisType.text = "Type: Small Government"
        thisHead.text = "Headquarters: The Two Rivers"
        thisAllign.text = "Allignemnt: Neutral"
        thisAffil.text = "Affiliation: The Two Rivers"


        val terminfo = findViewById<TextView>(R.id.charinfo)
        val string1 = SpannableString("\n     In the Two Rivers district of western Andor the villages of Taren Ferry, Watch Hill, Emond's Field, and Deven Ride hold themselves politically independent and practice a form of gender-based bicameral government. The Women's Circle of each community is an all-female committee.\n\n")
        val string1_1 = SpannableString("\n     In the Two Rivers district of western Andor the villages of Taren Ferry, Watch Hill, Emond's Field, and Deven Ride hold themselves politically independent and practice a form of gender-based bicameral government. The Women's Circle of each community is an all-female committee. " +
                "Each Circle is guided by a Wisdom.\n\n")


        val string2 = SpannableString("     The primary function of Circles is to establish and maintain social protocols within Two Rivers culture. A young woman in the Two Rivers is not allowed to Braid her hair until members of the local Women's Circle have decided that she is of marriageable age.\n\n")
        terminfo.setTextColor(Color.WHITE)

        val string3 = SpannableString("     The power of the Women's Circle in each community is balanced by - and often at odds with -the equally important Village Council. Councils are eight-member committees of men in each village. They are headed by a Mayor and serves as one of the eight members.\n\n")
        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=1) {
            terminfo.text = string1
        }
        else if (progress.book==1&&progress.chapter<=2)
        {
            terminfo.text = TextUtils.concat(string1_1,string3)
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>2))
        {
            terminfo.text = TextUtils.concat(string1_1,string2,string3)
        }
    }
}