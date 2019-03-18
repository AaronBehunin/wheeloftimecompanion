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

class ForestsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val charview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AielWasteView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BorderlandsView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DhallinForestView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ForestofShadowsView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreenView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SandHillsView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTwoRiversView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WaterwoodView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WestwoodView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
        charview.addView(view7)
        charview.addView(view8)
        charview.addView(view9)
    }
    fun launchAielWaste(view: View) {
        val intent = Intent(view.context, AielWaste::class.java)
        view.context.startActivity(intent)
    }
    fun launchBorderlands(view: View) {
        val intent = Intent(view.context, Borderlands::class.java)
        view.context.startActivity(intent)
    }
    fun launchDhallinForest(view: View) {
        val intent = Intent(view.context, DhallinForest::class.java)
        view.context.startActivity(intent)
    }
    fun launchForestofShadows(view: View) {
        val intent = Intent(view.context, ForestofShadows::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreatBlight(view: View) {
        val intent = Intent(view.context, GreatBlight::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreen(view: View) {
        val intent = Intent(view.context, Green::class.java)
        view.context.startActivity(intent)
    }
    fun launchSandHills(view: View) {
        val intent = Intent(view.context, SandHills::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheTwoRivers(view: View) {
        val intent = Intent(view.context, TheTwoRivers::class.java)
        view.context.startActivity(intent)
    }
    fun launchWaterwood(view: View) {
        val intent = Intent(view.context, Waterwood::class.java)
        view.context.startActivity(intent)
    }
    fun launchWestwood(view: View) {
        val intent = Intent(view.context, Westwood::class.java)
        view.context.startActivity(intent)
    }
}