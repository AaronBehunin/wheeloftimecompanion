package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.TamsSword
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Narg
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.JainFarstrider
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Nynaeve
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Perrin
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.HaralLuhhan
import com.example.u0450254.wheeloftimecompanion.Characters.Other.KarialThor
import com.example.u0450254.wheeloftimecompanion.Characters.Other.OrenDautry
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Bela
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Myrddraal
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.TheTwoRivers
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Forests.Westwood
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.Roads.WinespringInn
import com.example.u0450254.wheeloftimecompanion.Organizations.AesSedai
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.BelTine
import com.example.u0450254.wheeloftimecompanion.Terminology.Events.Winternight
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.TheDarkOne

/**
 * Created by u0450254 on 6/5/2018.
 */

class Activity5R: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.perrinView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.nynaeveView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LanView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JainFarstriderView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.KarialThorView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.OrenDautryView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WinespringInnView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AesSedaiView)
        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        var view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelTineView)
        var view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MyrddraalView)

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
    fun launchMyrddraal(view: View) {
        var intent = Intent(view.context, Myrddraal::class.java)
        view.context.startActivity(intent)
    }
    fun launchKarialThor(view: View){
        var intent = Intent(view.context, KarialThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchJainFarstrider(view: View)
    {
        var intent = Intent(view.context, JainFarstrider::class.java)
        view.context.startActivity(intent)
    }
    fun launchLan(view: View)
    {
        var intent = Intent(view.context, Lan::class.java)
        view.context.startActivity(intent)
    }
    fun launchOrenDautry(view: View){
        var intent = Intent(view.context, OrenDautry::class.java)
        view.context.startActivity(intent)
    }
    fun launchPerrin(view: View)
    {
        var intent = Intent(view.context, Perrin::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        var intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchNynaeve(view: View)
    {
        var intent = Intent(view.context, Nynaeve::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        var intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchAesSedai(view: View)
    {
        var intent = Intent(view.context, AesSedai::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        var intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
    fun launchWinespringInn(view: View) {
        var intent = Intent(view.context, WinespringInn::class.java)
        view.context.startActivity(intent)
    }
    fun launchBelTine(view: View)
    {
        var intent = Intent(view.context, BelTine::class.java)
        view.context.startActivity(intent)
    }
}