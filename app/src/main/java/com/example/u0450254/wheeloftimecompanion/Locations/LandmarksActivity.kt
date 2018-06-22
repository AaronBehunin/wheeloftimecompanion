package com.example.u0450254.wheeloftimecompanion.Locations

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Other.DaiseCongar
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.DhallinForest
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.TwoRivers
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/30/2018.
 */
class LandmarksActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TwoRiversView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DhallinForestView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
    }
    fun launchTwoRivers(view: View) {
        var intent = Intent(view.context, TwoRivers::class.java)
        view.context.startActivity(intent)
    }
    fun launchDhallinForest(view: View) {
        var intent = Intent(view.context, DhallinForest::class.java)
        view.context.startActivity(intent)
    }
}