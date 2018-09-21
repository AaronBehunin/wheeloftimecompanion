package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.PadanFain
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.ArturHawkwing
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.GreenMan
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.JainFarstrider
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.*
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Moiraine
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Thom
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Creatures.Races.Ogier
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.Baerlon
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.Caemlyn
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.WatchHill
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.AielWaste
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Waterwood
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.MountainsofMist
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.ArythOcean
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.Mire
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Ghealdan
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.TarValon
import com.example.u0450254.wheeloftimecompanion.Organizations.AesSedai
import com.example.u0450254.wheeloftimecompanion.Organizations.Aiel
import com.example.u0450254.wheeloftimecompanion.Organizations.Tuathaan
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDarkOne
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDragon

/**
 * Created by u0450254 on 6/5/2018.
 */

class Activity4R : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ArturHawkwingView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreenManView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JainFarstriderView)

        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwalCoplinView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BandryCraweView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SamelCraweView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JonThaneView)


        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GhealdanView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarValonView)

        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BaerlonView)
        var view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CaemlynView)
        var view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DevenRideView)
        var view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WatchHillView)

        var view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AielWasteView)
        var view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WaterwoodView)

        var view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MountainsofMistView)

        var view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ArythOceanView)
        var view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MireView)

        var view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiView)
        var view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AielView)
        var view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TinkerView)
        var view23 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WarderView)

        var view24 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        var view25 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheDragonView)

        var view26 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocView)

        var view27 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OgierView)


        if (progress.book==1 && progress.chapter<10)
        {
            view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainFriendView)
        }
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
        chapview.addView(view15)
        chapview.addView(view16)
        chapview.addView(view17)
        chapview.addView(view18)
        chapview.addView(view19)
        chapview.addView(view20)
        chapview.addView(view21)
        chapview.addView(view22)
        chapview.addView(view23)
        chapview.addView(view24)
        chapview.addView(view25)
        chapview.addView(view26)
        chapview.addView(view27)
    }
    fun launchEwalCoplin(view: View)
    {
        var intent = Intent(view.context, EwalCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchDragon(view: View)
    {
        var intent = Intent(view.context, TheDragon::class.java)
        view.context.startActivity(intent)
    }
    fun launchArturHawkwing(view: View)
    {
        var intent = Intent(view.context, ArturHawkwing::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreenMan(view: View)
    {
        var intent = Intent(view.context, GreenMan::class.java)
        view.context.startActivity(intent)
    }
    fun launchJainFarstrider(view: View)
    {
        var intent = Intent(view.context, JainFarstrider::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        var intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchPadanFain(view: View)
    {
        var intent = Intent(view.context, PadanFain::class.java)
        view.context.startActivity(intent)
    }
    fun launchJonThane(view: View){
        var intent = Intent(view.context, JonThane::class.java)
        view.context.startActivity(intent)
    }
    fun launchBandryCrawe(view: View){
        var intent = Intent(view.context, BandryCrawe::class.java)
        view.context.startActivity(intent)
    }
    fun launchSamelCrawe(view: View){
        var intent = Intent(view.context, SamelCrawe::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedai(view: View)
    {
        var intent = Intent(view.context, AesSedai::class.java)
        view.context.startActivity(intent)
    }
    fun launchAiel(view: View)
    {
        var intent = Intent(view.context, Aiel::class.java)
        view.context.startActivity(intent)
    }
    fun launchOgier(view: View) {
        var intent = Intent(view.context, Ogier::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrolloc(view: View) {
        var intent = Intent(view.context, Trolloc::class.java)
        view.context.startActivity(intent)
    }
    fun launchTuathaan(view: View)
    {
        var intent = Intent(view.context, Tuathaan::class.java)
        view.context.startActivity(intent)
    }
    fun launchGhealdan(view: View)
    {
        var intent = Intent(view.context, Ghealdan::class.java)
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
    fun launchWatchHill(view: View)
    {
        var intent = Intent(view.context, WatchHill::class.java)
        view.context.startActivity(intent)
    }
    fun launchMire(view: View) {
        var intent = Intent(view.context, Mire::class.java)
        view.context.startActivity(intent)
    }
    fun launchMountainsofMist(view: View) {
        var intent = Intent(view.context, MountainsofMist::class.java)
        view.context.startActivity(intent)
    }
    fun launchWaterwood(view: View) {
        var intent = Intent(view.context, Waterwood::class.java)
        view.context.startActivity(intent)
    }
    fun launchAielWaste(view: View) {
        var intent = Intent(view.context, AielWaste::class.java)
        view.context.startActivity(intent)
    }
    fun launchArythOcean(view: View) {
        var intent = Intent(view.context, ArythOcean::class.java)
        view.context.startActivity(intent)
    }
    fun launchCaemlyn(view: View) {
        var intent = Intent(view.context, Caemlyn::class.java)
        view.context.startActivity(intent)
    }
}