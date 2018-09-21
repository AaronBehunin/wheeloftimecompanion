package com.example.u0450254.wheeloftimecompanion


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.u0450254.wheeloftimecompanion.Creatures.AnimalsActivity
import com.example.u0450254.wheeloftimecompanion.Creatures.MonsterActivity
import com.example.u0450254.wheeloftimecompanion.Creatures.RacesActivity

class CreatureActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creature_menu)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var MonsterView = findViewById<TextView>(R.id.Monsters)
        var RacesView = findViewById<TextView>(R.id.NonHumanRaces)
        var AnimalsView = findViewById<TextView>(R.id.NamedAnimals)

        MonsterView.setOnClickListener() {
            var intent = Intent(this, MonsterActivity::class.java)
            startActivity(intent)
        }
        RacesView.setOnClickListener() {
            var intent = Intent(this, RacesActivity::class.java)
            startActivity(intent)
        }
        AnimalsView.setOnClickListener() {
            var intent = Intent(this, AnimalsActivity::class.java)
            startActivity(intent)
        }
    }
}