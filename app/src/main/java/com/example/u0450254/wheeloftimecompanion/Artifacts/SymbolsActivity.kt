package com.example.u0450254.wheeloftimecompanion.Artifacts

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.GreatSerpentRing
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.RingofTamyrlin
import com.example.u0450254.wheeloftimecompanion.Artifacts.OfficeSymbols.ScalesofOffice
import com.example.u0450254.wheeloftimecompanion.R

class SymbolsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreatSerpentRingView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.RingofTamyrlinView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ScalesofOfficeView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        chapview.addView(view1)
        chapview.addView(view2)
        chapview.addView(view3)
    }
    fun launchGreatSerpentRing(view: View){
        val intent = Intent(view.context, GreatSerpentRing::class.java)
        view.context.startActivity(intent)
    }
    fun launchRingofTamyrlin(view: View){
        val intent = Intent(view.context, RingofTamyrlin::class.java)
        view.context.startActivity(intent)
    }
    fun launchScalesofOffice(view: View){
        val intent = Intent(view.context, ScalesofOffice::class.java)
        view.context.startActivity(intent)
    }
}