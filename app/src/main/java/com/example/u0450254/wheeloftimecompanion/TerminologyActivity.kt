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
import com.example.u0450254.wheeloftimecompanion.Organizations.AesSedai
import com.example.u0450254.wheeloftimecompanion.Terminology.AgeofLegends
import com.example.u0450254.wheeloftimecompanion.Terminology.Angreal
import com.example.u0450254.wheeloftimecompanion.Terminology.Chora
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
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.amyrlinSeatView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.angrealView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.avendesoraView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.baalzamonView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.choraView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)


        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
        charview.addView(view7)
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
    fun launchAesSedai1(view: View)
    {
        var intent = Intent(view.context, AesSedai::class.java)
        intent.putExtra("Jump", 6950)
        view.context.startActivity(intent)
    }
    fun launchAngreal(view: View)
    {
        var intent = Intent(view.context, Angreal::class.java)
        view.context.startActivity(intent)
    }
    fun launchChora(view: View)
    {
        var intent = Intent(view.context, Chora::class.java)
        view.context.startActivity(intent)
    }
}