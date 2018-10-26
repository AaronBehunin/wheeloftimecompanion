package com.example.u0450254.wheeloftimecompanion.Terminology.Events

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


class BattleTarendrelle: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Battle of the Tarendrelle"

        val terminfo = findViewById<TextView>(R.id.termInfo)
        var string1 = SpannableString("\n     The Battle of the Tarendrelle River was a conflict that occurred in the middle years of the Trolloc Wars between the nation of Manetheren and a vast host of Shadowspawn.\n\n")

        var string1_1 = SpannableString("The Battle of the Tarendrelle River was a conflict that occurred in the middle years of the Trolloc Wars between the nation of Manetheren and a vast host of Shadowspawn. " +
                "It resulted in a victory for the forces of Shadow and led to the subsequent invasion and destruction of Manetheren.\n\n")

        var string2 = SpannableString("Background\n\n")
        string2.setSpan(RelativeSizeSpan(2f),0,10,0)

        var string3 = SpannableString("     Two centuries of conflict saw many heated battles between the armies of shadow and the forces of Light. " +
                "Foremost of the champions of the light was the nation of Manetheren, oft described as \"A thorn to the Dark One's foot and a bramble to his hand\".\n\n")

        var string4 = SpannableString("     In the middle years of the Trolloc Wars, circa 1200 AB, Manetheren was ruled by King Aemon al Caar al Thorin and his queen Eldrene ay Ellan ay Carlan. " +
                "King Aemon was regarded as brilliant military strategist, a powerful leader, and a shrewd gambler. " +
                "For years he answered pleas for aid from allied nations under assault by Dreadlord armies, repeatedly turning the tides of war towards the Light.\n\n")

        var string5 = SpannableString("     King Aemon's final victory occurred many leagues from his national borders upon the Field of Bekkar, known forever afterward as the Field of Blood.\n\n")

        var string6 = SpannableString("Prelude to Battle\n\n")
        string6.setSpan(RelativeSizeSpan(2f),0,17,0)

        var string7 = SpannableString("     Aemon immediately saw the peril Manetheren faced when the Shadow's plans were made known to him. Without hesitation or thought for the distance they must travel, the king's army marched from Bekkar, still covered in dust and sweat and blood. " +
                "Day and night they traveled and it is said that no man of them could sleep whilst danger threatened their homeland. " +
                "Aemon sent forth his swiftest riders to plead for aid.  " +
                "His messengers returned declaring that reinforcements would be dispatched from various allies but his army would have to resist the forces of shadow for three days before aid could arrive. " +
                "Aemon marched his army to the major east-west road leading into the heart of Manetheren and, on the east banks of the Tarendrelle River, arrayed his force to block their path and prevent the invaders from accessing two strategically important bridges.\n\n")

        var string8 = SpannableString("Deployemnt and dispotision of forces\n\n")
        string8.setSpan(RelativeSizeSpan(2f),0,36,0)

        var string9 = SpannableString("The forces of the Shadow.\n\n")
        string9.setSpan(RelativeSizeSpan(1.5f),0,24,0)

        var string10 = SpannableString("     Histories researched by Moiraine Damodred relate that the armies of shadow counted in the \"tens of tens of thousands\" and were surrounded by a sky \"blackened with ravens\".\n\n")
        terminfo.setTextColor(Color.WHITE)

        var string12 = SpannableString("The forces of the Light\n\n")
        string12.setSpan(RelativeSizeSpan(1.5f),0,23,0)

        var string13 = SpannableString("     Impressively, the king himself was present on the battlefield. " +
                "Common civilians from the heartland of Manetheren began to arrive ten days after the battle commenced, further swelling its ranks and providing additional manpower as soldiers and archers fell. " +
                "It is unknown exactly how many common folk joined their brethren in battle. " +
                "What is known is that they ranged from shepherds with bows, to farmers with pitchforks, to woodsmen with axes. " +
                "It is even said that women came to the battlefield to fight and die alongside their husbands.\n\n")

        var string18 = SpannableString("The Battle\n\n")
        string18.setSpan(RelativeSizeSpan(2f),0,10,0)

        var string19 = SpannableString("     King Aemon arranged his troops in a defensive position blocking the bridges. The battle began that morning.\n\n")

        var string20 = SpannableString("Days one to three\n\n")
        string20.setSpan(RelativeSizeSpan(1.5f),0,17,0)

        var string21 = SpannableString("     Historical accounts of the battle relate that both armies felt at first that the forces of shadow would overwhelm the army of Manetheren. " +
                "But the knowledge that they were fighting on home soil coupled with a belief that aid was coming gave the Manetheren soldiers strength of body and will to persevere. " +
                "Hour by hour, they held their ground against waves of Trollocs that should have destroyed them. " +
                "For three days the men fought, and though the fields east of the Tarendrelle became a butcher's yard, no crossing of the river did they yield.\n\n")

        var string22 = SpannableString("Days four through nine\n\n")
        string22.setSpan(RelativeSizeSpan(1.5f),0,22,0)

        var string23 = SpannableString("     By the fourth day of battle Aemon began to suspect that no aid was coming. " +
               "But even so, the men of Manetheren fought on. Four days became six, and six became eight, and by the end of the ninth day King Aemon knew he had been betrayed. " +
                "His forces were diminished and he could hold the eastern riverbanks no longer. " +
                "Thus Aemon sent forth riders with orders to evacuate civilians from his nation's heartland, and he ordered a retreat across the bridges.\n\n")

        var string24 = SpannableString("Day ten\n\n")
        string24.setSpan(RelativeSizeSpan(1.5f),0,7,0)

        var string25 = SpannableString("      On the dark of morning on the tenth day the Army of Manetheren completed its withdrawal across the bridges before destroying them.\n\n")


        var string26 = SpannableString("Days eleven - conclusion\n\n")
        string26.setSpan(RelativeSizeSpan(1.5f),0,24,0)

        var string27 = SpannableString("     History records that civilians - who had ignored their king's order to flee - began to arrive on the battlefield. " +
                "First in a trickle, and then in a flood thousands of people came to stand shoulder-to-shoulder with the infantry and pay the price of their homeland with their blood.\n\n")

        var string28 = SpannableString("Aftermath\n\n")
        string28.setSpan(RelativeSizeSpan(2f),0,9,0)

        var string29 = SpannableString("     After a day of battle the king,  However, the result was a Pyrrhic Victory for the forces of shadow, for when Queen Eldrene felt her husband perish via the bond they shared she became overwhelmed with grief and poured forth devastation to consume what remained of the shadow's army. " +
                "In a display reminiscent of the Breaking of the World, all of the dreadlords perished in flame and the surviving shadowspawn were scattered. " +
                "But in her final moments Eldrene had drawn to herself more of the One Power than any human could wield unaided and as the enemy generals died, " +
                "so did she; the fires that consumed her consumed too the empty city of Manetheren, even the stones of it, down to the living rock of the mountains.\n\n")

        var string30 = SpannableString("Legacy\n\n")
        string30.setSpan(RelativeSizeSpan(2f),0,6,0)

        var string31 = SpannableString("     The Battle of the Tarendrelle River left a lasting impression upon those who would later return to populate Manetheren. " +
                "The currents of the Tarendrelle have long since washed away the ruins of the bridges and the road leading from the battlefield to Aemon's Field (now called Emond's Field) is gone, erased by the bewildering tangles of the Waterwood. " +
                "The people of the Two Rivers, as the area has come to be called, are known for an intense streak of stubbornness, a legacy of the hardships created by the Trolloc Wars and their fierce Manetheren blood. " +
                "Outsiders to the region often remark that Two Rivers folk can \"give mules lessons and teach stones\".\n\n")
        if (progress.book==1&&progress.chapter<=9)
        {
            terminfo.text = string1
        }
        else if (progress.book>1 || (progress.book==1&&progress.chapter>9))
        {
            terminfo.text = TextUtils.concat(string1_1,string2,string3,string4,string5,string6,string7,string8,string9,string10,
                    string12,string13,string18,string19,string20,
                    string21,string22,string23,string24,string25,string26,string27,string28,string29,string30,
                    string31)
        }
    }
}