package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.JainFarstrider
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Nynaeve
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Perrin
import com.example.u0450254.wheeloftimecompanion.Characters.Other.HaralLuhhan
import com.example.u0450254.wheeloftimecompanion.Characters.Other.KarialThor
import com.example.u0450254.wheeloftimecompanion.Characters.Other.OrenDautry
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Myrddraal
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WinespringInn
import com.example.u0450254.wheeloftimecompanion.Organizations.AesSedai
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.BelTine
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDarkOne


class Activity5R: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.perrinView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.nynaeveView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LanView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JainFarstriderView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.KarialThorView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OrenDautryView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringInnView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelTineView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MyrddraalView)

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
    fun launchLan(view: View)
    {
        val intent = Intent(view.context, Lan::class.java)
        view.context.startActivity(intent)
    }
    fun launchJainFarstrider(view: View)
    {
        val intent = Intent(view.context, JainFarstrider::class.java)
        view.context.startActivity(intent)
    }
    fun launchKarialThor(view: View){
        val intent = Intent(view.context, KarialThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchOrenDautry(view: View){
        val intent = Intent(view.context, OrenDautry::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        val intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        val intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringInn(view: View) {
        val intent = Intent(view.context, WinespringInn::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedai(view: View)
    {
        val intent = Intent(view.context, AesSedai::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        val intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchBelTine(view: View)
    {
        val intent = Intent(view.context, BelTine::class.java)
        view.context.startActivity(intent)
    }
    fun launchMyrddraal(view: View) {
        val intent = Intent(view.context, Myrddraal::class.java)
        view.context.startActivity(intent)
    }
}