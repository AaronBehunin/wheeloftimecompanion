package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.R

class Manetherendrelle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmarks)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val thisTitle = findViewById<TextView>(R.id.Title)
        val thisMap = findViewById<ImageView>(R.id.locImage)

        thisTitle.text = "Mantherendrelle"

        thisMap.setImageResource(R.drawable.mantherenmap)

        val thisInfo = findViewById<TextView>(R.id.landInfo)

        val string1 = SpannableString("\n     The River Manetherendrelle is one of the primary waterways of the Westlands. " +
                "Together with its major tributary, the Arinelle, this river dominates much of the central-western region of the continent and keeps those lands fertile.\n\n")

        val string2 = SpannableString("    The Manetherendrelle itself rises in the Mountains of Mist at the extreme south-western tip of the Two Rivers district of Andor. " +
                "Its initial course along the southern border of the Two Rivers is marked by rapids, which cause the water to foam and gives the river its local name of the White River.\n\n")

        val string3 = SpannableString("     The Tarendrelle joins the Manetherendrelle further east before it is also joined by the Arinelle some distance south of Whitebridge. " +
                "The river then turns south and flows for several hundred miles through Altara, along the border of Murandy and through Illian before meeting the Sea of Storms at the City of Illian.\n\n")

        val string4 = SpannableString("     Between the Manetherendrelle and Arinelle, it is possible to sail from Maradon, the capital of Saldaea, all the way to Illian, a distance of approximately three thousand miles.\n\n")
        thisInfo.setTextColor(Color.WHITE)

        thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

        thisInfo.text = TextUtils.concat(string1,string2,string3,string4)
    }
}