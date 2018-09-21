package com.example.u0450254.wheeloftimecompanion.Locations

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.ForestsActivity
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.MountainActivity
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.OceanActivity
import com.example.u0450254.wheeloftimecompanion.Locations.Landmarks.RoadsandBuildings
import com.example.u0450254.wheeloftimecompanion.R


class LandmarksActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landmark_menu_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var forestView = findViewById<LinearLayout>(R.id.Areas)
        var mountainView = findViewById<LinearLayout>(R.id.Mountains)
        var oceanView = findViewById<LinearLayout>(R.id.Rivers)
        var roadView = findViewById<LinearLayout>(R.id.Roads)

        forestView.setOnClickListener() {
            var intent = Intent(this, ForestsActivity::class.java)
            startActivity(intent)
        }
        mountainView.setOnClickListener() {
            var intent = Intent(this, MountainActivity::class.java)
            startActivity(intent)
        }
        oceanView.setOnClickListener() {
            var intent = Intent(this, OceanActivity::class.java)
            startActivity(intent)
        }
        roadView.setOnClickListener() {
            var intent = Intent(this, RoadsandBuildings::class.java)
            startActivity(intent)
        }
    }
}