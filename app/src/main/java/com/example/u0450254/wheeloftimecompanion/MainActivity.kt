package com.example.u0450254.wheeloftimecompanion

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import android.widget.*
import com.example.u0450254.wheeloftimecompanion.Locations.NationActivity
import kotlinx.android.synthetic.main.guide.*
import org.w3c.dom.Text
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val guideView = findViewById<LinearLayout>(R.id.Guide)
        val charView = findViewById<LinearLayout>(R.id.Characters)
        val orgsView = findViewById<LinearLayout>(R.id.Organizations)
        val termView = findViewById<LinearLayout>(R.id.Terminology)
        val locationView = findViewById<LinearLayout>(R.id.Locations)

        guideView.setOnClickListener() {
            var intent = Intent(this, GuideActivity::class.java)
            startActivity(intent)
        }

        charView.setOnClickListener() {
            var intent = Intent(this, CharacterActivity::class.java)
            startActivity(intent)

        }
        orgsView.setOnClickListener() {
            var intent = Intent(this, OrganizationsActivity::class.java)
            startActivity(intent)

        }
        termView.setOnClickListener() {
            var intent = Intent(this, TerminologyActivity::class.java)
            startActivity(intent)

        }
        locationView.setOnClickListener() {
            var intent = Intent(this, LocationActivity::class.java)
            startActivity(intent)
        }
    }
}
class Progress(book: Int, chapter: Int)
{
    var book = book
    var chapter = chapter
}
