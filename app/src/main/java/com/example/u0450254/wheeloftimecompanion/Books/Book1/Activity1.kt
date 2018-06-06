package com.example.u0450254.wheeloftimecompanion.Books.Book1

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Characters.Forsworn.Ishamael
import com.example.u0450254.wheeloftimecompanion.Characters.Legends.LewsTherin
import com.example.u0450254.wheeloftimecompanion.Characters.Main_Characters.Rand
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R

/**
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

        inflatedLayoutLews.findViewById<ConstraintLayout>(R.id.parent).removeAllViews()

        chapview.addView(view1)
    }
    fun launchRand(view: View)
    {
        var intent = Intent(view.context, Rand::class.java)
        view.context.startActivity(intent)
    }
}