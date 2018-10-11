package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.TamsSword
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.PadanFain
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.*
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Moiraine
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Thom
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Myrddraal
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.*
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Borderlands
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Green
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.TheTwoRivers
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Westwood
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.GreatBlight
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.ShayolGhul
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.QuarryRoad
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WinespringInn
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.Shienar
import com.example.u0450254.wheeloftimecompanion.Locations.Nations.TarValon
import com.example.u0450254.wheeloftimecompanion.Organizations.*
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Gleeman
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.*
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.*

/**
 * Created by u0450254 on 6/5/2018.
 */

class Activity8R: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }

        val splits = inputString.split("-")

        val progress = Progress(splits[0].toInt(), splits[1].toInt())

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.perrinView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AbellCauthonView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DarlCoplinView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BandryCraweView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SamelCraweView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ShienarView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarValonView)
        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BaerlonView)
        var view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CaemlynView)
        var view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DevenRideView)
        var view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarenFerryView)
        var view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WatchHillView)
        var view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BorderlandsView)
        var view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WestwoodView)
        var view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreatBlightView)
        var view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ShayolGhulView)
        var view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ThakandarView)
        var view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.QuarryRoadView)
        var view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DreadlordsView)
        var view23 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ForsakenView)
        var view24 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WomensCircleView)
        var view25 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        var view26 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TaintView)
        var view27 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WheelofTimeView)
        var view28 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ageoflegendsView)
        var view29 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelTineView)
        var view30 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TimeofMadnessView)
        var view31 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocWarsView)
        var view32 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinternightView)
        var view33 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MyrddraalView)
        var view34 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocView)

        if (progress.book==1 && progress.chapter<10)
        {
            view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainFriendView)
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
        chapview.addView(view23)
        chapview.addView(view24)
        chapview.addView(view25)
        chapview.addView(view26)
        chapview.addView(view27)
        chapview.addView(view28)
        chapview.addView(view29)
        chapview.addView(view30)
        chapview.addView(view31)
        chapview.addView(view32)
        chapview.addView(view33)
        chapview.addView(view34)
    }
    fun launchMat(view: View)
    {
        var intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchPerrin(view: View)
    {
        var intent = Intent(view.context, Perrin::class.java)
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
    fun launchBandryCrawe(view: View){
        var intent = Intent(view.context, BandryCrawe::class.java)
        view.context.startActivity(intent)
    }
    fun launchSamelCrawe(view: View){
        var intent = Intent(view.context, SamelCrawe::class.java)
        view.context.startActivity(intent)
    }
    fun launchPadanFain(view: View)
    {
        var intent = Intent(view.context, PadanFain::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        var intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchShienar(view: View)
    {
        var intent = Intent(view.context, Shienar::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarValon(view: View)
    {
        var intent = Intent(view.context, TarValon::class.java)
        view.context.startActivity(intent)
    }
    fun launchBaerlon(view: View)
    {
        var intent = Intent(view.context, Baerlon::class.java)
        view.context.startActivity(intent)
    }
    fun launchCaemlyn(view: View) {
        var intent = Intent(view.context, Caemlyn::class.java)
        view.context.startActivity(intent)
    }
    fun launchDevenRide(view: View)
    {
        var intent = Intent(view.context, DevenRide::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarenFerry(view: View)
    {
        var intent = Intent(view.context, TarenFerry::class.java)
        view.context.startActivity(intent)
    }
    fun launchWatchHill(view: View)
    {
        var intent = Intent(view.context, WatchHill::class.java)
        view.context.startActivity(intent)
    }
    fun launchBorderlands(view: View) {
        var intent = Intent(view.context, Borderlands::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreatBlight(view: View) {
        var intent = Intent(view.context, GreatBlight::class.java)
        view.context.startActivity(intent)
    }
    fun launchShayolGhul(view: View) {
        var intent = Intent(view.context, ShayolGhul::class.java)
        view.context.startActivity(intent)
    }
    fun launchQuarryRoad(view: View) {
        var intent = Intent(view.context, QuarryRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchDreadlords(view: View)
    {
        var intent = Intent(view.context, Dreadlords::class.java)
        view.context.startActivity(intent)
    }
    fun launchForsaken(view: View)
    {
        var intent = Intent(view.context, Forsaken::class.java)
        view.context.startActivity(intent)
    }
    fun launchWomensCircle(view: View)
    {
        var intent = Intent(view.context, WomensCircle::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        var intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheOnePower(view: View)
    {
        var intent = Intent(view.context, TheOnePower::class.java)
        view.context.startActivity(intent)
    }
    fun launchTaint(view: View)
    {
        var intent = Intent(view.context, Taint::class.java)
        view.context.startActivity(intent)
    }
    fun launchWheelofTime(view: View)
    {
        var intent = Intent(view.context, WheelofTime::class.java)
        view.context.startActivity(intent)
    }
    fun launchAgeofLegends(view: View)
    {
        var intent = Intent(view.context, AgeofLegends::class.java)
        view.context.startActivity(intent)
    }
    fun launchBelTine(view: View)
    {
        var intent = Intent(view.context, BelTine::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheBreakingoftheWorld(view: View)
    {
        var intent = Intent(view.context, TheBreakingoftheWorld::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinternight(view: View)
    {
        var intent = Intent(view.context, Winternight::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrollocWars(view: View)
    {
        var intent = Intent(view.context, TrollocWars::class.java)
        view.context.startActivity(intent)
    }
    fun launchMyrddraal(view: View) {
        var intent = Intent(view.context, Myrddraal::class.java)
        view.context.startActivity(intent)
    }
    fun launchTrolloc(view: View) {
        var intent = Intent(view.context, Trolloc::class.java)
        view.context.startActivity(intent)
    }
    fun launchWestwood(view: View) {
        var intent = Intent(view.context, Westwood::class.java)
        view.context.startActivity(intent)
    }
}