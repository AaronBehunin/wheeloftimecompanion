package com.example.u0450254.wheeloftimecompanion.Terminology

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.*

/*
 * Created by u0450254 on 6/5/2018.
 */


class CultureActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiSymbolView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BraidView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GleemanView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.StonesView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TabacView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        chapview.addView(view1)
        chapview.addView(view2)
        chapview.addView(view3)
        chapview.addView(view4)
        chapview.addView(view5)
    }

    fun launchAesSedaiSymbol(view: View)
    {
        var intent = Intent(view.context, AesSedaiSymbol::class.java)
        view.context.startActivity(intent)
    }
    fun launchBraid(view: View)
    {
        var intent = Intent(view.context, Braid::class.java)
        view.context.startActivity(intent)
    }
    fun launchGleeman(view: View)
    {
        var intent = Intent(view.context, Gleeman::class.java)
        view.context.startActivity(intent)
    }
    fun launchStones(view: View)
    {
        var intent = Intent(view.context, Stones::class.java)
        view.context.startActivity(intent)
    }
    fun launchTabac(view: View)
    {
        var intent = Intent(view.context, Tabac::class.java)
        view.context.startActivity(intent)
    }

}