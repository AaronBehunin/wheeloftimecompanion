package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.Ishamael
import com.example.u0450254.wheeloftimecompanion.Characters.Forsaken.PadanFain
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.LewsTherin
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.*
import com.example.u0450254.wheeloftimecompanion.Characters.Other.BranAlVere
import com.example.u0450254.wheeloftimecompanion.Characters.Other.CennBuie
import com.example.u0450254.wheeloftimecompanion.Characters.Other.EwinFinngar
import com.example.u0450254.wheeloftimecompanion.Characters.Other.HaralLuhhan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 6/5/2018.
 */

class Activity3: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.perrinView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.egweneView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.nynaeveView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamAlThorView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.PadanFainView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwinFinngarView)
        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

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
    }
    fun launchPadanFain(view: View)
    {
        var intent = Intent(view.context, PadanFain::class.java)
        view.context.startActivity(intent)
    }
    fun launchRand(view: View)
    {
        var intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }
    fun launchPerrin(view: View)
    {
        var intent = Intent(view.context, Perrin::class.java)
        view.context.startActivity(intent)
    }
    fun launchBranAlVere(view: View) {
        var intent = Intent(view.context, BranAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        var intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamAlThor(view: View)
    {
        var intent = Intent(view.context, TamAlThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwinFinngar(view: View){
        var intent = Intent(view.context, EwinFinngar::class.java)
        view.context.startActivity(intent)
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
    fun launchNynaeve(view: View)
    {
        var intent = Intent(view.context, Nynaeve::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwgene(view: View)
    {
        var intent = Intent(view.context, Egwene::class.java)
        view.context.startActivity(intent)
    }


}