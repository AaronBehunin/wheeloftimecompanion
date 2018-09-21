package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.*
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.GreatBlight
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/30/2018.
 */
class ForestsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AielWasteView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DhallinForestView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ForestofShadowsView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreenView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SandHillsView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTwoRiversView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WaterwoodView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WestwoodView)

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
    fun launchAielWaste(view: View) {
        var intent = Intent(view.context, AielWaste::class.java)
        view.context.startActivity(intent)
    }
    fun launchBorderlands(view: View) {
        var intent = Intent(view.context, Borderlands::class.java)
        view.context.startActivity(intent)
    }
    fun launchDhallinForest(view: View) {
        var intent = Intent(view.context, DhallinForest::class.java)
        view.context.startActivity(intent)
    }
    fun launchForestofShadows(view: View) {
        var intent = Intent(view.context, ForestofShadows::class.java)
        view.context.startActivity(intent)
    }
    fun launchSandHills(view: View) {
        var intent = Intent(view.context, SandHills::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheTwoRivers(view: View) {
        var intent = Intent(view.context, TheTwoRivers::class.java)
        view.context.startActivity(intent)
    }
    fun launchWaterwood(view: View) {
        var intent = Intent(view.context, Waterwood::class.java)
        view.context.startActivity(intent)
    }
    fun launchWestwood(view: View) {
        var intent = Intent(view.context, Westwood::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreen(view: View) {
        var intent = Intent(view.context, Green::class.java)
        view.context.startActivity(intent)
    }
}