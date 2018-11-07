/**
 * Created by u0450254 on 5/30/2018.
 */
package com.example.u0450254.wheeloftimecompanion.Creatures

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Lan
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Moiraine
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.TamAlThor
import com.example.u0450254.wheeloftimecompanion.Characters.Supporting.Thom
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Bela
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Cloud
import com.example.u0450254.wheeloftimecompanion.Creatures.Animals.Scratch
import com.example.u0450254.wheeloftimecompanion.Creatures.Monsters.Trolloc
import com.example.u0450254.wheeloftimecompanion.R

/**
 * Created by u0450254 on 5/30/2018.
 */
class AnimalsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val inflater = LayoutInflater.from(this)
        val inflatedLayoutLews = inflater.inflate(R.layout.guides, null, false)

        var charview = findViewById<LinearLayout>(R.id.chapterlayout)

        var view1 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.BelaView)
        var view2 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.CloudView)
        var view3 = inflatedLayoutLews.findViewById<RelativeLayout>(R.id.ScratchView)

        inflatedLayoutLews.findViewById<LinearLayout>(R.id.parent).removeAllViews()

        charview.addView(view1)
        charview.addView(view2)
        charview.addView(view3)
    }

    fun launchBela(view: View) {
        var intent = Intent(view.context, Bela::class.java)
        view.context.startActivity(intent)
    }
    fun launchCloud(view: View) {
        var intent = Intent(view.context, Cloud::class.java)
        view.context.startActivity(intent)
    }
    fun launchScratch(view: View) {
        var intent = Intent(view.context, Scratch::class.java)
        view.context.startActivity(intent)
    }
}