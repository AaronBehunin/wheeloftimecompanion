package com.example.u0450254.wheeloftimecompanion.Characters

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Characters.Other.*
import com.example.u0450254.wheeloftimecompanion.R
import kotlinx.android.synthetic.main.guides.*

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

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamAlThorView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BranAlVereView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CennBuieView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DaiseCongarView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WitCongarView)


        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

       charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
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
}