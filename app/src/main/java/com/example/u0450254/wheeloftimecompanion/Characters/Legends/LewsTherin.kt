package com.example.u0450254.wheeloftimecompanion.Characters.Legends

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.view.MenuItem
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Launchers

class LewsTherin : AppCompatActivity() {

   // next reference: Eye of the World 14

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        val launcher = Launchers(this)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisAge = findViewById<TextView>(R.id.Age)
        var thisAffil = findViewById<TextView>(R.id.Affiliation)
        var thisGender = findViewById<TextView>(R.id.Gender)
        var thisHeight = findViewById<TextView>(R.id.Height)
        var thisWeight = findViewById<TextView>(R.id.Weight)
        var thisHair = findViewById<TextView>(R.id.HairColor)
        var thisEye = findViewById<TextView>(R.id.EyeColor)
        var thisRank = findViewById<TextView>(R.id.Rank)

        thisTitle.text = "Lews Therin"
        thisAffil.text = " Affiliation: Legend"

        thisAge.text = " Age: 400(Deceased)"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Brown with White"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: General"

        var thisInfo = findViewById<TextView>(R.id.charinfo)


        var string1 = SpannableString("\n      Lews Therin Telamon was the Dragon during the War of Power.\n\n")
        var string1_1 = SpannableString("\n      Lews Therin Telamon was the Dragon during the War of Power. He was the leader of the forces of Light and was well respected all over the world. He was able to summon the Nine Rods of Dominion, as well as being the highest rank of Aes Sedai, wearing the Ring of Tamyrlin. He was as strong in the Power as a man could be and was the \"First Among Servants.\"\n\n")

        var string2 = SpannableString("History\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,7,0)

        var string3 = SpannableString("      He died on Dragonmount, at approximately 400 years old.")

        var string4 = SpannableString("     He married Ilyena Sunhair. At some time during the War of Power he humbled Ishamael in the Hall of Servants and defeated him at the Gates of Paaran Disen.\n\n")

        var string6 = SpannableString("Death and Dragonmount\n\n")
        string6.setSpan(RelativeSizeSpan(1.5f),0,21,0)

        var string7 = SpannableString("     Lews Therin returned to kill all of his family and many friends, causing people to later rename him \"Lews Therin Kinslayer.\" Healed of his madness by Ishamael and horrified by his actions, he drew too much of the One Power and killed himself, causing the creation of Dragonmount\n\n")
        var string23 = SpannableString("Titles\n\n")
        string23.setSpan(RelativeSizeSpan(2f),0,6,0)

        var string24 = SpannableString("Lord of the Morning\nThe Dragon\nKinslayer\n")

        thisInfo.setTextColor(Color.WHITE)
        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1

        if ((progress.book==1 && progress.chapter>0)||progress.book>1)
        {
            thisInfo.text = TextUtils.concat(string1_1, string2, string3, string4,string6,string7,string23,string24)
        }
    }
}