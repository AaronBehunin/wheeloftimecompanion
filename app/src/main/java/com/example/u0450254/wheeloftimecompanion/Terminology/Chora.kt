package com.example.u0450254.wheeloftimecompanion.Terminology

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.RelativeSizeSpan
import android.widget.ScrollView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/31/2018.
 */


class Chora: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        var jump:Int = intent.getIntExtra("Jump", 0)


        var scrollView = findViewById<ScrollView>(R.id.orgScroll)

        var h = Handler();

        h.postDelayed(Runnable() {

            scrollView.scrollTo(0, jump);

        }, 250); // 250 ms delay

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Chora"

        val terminfo = findViewById<TextView>(R.id.termInfo)


        val string1 = SpannableString("     Chora trees are large, living, tree-like constructs with trefoil-shaped leaves, created during the Age of Legends. It is said that they emitted a sense of peace for any who passed below their branches. They were grown in abundant quantities in the cities of old, especially in V'saine and Paaran Disen. They are grown by the songs of the Ogier and Nym.[verify]\n" +
                "\n" +
                "     During the reign of Alvera Ramosanya, the Aiel gave the Cairhienin a chora sapling thanking for the water their ancestor were given by those of the Cairhienin.\n\n")

        val string2 = SpannableString("Avendesora\n\n     The last-existing chora tree, found growing in Rhuidean means \"Tree of Life\" in the Old Tongue.\n\n")

        string2.setSpan(RelativeSizeSpan(2f), 0,10, 0 )

        val string3 = SpannableString("Avendoraldera\n\n" +
                "     Avendoraldera was a sapling from Avendesora presented by the Aiel to Cairhien in 509 NE. It was a gift given to the people of the new city because the Aiel had determined that Cairhienin ancestors had provided their ancestors with water shortly after the Breaking. It was therefore a gift given to the city of Cairhien to satisfy the Aiel sense of honor for the aid they received when all other hands had turned against them. Along with the sapling, Cairhienin merchants were given free passage across the Aiel Waste provided they displayed the proper banners. In the histories, there are indications that Cairhien had no idea why they were privileged with such treasures or privileges.\n" +
                "\n" +
                "     Avendoraldera grew for four hundred years before King Laman cut it down with a mind to use its wood to build himself a magnificent and unique throne, thus precipitating the Aiel War and earning the Cairhienin citizens the Aiel epithet, \"tree-killer.\"\n" +
                "\n")

        string3.setSpan(RelativeSizeSpan(2f), 0,13, 0 )

        val string4 = SpannableString("Tarabonn\n\n"+
                "     It is said that a third chora tree survived for many centuries in the territory that now is held by Tarabon. An image of this tree is still today in the banner of Tarabon.")

        string4.setSpan(RelativeSizeSpan(2f), 0,8, 0 )
        terminfo.setTextColor(Color.WHITE)

        terminfo.setMovementMethod(LinkMovementMethod.getInstance())

        terminfo.text = TextUtils.concat(string1,string2, string3,string4)
    }
}