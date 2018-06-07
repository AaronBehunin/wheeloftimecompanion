package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

class AielWaste: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "Aiel Waste"

        val terminfo = findViewById<TextView>(R.id.Title)
        terminfo.text = "     The Aiel Waste is a desert region to the east of the Spine of the World. It is bordered on the east by an expansive and exotic land known as Shara. The Aiel waste is so inhospitable that only the hardy Aiel can survive for extended periods there.\n" +
                "\n" +
                "     The Aiel call the Waste the \"Three-fold Land,\" referring to the gifts the harsh land gives to the Aiel people. The gifts to the Aiel are: a shaping stone to make them, a testing ground to prove their worth, and a punishment for their sin. Aiel prophecy states that the Aiel will leave the Waste once the Stone of Tear falls.\n" +
                "\n" +
                "    Trollocs call the Aiel Waste \"Djevik K'Shar\" in their native tongue, meaning \"The Dying Ground.\" The waste is home to many animal species; some of which are unique to this desert region and all which seem dangerous to humans in some way. The books have mentioned lions, warthogs, several types of venomous snake, and a type of lizard similar to a gila monster can all be found there.\n" +
                "\n" +
                "    The southern part of the Aiel Waste just north of the Sea of Storms is called the Termool. It is so dry, barren, and desolate that not even the Aiel travel there."
        terminfo.setTextColor(Color.WHITE)
    }
}
