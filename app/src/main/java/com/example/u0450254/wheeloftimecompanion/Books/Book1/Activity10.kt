package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Egwene
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Mat
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Perrin
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.JonThane
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Moiraine
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Thom
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 6/5/2018.
 */



class Activity10: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.egweneView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.matView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.perrinView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MoiraineView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LanView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ThomView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JonThaneView)
        var view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EmondsFieldView)

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
    }
    fun launchEwgene(view: View)
    {
        var intent = Intent(view.context, Egwene::class.java)
        view.context.startActivity(intent)
    }
    fun launchMat(view: View)
    {
        var intent = Intent(view.context, Mat::class.java)
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
    fun launchLan(view: View)
    {
        var intent = Intent(view.context, Lan::class.java)
        view.context.startActivity(intent)
    }
    fun launchMoiraine(view: View)
    {
        var intent = Intent(view.context, Moiraine::class.java)
        view.context.startActivity(intent)
    }
    fun launchThom(view: View)
    {
        var intent = Intent(view.context, Thom::class.java)
        view.context.startActivity(intent)
    }
    fun launchJonThane(view: View){
        var intent = Intent(view.context, JonThane::class.java)
        view.context.startActivity(intent)
    }
    fun launchEmondsField(view: View)
    {
        var intent = Intent(view.context, EmondsField::class.java)
        view.context.startActivity(intent)
    }
}