package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.PadanFain
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.*
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Green
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.TheTwoRivers
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WagonBridge
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WinespringInn
import com.example.u0450254.wheeloftimecompanion.Organizations.VillageCouncil
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Wisdom

class Activity3E : AppCompatActivity() {

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

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.egweneView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.perrinView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.nynaeveView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamAlThorView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HuBarranView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TadBarranView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WitCongarView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SamelCraweView)
        var view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwinFinngarView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreenView)
        val view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTwoRiversView)
        val view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringInnView)
        val view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WagonBridgeView)
        val view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.VillageCouncilView)
        val view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WisdomView)

        if (progress.book==1 && progress.chapter<10)
        {
            view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainFriendView)
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
    }
    fun launchRand(view: View) {
        val intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwgene(view: View)
    {
        val intent = Intent(view.context, Egwene::class.java)
        view.context.startActivity(intent)
    }
    fun launchMat(view: View)
    {
        val intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchPerrin(view: View)
    {
        val intent = Intent(view.context, Perrin::class.java)
        view.context.startActivity(intent)
    }
    fun launchNynaeve(view: View)
    {
        val intent = Intent(view.context, Nynaeve::class.java)
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
    fun launchHuBarran(view: View){
        val intent = Intent(view.context, HuBarran::class.java)
        view.context.startActivity(intent)
    }
    fun launchTadBarran(view: View){
        val intent = Intent(view.context, TadBarran::class.java)
        view.context.startActivity(intent)
    }
    fun launchCennBuie(view: View){
        val intent = Intent(view.context, CennBuie::class.java)
        view.context.startActivity(intent)
    }
    fun launchWitCongar(view: View)
    {
        val intent = Intent(view.context, WitCongar::class.java)
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
    fun launchEwinFinngar(view: View){
        val intent = Intent(view.context, EwinFinngar::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        val intent = Intent(view.context, HaralLuhhan::class.java)
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
    fun launchWinespringInn(view: View) {
        val intent = Intent(view.context, WinespringInn::class.java)
        view.context.startActivity(intent)
    }
    fun launchWagonBridge(view: View) {
        val intent = Intent(view.context, WagonBridge::class.java)
        view.context.startActivity(intent)
    }
    fun launchVillageCouncil(view: View)
    {
        val intent = Intent(view.context, VillageCouncil::class.java)
        view.context.startActivity(intent)
    }
    fun launchWisdom(view: View)
    {
        val intent = Intent(view.context, Wisdom::class.java)
        view.context.startActivity(intent)
    }
}