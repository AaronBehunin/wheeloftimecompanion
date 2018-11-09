package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.PadanFain
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Mat
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Bela
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.DevenRide
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.WatchHill
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.TarValon
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.BelTine
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.TrollocWars
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.Winternight
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDarkOne
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDragon
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.WheelofTime

class Activity7R: AppCompatActivity() {

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
        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AbellCauthonView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DarlCoplinView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AlsbetLuhhanView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BerinThaneView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarValonView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DevenRideView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WatchHillView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.FalseDragonView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WheelofTimeView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelTineView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocWarsView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinternightView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocView)
        val view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelaView)

        if (progress.book==1 && progress.chapter<10)
        {
            view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainFriendView)
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
    }
    fun launchMat(view: View)
    {
        val intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchCennBuie(view: View){
        val intent = Intent(view.context, CennBuie::class.java)
        view.context.startActivity(intent)
    }
    fun launchAbellCauthon(view: View){
        val intent = Intent(view.context, AbellCauthon::class.java)
        view.context.startActivity(intent)
    }
    fun launchDarlCoplin(view: View){
        val intent = Intent(view.context, DarlCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchPadanFain(view: View)
    {
        val intent = Intent(view.context, PadanFain::class.java)
        view.context.startActivity(intent)
    }
    fun launchAlsbetLuhhan(view: View){
        val intent = Intent(view.context, AlsbetLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchBerinThane(view: View){
        val intent = Intent(view.context, BerinThane::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarValon(view: View)
    {
        val intent = Intent(view.context, TarValon::class.java)
        view.context.startActivity(intent)
    }
    fun launchDevenRide(view: View)
    {
        val intent = Intent(view.context, DevenRide::class.java)
        view.context.startActivity(intent)
    }
    fun launchWatchHill(view: View)
    {
        val intent = Intent(view.context, WatchHill::class.java)
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
    fun launchWheelofTime(view: View)
    {
        val intent = Intent(view.context, WheelofTime::class.java)
        view.context.startActivity(intent)
    }
    fun launchBelTine(view: View)
    {
        val intent = Intent(view.context, BelTine::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrollocWars(view: View)
    {
        val intent = Intent(view.context, TrollocWars::class.java)
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
    fun launchBela(view: View) {
        val intent = Intent(view.context, Bela::class.java)
        view.context.startActivity(intent)
    }
}