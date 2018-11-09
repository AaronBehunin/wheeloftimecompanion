package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.MoirainesStaff
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.TamsSword
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Mat
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Moiraine
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.TheTwoRivers
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WinespringInn
import com.example.u0450254.wheeloftimecompanion.Organizations.AesSedai
import com.example.u0450254.wheeloftimecompanion.Organizations.Warder
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.OldTongue

class Activity9E: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)
        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MoiraineView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LanView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamAlThorView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PaetalCarrView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwardCandwinView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BiliCongarView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DarlCoplinView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HariCoplinView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheTwoRiversView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringInnView)
        val view14 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MoirainesStaffView)
        val view15 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamsSwordView)
        val view16 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiView)
        val view17 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WarderView)
        val view18 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OldTongueView)

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
    fun launchMoiraine(view: View)
    {
        val intent = Intent(view.context, Moiraine::class.java)
        view.context.startActivity(intent)
    }
    fun launchLan(view: View)
    {
        val intent = Intent(view.context, Lan::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamAlThor(view: View)
    {
        val intent = Intent(view.context, TamAlThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchPaetalCarr(view: View){
        val intent = Intent(view.context, PaetalCarr::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwardCandwin(view: View){
        val intent = Intent(view.context, EwardCandwin::class.java)
        view.context.startActivity(intent)
    }
    fun launchBiliCongar(view: View) {
        val intent = Intent(view.context, BiliCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchDarlCoplin(view: View) {
        val intent = Intent(view.context, DarlCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchHariCoplin(view: View){
        val intent = Intent(view.context, HariCoplin::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        val intent = Intent(view.context, EmondsField::class.java)
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
    fun launchMoirainesStaff(view: View){
        val intent = Intent(view.context, MoirainesStaff::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamsSword(view: View){
        val intent = Intent(view.context, TamsSword::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedai(view: View)
    {
        val intent = Intent(view.context, AesSedai::class.java)
        view.context.startActivity(intent)
    }
    fun launchWarder(view: View)
    {
        val intent = Intent(view.context, Warder::class.java)
        view.context.startActivity(intent)
    }
    fun launchOldTongue(view: View)
    {
        val intent = Intent(view.context, OldTongue::class.java)
        view.context.startActivity(intent)
    }
}