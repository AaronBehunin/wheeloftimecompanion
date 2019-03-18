package com.example.u0450254.wheeloftimecompanion.Locations

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Maps.BaerlonMap
import com.example.u0450254.wheeloftimecompanion.Locations.Maps.EmondsFieldMap
import com.example.u0450254.wheeloftimecompanion.Locations.Maps.TwoRiversMap
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

        val charview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WorldMapView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BaerlonView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTwoRiversView)


        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()
        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
    }
    fun launchWorldMap(view: View) {
        val intent = Intent(view.context, WorldMap::class.java)
        view.context.startActivity(intent)
    }
    fun launchBaerlon(view: View) {
        val intent = Intent(view.context, BaerlonMap::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View) {
        val intent = Intent(view.context, EmondsFieldMap::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheTwoRivers(view: View) {
        val intent = Intent(view.context, TwoRiversMap::class.java)
        view.context.startActivity(intent)
    }
}
