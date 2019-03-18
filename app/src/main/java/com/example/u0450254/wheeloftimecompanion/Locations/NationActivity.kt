
package com.example.u0450254.wheeloftimecompanion.Locations

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.*
import com.example.u0450254.wheeloftimecompanion.R


class NationActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val charview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CairhienView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GhealdanView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.IllianView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ManetherenView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ShienarView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarValonView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
    }

    fun launchCairhien(view: View)
    {
        val intent = Intent(view.context, Cairhien::class.java)
        view.context.startActivity(intent)
    }
    fun launchGhealdan(view: View)
    {
        val intent = Intent(view.context, Ghealdan::class.java)
        view.context.startActivity(intent)
    }
    fun launchIllian(view: View)
    {
        val intent = Intent(view.context, Illian::class.java)
        view.context.startActivity(intent)
    }
    fun launchManetheren(view: View)
    {
        val intent = Intent(view.context, Manetheren::class.java)
        view.context.startActivity(intent)
    }
    fun launchShienar(view: View)
    {
        val intent = Intent(view.context, Shienar::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarValon(view: View)
    {
        val intent = Intent(view.context, TarValon::class.java)
        view.context.startActivity(intent)
    }
}