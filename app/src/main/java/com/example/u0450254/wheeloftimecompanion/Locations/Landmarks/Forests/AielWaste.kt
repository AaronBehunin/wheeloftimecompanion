package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests

    import android.graphics.Color
    import android.os.Bundle
    import android.support.v7.app.AppCompatActivity
    import android.text.SpannableString
    import android.text.method.LinkMovementMethod
    import android.widget.TextView
    import com.example.u0450254.wheeloftimecompanion.Progress
    import com.example.u0450254.wheeloftimecompanion.R


/*
 * Created by u0450254 on 5/18/2018.
 */


class AielWaste : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.terminology)

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            val  progressFile = openFileInput("Progress")

            val inputString = progressFile.bufferedReader().use { it.readText() }


            val splits = inputString.split("-")

            val progress = Progress(splits[0].toInt(), splits[1].toInt())

            val thisTitle = findViewById<TextView>(R.id.Title)

            thisTitle.text = "Aiel Waste"

            var thisInfo = findViewById<TextView>(R.id.termInfo)

            var string1 = SpannableString("\n      The Aiel Waste is a desert region to the east of the Spine of the World. It is bordered on the east by an expansive and exotic land known as Shara. The Aiel waste is so inhospitable that only the hardy Aiel can survive for extended periods there.\n\n")
            thisInfo.setTextColor(Color.WHITE)

            thisInfo.setMovementMethod(LinkMovementMethod.getInstance());

            thisInfo.text = string1
    }
}