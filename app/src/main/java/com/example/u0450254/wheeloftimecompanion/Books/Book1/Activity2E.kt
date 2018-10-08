package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.GreatSerpentRing
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.ColorShiftCloak
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Mat
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Moiraine
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Scratch
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Green
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.TheTwoRivers
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WagonBridge
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WinespringInn
import com.example.u0450254.wheeloftimecompanion.Organizations.VillageCouncil
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Tabac


class Activity2E : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MoiraineView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LanView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamAlThorView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MarinAlVereView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SamelCraweView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwinFinngarView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.RowanHurnView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JonThaneView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreenView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTwoRiversView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WagonBridgeView)
        val view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringInnView)
        val view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ColorShiftCloakView)
        val view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.VillageCouncilView)
        val view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreatSerpentRingView)
        val view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TabacView)
        val view23 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ScratchView)

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
    }
    fun launchRand(view: View) {
        val intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }
    fun launchMat(view: View) {
        val intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchMoiraine(view: View)
    {
        val intent = Intent(view.context, Moiraine::class.java)
        view.context.startActivity(intent)
    }
    fun launchLan(view: View)
    {
        val intent = Intent(view.context, Lan::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamAlThor(view: View)
    {
        val intent = Intent(view.context, TamAlThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchBranAlVere(view: View) {
        val intent = Intent(view.context, BranAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchMarinAlVere(view: View){
        val intent = Intent(view.context, MarinAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchCennBuie(view: View) {
        val intent = Intent(view.context, CennBuie::class.java)
        view.context.startActivity(intent)
    }
    fun launchSamelCrawe(view: View){
        val intent = Intent(view.context, SamelCrawe::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwinFinngar(view: View){
        val intent = Intent(view.context, EwinFinngar::class.java)
        view.context.startActivity(intent)
    }
    fun launchRowanHurn(view: View){
        val intent = Intent(view.context, RowanHurn::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        val intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchJonThane(view: View){
        val intent = Intent(view.context, JonThane::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        val intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreen(view: View) {
        val intent = Intent(view.context, Green::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheTwoRivers(view: View) {
        val intent = Intent(view.context, TheTwoRivers::class.java)
        view.context.startActivity(intent)
    }
    fun launchWagonBridge(view: View) {
        val intent = Intent(view.context, WagonBridge::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringInn(view: View) {
        val intent = Intent(view.context, WinespringInn::class.java)
        view.context.startActivity(intent)
    }
    fun launchColorShiftCloak(view: View){
        val intent = Intent(view.context, ColorShiftCloak::class.java)
        view.context.startActivity(intent)
    }
    fun launchVillageCouncil(view: View)
    {
        val intent = Intent(view.context, VillageCouncil::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreatSerpentRing(view: View){
        val intent = Intent(view.context, GreatSerpentRing::class.java)
        view.context.startActivity(intent)
    }
    fun launchTabac(view: View)
    {
        val intent = Intent(view.context, Tabac::class.java)
        view.context.startActivity(intent)
    }
    fun launchScratch(view: View) {
        val intent = Intent(view.context, Scratch::class.java)
        view.context.startActivity(intent)
    }
}