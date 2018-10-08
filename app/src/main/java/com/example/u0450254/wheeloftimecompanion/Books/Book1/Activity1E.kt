package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.ScalesofOffice
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Mat
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Bela
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Green
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.TheTwoRivers
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.QuarryRoad
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Westwood
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WinespringInn
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.ThirdAge
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.Void


class Activity1E: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)
        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamAlThorView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DaiseCongarView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WitCongarView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTwoRiversView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreenView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WestwoodView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.QuarryRoadView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringInnView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ScalesofOfficeView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.VoidView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ThirdAgeView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelaView)

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
    }
    fun launchRand(view: View)
    {
        val intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }
    fun launchMat(view: View)
    {
        val intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamAlThor(view: View)
    {
        val intent = Intent(view.context, TamAlThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchBranAlVere(view: View){
        val intent = Intent(view.context, BranAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchCennBuie(view: View){
        val intent = Intent(view.context, CennBuie::class.java)
        view.context.startActivity(intent)
    }
    fun launchDaiseCongar(view: View)
    {
        val intent = Intent(view.context, DaiseCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchWitCongar(view: View)
    {
        val intent = Intent(view.context, WitCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        val intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheTwoRivers(view: View){
        val intent = Intent(view.context, TheTwoRivers::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreen(view: View)
    {
        val intent = Intent(view.context, Green::class.java)
        view.context.startActivity(intent)
    }
    fun launchWestwood(view: View)
    {
        val intent = Intent(view.context, Westwood::class.java)
        view.context.startActivity(intent)
    }
    fun launchQuarryRoad(view: View)
    {
        val intent = Intent(view.context, QuarryRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringInn(view: View) {
        val intent = Intent(view.context, WinespringInn::class.java)
        view.context.startActivity(intent)
    }
    fun launchScalesofOffice(view: View){
        val intent = Intent(view.context, ScalesofOffice::class.java)
        view.context.startActivity(intent)
    }
    fun launchVoid(view: View)
    {
        val intent = Intent(view.context, Void::class.java)
        view.context.startActivity(intent)
    }
    fun launchThirdAge(view: View)
    {
        val intent = Intent(view.context, ThirdAge::class.java)
        view.context.startActivity(intent)
    }
    fun launchBela(view: View) {
        val intent = Intent(view.context, Bela::class.java)
        view.context.startActivity(intent)
    }
}