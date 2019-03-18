package com.example.u0450254.wheeloftimecompanion.Terminology

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.R
import com.example.u0450254.wheeloftimecompanion.Terminology.Culture.Wisdom
import com.example.u0450254.wheeloftimecompanion.Terminology.Terms.*

class TermActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        val chapview = findViewById<LinearLayout>(R.id.chapterlayout)

        val view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AngrealView)
        val view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.AvendesoraView)
        val view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CreatorView)
        val view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.darkoneView)
        val view5 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheDragonView)
        val view6 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.DragonsFangView)
        val view7 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.VoidView)
        val view8 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.HighSeatView)
        val view9 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.NineRodsView)
        val view10 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TheOnePowerView)
        val view11 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.SaidinView)
        val view12 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.TaintView)
        val view13 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.WheelofTimeView)


        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

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
        chapview.addView(view12)
        chapview.addView(view13)
    }
    fun launchAngreal(view: View)
    {
        val intent = Intent(view.context, Angreal::class.java)
        view.context.startActivity(intent)
    }
    fun launchAvendesora(view: View)
    {
        val intent = Intent(view.context, Chora::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheCreator(view: View)
    {
        val intent = Intent(view.context, TheCreator::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheDarkOne(view: View)
    {
        val intent = Intent(view.context, TheDarkOne::class.java)
        view.context.startActivity(intent)
    }
    fun launchDragon(view: View)
    {
        val intent = Intent(view.context, TheDragon::class.java)
        view.context.startActivity(intent)
    }
    fun launchDragonsFang(view: View)
    {
        val intent = Intent(view.context, DragonsFang::class.java)
        view.context.startActivity(intent)
    }
    fun launchHighSeat(view: View)
    {
        val intent = Intent(view.context, HighSeat::class.java)
        view.context.startActivity(intent)
    }
    fun launchNineRods(view: View)
    {
        val intent = Intent(view.context, NineRods::class.java)
        view.context.startActivity(intent)
    }
    fun launchTheOnePower(view: View)
    {
        val intent = Intent(view.context, TheOnePower::class.java)
        view.context.startActivity(intent)
    }
    fun launchSaidin(view: View)
    {
        val intent = Intent(view.context, Saidin::class.java)
        view.context.startActivity(intent)
    }
    fun launchTaint(view: View)
    {
        val intent = Intent(view.context, Taint::class.java)
        view.context.startActivity(intent)
    }
    fun launchVoid(view: View)
    {
        val intent = Intent(view.context, Void::class.java)
        view.context.startActivity(intent)
    }
    fun launchWheelofTime(view: View)
    {
        val intent = Intent(view.context, WheelofTime::class.java)
        view.context.startActivity(intent)
    }

}