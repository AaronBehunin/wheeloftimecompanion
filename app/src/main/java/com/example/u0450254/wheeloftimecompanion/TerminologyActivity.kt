package com.example.u0450254.wheeloftimecompanion


// the current year is 998
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Terminology.CultureActivity
import com.example.u0450254.wheeloftimecompanion.Terminology.EventsActivity
import com.example.u0450254.wheeloftimecompanion.Terminology.TermActivity

class TerminologyActivity : AppCompatActivity() {


    var progress = Progress(-1, -1)

    var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminology_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var terms = findViewById<LinearLayout>(R.id.Terms)
        var events= findViewById<LinearLayout>(R.id.Events)
        var culture= findViewById<LinearLayout>(R.id.Culture)


        terms.setOnClickListener() {
            var intent = Intent(this, TermActivity::class.java)
            startActivity(intent)
        }
        events.setOnClickListener() {
            var intent = Intent(this, EventsActivity::class.java)
            startActivity(intent)
        }
        culture.setOnClickListener() {
            var intent = Intent(this, CultureActivity::class.java)
            startActivity(intent)
        }

    }
}