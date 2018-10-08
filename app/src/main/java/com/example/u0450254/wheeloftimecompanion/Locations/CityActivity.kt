package com.example.u0450254.wheeloftimecompanion.Locations

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.*
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Illian
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

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BaerlonView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CaemlynView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DevenRideView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LugardView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PaaranDisenView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarenFerryView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WatchHillView)

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
        var intent = Intent(view.context, Baerlon::class.java)
        view.context.startActivity(intent)
    }
    fun launchDevenRide(view: View)
    {
        var intent = Intent(view.context, DevenRide::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        var intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchPaaranDisen(view: View)
    {
        var intent = Intent(view.context, PaaranDisen::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarenFerry(view: View)
    {
        var intent = Intent(view.context, TarenFerry::class.java)
        view.context.startActivity(intent)
    }
    fun launchWatchHill(view: View)
    {
        var intent = Intent(view.context, WatchHill::class.java)
        view.context.startActivity(intent)
    }
    fun launchCaemlyn(view: View) {
        var intent = Intent(view.context, Caemlyn::class.java)
        view.context.startActivity(intent)
    }
    fun launchLugard(view: View) {
        var intent = Intent(view.context, Lugard::class.java)
        view.context.startActivity(intent)
    }
}