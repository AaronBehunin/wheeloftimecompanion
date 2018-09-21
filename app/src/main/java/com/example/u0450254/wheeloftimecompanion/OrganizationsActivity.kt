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
import com.example.u0450254.wheeloftimecompanion.Organizations.*

/**
 * Created by u0450254 on 5/30/2018.
 */
class OrganizationsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiLegendsView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AielView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ChildrenoftheLightView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DarkfriendsView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ForsakenView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HallofServantsView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HundredCompanionsView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ServantsView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SistersView)
        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TinkerView)
        var view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.VillageCouncilView)
        var view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WarderView)
        var view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WomensCircleView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()
        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
        charview.addView(view7)
        charview.addView(view8)
        charview.addView(view9)
        charview.addView(view10)
        charview.addView(view11)
        charview.addView(view12)
        charview.addView(view13)
        charview.addView(view14)
    }

    fun launchAesSedai(view: View)
    {
        var intent = Intent(view.context, AesSedai::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedaiLegends(view: View)
    {
        var intent = Intent(view.context, AesSedaiAgeofLegends::class.java)
        view.context.startActivity(intent)
    }
    fun launchAiel(view: View)
    {
        var intent = Intent(view.context, Aiel::class.java)
        view.context.startActivity(intent)
    }
    fun launchDarkfriends(view: View)
    {
        var intent = Intent(view.context, Darkfriends::class.java)
        view.context.startActivity(intent)
    }
    fun launchChildrenoftheLight(view: View)
    {
        var intent = Intent(view.context, ChildrenoftheLight::class.java)
        view.context.startActivity(intent)
    }
    fun launchForsaken(view: View)
    {
        var intent = Intent(view.context, Forsaken::class.java)
        view.context.startActivity(intent)
    }
    fun launchHundredCompanions(view: View)
    {
        var intent = Intent(view.context, HundredCompanions::class.java)
        view.context.startActivity(intent)
    }
    fun launchVillageCouncil(view: View)
    {
        var intent = Intent(view.context, VillageCouncil::class.java)
        view.context.startActivity(intent)
    }
    fun launchWarder(view: View)
    {
        var intent = Intent(view.context, Warder::class.java)
        view.context.startActivity(intent)
    }
    fun launchWomensCircle(view: View)
    {
        var intent = Intent(view.context, WomensCircle::class.java)
        view.context.startActivity(intent)
    }
    fun launchTuathaan(view: View)
    {
        var intent = Intent(view.context, Tuathaan::class.java)
        view.context.startActivity(intent)
    }
}