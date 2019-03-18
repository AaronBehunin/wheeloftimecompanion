package com.example.u0450254.wheeloftimecompanion.Terminology

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.*

class EventsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ageoflegendsView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelTineView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheBreakingoftheWorldView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.FieldofBekkarView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ShiningWallsBattleView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SundayView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BattleTarendrelleView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ThirdAgeView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TimeofMadnessView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocWarsView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HundredYearsWarView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinternightView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        chapview.addView(view1)
        chapview.addView(view2)
        chapview.addView(view3)
        chapview.addView(view4)
        chapview.addView(view5)
        chapview.addView(view6)
        chapview.addView(view7)
        chapview.addView(view8)
        chapview.addView(view9)
        chapview.addView(view10)
        chapview.addView(view11)
        chapview.addView(view12)
    }
    fun launchAgeofLegends(view: View)
    {
        val intent = Intent(view.context, AgeofLegends::class.java)
        view.context.startActivity(intent)
    }
    fun launchBelTine(view: View)
    {
        val intent = Intent(view.context, BelTine::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheBreakingoftheWorld(view: View)
    {
        val intent = Intent(view.context, TheBreakingoftheWorld::class.java)
        view.context.startActivity(intent)
    }
    fun launchShiningWallsBattle(view: View)
    {
        val intent = Intent(view.context, ShiningWallsBattle::class.java)
        view.context.startActivity(intent)
    }
    fun launchFieldofBekkar(view: View)
    {
        val intent = Intent(view.context, FieldofBekkar::class.java)
        view.context.startActivity(intent)
    }
    fun launchSunday(view: View)
    {
        val intent = Intent(view.context, Sunday::class.java)
        view.context.startActivity(intent)
    }
    fun launchBattleTarendrelle(view: View)
    {
        val intent = Intent(view.context, BattleTarendrelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchThirdAge(view: View)
    {
        val intent = Intent(view.context, ThirdAge::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrollocWars(view: View)
    {
        val intent = Intent(view.context, TrollocWars::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinternight(view: View)
    {
        val intent = Intent(view.context, Winternight::class.java)
        view.context.startActivity(intent)
    }
    fun launchHundredYearsWar(view: View)
    {
        val intent = Intent(view.context, HundredYearsWar::class.java)
        view.context.startActivity(intent)
    }
}