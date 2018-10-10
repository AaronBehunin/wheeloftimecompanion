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
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Egwene
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Mat
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Nynaeve
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Moiraine
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Thom
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Bela
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Myrddraal
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.DevenRide
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
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

/**
 * Created by u0450254 on 6/5/2018.
 */

class Activity7R: AppCompatActivity() {

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

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)

        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AbellCauthonView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DarlCoplinView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AlsbetLuhhanView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BerinThaneView)

        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarValonView)

        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DevenRideView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WatchHillView)

        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamsSwordView)

        var view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        var view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.FalseDragonView)
        var view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WheelofTimeView)

        var view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelTineView)
        var view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocWarsView)
        var view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinternightView)

        var view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocView)

        var view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelaView)

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
        chapview.addView(view19)
    }
    fun launchMat(view: View)
    {
        var intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchCennBuie(view: View){
        var intent = Intent(view.context, CennBuie::class.java)
        view.context.startActivity(intent)
    }
    fun launchAbellCauthon(view: View){
        var intent = Intent(view.context, AbellCauthon::class.java)
        view.context.startActivity(intent)
    }
    fun launchDarlCoplin(view: View){
        var intent = Intent(view.context, DarlCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchPadanFain(view: View)
    {
        var intent = Intent(view.context, PadanFain::class.java)
        view.context.startActivity(intent)
    }
    fun launchAlsbetLuhhan(view: View){
        var intent = Intent(view.context, AlsbetLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchBerinThane(view: View){
        var intent = Intent(view.context, BerinThane::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarValon(view: View)
    {
        var intent = Intent(view.context, TarValon::class.java)
        view.context.startActivity(intent)
    }
    fun launchDevenRide(view: View)
    {
        var intent = Intent(view.context, DevenRide::class.java)
        view.context.startActivity(intent)
    }
    fun launchWatchHill(view: View)
    {
        var intent = Intent(view.context, WatchHill::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        var intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchDragon(view: View)
    {
        var intent = Intent(view.context, TheDragon::class.java)
        view.context.startActivity(intent)
    }
    fun launchWheelofTime(view: View)
    {
        var intent = Intent(view.context, WheelofTime::class.java)
        view.context.startActivity(intent)
    }
    fun launchBelTine(view: View)
    {
        var intent = Intent(view.context, BelTine::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrollocWars(view: View)
    {
        var intent = Intent(view.context, TrollocWars::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinternight(view: View)
    {
        var intent = Intent(view.context, Winternight::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrolloc(view: View) {
        var intent = Intent(view.context, Trolloc::class.java)
        view.context.startActivity(intent)
    }
    fun launchBela(view: View) {
        var intent = Intent(view.context, Bela::class.java)
        view.context.startActivity(intent)
    }
}