package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.PadanFain
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.ArturHawkwing
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.GreenMan
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.JainFarstrider
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Creatures.Races.Ogier
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.*
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.AielWaste
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.ForestofShadows
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Waterwood
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.MountainsofMist
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.ArythOcean
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.Manetherendrelle
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.Mire
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.Tarendrelle
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Ghealdan
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.TarValon
import com.example.u0450254.wheeloftimecompanion.Organizations.AesSedai
import com.example.u0450254.wheeloftimecompanion.Organizations.Aiel
import com.example.u0450254.wheeloftimecompanion.Organizations.Tuathaan
import com.example.u0450254.wheeloftimecompanion.Organizations.Warder
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.*
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDarkOne
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDragon

class Activity4R : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ArturHawkwingView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreenManView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JainFarstriderView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwalCoplinView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BandryCraweView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SamelCraweView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JonThaneView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GhealdanView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarValonView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BaerlonView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CaemlynView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DevenRideView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LugardView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarenFerryView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WatchHillView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AielWasteView)
        val view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ForestofShadowsView)
        val view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WaterwoodView)
        val view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MountainsofMistView)
        val view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ArythOceanView)
        val view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MireView)
        val view23 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarendrelleView)
        val view24 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WhiteRiverView)
        val view25 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiView)
        val view26 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AielView)
        val view27 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TinkerView)
        val view28 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WarderView)
        val view29 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        val view30 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheDragonView)
        val view31 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ageoflegendsView)
        val view32 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelTineView)
        val view33 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TimeofMadnessView)
        val view34 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocWarsView)
        val view35 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HundredYearsWarView)
        val view36 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinternightView)
        val view37 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocView)
        val view38 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OgierView)


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
        chapview.addView(view28)
        chapview.addView(view29)
        chapview.addView(view30)
        chapview.addView(view31)
        chapview.addView(view32)
        chapview.addView(view33)
        chapview.addView(view34)
        chapview.addView(view35)
        chapview.addView(view36)
        chapview.addView(view37)
        chapview.addView(view38)
    }
    fun launchArturHawkwing(view: View)
    {
        val intent = Intent(view.context, ArturHawkwing::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreenMan(view: View)
    {
        val intent = Intent(view.context, GreenMan::class.java)
        view.context.startActivity(intent)
    }
    fun launchJainFarstrider(view: View)
    {
        val intent = Intent(view.context, JainFarstrider::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwalCoplin(view: View)
    {
        val intent = Intent(view.context, EwalCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchBandryCrawe(view: View){
        val intent = Intent(view.context, BandryCrawe::class.java)
        view.context.startActivity(intent)
    }
    fun launchSamelCrawe(view: View){
        val intent = Intent(view.context, SamelCrawe::class.java)
        view.context.startActivity(intent)
    }
    fun launchPadanFain(view: View)
    {
        val intent = Intent(view.context, PadanFain::class.java)
        view.context.startActivity(intent)
    }
    fun launchJonThane(view: View){
        val intent = Intent(view.context, JonThane::class.java)
        view.context.startActivity(intent)
    }
    fun launchGhealdan(view: View)
    {
        val intent = Intent(view.context, Ghealdan::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarValon(view: View)
    {
        val intent = Intent(view.context, TarValon::class.java)
        view.context.startActivity(intent)
    }
    fun launchBaerlon(view: View)
    {
        val intent = Intent(view.context, Baerlon::class.java)
        view.context.startActivity(intent)
    }
    fun launchCaemlyn(view: View) {
        val intent = Intent(view.context, Caemlyn::class.java)
        view.context.startActivity(intent)
    }
    fun launchDevenRide(view: View)
    {
        val intent = Intent(view.context, DevenRide::class.java)
        view.context.startActivity(intent)
    }
    fun launchLugard(view: View) {
        val intent = Intent(view.context, Lugard::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarenFerry(view: View)
    {
        val intent = Intent(view.context, TarenFerry::class.java)
        view.context.startActivity(intent)
    }
    fun launchWatchHill(view: View)
    {
        val intent = Intent(view.context, WatchHill::class.java)
        view.context.startActivity(intent)
    }
    fun launchAielWaste(view: View) {
        val intent = Intent(view.context, AielWaste::class.java)
        view.context.startActivity(intent)
    }
    fun launchForestofShadows(view: View) {
        val intent = Intent(view.context, ForestofShadows::class.java)
        view.context.startActivity(intent)
    }
    fun launchWaterwood(view: View) {
        val intent = Intent(view.context, Waterwood::class.java)
        view.context.startActivity(intent)
    }
    fun launchMountainsofMist(view: View) {
        val intent = Intent(view.context, MountainsofMist::class.java)
        view.context.startActivity(intent)
    }
    fun launchArythOcean(view: View) {
        val intent = Intent(view.context, ArythOcean::class.java)
        view.context.startActivity(intent)
    }
    fun launchMire(view: View) {
        val intent = Intent(view.context, Mire::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarendrelle(view: View) {
        val intent = Intent(view.context, Tarendrelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchManetherendrelle(view: View) {
        val intent = Intent(view.context, Manetherendrelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedai(view: View)
    {
        val intent = Intent(view.context, AesSedai::class.java)
        view.context.startActivity(intent)
    }
    fun launchAiel(view: View)
    {
        val intent = Intent(view.context, Aiel::class.java)
        view.context.startActivity(intent)
    }
    fun launchTuathaan(view: View)
    {
        val intent = Intent(view.context, Tuathaan::class.java)
        view.context.startActivity(intent)
    }
    fun launchWarder(view: View)
    {
        val intent = Intent(view.context, Warder::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        val intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchDragon(view: View)
    {
        val intent = Intent(view.context, TheDragon::class.java)
        view.context.startActivity(intent)
    }
    fun launchAgeofLegends(view: View)
    {
        val intent = Intent(view.context, AgeofLegends::class.java)
        view.context.startActivity(intent)
    }
    fun launchBelTine(view: View)
    {
        val intent = Intent(view.context, BelTine::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheBreakingoftheWorld(view: View)
    {
        val intent = Intent(view.context, TheBreakingoftheWorld::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrollocWars(view: View) {
        val intent = Intent(view.context, TrollocWars::class.java)
        view.context.startActivity(intent)
    }
    fun launchHundredYearsWar(view: View)
    {
        val intent = Intent(view.context, HundredYearsWar::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinternight(view: View)
    {
        val intent = Intent(view.context, Winternight::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrolloc(view: View) {
        val intent = Intent(view.context, Trolloc::class.java)
        view.context.startActivity(intent)
    }
    fun launchOgier(view: View) {
        val intent = Intent(view.context, Ogier::class.java)
        view.context.startActivity(intent)
    }
}