package com.example.u0450254.wheeloftimecompanion.Characters

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/30/2018.
 */
class OtherCharacterActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)


        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MarinAlVereView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DaiseCongarView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WitCongarView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SamelCraweView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwinFinngarView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.RowanHurnView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JonThaneView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
        charview.addView(view7)
        charview.addView(view8)
        charview.addView(view9)
        charview.addView(view10)
    }


    fun launchWitCongar(view: View)
    {
        var intent = Intent(view.context, WitCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchDaiseCongar(view: View) {
        var intent = Intent(view.context, DaiseCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchBranAlVere(view: View) {
        var intent = Intent(view.context, BranAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchCennBuie(view: View){
        var intent = Intent(view.context, CennBuie::class.java)
        view.context.startActivity(intent)
    }
    fun launchHaralLuhhan(view: View){
        var intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }
    fun launchJonThane(view: View){
        var intent = Intent(view.context, JonThane::class.java)
        view.context.startActivity(intent)
    }
    fun launchMarinAlVere(view: View){
        var intent = Intent(view.context, MarinAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwinFinngar(view: View){
        var intent = Intent(view.context, EwinFinngar::class.java)
        view.context.startActivity(intent)
    }
    fun launchRowanHurn(view: View){
        var intent = Intent(view.context, RowanHurn::class.java)
        view.context.startActivity(intent)
    }
    fun launchSamelCrawe(view: View){
        var intent = Intent(view.context, SamelCrawe::class.java)
        view.context.startActivity(intent)
    }
}
