package com.example.u0450254.wheeloftimecompanion

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Books.Book1Activity
import java.io.File

class CharacterActivity : AppCompatActivity() {


    var progress = Progress(-1, -1)

    var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character_menu)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var mainChar = findViewById<TextView>(R.id.Mainchars)
        var suppChar = findViewById<TextView>(R.id.SupportChars)
        var enemyChar = findViewById<TextView>(R.id.Enemies)
        var otherChar = findViewById<TextView>(R.id.OtherChars)
        var legendChar = findViewById<TextView>(R.id.LegnedaryChars)

        mainChar.setOnClickListener() {
            var intent = Intent(this, MainCharacterActivity::class.java)
            startActivity(intent)
        }
        suppChar.setOnClickListener() {
            var intent = Intent(this, SupportCharacterActivity::class.java)
            startActivity(intent)
        }
        enemyChar.setOnClickListener() {
            var intent = Intent(this, EnemyCharacterActivity::class.java)
            startActivity(intent)
        }
        otherChar.setOnClickListener() {
            var intent = Intent(this, OtherCharacterActivity::class.java)
            startActivity(intent)
        }
        legendChar.setOnClickListener() {
            var intent = Intent(this, LegendCharacterActivity::class.java)
            startActivity(intent)
        }
    }
}