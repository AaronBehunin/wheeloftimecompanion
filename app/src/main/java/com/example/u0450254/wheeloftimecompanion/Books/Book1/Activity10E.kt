package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.HalfMoonAxe
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.TamsSword
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Egwene
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Mat
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Perrin
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.JonThane
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Moiraine
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Thom
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Bela
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Cloud
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.TheTwoRivers
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.WinespringWater
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.NorthRoad
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WagonBridge
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WinespringInn
import com.example.u0450254.wheeloftimecompanion.Organizations.AesSedai
import com.example.u0450254.wheeloftimecompanion.Organizations.Warder
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 6/5/2018.
 */



class Activity10E: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.egweneView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.perrinView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MoiraineView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LanView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ThomView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JonThaneView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTwoRiversView)
        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringWaterView)
        var view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.NorthRoadView)
        var view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WagonBridgeView)
        var view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringInnView)
        var view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HalfMoonAxeView)
        var view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamsSwordView)
        var view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiView)
        var view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WarderView)
        var view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelaView)
        var view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CloudView)

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
    }
    fun launchEwgene(view: View)
    {
        var intent = Intent(view.context, Egwene::class.java)
        view.context.startActivity(intent)
    }
    fun launchMat(view: View)
    {
        var intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchRand(view: View)
    {
        var intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }
    fun launchPerrin(view: View)
    {
        var intent = Intent(view.context, Perrin::class.java)
        view.context.startActivity(intent)
    }
    fun launchLan(view: View)
    {
        var intent = Intent(view.context, Lan::class.java)
        view.context.startActivity(intent)
    }
    fun launchMoiraine(view: View)
    {
        var intent = Intent(view.context, Moiraine::class.java)
        view.context.startActivity(intent)
    }
    fun launchThom(view: View)
    {
        var intent = Intent(view.context, Thom::class.java)
        view.context.startActivity(intent)
    }
    fun launchJonThane(view: View){
        var intent = Intent(view.context, JonThane::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        var intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheTwoRivers(view: View) {
        var intent = Intent(view.context, TheTwoRivers::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringWater(view: View) {
        var intent = Intent(view.context, WinespringWater::class.java)
        view.context.startActivity(intent)
    }
    fun launchNorthRoad(view: View) {
        var intent = Intent(view.context, NorthRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchWagonBridge(view: View) {
        var intent = Intent(view.context, WagonBridge::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringInn(view: View) {
        var intent = Intent(view.context, WinespringInn::class.java)
        view.context.startActivity(intent)
    }
    fun launchHalfMoonAxe(view: View){
        var intent = Intent(view.context, HalfMoonAxe::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamsSword(view: View){
        var intent = Intent(view.context, TamsSword::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedai(view: View)
    {
        var intent = Intent(view.context, AesSedai::class.java)
        view.context.startActivity(intent)
    }
    fun launchWarder(view: View)
    {
        var intent = Intent(view.context, Warder::class.java)
        view.context.startActivity(intent)
    }
    fun launchBela(view: View) {
        var intent = Intent(view.context, Bela::class.java)
        view.context.startActivity(intent)
    }
    fun launchCloud(view: View) {
        var intent = Intent(view.context, Cloud::class.java)
        view.context.startActivity(intent)
    }
}