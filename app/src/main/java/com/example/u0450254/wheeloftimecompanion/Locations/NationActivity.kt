/**
 * Created by u0450254 on 5/30/2018.
 */
package com.example.u0450254.wheeloftimecompanion.Locations

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Ishamael
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Ghealdan
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Illian
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.TarValon
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/30/2018.
 */
class NationActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GhealdanView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.IllianView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarValonView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
    }

    fun launchGhealdan(view: View)
    {
        var intent = Intent(view.context, Ghealdan::class.java)
        view.context.startActivity(intent)
    }
    fun launchIllian(view: View)
    {
        var intent = Intent(view.context, Illian::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarValon(view: View)
    {
        var intent = Intent(view.context, TarValon::class.java)
        view.context.startActivity(intent)
    }
}