package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Mat
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.R


class Activity2: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LanView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MoiraineView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SamelCraweView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EwinFinngarView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.RowanHurnView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MarinAlVereView)
        var view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HaralLuhhanView)
        var view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JonThaneView)

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

    fun launchHaralLuhhan(view: View) {
        var intent = Intent(view.context, HaralLuhhan::class.java)
        view.context.startActivity(intent)
    }

    fun launchJonThane(view: View) {
        var intent = Intent(view.context, JonThane::class.java)
        view.context.startActivity(intent)
    }

    fun launchRand(view: View) {
        var intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }

    fun launchMarinAlVere(view: View) {
        var intent = Intent(view.context, MarinAlVere::class.java)
        view.context.startActivity(intent)
    }

    fun launchMat(view: View) {
        var intent = Intent(view.context, Mat::class.java)
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
    fun launchBranAlVere(view: View) {
        var intent = Intent(view.context, BranAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchLan(view: View)
    {
        var intent = Intent(view.context, Lan::class.java)
        view.context.startActivity(intent)
    }
}