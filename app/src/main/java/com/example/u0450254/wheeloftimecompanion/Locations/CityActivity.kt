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
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Illian
import com.example.u0450254.wheeloftimecompanion.R

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

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BaerlonView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.IllianView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
    }

    fun launchEmondsField(view: View)
    {
        var intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchIllian(view: View)
    {
        var intent = Intent(view.context, Illian::class.java)
        view.context.startActivity(intent)
    }
    fun launchBaerlon(view: View)
    {
        var intent = Intent(view.context, Baerlon::class.java)
        view.context.startActivity(intent)
    }
}