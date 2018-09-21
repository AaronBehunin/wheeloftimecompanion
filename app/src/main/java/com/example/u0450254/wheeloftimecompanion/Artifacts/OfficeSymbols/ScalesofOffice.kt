package com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/23/2018.
 */
class ScalesofOffice: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artifact)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisOwner = findViewById<TextView>(R.id.Owner)

        thisTitle.text = "Scales of Office"
        thisOwner.text = "Owner: Brandelwyn al'Vere"

        val artinfo = findViewById<TextView>(R.id.artInfo)
        var string1 = SpannableString("\n     The Scales of Office is a silver medallion in the form of a set of balance scales.\n\n")
        var string1_1 = SpannableString("\n     The Scales of Office is a silver medallion in the form of a set of balance scales. These, along with a set of real scales, represent the office of Mayor in Emond's Field.\n\n")

        var string2 = SpannableString("Bran al'Vere's\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,14,0)

        var string3 = SpannableString("     Bran al'Vere typically wears this for dealing with merchants. He is wearing this during the day of Winternight.")
        artinfo.setTextColor(Color.WHITE)

        artinfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=1)
        {

            artinfo.text = string1
        }
         else if (progress.book>1||(progress.book==1&&progress.chapter>1))
        {
            artinfo.text = TextUtils.concat(string1_1,string2,string3)
        }
    }
}