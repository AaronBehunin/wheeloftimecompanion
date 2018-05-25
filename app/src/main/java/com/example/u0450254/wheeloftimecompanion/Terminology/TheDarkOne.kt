package com.example.u0450254.wheeloftimecompanion.Terminology

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/23/2018.
 */
class TheDarkOne: Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())


        var thisTitle = findViewById<TextView>(R.id.Title)

        thisTitle.text = "The Dark One"

        val terminfo = findViewById<TextView>(R.id.terminfo)
        terminfo.text = "The Dark One is a primordial, sapient, cosmic force of evil in the universe. The Dark One's goal is to break the spirits and hearts of whatever sapient beings he can influence, and, if freed from his prison, eventually to remake Creation in his own image. His actions appear to indicate that he is also a force of chaos, destruction, and discord, as many of his underlings seem to place a great deal of emphasis on increasing the amount of chaos in the world at any opportunity. His existence is revealed to be an integral part of human free will, as his malign influence encourages humanity to make selfish choices. If destroyed, humans (and likely other sapient beings) would possibly become completely incapable of evil, violence, or selfishness in any respect." +
                " He is said to have been imprisoned by the Creator at the beginning of time in a separate dimension outside of normal reality, " +
                "and outside of the pattern, and has sought ever since to break free of his prison and destroy the wheel of time and remake the world " +
                "according to his image and purpose, or alternatively, to destroy creation completely. He is currently imprisoned. Additionally, despite " +
                "being referred by both his enemies and his followers as male, the Dark One is not a person, but a sapient force, therefore completely " +
                "beyond the concept of sex or gender, and can be more accurately referred to as \"it\". However, as with the Creator, people tend to simply use male pronouns to refer to the Dark One."

        terminfo.setTextColor(Color.WHITE)


    }


}
