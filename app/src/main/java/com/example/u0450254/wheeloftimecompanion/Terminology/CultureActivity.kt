package com.example.u0450254.wheeloftimecompanion.Terminology

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.*

class CultureActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiSymbolView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BraidView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GleemanView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OldTongueView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.StonesView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TabacView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WisdomView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        chapview.addView(view1)
        chapview.addView(view2)
        chapview.addView(view3)
        chapview.addView(view4)
        chapview.addView(view5)
        chapview.addView(view6)
        chapview.addView(view7)
    }

    fun launchAesSedaiSymbol(view: View)
    {
        val intent = Intent(view.context, AesSedaiSymbol::class.java)
        view.context.startActivity(intent)
    }
    fun launchBraid(view: View)
    {
        val intent = Intent(view.context, Braid::class.java)
        view.context.startActivity(intent)
    }
    fun launchGleeman(view: View)
    {
        val intent = Intent(view.context, Gleeman::class.java)
        view.context.startActivity(intent)
    }
    fun launchOldTongue(view: View)
    {
        val intent = Intent(view.context, OldTongue::class.java)
        view.context.startActivity(intent)
    }
    fun launchStones(view: View)
    {
        val intent = Intent(view.context, Stones::class.java)
        view.context.startActivity(intent)
    }
    fun launchTabac(view: View)
    {
        val intent = Intent(view.context, Tabac::class.java)
        view.context.startActivity(intent)
    }
    fun launchWisdom(view: View)
    {
        val intent = Intent(view.context, Wisdom::class.java)
        view.context.startActivity(intent)
    }
}