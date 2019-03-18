package com.example.u0450254.wheeloftimecompanion

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Organizations.*

class OrganizationsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val charview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiLegendsView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AielView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ChildrenoftheLightView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DarkfriendsView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DreadlordsView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ForsakenView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HallofServantsView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HundredCompanionsView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ServantsView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SistersView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TinkerView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.VillageCouncilView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WarderView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WomensCircleView)

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
        charview.addView(view15)
    }

    fun launchAesSedai(view: View)
    {
        val intent = Intent(view.context, AesSedai::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedaiLegends(view: View)
    {
        val intent = Intent(view.context, AesSedaiAgeofLegends::class.java)
        view.context.startActivity(intent)
    }
    fun launchAiel(view: View)
    {
        val intent = Intent(view.context, Aiel::class.java)
        view.context.startActivity(intent)
    }
    fun launchChildrenoftheLight(view: View)
    {
        val intent = Intent(view.context, ChildrenoftheLight::class.java)
        view.context.startActivity(intent)
    }
    fun launchDarkfriends(view: View)
    {
        val intent = Intent(view.context, Darkfriends::class.java)
        view.context.startActivity(intent)
    }
    fun launchDreadlords(view: View)
    {
        val intent = Intent(view.context, Dreadlords::class.java)
        view.context.startActivity(intent)
    }
    fun launchForsaken(view: View)
    {
        val intent = Intent(view.context, Forsaken::class.java)
        view.context.startActivity(intent)
    }
    fun launchHundredCompanions(view: View)
    {
        val intent = Intent(view.context, HundredCompanions::class.java)
        view.context.startActivity(intent)
    }
    fun launchVillageCouncil(view: View)
    {
        val intent = Intent(view.context, VillageCouncil::class.java)
        view.context.startActivity(intent)
    }
    fun launchWarder(view: View)
    {
        val intent = Intent(view.context, Warder::class.java)
        view.context.startActivity(intent)
    }
    fun launchWomensCircle(view: View)
    {
        val intent = Intent(view.context, WomensCircle::class.java)
        view.context.startActivity(intent)
    }
    fun launchTuathaan(view: View)
    {
        val intent = Intent(view.context, Tuathaan::class.java)
        view.context.startActivity(intent)
    }
}