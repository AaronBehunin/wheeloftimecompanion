package com.example.u0450254.wheeloftimecompanion.Characters

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Aginor
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Ishamael
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Narg
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.PadanFain
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/30/2018.
 */
class EnemyCharacterActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AginorView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ishamaelView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.NargView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)

        if (progress.book>1||(progress.book==1 &&progress.chapter >10))
        {
            charview.addView(view3)
        }
        charview.addView(view4)
    }
    fun launchIshamael(view: View)
    {
        var intent = Intent(view.context, Ishamael::class.java)
        view.context.startActivity(intent)
    }
    fun launchPadanFain(view: View)
    {
        var intent = Intent(view.context, PadanFain::class.java)
        view.context.startActivity(intent)
    }
    fun launchAginor(view: View)
    {
        var intent = Intent(view.context, Aginor::class.java)
        view.context.startActivity(intent)
    }
    fun launchNarg(view: View)
    {
        var intent = Intent(view.context, Narg::class.java)
        view.context.startActivity(intent)
    }
}