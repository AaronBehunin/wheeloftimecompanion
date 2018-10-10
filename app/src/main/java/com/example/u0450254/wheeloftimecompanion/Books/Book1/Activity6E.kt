package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.TamsSword
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Myrddraal
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Westwood
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.QuarryRoad
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.Winternight

class Activity6E: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)
        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamAlThorView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WestwoodView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.QuarryRoadView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamsSwordView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinternightView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MyrddraalView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TrollocView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        chapview.addView(view1)
        chapview.addView(view2)
        chapview.addView(view3)
        chapview.addView(view4)
        chapview.addView(view5)
        chapview.addView(view6)
        chapview.addView(view7)
        chapview.addView(view8)
    }
    fun launchRand(view: View)
    {
        val intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamAlThor(view: View)
    {
        val intent = Intent(view.context, TamAlThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchWestwood(view: View) {
        val intent = Intent(view.context, Westwood::class.java)
        view.context.startActivity(intent)
    }
    fun launchQuarryRoad(view: View) {
        val intent = Intent(view.context, QuarryRoad::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamsSword(view: View){
        val intent = Intent(view.context, TamsSword::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinternight(view: View)
    {
        val intent = Intent(view.context, Winternight::class.java)
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
}