package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Other.AlsbetLuhhan
import com.example.u0450254.wheeloftimecompanion.Characters.Other.BranAlVere
import com.example.u0450254.wheeloftimecompanion.Characters.Other.HaralLuhhan
import com.example.u0450254.wheeloftimecompanion.Characters.Other.NattiCauthon
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Thom
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Draghkar
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Myrddraal
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.Baerlon
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.TarenFerry
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.WatchHill
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Waterwood
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.ShayolGhul
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.TarValon
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.AgeofLegends


class Activity10R: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamAlThorView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.NattiCauthonView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AlsbetLuhhanView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarValonView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BaerlonView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WatchHillView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WaterwoodView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ShayolGhulView)
        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ageoflegendsView)
        var view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DraghkarView)
        var view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MyrddraalView)
        var view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocView)

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
        chapview.addView(view12)
        chapview.addView(view13)
        chapview.addView(view14)
}
    fun launchThom(view: View)
    {
        var intent = Intent(view.context, Thom::class.java)
        view.context.startActivity(intent)
    }
    fun launchBranAlVere(view: View) {
        var intent = Intent(view.context, BranAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchNattiCauthon(view: View){
        var intent = Intent(view.context, NattiCauthon::class.java)
        view.context.startActivity(intent)
    }
    fun launchAlsbetLuhhan(view: View){
        var intent = Intent(view.context, AlsbetLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        var intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarValon(view: View)
    {
        var intent = Intent(view.context, TarValon::class.java)
        view.context.startActivity(intent)
    }
    fun launchBaerlon(view: View)
    {
        var intent = Intent(view.context, Baerlon::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarenFerry(view: View)
    {
        var intent = Intent(view.context, TarenFerry::class.java)
        view.context.startActivity(intent)
    }
    fun launchWatchHill(view: View)
    {
        var intent = Intent(view.context, WatchHill::class.java)
        view.context.startActivity(intent)
    }
    fun launchWaterwood(view: View) {
        var intent = Intent(view.context, Waterwood::class.java)
        view.context.startActivity(intent)
    }
    fun launchShayolGhul(view: View) {
        var intent = Intent(view.context, ShayolGhul::class.java)
        view.context.startActivity(intent)
    }
    fun launchAgeofLegends(view: View)
    {
        var intent = Intent(view.context, AgeofLegends::class.java)
        view.context.startActivity(intent)
    }
    fun launchDraghkar(view: View) {
        var intent = Intent(view.context, Draghkar::class.java)
        view.context.startActivity(intent)
    }
    fun launchMyrddraal(view: View) {
        var intent = Intent(view.context, Myrddraal::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrolloc(view: View) {
        var intent = Intent(view.context, Trolloc::class.java)
        view.context.startActivity(intent)
    }
}