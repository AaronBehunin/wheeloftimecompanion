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
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 6/5/2018.
 */


class Activity1: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)


        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamAlThorView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WitCongarView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DaiseCongarView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

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
        var intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamAlThor(view: View)
    {
        var intent = Intent(view.context, TamAlThor::class.java)
        view.context.startActivity(intent)
    }
    fun launchWitCongar(view: View)
    {
        var intent = Intent(view.context, WitCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchDaiseCongar(view: View)
    {
        var intent = Intent(view.context, DaiseCongar::class.java)
        view.context.startActivity(intent)
    }
    fun launchBranAlVere(view: View){
        var intent = Intent(view.context, BranAlVere::class.java)
        view.context.startActivity(intent)
    }
    fun launchCennBuie(view: View){
        var intent = Intent(view.context, CennBuie::class.java)
        view.context.startActivity(intent)
    }
    fun launchMat(view: View)
    {
        var intent = Intent(view.context, Mat::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        var intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }

}