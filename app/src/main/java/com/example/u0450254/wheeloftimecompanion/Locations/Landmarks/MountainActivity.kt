package com.example.u0450254.wheeloftimecompanion.Locations.Landmarks

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.*
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 5/30/2018.
 */
class MountainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DragonmountView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DragonwallView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreatBlightView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MountainsofMistView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ShayolGhulView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SpineoftheWorldView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
    }
    fun launchDragonmount(view: View) {
        var intent = Intent(view.context, Dragonmount::class.java)
        view.context.startActivity(intent)
    }
    fun launchMountainsofMist(view: View) {
        var intent = Intent(view.context, MountainsofMist::class.java)
        view.context.startActivity(intent)
    }
    fun launchShayolGhul(view: View) {
        var intent = Intent(view.context, ShayolGhul::class.java)
        view.context.startActivity(intent)
    }
    fun launchSpineoftheWorld(view: View) {
        var intent = Intent(view.context, SpineoftheWorld::class.java)
        view.context.startActivity(intent)
    }
}