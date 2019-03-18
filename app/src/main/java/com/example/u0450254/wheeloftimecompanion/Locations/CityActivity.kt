package com.example.u0450254.wheeloftimecompanion.Locations

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.*
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/30/2018.
 */
class CityActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val charview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BaerlonView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CaemlynView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DevenRideView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LugardView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PaaranDisenView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarenFerryView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WatchHillView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
        charview.addView(view7)
        charview.addView(view8)
    }

    fun launchBaerlon(view: View)
    {
        val intent = Intent(view.context, Baerlon::class.java)
        view.context.startActivity(intent)
    }
    fun launchCaemlyn(view: View) {
        val intent = Intent(view.context, Caemlyn::class.java)
        view.context.startActivity(intent)
    }
    fun launchDevenRide(view: View)
    {
        val intent = Intent(view.context, DevenRide::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        val intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchLugard(view: View) {
        val intent = Intent(view.context, Lugard::class.java)
        view.context.startActivity(intent)
    }
    fun launchPaaranDisen(view: View)
    {
        val intent = Intent(view.context, PaaranDisen::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarenFerry(view: View)
    {
        val intent = Intent(view.context, TarenFerry::class.java)
        view.context.startActivity(intent)
    }
    fun launchWatchHill(view: View)
    {
        val intent = Intent(view.context, WatchHill::class.java)
        view.context.startActivity(intent)
    }
}