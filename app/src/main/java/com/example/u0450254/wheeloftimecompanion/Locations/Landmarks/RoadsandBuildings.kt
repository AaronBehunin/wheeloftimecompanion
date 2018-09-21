package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.*
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/30/2018.
 */
class RoadsandBuildings: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.NorthRoadView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OldRoadView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.QuarryRoadView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WagonBridgeView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringInnView)



        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
    }

    fun launchNorthRoad(view: View) {
        var intent = Intent(view.context, NorthRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchOldRoad(view: View) {
        var intent = Intent(view.context, OldRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchQuarryRoad(view: View) {
        var intent = Intent(view.context, QuarryRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchWagonBridge(view: View) {
        var intent = Intent(view.context, WagonBridge::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringInn(view: View) {
        var intent = Intent(view.context, WinespringInn::class.java)
        view.context.startActivity(intent)
    }
}