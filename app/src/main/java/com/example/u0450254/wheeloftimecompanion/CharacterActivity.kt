package com.example.u0450254.wheeloftimecompanion


// the current year is 998
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Characters.*

class CharacterActivity : AppCompatActivity() {


    var progress = Progress(-1, -1)

    var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character_menu)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val mainChar = findViewById<LinearLayout>(R.id.Mainchars)
        val suppChar = findViewById<LinearLayout>(R.id.SupportChars)
        val enemyChar = findViewById<LinearLayout>(R.id.Enemies)
        val otherChar = findViewById<LinearLayout>(R.id.OtherChars)
        val legendChar = findViewById<LinearLayout>(R.id.LegendaryChars)

        mainChar.setOnClickListener() {
            val intent = Intent(this, MainCharacterActivity::class.java)
            startActivity(intent)
        }
        suppChar.setOnClickListener() {
            val intent = Intent(this, SupportCharacterActivity::class.java)
            startActivity(intent)
        }
        enemyChar.setOnClickListener() {
            val intent = Intent(this, EnemyCharacterActivity::class.java)
            startActivity(intent)
        }
        otherChar.setOnClickListener() {
            val intent = Intent(this, OtherCharacterActivity::class.java)
            startActivity(intent)
        }
        legendChar.setOnClickListener() {
            val intent = Intent(this, LegendCharacterActivity::class.java)
            startActivity(intent)
        }
    }
}