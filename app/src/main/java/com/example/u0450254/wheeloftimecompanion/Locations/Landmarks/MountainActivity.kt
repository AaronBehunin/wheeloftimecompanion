package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.*
import com.example.u0450254.wheeloftimecompanion.R

class MountainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val charview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DragonmountView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DragonwallView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreatBlightView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MountainsofMistView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ShayolGhulView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SpineoftheWorldView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
    }
    fun launchDragonmount(view: View) {
        val intent = Intent(view.context, Dragonmount::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreatBlight(view: View) {
        val intent = Intent(view.context, GreatBlight::class.java)
        view.context.startActivity(intent)
    }
    fun launchMountainsofMist(view: View) {
        val intent = Intent(view.context, MountainsofMist::class.java)
        view.context.startActivity(intent)
    }
    fun launchShayolGhul(view: View) {
        val intent = Intent(view.context, ShayolGhul::class.java)
        view.context.startActivity(intent)
    }
    fun launchSpineoftheWorld(view: View) {
        val intent = Intent(view.context, SpineoftheWorld::class.java)
        view.context.startActivity(intent)
    }
}