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

/**
 * Created by u0450254 on 6/5/2018.
 */

class Activity3E : AppCompatActivity() {

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

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.egweneView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.perrinView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.nynaeveView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamAlThorView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HuBarranView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TadBarranView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WitCongarView)
        var view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SamelCraweView)
        var view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainView)
        var view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwinFinngarView)
        var view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)
        var view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        var view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreenView)
        var view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTwoRiversView)
        var view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringInnView)
        var view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WagonBridgeView)
        var view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.VillageCouncilView)
        var view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WisdomView)




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
    fun launchTamAlThor(view: View)
    {
        var intent = Intent(view.context, TamAlThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchBranAlVere(view: View) {
        var intent = Intent(view.context, BranAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchHuBarran(view: View){
        var intent = Intent(view.context, HuBarran::class.java)
        view.context.startActivity(intent)
    }
    fun launchTadBarran(view: View){
        var intent = Intent(view.context, TadBarran::class.java)
        view.context.startActivity(intent)
    }
    fun launchCennBuie(view: View){
        var intent = Intent(view.context, CennBuie::class.java)
        view.context.startActivity(intent)
    }
    fun launchWitCongar(view: View)
    {
        var intent = Intent(view.context, WitCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchSamelCrawe(view: View){
        var intent = Intent(view.context, SamelCrawe::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        var intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwgene(view: View)
    {
        var intent = Intent(view.context, Egwene::class.java)
        view.context.startActivity(intent)
    }
    fun launchPadanFain(view: View)
    {
        var intent = Intent(view.context, PadanFain::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwinFinngar(view: View){
        var intent = Intent(view.context, EwinFinngar::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreen(view: View) {
        var intent = Intent(view.context, Green::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        var intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchMat(view: View)
    {
        var intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchNynaeve(view: View)
    {
        var intent = Intent(view.context, Nynaeve::class.java)
        view.context.startActivity(intent)
    }
    fun launchPerrin(view: View)
    {
        var intent = Intent(view.context, Perrin::class.java)
        view.context.startActivity(intent)
    }
    fun launchRand(view: View) {
        var intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheTwoRivers(view: View) {
        var intent = Intent(view.context, TheTwoRivers::class.java)
        view.context.startActivity(intent)
    }
    fun launchVillageCouncil(view: View)
    {
        var intent = Intent(view.context, VillageCouncil::class.java)
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
    fun launchWisdom(view: View)
    {
        var intent = Intent(view.context, Wisdom::class.java)
        view.context.startActivity(intent)
    }
}