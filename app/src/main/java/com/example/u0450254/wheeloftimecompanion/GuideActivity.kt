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

class GuideActivity : AppCompatActivity() {
    var progress = Progress(-1, -1)

   var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.guide)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var file = File("/data/data/com.example.u0450254.wheeloftimecompanion/files/Progress")

        if (!file.exists()) {
            val filename = "Progress"
            val fileContents = "1-0"
            openFileOutput(filename, Context.MODE_PRIVATE).use {
                it.write(fileContents.toByteArray())
            }
        }

        var progressFile = openFileInput("Progress")

        val inputString = progressFile.bufferedReader().use { it.readText() }


        val splits = inputString.split("-")

        progress = Progress(splits[0].toInt(), splits[1].toInt())



        setContentView(R.layout.guide)


        val book1View = findViewById<RelativeLayout>(R.id.rel1)
        val book2View = findViewById<TextView>(R.id.Book2)
        val book3View = findViewById<TextView>(R.id.Book3)
        val book4View = findViewById<TextView>(R.id.Book4)
        val book5View = findViewById<TextView>(R.id.Book5)
        val book6View = findViewById<TextView>(R.id.Book6)
        val book7View = findViewById<TextView>(R.id.Book7)
        val book8View = findViewById<TextView>(R.id.Book8)
        val book9View = findViewById<TextView>(R.id.Book9)
        val book10View = findViewById<TextView>(R.id.Book10)
        val book11View = findViewById<TextView>(R.id.Book11)
        val book12View = findViewById<TextView>(R.id.Book12)
        val book13View = findViewById<TextView>(R.id.Book13)
        val book14View = findViewById<TextView>(R.id.Book14)

        if (progress.book > 1) {
            val check = findViewById<CheckBox>(R.id.Book1Check)
            val rel = findViewById<RelativeLayout>(R.id.rel2)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 2) {
            val check = findViewById<CheckBox>(R.id.Book2Check)
            val rel = findViewById<RelativeLayout>(R.id.rel3)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 3) {
            val check = findViewById<CheckBox>(R.id.Book3Check)
            val rel = findViewById<RelativeLayout>(R.id.rel4)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 4) {
            val check = findViewById<CheckBox>(R.id.Book4Check)
            val rel = findViewById<RelativeLayout>(R.id.rel5)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 5) {
            val check = findViewById<CheckBox>(R.id.Book5Check)
            val rel = findViewById<RelativeLayout>(R.id.rel6)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 6) {
            val check = findViewById<CheckBox>(R.id.Book6Check)
            val rel = findViewById<RelativeLayout>(R.id.rel7)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 7) {
            val check = findViewById<CheckBox>(R.id.Book7Check)
            val rel = findViewById<RelativeLayout>(R.id.rel8)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 8) {
            val check = findViewById<CheckBox>(R.id.Book8Check)
            val rel = findViewById<RelativeLayout>(R.id.rel9)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 9) {
            val check = findViewById<CheckBox>(R.id.Book9Check)
            val rel = findViewById<RelativeLayout>(R.id.rel10)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 10) {
            val check = findViewById<CheckBox>(R.id.Book10Check)
            val rel = findViewById<RelativeLayout>(R.id.rel11)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 11) {
            val check = findViewById<CheckBox>(R.id.Book11Check)
            val rel = findViewById<RelativeLayout>(R.id.rel12)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 12) {
            val check = findViewById<CheckBox>(R.id.Book12Check)
            val rel = findViewById<RelativeLayout>(R.id.rel13)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }
        if (progress.book > 13) {
            val check = findViewById<CheckBox>(R.id.Book13Check)
            val rel = findViewById<RelativeLayout>(R.id.rel14)
            check.isChecked = true
            rel.visibility = View.VISIBLE
        }

        book1View.setOnClickListener() {
        }
    }

    fun boxClick(boxview: View) {
        val check = findViewById<CheckBox>(boxview.id)

        if (check.isChecked) {

            if (check.id == getResources().getIdentifier("Book1Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel2)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "2-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 2
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book2Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel3)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "3-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 3
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book3Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel4)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "4-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 4
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book4Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel5)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "5-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 5
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book5Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel6)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "6-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 6
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book6Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel7)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "7-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 7
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book7Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel8)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "8-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 8
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book8Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel9)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "9-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 9
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book9Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel10)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "10-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 10
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book10Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel11)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "11-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 11
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book11Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel2)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "12-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 12
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book12Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel13)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "13-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 13
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book13Check", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.rel14)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "14-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 14
                progress.chapter = 0
            }
        } else {
            val book2View = findViewById<RelativeLayout>(R.id.rel2)
            val book3View = findViewById<RelativeLayout>(R.id.rel3)
            val book4View = findViewById<RelativeLayout>(R.id.rel4)
            val book5View = findViewById<RelativeLayout>(R.id.rel5)
            val book6View = findViewById<RelativeLayout>(R.id.rel6)
            val book7View = findViewById<RelativeLayout>(R.id.rel7)
            val book8View = findViewById<RelativeLayout>(R.id.rel8)
            val book9View = findViewById<RelativeLayout>(R.id.rel9)
            val book10View = findViewById<RelativeLayout>(R.id.rel10)
            val book11View = findViewById<RelativeLayout>(R.id.rel11)
            val book12View = findViewById<RelativeLayout>(R.id.rel12)
            val book13View = findViewById<RelativeLayout>(R.id.rel13)
            val book14View = findViewById<RelativeLayout>(R.id.rel14)


            if (check.id == getResources().getIdentifier("Book1Check", "id", packageName)) {
                book2View.visibility = View.GONE
                book3View.visibility = View.GONE
                book4View.visibility = View.GONE
                book5View.visibility = View.GONE
                book6View.visibility = View.GONE
                book7View.visibility = View.GONE
                book8View.visibility = View.GONE
                book9View.visibility = View.GONE
                book10View.visibility = View.GONE
                book11View.visibility = View.GONE
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "1-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book2Check", "id", packageName)) {
                book3View.visibility = View.GONE
                book4View.visibility = View.GONE
                book5View.visibility = View.GONE
                book6View.visibility = View.GONE
                book7View.visibility = View.GONE
                book8View.visibility = View.GONE
                book9View.visibility = View.GONE
                book10View.visibility = View.GONE
                book11View.visibility = View.GONE
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "2-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 2
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book3Check", "id", packageName)) {
                book4View.visibility = View.GONE
                book5View.visibility = View.GONE
                book6View.visibility = View.GONE
                book7View.visibility = View.GONE
                book8View.visibility = View.GONE
                book9View.visibility = View.GONE
                book10View.visibility = View.GONE
                book11View.visibility = View.GONE
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "3-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 3
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book4Check", "id", packageName)) {
                book5View.visibility = View.GONE
                book6View.visibility = View.GONE
                book7View.visibility = View.GONE
                book8View.visibility = View.GONE
                book9View.visibility = View.GONE
                book10View.visibility = View.GONE
                book11View.visibility = View.GONE
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "4-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 4
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book5Check", "id", packageName)) {
                book6View.visibility = View.GONE
                book7View.visibility = View.GONE
                book8View.visibility = View.GONE
                book9View.visibility = View.GONE
                book10View.visibility = View.GONE
                book11View.visibility = View.GONE
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "5-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 5
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book6Check", "id", packageName)) {
                book7View.visibility = View.GONE
                book8View.visibility = View.GONE
                book9View.visibility = View.GONE
                book10View.visibility = View.GONE
                book11View.visibility = View.GONE
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "6-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 6
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book7Check", "id", packageName)) {
                book8View.visibility = View.GONE
                book9View.visibility = View.GONE
                book10View.visibility = View.GONE
                book11View.visibility = View.GONE
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "7-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 7
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book8Check", "id", packageName)) {
                book9View.visibility = View.GONE
                book10View.visibility = View.GONE
                book11View.visibility = View.GONE
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "8-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 8
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book9Check", "id", packageName)) {
                book10View.visibility = View.GONE
                book11View.visibility = View.GONE
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "9-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 9
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book10Check", "id", packageName)) {
                book11View.visibility = View.GONE
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "10-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 10
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book11Check", "id", packageName)) {
                book12View.visibility = View.GONE
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "11-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 11
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book12Check", "id", packageName)) {
                book13View.visibility = View.GONE
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "12-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 12
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book13Check", "id", packageName)) {
                book14View.visibility = View.GONE

                val filename = "Progress"
                val fileContents = "13-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 13
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("Book14Check", "id", packageName)) {
                val filename = "Progress"
                val fileContents = "14-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 14
                progress.chapter = 0
            }
        }
        val guideView = findViewById<ConstraintLayout>(R.id.guideView)
        guideView.postInvalidate()
    }
    fun launchBook1(view: View) {
        val intent = Intent(view.context, Book1Activity::class.java)
        view.context.startActivity(intent)

    }

}