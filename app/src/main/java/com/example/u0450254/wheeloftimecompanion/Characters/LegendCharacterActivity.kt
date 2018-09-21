package com.example.u0450254.wheeloftimecompanion.Characters

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.*
import com.example.u0450254.wheeloftimecompanion.R
import kotlinx.android.synthetic.main.guides.*

/**
 * Created by u0450254 on 5/30/2018.
 */
class  LegendCharacterActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)




        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.lewsView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.EldreneayCarlanView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ArturHawkwingView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.GreenManView)
        var view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.JainFarstriderView)
        var view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AemonalThorinView)
        var view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.IlyenaTherinMoerelleView)
        var view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.LamanDamodredView)


        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
        charview.addView(view5)
        charview.addView(view6)
        charview.addView(view7)
        charview.addView(view8)
    }
    fun launchLewsTherin(view: View)
    {
        var intent = Intent(view.context, LewsTherin::class.java)
        view.context.startActivity(intent)
    }
    fun launchArturHawkwing(view: View)
    {
        var intent = Intent(view.context, ArturHawkwing::class.java)
        view.context.startActivity(intent)
    }
    fun launchLamanDamodred(view: View)
    {
        var intent = Intent(view.context, LamanDamodred::class.java)
        view.context.startActivity(intent)
    }
    fun launchGreenMan(view: View)
    {
        var intent = Intent(view.context, GreenMan::class.java)
        view.context.startActivity(intent)
    }
    fun launchAemonalThorin(view: View)
    {
        var intent = Intent(view.context, AemonalThorin::class.java)
        view.context.startActivity(intent)
    }
    fun launchEldreneayCarlan(view: View)
    {
        var intent = Intent(view.context, EldreneayCarlan::class.java)
        view.context.startActivity(intent)
    }
    fun launchIlyenaTherinMoerelle(view: View)
    {
        var intent = Intent(view.context, IlyenaTherinMoerelle::class.java)
        view.context.startActivity(intent)
    }
    fun launchJainFarstrider(view: View)
    {
        var intent = Intent(view.context, JainFarstrider::class.java)
        view.context.startActivity(intent)
    }


}