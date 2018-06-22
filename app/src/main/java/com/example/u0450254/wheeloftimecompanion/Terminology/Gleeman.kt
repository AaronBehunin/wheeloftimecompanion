    package com.example.u0450254.wheeloftimecompanion.Terminology

    import android.graphics.Color
    import android.os.Bundle
    import android.support.v7.app.AppCompatActivity
    import android.text.SpannableString
    import android.text.method.LinkMovementMethod
    import android.text.style.RelativeSizeSpan
    import android.widget.TextView
    import com.example.u0450254.wheeloftimecompanion.Progress
    import com.example.u0450254.wheeloftimecompanion.R

    /*
     * Created by u0450254 on 5/23/2018.
     */
    class Gleeman: AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.terminology)

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            var progressFile = openFileInput("Progress")

            val inputString = progressFile.bufferedReader().use { it.readText() }

            val splits = inputString.split("-")

            val progress = Progress(splits[0].toInt(), splits[1].toInt())

            var thisTitle = findViewById<TextView>(R.id.Title)

            thisTitle.text = "Gleeman"

            val terminfo = findViewById<TextView>(R.id.termInfo)
            var string1  = SpannableString("     A traveling storyteller, musisian, juggler, tumbler and all-around entertainer. " +
                    "Known by their trademark cloaks of many-colored patches, they perform mainly in the villages and smaller towns, since larger towns and cities have other entertainments available")

            terminfo.setTextColor(Color.WHITE)

            terminfo.setMovementMethod(LinkMovementMethod.getInstance())

            terminfo.text = string1
        }
    }