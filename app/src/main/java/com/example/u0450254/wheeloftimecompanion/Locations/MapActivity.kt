package com.example.u0450254.wheeloftimecompanion.Locations

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.TheTwoRivers
import com.example.u0450254.wheeloftimecompanion.Locations.Maps.WorldMap
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 6/14/2018.
 */
class MapActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WorldMapView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTwoRiversView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()
        charview.addView(view1)
        charview.addView(view2)
    }

    fun launchTheTwoRivers(view: View) {
        var intent = Intent(view.context, TheTwoRivers::class.java)
        view.context.startActivity(intent)
    }
    fun launchWorldMap(view: View) {
        var intent = Intent(view.context, WorldMap::class.java)
        view.context.startActivity(intent)
    }
}
