package com.example.u0450254.wheeloftimecompanion


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import com.example.u0450254.wheeloftimecompanion.Creatures.AnimalsActivity
import com.example.u0450254.wheeloftimecompanion.Creatures.MonsterActivity
import com.example.u0450254.wheeloftimecompanion.Creatures.RacesActivity

class CreatureActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creature_menu)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val MonsterView = findViewById<LinearLayout>(R.id.Monsters)
        val RacesView = findViewById<LinearLayout>(R.id.NonHumanRaces)
        val AnimalsView = findViewById<LinearLayout>(R.id.NamedAnimals)

        MonsterView.setOnClickListener() {
            val intent = Intent(this, MonsterActivity::class.java)
            startActivity(intent)
        }
        RacesView.setOnClickListener() {
            val intent = Intent(this, RacesActivity::class.java)
            startActivity(intent)
        }
        AnimalsView.setOnClickListener() {
            val intent = Intent(this, AnimalsActivity::class.java)
            startActivity(intent)
        }
    }
}