package com.example.u0450254.wheeloftimecompanion.Characters.Legends

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import android.widget.*

class EldreneayCarlan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisPortrat = findViewById<ImageView>(R.id.Portrat)
        val thisAge = findViewById<TextView>(R.id.Age)
        val thisAffil = findViewById<TextView>(R.id.Affiliation)
        val thisGender = findViewById<TextView>(R.id.Gender)
        val thisHeight = findViewById<TextView>(R.id.Height)
        val thisWeight = findViewById<TextView>(R.id.Weight)
        val thisHair = findViewById<TextView>(R.id.HairColor)
        val thisEye = findViewById<TextView>(R.id.EyeColor)
        val thisRank = findViewById<TextView>(R.id.Rank)

        thisTitle.text = "Eldrene ay Ellan ay Carlan"
        thisAffil.text = " Affiliation: Legend"

        thisAge.text = " Age: 60(Deceased)"

        thisGender.text = " Gender: Female"
        thisHeight.text = " Height: ?"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: Blonde"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: Queen"

        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Eldrene ay Ellan ay Carlan was the wife of King Aemon al Caar al Thorin and the last queen of lost Manetheren.\n\n")
        val string1_1 = SpannableString("\n     Eldrene ay Ellan ay Carlan was the wife of King Aemon al Caar al Thorin and the last queen of lost Manetheren. She was a beloved figurehead of her people.\n\n")

        val string2 = SpannableString("Appearance and Abilities\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,24,0)

        val string3 = SpannableString("     Historians relate that Eldrene possessed a great beauty. It was said that wherever she went, flowers bloomed at her feet to make her smile.\n\n")

        val string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,7,0)

        val string7 = SpannableString("Trolloc Wars\n\n")
        string7.setSpan(RelativeSizeSpan(1.5f),0,12,0)

        val string8 = SpannableString("     She became the queen of Manetheren at a time when the entire world was at war against the Shadow and she ruled from her country's wondrous capital city, high and secure in the cloud-capped peaks of the Mountains of Mist. Her nation was known to have always been at the forefront of the fighting and it was said that people of other nations referred to Manetheren as \"a thorn to the Dark One's foot and a bramble to his hand\".\n\n")

        val string9 = SpannableString("     Eventually the threat posed by Manetheren required the shadow to focus a large amount of resources towards its extermination. Aemon overextended his military which allowed the shadow to strike at the Manetheren heartland. When the shadow's plans became known to Aemon, he recalled his forces from the Field of Bekkar - site of Manetheren's most recent victory - and back to the Manetheren heartland where they engaged their enemy in a titanic multiple-day struggle that came to be known as the Battle of the Tarendrelle River. Knowing that he could not win the battle unaided, Aemon sent messengers carrying a plea for aid to all the allied powers of the Ten Nations \n\n")

        val string10 = SpannableString("     Aemon's army was unable to halt the advance of the shadow into the Manetheren heartland and he ordered an evacuation of all civilians. It is also said that thousands refused their king's order to flee and instead marched to join Aemon's failing army and pay the price of their homeland with their blood.\n\n")

        val string11 = SpannableString("Eldrene's Death\n\n")
        string11.setSpan(RelativeSizeSpan(1.5f),0,15,0)

        val string12 = SpannableString("     Manetheren's doom was sealed when Aemon's army was driven back to a crossroads which is now known as the intersection of the North Road, the Old Road, and the Quarry Road. In a final desperate last stand, Aemon and his army were overpowered in a one day battle that came to be known as the Battle of Aemon's Field. The moment Aemon perished Eldrene felt the severing of the bond with her beloved husband. Alone in the evacuated capital city she became consumed by grief and thus she began to draw upon the True Source.\n\n")

        val string13 = SpannableString("     Eldrene poured forth devastation at what remained of the Shadow's army. In a display reminiscent of the Breaking of the World, Eldrene destroyed the larger whole of the Shadow's forces - including all the dreadlord generals. Those few shadowspawn that survived fled to be hunted down and exterminated in other nations. But in her final moments Eldrene had drawn to herself more of the One Power than any human could wield unaided and as the enemy generals died, so did she; the fires that consumed her consumed too the empty city of Manetheren, even the stones of it, down to the living rock of the mountains.\n\n")

        thisInfo.setTextColor(Color.WHITE)
        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisPortrat.setImageResource(R.drawable.eldrene)
        }

        if (progress.book==1 && progress.chapter<=9)
        {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1_1,string2,string3,string4,string7,string8,string9,string10,string11,string12,string13)
        }
    }
}