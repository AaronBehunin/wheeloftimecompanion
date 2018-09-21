package com.example.u0450254.wheeloftimecompanion.Artifacts

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.Angreal.TheRobedWoman
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.GreatSerpentRing
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.RingofTamyrlin
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.ScalesofOffice
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.TamsSword
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Mat
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Locations.Cities.EmondsField
import com.example.u0450254.wheeloftimecompanion.R
import kotlinx.android.synthetic.main.guides.*

/*
 * Created by u0450254 on 6/5/2018.
 */


class SymbolsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)


        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreatSerpentRingView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.RingofTamyrlinView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ScalesofOfficeView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

        chapview.addView(view1)
        chapview.addView(view2)
        chapview.addView(view3)
    }

    fun launchGreatSerpentRing(view: View){
        var intent = Intent(view.context, GreatSerpentRing::class.java)
        view.context.startActivity(intent)
    }
    fun launchRingofTamyrlin(view: View){
        var intent = Intent(view.context, RingofTamyrlin::class.java)
        view.context.startActivity(intent)
    }
    fun launchScalesofOffice(view: View){
        var intent = Intent(view.context, ScalesofOffice::class.java)
        view.context.startActivity(intent)
    }
}