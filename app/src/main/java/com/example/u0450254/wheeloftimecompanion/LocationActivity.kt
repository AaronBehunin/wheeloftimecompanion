package com.example.u0450254.wheeloftimecompanion


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Locations.CityActivity
import com.example.u0450254.wheeloftimecompanion.Locations.LandmarksActivity
import com.example.u0450254.wheeloftimecompanion.Locations.MapActivity
import com.example.u0450254.wheeloftimecompanion.Locations.NationActivity

class LocationActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.location_menu)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var nationView = findViewById<LinearLayout>(R.id.Nations)
        var cityView = findViewById<LinearLayout>(R.id.TownsandCities)
        var landmarkView = findViewById<LinearLayout>(R.id.Landmarks)
        var mapView = findViewById<LinearLayout>(R.id.Maps)


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
        mapView.setOnClickListener() {
            var intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
    }
}
