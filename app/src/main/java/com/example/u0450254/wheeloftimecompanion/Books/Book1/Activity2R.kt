package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Egwene
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Nynaeve
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Bela
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.*
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.GreatBlight
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.MountainsofMist
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Westwood
import com.example.u0450254.wheeloftimecompanion.Organizations.Warder
import com.example.u0450254.wheeloftimecompanion.Organizations.WomensCircle
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Braid
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Stones
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.BelTine
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.Winternight
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.WheelofTime
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Wisdom


class Activity2R : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.egweneView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.nynaeveView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HuBarranView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TadBarranView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DagCoplinView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AlsbetLuhhanView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BaerlonView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DevenRideView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarenFerryView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WatchHillView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreatBlightView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MountainsofMistView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WestwoodView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WarderView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WomensCircleView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelTineView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BraidView)
        val view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.StonesView)
        val view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WheelofTimeView)
        val view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinternightView)
        val view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WisdomView)
        val view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelaView)

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
    fun launchEwgene(view: View)
    {
        val intent = Intent(view.context, Egwene::class.java)
        view.context.startActivity(intent)
    }
    fun launchNynaeve(view: View)
    {
        val intent = Intent(view.context, Nynaeve::class.java)
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
    fun launchDagCoplin(view: View){
        val intent = Intent(view.context, DagCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchAlsbetLuhhan(view: View){
        val intent = Intent(view.context, AlsbetLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchBaerlon(view: View)
    {
        val intent = Intent(view.context, Baerlon::class.java)
        view.context.startActivity(intent)
    }
    fun launchDevenRide(view: View)
    {
        val intent = Intent(view.context, DevenRide::class.java)
        view.context.startActivity(intent)
    }
    fun launchTarenFerry(view: View)
    {
        val intent = Intent(view.context, TarenFerry::class.java)
        view.context.startActivity(intent)
    }
    fun launchWatchHill(view: View)
    {
        val intent = Intent(view.context, WatchHill::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreatBlight(view: View) {
        val intent = Intent(view.context, GreatBlight::class.java)
        view.context.startActivity(intent)
    }
    fun launchMountainsofMist(view: View) {
        val intent = Intent(view.context, MountainsofMist::class.java)
        view.context.startActivity(intent)
    }
    fun launchWestwood(view: View) {
        val intent = Intent(view.context, Westwood::class.java)
        view.context.startActivity(intent)
    }
    fun launchWarder(view: View)
    {
        val intent = Intent(view.context, Warder::class.java)
        view.context.startActivity(intent)
    }
    fun launchWomensCircle(view: View)
    {
        val intent = Intent(view.context, WomensCircle::class.java)
        view.context.startActivity(intent)
    }
    fun launchBelTine(view: View)
    {
        val intent = Intent(view.context, BelTine::class.java)
        view.context.startActivity(intent)
    }
    fun launchBela(view: View) {
        val intent = Intent(view.context, Bela::class.java)
        view.context.startActivity(intent)
    }
    fun launchBraid(view: View) {
        val intent = Intent(view.context, Braid::class.java)
        view.context.startActivity(intent)
    }
    fun launchStones(view: View)
    {
        var intent = Intent(view.context, Stones::class.java)
        view.context.startActivity(intent)
    }
    fun launchWheelofTime(view: View)
    {
        val intent = Intent(view.context, WheelofTime::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinternight(view: View)
    {
        val intent = Intent(view.context, Winternight::class.java)
        view.context.startActivity(intent)
    }
    fun launchWisdom(view: View)
    {
        val intent = Intent(view.context, Wisdom::class.java)
        view.context.startActivity(intent)
    }
}