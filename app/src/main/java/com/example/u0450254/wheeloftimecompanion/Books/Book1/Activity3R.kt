package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Moiraine
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.TarenFerry
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.AielWaste
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Borderlands
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.DhallinForest
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.GreatBlight
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.ArythOcean
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.SeaofStorms
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.Tarendrelle
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Ghealdan
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Illian
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.TarValon
import com.example.u0450254.wheeloftimecompanion.Organizations.AesSedai
import com.example.u0450254.wheeloftimecompanion.Organizations.ChildrenoftheLight
import com.example.u0450254.wheeloftimecompanion.Organizations.Darkfriends
import com.example.u0450254.wheeloftimecompanion.Organizations.WomensCircle
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Gleeman
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.AgeofLegends
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.BelTine
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.TheBreakingoftheWorld
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDarkOne
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDragon

class Activity3R : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MoiraineView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CorinAyellinView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BiliCongarView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GhealdanView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.IllianView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarValonView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarenFerryView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AielWasteView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BorderlandsView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DhallinForestView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreatBlightView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ArythOceanView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SeaofStormsView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarendrelleView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ChildrenoftheLightView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DarkfriendsView)
        val view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WomensCircleView)
        val view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        val view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheDragonView)
        val view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ageoflegendsView)
        val view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelTineView)
        val view23 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheBreakingoftheWorldView)
        val view24 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GleemanView)

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
    }
    fun launchMoiraine(view: View)
    {
        val intent = Intent(view.context, Moiraine::class.java)
        view.context.startActivity(intent)
    }
    fun launchCorinAyellin(view: View){
        val intent = Intent(view.context, CorinAyellin::class.java)
        view.context.startActivity(intent)
    }
    fun launchBiliCongar(view: View) {
        val intent = Intent(view.context, BiliCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchGhealdan(view: View)
    {
        val intent = Intent(view.context, Ghealdan::class.java)
        view.context.startActivity(intent)
    }
    fun launchIllian(view: View)
    {
        val intent = Intent(view.context, Illian::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarValon(view: View)
    {
        val intent = Intent(view.context, TarValon::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarenFerry(view: View)
    {
        val intent = Intent(view.context, TarenFerry::class.java)
        view.context.startActivity(intent)
    }
    fun launchAielWaste(view: View) {
        val intent = Intent(view.context, AielWaste::class.java)
        view.context.startActivity(intent)
    }
    fun launchBorderlands(view: View) {
        val intent = Intent(view.context, Borderlands::class.java)
        view.context.startActivity(intent)
    }
    fun launchDhallinForest(view: View) {
        val intent = Intent(view.context, DhallinForest::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreatBlight(view: View) {
        val intent = Intent(view.context, GreatBlight::class.java)
        view.context.startActivity(intent)
    }
    fun launchArythOcean(view: View) {
        val intent = Intent(view.context, ArythOcean::class.java)
        view.context.startActivity(intent)
    }
    fun launchSeaofStorms(view: View) {
        val intent = Intent(view.context, SeaofStorms::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarendrelle(view: View) {
        val intent = Intent(view.context, Tarendrelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedai(view: View)
    {
        val intent = Intent(view.context, AesSedai::class.java)
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
    fun launchWomensCircle(view: View)
    {
        val intent = Intent(view.context, WomensCircle::class.java)
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
    fun launchGleeman(view: View)
    {
        val intent = Intent(view.context, Gleeman::class.java)
        view.context.startActivity(intent)
    }
}