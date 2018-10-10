package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.RingofTamyrlin
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.IlyenaTherinMoerelle
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.PaaranDisen
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.WorldSea
import com.example.u0450254.wheeloftimecompanion.Organizations.AesSedaiAgeofLegends
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Organizations.HundredCompanions
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.NineRods
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheCreator
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDarkOne

class ActivityPR : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.IlyenaTherinMoerelleView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PaaranDisenView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WorldSeaView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.RingofTamyrlinView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HallofServantsView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HundredCompanionsView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ServantsView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SistersView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CreatorView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.NineRodsView)


        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        chapview.addView(view1)
        chapview.addView(view2)
        chapview.addView(view3)
        chapview.addView(view4)
        chapview.addView(view5)
        chapview.addView(view6)
        chapview.addView(view7)
        chapview.addView(view8)
        chapview.addView(view9)
        chapview.addView(view10)
        chapview.addView(view11)

    }
    fun launchIlyenaTherinMoerelle(view: View)
    {
        val intent = Intent(view.context, IlyenaTherinMoerelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchPaaranDisen(view: View)
    {
        val intent = Intent(view.context, PaaranDisen::class.java)
        view.context.startActivity(intent)
    }
    fun launchWorldSea(view: View) {
        val intent = Intent(view.context, WorldSea::class.java)
        view.context.startActivity(intent)
    }
    fun launchRingofTamyrlin(view: View){
        val intent = Intent(view.context, RingofTamyrlin::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedaiLegends(view: View)
    {
        val intent = Intent(view.context, AesSedaiAgeofLegends::class.java)
        view.context.startActivity(intent)
    }
    fun launchHundredCompanions(view: View)
    {
        val intent = Intent(view.context, HundredCompanions::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheCreator(view: View)
    {
        val intent = Intent(view.context, TheCreator::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        val intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchNineRods(view: View)
    {
        val intent = Intent(view.context, NineRods::class.java)
        view.context.startActivity(intent)
    }
}