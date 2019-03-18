package com.example.u0450254.wheeloftimecompanion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Artifacts.AngrealActivity
import com.example.u0450254.wheeloftimecompanion.Artifacts.SymbolsActivity
import com.example.u0450254.wheeloftimecompanion.Artifacts.WeaponsActivity

class ArtifactsActivity : AppCompatActivity() {

    var progress = Progress(-1, -1)

    var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artifacts_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val weapons = findViewById<LinearLayout>(R.id.Weapons)
        val angreal= findViewById<LinearLayout>(R.id.Angreal)
        val symbols= findViewById<LinearLayout>(R.id.Symbols)

        angreal.setOnClickListener() {
            val intent = Intent(this, AngrealActivity::class.java)
            startActivity(intent)
        }
        weapons.setOnClickListener() {
            val intent = Intent(this, WeaponsActivity::class.java)
            startActivity(intent)
        }
        symbols.setOnClickListener() {
            val intent = Intent(this, SymbolsActivity::class.java)
            startActivity(intent)
        }
    }
}