package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Aginor
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Ishamael
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.*
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.*
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.GreatBlight
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.SandHills
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Waterwood
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.MountainsofMist
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Mountains.ShayolGhul
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Oceans.WinespringWater
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.NorthRoad
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.OldRoad
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WagonBridge
import com.example.u0450254.wheeloftimecompanion.Organizations.Forsaken
import com.example.u0450254.wheeloftimecompanion.Organizations.VillageCouncil
import com.example.u0450254.wheeloftimecompanion.Organizations.WomensCircle
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Gleeman
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Stones
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Wisdom
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.BelTine
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.Sunday
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.TheBreakingoftheWorld
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.Winternight
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheCreator
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDarkOne
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDragon
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.WheelofTime

class Activity1R: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.egweneView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.perrinView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.nynaeveView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AginorView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ishamaelView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DavAyellinView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AbellCauthonView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ElamDowtryView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JonThaneView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BaerlonView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DevenRideView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TarenFerryView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WatchHillView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SandHillsView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WaterwoodView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreatBlightView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MountainsofMistView)
        val view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ShayolGhulView)
        val view19 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringWaterView)
        val view20 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.NorthRoadView)
        val view21 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OldRoadView)
        val view22 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WagonBridgeView)
        val view23 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ForsakenView)
        val view24 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.VillageCouncilView)
        val view25 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WomensCircleView)
        val view26 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelTineView)
        val view27 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheBreakingoftheWorldView)
        val view28 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CreatorView)
        val view29 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        val view30 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheDragonView)
        val view31 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WheelofTimeView)
        val view32 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WisdomView)
        val view33 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GleemanView)
        val view34 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.StonesView)
        val view35 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SundayView)
        val view36 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinternightView)


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
        chapview.addView(view35)
        chapview.addView(view36)
    }
    fun launchEwgene(view: View)
    {
        val intent = Intent(view.context, Egwene::class.java)
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
    fun launchAginor(view: View)
    {
        val intent = Intent(view.context, Aginor::class.java)
        view.context.startActivity(intent)
    }
    fun launchIshamael(view: View)
    {
        val intent = Intent(view.context, Ishamael::class.java)
        view.context.startActivity(intent)
    }
    fun launchDavAyellin(view: View){
        val intent = Intent(view.context, DavAyellin::class.java)
        view.context.startActivity(intent)
    }
    fun launchAbellCauthon(view: View){
        val intent = Intent(view.context, AbellCauthon::class.java)
        view.context.startActivity(intent)
    }
    fun launchElamDowtry(view: View){
        val intent = Intent(view.context, ElamDowtry::class.java)
        view.context.startActivity(intent)
    }
    fun launchJonThane(view: View){
        val intent = Intent(view.context, JonThane::class.java)
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
    fun launchSandHills(view: View){
        val intent = Intent(view.context, SandHills::class.java)
        view.context.startActivity(intent)
    }
    fun launchWaterwood(view: View) {
        val intent = Intent(view.context, Waterwood::class.java)
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
    fun launchShayolGhul(view: View) {
        val intent = Intent(view.context, ShayolGhul::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringWater(view: View) {
        val intent = Intent(view.context, WinespringWater::class.java)
        view.context.startActivity(intent)
    }
    fun launchNorthRoad(view: View) {
        val intent = Intent(view.context, NorthRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchOldRoad(view: View) {
        val intent = Intent(view.context, OldRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchWagonBridge(view: View) {
        val intent = Intent(view.context, WagonBridge::class.java)
        view.context.startActivity(intent)
    }
    fun launchForsaken(view: View)
    {
        val intent = Intent(view.context, Forsaken::class.java)
        view.context.startActivity(intent)
    }
    fun launchVillageCouncil(view: View)
    {
        val intent = Intent(view.context, VillageCouncil::class.java)
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
    fun launchTheBreakingoftheWorld(view: View)
    {
        val intent = Intent(view.context, TheBreakingoftheWorld::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheCreator(view: View)
    {
        val intent = Intent(view.context, TheCreator::class.java)
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
    fun launchWisdom(view: View)
    {
        val intent = Intent(view.context, Wisdom::class.java)
        view.context.startActivity(intent)
    }
    fun launchGleeman(view: View)
    {
        val intent = Intent(view.context, Gleeman::class.java)
        view.context.startActivity(intent)
    }
    fun launchStones(view: View)
    {
        val intent = Intent(view.context, Stones::class.java)
        view.context.startActivity(intent)
    }
    fun launchSunday(view: View)
    {
        val intent = Intent(view.context, Sunday::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinternight(view: View)
    {
        val intent = Intent(view.context, Winternight::class.java)
        view.context.startActivity(intent)
    }
}