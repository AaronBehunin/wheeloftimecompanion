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

        var mainChar = findViewById<LinearLayout>(R.id.Mainchars)
        var suppChar = findViewById<LinearLayout>(R.id.SupportChars)
        var enemyChar = findViewById<LinearLayout>(R.id.Enemies)
        var otherChar = findViewById<LinearLayout>(R.id.OtherChars)
        var legendChar = findViewById<LinearLayout>(R.id.LegendaryChars)

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