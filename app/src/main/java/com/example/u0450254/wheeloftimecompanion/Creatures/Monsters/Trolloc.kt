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
class Trolloc: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creatures)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisPicture = findViewById<ImageView>(R.id.creaturePic)



        thisTitle.text = "Trolloc"

        val terminfo = findViewById<TextView>(R.id.creatureInfo)
        var string1  = SpannableString("\n     A Trolloc is a type of Shadowspawn created in the Age of Legends that comprises the bulk of the Dark One's armies. A crossing of human and animal stock, their physical characteristics are a blending of both lineages, horrifying almost all that come in contact with them.\n\n")
        var string1_1 = SpannableString("\n     A Trolloc is a type of Shadowspawn created in the Age of Legends that comprises the bulk of the Dark One's armies. A crossing of human and animal stock, their physical characteristics are a blending of both lineages, horrifying almost all that come in contact with them. While capable of speech, they possess an intellect inferior to that of other sentient races and have proven difficult to utilize in battle unless supervised. They are carnivorous, sadistic, fearful, and violent. Unlike other Shadowspawn, Trollocs are social creatures, grouped by several distinct tribes and capable of cruel and twisted humor.\n\n")

        var string2 = SpannableString("Characteristics\n\n")
        string2.setSpan(RelativeSizeSpan(2f), 0,15,0)

        var string3 = SpannableString("     A Trolloc is a humanoid creature with both animal and human physical features. A Trolloc has an animal-like snout, beak, or head, hoofed feet, feathers, or oversized rough hands with thick nails. Much as height and hair color differs between humans, so does the line between animal and human vary amongst individual Trollocs. Some have feet capable of wearing boots, while others have legs far more like a goat, hoofed and unable to wear shoes. Trollocs are significantly larger, taller, and stronger than most humans, being more on par with the Ogier in size. Some can track a person by scent or sound. They see better than a man in the dark.\n\n")
        var string3_1 = SpannableString("     A Trolloc is a humanoid creature with both animal and human physical features. A Trolloc has an animal-like snout, beak, or head, hoofed feet, feathers, or oversized rough hands with thick nails. Much as height and hair color differs between humans, so does the line between animal and human vary amongst individual Trollocs. Some have feet capable of wearing boots, while others have legs far more like a goat, hoofed and unable to wear shoes. Trollocs are significantly larger, taller, and stronger than most humans, being more on par with the Ogier in size. Their carnivorous, indiscriminate appetite is well known. Some can track a person by scent or sound. They see better than a man in the dark.\n\n")

        var string4 = SpannableString("     Mentally, Trollocs share more in common with the Shadow than an average human. They are cruel and sadistic, often killing simply for pleasure or for the act itself. A Trolloc's intelligence can vary from one creature to the next, but it is invariably much lower than the human stock from which it descends. Additionally, despite their strength and size, their combat effectiveness is questionable.\n\n")

        var string5 = SpannableString("     Trollocs are fearful creatures, with self-preservation generally being one of the only reasons they abstain from violence and killing. \n\n")
        var string5_1 = SpannableString("     Trollocs are fearful creatures, with self-preservation generally being one of the only reasons they abstain from violence and killing. To some extent they fear, and hate, wolves\n\n")

        var string27 = SpannableString("Eating Habits\n\n")
        string27.setSpan(RelativeSizeSpan(2f), 0,13,0)

        var string28 = SpannableString("     Trollocs are largely carnivores, eating any meat they can acquire.\n\n")

        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = string1

        if (progress.book>1||(progress.book==1&&progress.chapter>5))
        {
            thisPicture.setImageResource(R.drawable.trollocs)
            terminfo.text = TextUtils.concat(string1_1,string2,string3,string4,string5)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>7))
        {
            terminfo.text = TextUtils.concat(string1_1,string2,string3_1,string4,string5,string27,string28)
        }
        if (progress.book>1||(progress.book==1&&progress.chapter>10))
        {
            terminfo.text = TextUtils.concat(string1_1,string2,string3_1,string4,string5_1,string27,string28)
        }


    }
}