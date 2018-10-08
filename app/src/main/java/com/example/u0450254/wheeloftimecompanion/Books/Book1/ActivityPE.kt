package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Ishamael
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.LewsTherin
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.AesSedaiSymbol
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.*

class ActivityPE : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)


        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.lewsView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ishamaelView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiSymbolView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheOnePowerView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SaidinView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TaintView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WheelofTimeView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        chapview.addView(view1)
        chapview.addView(view2)
        chapview.addView(view3)
        chapview.addView(view4)
        chapview.addView(view5)
        chapview.addView(view6)
        chapview.addView(view7)
    }
    fun launchLewsTherin(view: View)
    {
        val intent = Intent(view.context, LewsTherin::class.java)
        view.context.startActivity(intent)
    }
    fun launchIshamael(view: View)
    {
        val intent = Intent(view.context, Ishamael::class.java)
        view.context.startActivity(intent)
    }

    fun launchAesSedaiSymbol(view: View)
    {
        var intent = Intent(view.context, AesSedaiSymbol::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheOnePower(view: View)
    {
        var intent = Intent(view.context, TheOnePower::class.java)
        view.context.startActivity(intent)
    }
    fun launchSaidin(view: View)
    {
        var intent = Intent(view.context, Saidin::class.java)
        view.context.startActivity(intent)
    }
    fun launchTaint(view: View)
    {
        var intent = Intent(view.context, Taint::class.java)
        view.context.startActivity(intent)
    }
    fun launchWheelofTime(view: View)
    {
        var intent = Intent(view.context, WheelofTime::class.java)
        view.context.startActivity(intent)
    }
}