package com.example.u0450254.wheeloftimecompanion


// the current year is 998
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Artifacts.AngrealActivity
import com.example.u0450254.wheeloftimecompanion.Artifacts.SymbolsActivity
import com.example.u0450254.wheeloftimecompanion.Artifacts.WeaponsActivity
import com.example.u0450254.wheeloftimecompanion.Characters.*

class ArtifactsActivity : AppCompatActivity() {


    var progress = Progress(-1, -1)

    var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artifacts_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var weapons = findViewById<TextView>(R.id.Weapons)
        var angreal= findViewById<TextView>(R.id.Angreal)
        var symbols= findViewById<TextView>(R.id.Symbols)


        angreal.setOnClickListener() {
            var intent = Intent(this, AngrealActivity::class.java)
            startActivity(intent)
        }
        weapons.setOnClickListener() {
            var intent = Intent(this, WeaponsActivity::class.java)
            startActivity(intent)
        }
        symbols.setOnClickListener() {
            var intent = Intent(this, SymbolsActivity::class.java)
            startActivity(intent)
        }

    }
}