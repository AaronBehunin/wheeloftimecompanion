package com.example.u0450254.wheeloftimecompanion

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Egwene
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Nynaeve
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Perrin
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand

/**
 * Created by u0450254 on 5/30/2018.
 */
class MainCharacterActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.randView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.perrinView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.nynaeveView)
        var view4 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.egweneView)

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
        charview.addView(view4)
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
    fun launchNynaeve(view: View)
    {
        var intent = Intent(view.context, Nynaeve::class.java)
        view.context.startActivity(intent)
    }
    fun launchEwgene(view: View)
    {
        var intent = Intent(view.context, Egwene::class.java)
        view.context.startActivity(intent)
    }
}