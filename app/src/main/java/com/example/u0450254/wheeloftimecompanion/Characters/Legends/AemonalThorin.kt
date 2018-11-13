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

class AemonalThorin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val progressFile = openFileInput("Progress")

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

        thisTitle.text = "Aemon al Caar al Thorin"
        thisAffil.text = " Affiliation: Legend"

        thisAge.text = " Age: 45(Deceased)"

        thisGender.text = " Gender: Male"
        thisHeight.text = " Height: 6'0+"
        thisWeight.text = " Weight: ?"
        thisHair.text = " Hair Color: ?"
        thisEye.text = " Eye Color: ?"
        thisRank.text = " Rank: King"

        val thisInfo = findViewById<TextView>(R.id.charinfo)

        val string1 = SpannableString("\n     Aemon al Caar al Thorin was the husband of Eldrene ay Ellan ay Carlan and the last King of lost Manetheren.\n\n")
        val string1_1 = SpannableString("\n     Aemon al Caar al Thorin (translated from the Old Tongue as Aemon, son of Caar, son of Thorin) was the husband of Eldrene ay Ellan ay Carlan and the last King of lost Manetheren. " +
                "He was a warrior of exceptional ability and a revered ruler of his people. " +
                "His father was Caar al Thorin al Toren.\n\n")

        val string2 = SpannableString("Appearance and Abilities\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,24,0)

        val string3 = SpannableString("     Aemon was renowned throughout the Ten Nations for his unmatched courage. Aemon's greatest love - his wife Queen Eldrene - was a beloved figurehead of their people. Together they represented bravery and beauty and wisdom and a love that death could not sunder.\n\n")

        val string4 = SpannableString("History\n\n")
        string4.setSpan(RelativeSizeSpan(2f),0,7,0)

        val string8 = SpannableString("The Trolloc Wars\n\n")
        string8.setSpan(RelativeSizeSpan(1.5f),0,16,0)

        val string9 = SpannableString("     Wherever men fought the forces of the Dark One, the Red Eagle of Manetheren was always at the fore. For their perseverance and courage, the Army of Manetheren became known as a thorn to the Dark one's foot, and a bramble to his hand and Manetheren itself as the sword that could not be broken.\n\n")

        val string11 = SpannableString("     Despite the one-sided slaughter that Aemon's soldiers had visited upon their enemy, he had overextended his military forces, providing an opportunity for Shadowspawn armies to assault the very heartland of Manetheren.\n\n")

        val string12 = SpannableString("The Fall of Manetheren\n\n")
        string12.setSpan(RelativeSizeSpan(1.5f),0,22,0)

        val string13 = SpannableString("     Aemon immediately saw the peril Manetheren faced when the Shadow's plans were made known to him. Without hesitation or thought for the distance they must travel, the king's army marched from Bekkar, still covered in dust and sweat and blood. Day and night they traveled and it is said that no man of them could sleep whilst danger threatened their homeland. " +
                " Aemon sent forth his swiftest riders to plead for aid from those of the Ten Nations that remained.  His messengers returned declaring that reinforcements would be dispatched from various allies but his army would have to resist the forces of shadow for three days before aid could arrive. "+
                " After learning that his enemy planned to invade from the east, Aemon marched his army to the major east-west road leading into the heart of Manetheren and, on the east banks of the Tarendrelle River, arrayed his force to block their path and prevent the invaders from accessing two strategically important bridges. Thus began the legendary Battle of the Tarendrelle River.\n\n")

        val string14 = SpannableString("     On the first day of battle Aemon's army was outnumbered 10:1. But the knowledge that they were fighting on home soil coupled with a belief that aid was coming gave the Manetheren soldiers strength of body and will to persevere. Hour by hour, they held their ground against waves of Trollocs that should have destroyed them. For three days the men fought, and though the fields east of the Tarendrelle became a butcher's yard, no crossing of the river did they yield." +
                "  Four days became six, and six became eight, and by the end of the ninth day King Aemon knew he had been betrayed. His forces were diminished and he could hold the eastern riverbanks no longer. Thus Aemon sent forth riders with orders to evacuate civilians from his nation's heartland, and he ordered a retreat across the bridges. In the dark of morning on the tenth day the Army of Manetheren completed its withdrawal across the bridges before destroying them." +
                " History records that it was in this final desperate defense that civilians began to arrive on the battlefield. First in a trickle, and then in a flood thousands of people came to stand shoulder-to-shoulder with Aemon's infantry and pay the price of their homeland with their blood.\n\n")

        val string15 = SpannableString("Aemon's Death\n\n")
        string15.setSpan(RelativeSizeSpan(1.5f),0,13,0)

        val string16 = SpannableString("     Despite their heroic courage and unbelievable sacrifices, Aemon's army was greatly diminished and began to be pushed back into the heartland of Manetheren. This fighting retreat eventually ended at an intersection of roads now called the North Road, the Old Road, and the Quarry Road. It was at a field near these crossroads that Aemon rallied his forces and led a final stand. After a day of battle the king, and the remainder of his army combined with civilian volunteers, fell to overwhelming forces in a struggle that came to be known as the Battle of Aemon's Field." +
                " When Queen Eldrene felt her husband perish she became overwhelmed with grief and poured forth devastation and balefire to consume what remained of the shadow's army. In a display reminiscent of the Breaking of the World, all of the dreadlords died in flame and the few surviving shadowspawn were scattered. But in her final moments Eldrene had drawn to herself more of the One Power than any human could wield unaided and as the enemy generals died, so did she; the fires that consumed her consumed too the empty city of Manetheren, even the stones of it, down to the living rock of the mountains.\n\n")

        val string17 = SpannableString("Legacy\n\n")
        string17.setSpan(RelativeSizeSpan(2f),0,6,0)

        val string24 = SpannableString("     Beyond geography, the people of the Two Rivers are known for an intense streak of stubbornness, a legacy of the hardships created by the Trolloc Wars and their fierce Manetheren blood. Outsiders to the region often remark that Two Rivers folk can \"give mules lessons and teach stones\".")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        if (progress.book==1&&progress.chapter<=9)
        {
            thisInfo.text = string1
        }
        else if (progress.book>1||(progress.book==1&&progress.chapter>9))
        {
            thisInfo.text = TextUtils.concat(string1_1,string2,string3,string4,string8,string9,
                    string11,string12,string13,string14,string15,string16,string17,
                    string24)
        }
    }
}