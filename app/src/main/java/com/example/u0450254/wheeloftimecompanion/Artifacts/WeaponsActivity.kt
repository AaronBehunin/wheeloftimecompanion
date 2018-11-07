package com.example.u0450254.wheeloftimecompanion.Artifacts

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.ColorShiftCloak
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.HalfMoonAxe
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.MoirainesStaff
import com.example.u0450254.wheeloftimecompanion.Artifacts.Weapons.TamsSword
import com.example.u0450254.wheeloftimecompanion.R

/*
 * Created by u0450254 on 6/5/2018.
 */


class WeaponsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HalfMoonAxeView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TamsSwordView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.MoirainesStaffView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ColorShiftCloakView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        chapview.addView(view1)
        chapview.addView(view2)
        chapview.addView(view3)
        chapview.addView(view4)
    }

    fun launchColorShiftCloak(view: View){
        var intent = Intent(view.context, ColorShiftCloak::class.java)
        view.context.startActivity(intent)
    }
    fun launchHalfMoonAxe(view: View){
        var intent = Intent(view.context, HalfMoonAxe::class.java)
        view.context.startActivity(intent)
    }
    fun launchMoirainesStaff(view: View){
        var intent = Intent(view.context, MoirainesStaff::class.java)
        view.context.startActivity(intent)
    }
    fun launchTamsSword(view: View){
        var intent = Intent(view.context, TamsSword::class.java)
        view.context.startActivity(intent)
    }
}