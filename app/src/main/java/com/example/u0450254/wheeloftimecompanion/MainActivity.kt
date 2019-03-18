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

        val file = File("/data/data/com.example.u0450254.wheeloftimecompanion/files/Progress")

        if (!file.exists()) {
            val filename = "Progress"
            val fileContents = "1-0"
            openFileOutput(filename, Context.MODE_PRIVATE).use {
                it.write(fileContents.toByteArray())
            }
        }

        val progressFile = openFileInput("Progress")

        val guideView = findViewById<LinearLayout>(R.id.Guide)
        val charView = findViewById<LinearLayout>(R.id.Characters)
        val orgsView = findViewById<LinearLayout>(R.id.Organizations)
        val termView = findViewById<LinearLayout>(R.id.Terminology)
        val locationView = findViewById<LinearLayout>(R.id.Locations)
        val creatureView = findViewById<LinearLayout>(R.id.creatures)
        val artView = findViewById<LinearLayout>(R.id.Artifacts)
        val indexView = findViewById<LinearLayout>(R.id.index)

        guideView.setOnClickListener() {
            val intent = Intent(this, GuideActivity::class.java)
            startActivity(intent)
        }

        charView.setOnClickListener() {
            val intent = Intent(this, CharacterActivity::class.java)
            startActivity(intent)

        }
        orgsView.setOnClickListener() {
            val intent = Intent(this, OrganizationsActivity::class.java)
            startActivity(intent)

        }
        termView.setOnClickListener() {
            val intent = Intent(this, TerminologyActivity::class.java)
            startActivity(intent)

        }
        locationView.setOnClickListener() {
            val intent = Intent(this, LocationActivity::class.java)
            startActivity(intent)
        }
        creatureView.setOnClickListener() {
            val intent = Intent(this, CreatureActivity::class.java)
            startActivity(intent)
        }
        artView.setOnClickListener() {
            val intent = Intent(this, ArtifactsActivity::class.java)
            startActivity(intent)
        }
        indexView.setOnClickListener() {
            val intent = Intent(this, IndexActivity::class.java)
            startActivity(intent)
        }
    }
}
class Progress(book: Int, chapter: Int)
{
    var book = book
    var chapter = chapter
}
