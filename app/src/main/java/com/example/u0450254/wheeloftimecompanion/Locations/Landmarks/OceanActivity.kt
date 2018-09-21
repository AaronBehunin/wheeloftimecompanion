package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.*
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/30/2018.
 */
class OceanActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ArythOceanView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MireView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SeaofStormsView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarendrelleView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringWaterView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WorldSeaView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
    }
    fun launchArythOcean(view: View) {
        var intent = Intent(view.context, ArythOcean::class.java)
        view.context.startActivity(intent)
    }
    fun launchMire(view: View) {
        var intent = Intent(view.context, Mire::class.java)
        view.context.startActivity(intent)
    }
    fun launchSeaofStorms(view: View) {
        var intent = Intent(view.context, SeaofStorms::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarendrelle(view: View) {
        var intent = Intent(view.context, Tarendrelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringWater(view: View) {
        var intent = Intent(view.context, WinespringWater::class.java)
        view.context.startActivity(intent)
    }
    fun launchWorldSea(view: View) {
        var intent = Intent(view.context, WorldSea::class.java)
        view.context.startActivity(intent)
    }

}