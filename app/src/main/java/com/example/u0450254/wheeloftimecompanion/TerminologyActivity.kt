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
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.LewsTherin
import com.example.u0450254.wheeloftimecompanion.Organizations.Warder
import com.example.u0450254.wheeloftimecompanion.Terminology.*

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
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheBreakingoftheWorldView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CreatorView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheDragonView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheOnePowerView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GleemanView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTimeofMadnessView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WisdomView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

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
    fun launchDragon(view: View)
    {
        var intent = Intent(view.context, LewsTherin::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheOnePower(view: View)
    {
        var intent = Intent(view.context, TheOnePower::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheBreakingoftheWorld(view: View)
    {
        var intent = Intent(view.context, TheBreakingoftheWorld::class.java)
        view.context.startActivity(intent)
    }
    fun launchWisdom(view: View)
    {
        var intent = Intent(view.context, Wisdom::class.java)
        view.context.startActivity(intent)
    }
    fun launchGleeman(view: View)
    {
        var intent = Intent(view.context, Gleeman::class.java)
        view.context.startActivity(intent)
    }
}