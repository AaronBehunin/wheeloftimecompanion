package com.example.u0450254.wheeloftimecompanion


import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Locations.CityActivity
import com.example.u0450254.wheeloftimecompanion.Locations.LandmarksActivity
import com.example.u0450254.wheeloftimecompanion.Locations.NationActivity
import com.example.u0450254.wheeloftimecompanion.R

class LocationActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.location_menu)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var nationView = findViewById<TextView>(R.id.nations)
        var cityView = findViewById<TextView>(R.id.townscities)
        var landmarkView = findViewById<TextView>(R.id.landmarks)
        var mapView = findViewById<TextView>(R.id.landmarks)


        nationView.setOnClickListener() {
            var intent = Intent(this, NationActivity::class.java)
            startActivity(intent)
        }
        landmarkView.setOnClickListener() {
            var intent = Intent(this, LandmarksActivity::class.java)
            startActivity(intent)
        }
        cityView.setOnClickListener() {
            var intent = Intent(this, CityActivity::class.java)
            startActivity(intent)
        }
    }
}
