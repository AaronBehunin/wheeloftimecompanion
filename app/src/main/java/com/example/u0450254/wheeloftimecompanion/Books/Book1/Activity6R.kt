package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.TamsSword
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.GreenMan
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.LamanDamodred
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Mat
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Myrddraal
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Creatures.Races.Ogier
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Westwood
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.MountainsofMist
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.SpineoftheWorld
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.QuarryRoad
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Cairhien
import com.example.u0450254.wheeloftimecompanion.Organizations.Aiel
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Gleeman
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.ShiningWallsBattle
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.Winternight

/**
 * Created by u0450254 on 6/5/2018.
 */

class Activity6R: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)

        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreenManView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LamanDamodredView)

        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.KarialThorView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MarinAlVereView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AlsbetLuhhanView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)

        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CairhienView)

        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)

        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DragonwallView)
        var view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SpineoftheWorldView)

        var view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AielView)

        var view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AvendesoraView)

        var view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ShiningWallsBattleView)
        var view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinternightView)

        var view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GleemanView)

        var view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OgierView)


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
        var intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreenMan(view: View)
    {
        var intent = Intent(view.context, GreenMan::class.java)
        view.context.startActivity(intent)
    }
    fun launchLamanDamodred(view: View)
    {
        var intent = Intent(view.context, LamanDamodred::class.java)
        view.context.startActivity(intent)
    }
    fun launchKarialThor(view: View){
        var intent = Intent(view.context, KarialThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchMarinAlVere(view: View){
        var intent = Intent(view.context, MarinAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchCennBuie(view: View){
        var intent = Intent(view.context, CennBuie::class.java)
        view.context.startActivity(intent)
    }
    fun launchAlsbetLuhhan(view: View){
        var intent = Intent(view.context, AlsbetLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        var intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchCairhien(view: View)
    {
        var intent = Intent(view.context, Cairhien::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        var intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchSpineoftheWorld(view: View) {
        var intent = Intent(view.context, SpineoftheWorld::class.java)
        view.context.startActivity(intent)
    }
    fun launchMountainsofMist(view: View) {
        var intent = Intent(view.context, MountainsofMist::class.java)
        view.context.startActivity(intent)
    }
    fun launchAiel(view: View)
    {
        var intent = Intent(view.context, Aiel::class.java)
        view.context.startActivity(intent)
    }
    fun launchShiningWallsBattle(view: View)
    {
        var intent = Intent(view.context, ShiningWallsBattle::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinternight(view: View)
    {
        var intent = Intent(view.context, Winternight::class.java)
        view.context.startActivity(intent)
    }
    fun launchGleeman(view: View)
    {
        var intent = Intent(view.context, Gleeman::class.java)
        view.context.startActivity(intent)
    }
    fun launchOgier(view: View) {
        var intent = Intent(view.context, Ogier::class.java)
        view.context.startActivity(intent)
    }
}