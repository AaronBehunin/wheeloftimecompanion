package com.example.u0450254.wheeloftimecompanion.Creatures.Monsters

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
 * Created by u0450254 on 5/23/2018.
 */
class Myrddraal: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creatures)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisPicture = findViewById<ImageView>(R.id.creaturePic)

        thisTitle.text = "Myrddraal"

        val terminfo = findViewById<TextView>(R.id.creatureInfo)
        val string1  = SpannableString("\n     Myrddraal are Shadowspawn, muscular and serpent-quick, with lank black hair and waxy white skin.\n\n")
        val string1_1  = SpannableString("\n     Myrddraal are Shadowspawn, muscular and serpent-quick, with lank black hair and waxy white skin. They have no eyes, but can \"see\" with perfect clarity.\n\n")

        val string2 = SpannableString("Nature\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0,6,0)


        val string5 = SpannableString("Appearance and Abilities\n\n")
        string5.setSpan(RelativeSizeSpan(1.5f), 0,25,0)

        val string6 = SpannableString("     Myrddraal wear black armor with overlapping scales, and black cloaks which do not stir in the wind. They are able to move between, or disappear into, shadows.\n\n")

        val string8 = SpannableString("Combat\n\n")
        string8.setSpan(RelativeSizeSpan(2f), 0,6,0)

        val string10 = SpannableString("     Myrddraal are most often seen leading fists of Trollocs.\n\n")

        val string11 = SpannableString("Weapons\n\n")
        string11.setSpan(RelativeSizeSpan(1.5f), 0,7,0)
        val string13 = SpannableString("     A major weapon in a Myrddraal's arsenal is fear. Myrddraal have the innate ability to instill stark terror in anyone they gaze upon: \"The look of the Eyeless is fear,\" as Borderlanders say.\n\n")
        val string18 = SpannableString("Other Names\n\n")
        string18.setSpan(RelativeSizeSpan(2f), 0,11,0)

        val string19 = SpannableString("Halfman,\nThe Eyeless,\nShadowman,\nLurk (Tear),\nFade\n\n     In most nations, they are treated about as seriously as bogeymen, but those in the Borderlands or who have had the misfortune to encounter them know better.")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        if (progress.book==1&&progress.chapter<=8)
        {
            terminfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>8))
        {
            thisPicture.setImageResource(R.drawable.fade)
            terminfo.text = TextUtils.concat(string1_1,string2,string5,string6,string8,string10,string11,string13,string18,string19)
        }
    }
}