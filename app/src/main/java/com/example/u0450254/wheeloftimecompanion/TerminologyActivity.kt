/**
 * Created by u0450254 on 5/30/2018.
 */
package com.example.u0450254.wheeloftimecompanion

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Terminology.AgeofLegends
import com.example.u0450254.wheeloftimecompanion.Terminology.TheCreator
import com.example.u0450254.wheeloftimecompanion.Terminology.TheDarkOne

/**
 * Created by u0450254 on 5/30/2018.
 */
class TerminologyActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ageoflegendsView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CreatorView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
    }
    fun launchAgeofLegends(view: View)
    {
        var intent = Intent(view.context, AgeofLegends::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        var intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheCreator(view: View)
    {
        var intent = Intent(view.context, TheCreator::class.java)
        view.context.startActivity(intent)
    }
}