package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.AemonalThorin
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.EldreneayCarlan
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Nynaeve
import com.example.u0450254.wheeloftimecompanion.Characters.Other.AbellCauthon
import com.example.u0450254.wheeloftimecompanion.Characters.Other.JonThane
import com.example.u0450254.wheeloftimecompanion.Characters.Other.MarinAlVere
import com.example.u0450254.wheeloftimecompanion.Characters.Other.OrenDautry
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Thom
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Myrddraal
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Creatures.Races.Ogier
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.MountainsofMist
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.ShayolGhul
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.Tarendrelle
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Manetheren
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.TarValon
import com.example.u0450254.wheeloftimecompanion.Organizations.Darkfriends
import com.example.u0450254.wheeloftimecompanion.Organizations.Dreadlords
import com.example.u0450254.wheeloftimecompanion.Organizations.VillageCouncil
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.BattleTarendrelle
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.FieldofBekkar
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.TrollocWars
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDarkOne

class Activity9R: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.nynaeveView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ThomView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AemonalThorinView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EldreneayCarlanView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MarinAlVereView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AbellCauthonView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OrenDautryView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JonThaneView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ManetherenView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarValonView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MountainsofMistView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ShayolGhulView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarendrelleView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DarkfriendsView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DreadlordsView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.VillageCouncilView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        val view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.FieldofBekkarView)
        val view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BattleTarendrelleView)
        val view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocWarsView)
        val view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MyrddraalView)
        val view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocView)
        val view23 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OgierView)

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
    fun launchNynaeve(view: View)
    {
        val intent = Intent(view.context, Nynaeve::class.java)
        view.context.startActivity(intent)
    }
    fun launchThom(view: View)
    {
        val intent = Intent(view.context, Thom::class.java)
        view.context.startActivity(intent)
    }
    fun launchAemonalThorin(view: View)
    {
        val intent = Intent(view.context, AemonalThorin::class.java)
        view.context.startActivity(intent)
    }
    fun launchEldreneayCarlan(view: View)
    {
        val intent = Intent(view.context, EldreneayCarlan::class.java)
        view.context.startActivity(intent)
    }
    fun launchMarinAlVere(view: View){
        val intent = Intent(view.context, MarinAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchAbellCauthon(view: View){
        val intent = Intent(view.context, AbellCauthon::class.java)
        view.context.startActivity(intent)
    }
    fun launchOrenDautry(view: View){
        val intent = Intent(view.context, OrenDautry::class.java)
        view.context.startActivity(intent)
    }
    fun launchJonThane(view: View){
        val intent = Intent(view.context, JonThane::class.java)
        view.context.startActivity(intent)
    }
    fun launchManetheren(view: View)
    {
        val intent = Intent(view.context, Manetheren::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarValon(view: View)
    {
        val intent = Intent(view.context, TarValon::class.java)
        view.context.startActivity(intent)
    }
    fun launchMountainsofMist(view: View) {
        val intent = Intent(view.context, MountainsofMist::class.java)
        view.context.startActivity(intent)
    }
    fun launchShayolGhul(view: View) {
        val intent = Intent(view.context, ShayolGhul::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarendrelle(view: View) {
        val intent = Intent(view.context, Tarendrelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchDarkfriends(view: View)
    {
        val intent = Intent(view.context, Darkfriends::class.java)
        view.context.startActivity(intent)
    }
    fun launchDreadlords(view: View)
    {
        val intent = Intent(view.context, Dreadlords::class.java)
        view.context.startActivity(intent)
    }
    fun launchVillageCouncil(view: View)
    {
        val intent = Intent(view.context, VillageCouncil::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        val intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchFieldofBekkar(view: View)
    {
        val intent = Intent(view.context, FieldofBekkar::class.java)
        view.context.startActivity(intent)
    }
    fun launchBattleTarendrelle(view: View)
    {
        val intent = Intent(view.context, BattleTarendrelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrollocWars(view: View)
    {
        val intent = Intent(view.context, TrollocWars::class.java)
        view.context.startActivity(intent)
    }
    fun launchMyrddraal(view: View) {
        val intent = Intent(view.context, Myrddraal::class.java)
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