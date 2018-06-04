package com.example.u0450254.wheeloftimecompanion.Organizations

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/29/2018.
 */
class AesSedai: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organization)
        val filename = "Progress"
        val fileContents = "1-1"
        openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        var  progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)
        var thisType = findViewById<TextView>(R.id.type)
        var thisHead = findViewById<TextView>(R.id.Headquarters)
        var thisAllign = findViewById<TextView>(R.id.Allignment)
        var thisAffil = findViewById<TextView>(R.id.Affiliation)

        var thisSymbol = findViewById<ImageView>(R.id.Symbol)

        thisTitle.text = "Aes Sedai"
        thisType.text = "Type: One Power Users"
        thisHead.text = "Headquarters: Tar Valon"
        thisAllign.text = "Allignment: Good"
        thisAffil.text = "Affiliation: Independent"

        thisSymbol.setImageResource(R.drawable.aessedaisymbol)

        var thisInfo = findViewById<TextView>(R.id.charinfo)

        var string1 = SpannableString("Wielders of the One Power. Since the Time of Madness, all surviving Aes Sedai are women." +
                " Widely distrusted and feared, even hated, they are blamed by many for the Breaking of the World, and are generally thought to meddle in the affairs of nations."+
                " At the same time, few rulers will be without an Aes Sedai adviser, even in lands where the existence of such a connection must be kept secret."
        )

        var string2 = SpannableString("Aes Sedai are organized into what is known as the White Tower. Only those women accepted by the White Tower can be called Aes Sedai, and all other channelers are known as wilders."
        +"Aes Sedai, by and large, are trained not only in the Power, but are taught how to manipulate those around them."+
                "Most Aes Sedai tend to place the White Tower's status, authority, and well-being above all other considerations. As such, they are seen as being very self-interested and self-serving. Many Aes Sedai excuse their behavior with the justification that whatever is best for the Tower is best for the world, but needless to say, this outlook is not shared by others. Additionally, the implementation of the Three Oaths, which make Aes Sedai incapable of telling an outright lie, have backfired with regard to their effectiveness. This is due to the fact that Aes Sedai simply use metaphorical doublespeak to circumvent the Oaths, and people are well aware of it."+
                "Most people in the Third Age trust neither the intentions nor the words of an Aes Sedai, and many others outright hate and fear them. Due to their tendency to meddle in the affairs of others, and their poor reputation, the Aes Sedai have many enemies and few allies. They are still very respected in the Borderlands and a Sister is usually chosen as advisor by the rulers of Andor and Cairhien, due their historical links to the Tower, but in most places especially in the south they are unwelcome but tolerated, and in other places, they are even openly deterred or outright banned."
        )
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = string1
    }
}