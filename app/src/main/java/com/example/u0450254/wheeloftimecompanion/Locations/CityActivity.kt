package com.example.u0450254.wheeloftimecompanion.Locations

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.Baerlon
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.AielWaste
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Andor
import com.example.u0450254.wheeloftimecompanion.Organizations.AesSedai
import com.example.u0450254.wheeloftimecompanion.R

import com.example.u0450254.wheeloftimecompanion.Terminology.AgeofLegends
import com.example.u0450254.wheeloftimecompanion.Terminology.TheDarkOne

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

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.baerlonView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
    }

    fun launchBaerlon(view: View)
    {
        var intent = Intent(view.context, Baerlon::class.java)
        view.context.startActivity(intent)
    }

}