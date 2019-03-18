package com.example.u0450254.wheeloftimecompanion.Books

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.u0450254.wheeloftimecompanion.Books.Book1.*
import java.io.File
import com.example.u0450254.wheeloftimecompanion.Progress
import com.example.u0450254.wheeloftimecompanion.R


/**
 * Created by u0450254 on 5/22/2018.
 */
class Book1Activity: AppCompatActivity() {

    var progress = Progress(-1, -1)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book1)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

         val progressFile = openFileInput("Progress")

         val inputString = progressFile.bufferedReader().use { it.readText() }

         val splits = inputString.split("-")

        progress = Progress(splits[0].toInt(), splits[1].toInt())

            
        if (progress.chapter > 0) {  
                val check = findViewById<CheckBox>(R.id.checkbook1chapP)
                val rel = findViewById<RelativeLayout>(R.id.book1chap1)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 1) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap1)
                val rel = findViewById<RelativeLayout>(R.id.book1chap2)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 2) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap2)
                val rel = findViewById<RelativeLayout>(R.id.book1chap3)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 3) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap3)
                val rel = findViewById<RelativeLayout>(R.id.book1chap4)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 4) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap4)
                val rel = findViewById<RelativeLayout>(R.id.book1chap5)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 5) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap5)
                val rel = findViewById<RelativeLayout>(R.id.book1chap6)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 6) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap6)
                val rel = findViewById<RelativeLayout>(R.id.book1chap7)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 7) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap7)
                val rel = findViewById<RelativeLayout>(R.id.book1chap8)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 8) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap8)
                val rel = findViewById<RelativeLayout>(R.id.book1chap9)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 9) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap9)
                val rel = findViewById<RelativeLayout>(R.id.book1chap10)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 10) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap10)
                val rel = findViewById<RelativeLayout>(R.id.book1chap11)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 11) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap11)
                val rel = findViewById<RelativeLayout>(R.id.book1chap12)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 12) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap12)
                val rel = findViewById<RelativeLayout>(R.id.book1chap13)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 13) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap13)
                val rel = findViewById<RelativeLayout>(R.id.book1chap14)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 14) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap14)
                val rel = findViewById<RelativeLayout>(R.id.book1chap15)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 15) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap15)
                val rel = findViewById<RelativeLayout>(R.id.book1chap16)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 16) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap16)
                val rel = findViewById<RelativeLayout>(R.id.book1chap17)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 17) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap17)
                val rel = findViewById<RelativeLayout>(R.id.book1chap18)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 18) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap18)
                val rel = findViewById<RelativeLayout>(R.id.book1chap19)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 19) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap19)
                val rel = findViewById<RelativeLayout>(R.id.book1chap20)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 20) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap20)
                val rel = findViewById<RelativeLayout>(R.id.book1chap21)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 21) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap21)
                val rel = findViewById<RelativeLayout>(R.id.book1chap22)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 22) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap22)
                val rel = findViewById<RelativeLayout>(R.id.book1chap23)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 23) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap23)
                val rel = findViewById<RelativeLayout>(R.id.book1chap24)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 24) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap24)
                val rel = findViewById<RelativeLayout>(R.id.book1chap25)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 25) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap25)
                val rel = findViewById<RelativeLayout>(R.id.book1chap26)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 26) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap26)
                val rel = findViewById<RelativeLayout>(R.id.book1chap27)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 27) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap27)
                val rel = findViewById<RelativeLayout>(R.id.book1chap28)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 28) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap28)
                val rel = findViewById<RelativeLayout>(R.id.book1chap29)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 29) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap29)
                val rel = findViewById<RelativeLayout>(R.id.book1chap30)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 30) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap30)
                val rel = findViewById<RelativeLayout>(R.id.book1chap31)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 31) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap31)
                val rel = findViewById<RelativeLayout>(R.id.book1chap32)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 32) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap32)
                val rel = findViewById<RelativeLayout>(R.id.book1chap33)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 33) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap33)
                val rel = findViewById<RelativeLayout>(R.id.book1chap34)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 34) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap34)
                val rel = findViewById<RelativeLayout>(R.id.book1chap35)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 35) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap35)
                val rel = findViewById<RelativeLayout>(R.id.book1chap36)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 36) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap36)
                val rel = findViewById<RelativeLayout>(R.id.book1chap37)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 37) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap37)
                val rel = findViewById<RelativeLayout>(R.id.book1chap38)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 38) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap38)
                val rel = findViewById<RelativeLayout>(R.id.book1chap39)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 39) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap39)
                val rel = findViewById<RelativeLayout>(R.id.book1chap40)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 40) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap40)
                val rel = findViewById<RelativeLayout>(R.id.book1chap41)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 41) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap41)
                val rel = findViewById<RelativeLayout>(R.id.book1chap42)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 42) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap42)
                val rel = findViewById<RelativeLayout>(R.id.book1chap43)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 43) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap43)
                val rel = findViewById<RelativeLayout>(R.id.book1chap44)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 44) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap44)
                val rel = findViewById<RelativeLayout>(R.id.book1chap45)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 45) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap45)
                val rel = findViewById<RelativeLayout>(R.id.book1chap46)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 46) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap46)
                val rel = findViewById<RelativeLayout>(R.id.book1chap47)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 47) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap47)
                val rel = findViewById<RelativeLayout>(R.id.book1chap48)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 48) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap48)
                val rel = findViewById<RelativeLayout>(R.id.book1chap49)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 49) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap49)
                val rel = findViewById<RelativeLayout>(R.id.book1chap50)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 50) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap50)
                val rel = findViewById<RelativeLayout>(R.id.book1chap51)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 51) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap51)
                val rel = findViewById<RelativeLayout>(R.id.book1chap52)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 52) {
                val check = findViewById<CheckBox>(R.id.checkbook1chap52)
                val rel = findViewById<RelativeLayout>(R.id.book1chap53)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }

    }
    fun boxClick(boxview: View) {
        val check = findViewById<CheckBox>(boxview.id)

        if (check.isChecked) {

            if (check.id == getResources().getIdentifier("checkbook1chapP", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap1)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-1"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 1
            } else if (check.id == getResources().getIdentifier("checkbook1chap1", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap2)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-2"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 2
            } else if (check.id == getResources().getIdentifier("checkbook1chap2", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap3)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-3"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 3
            } else if (check.id == getResources().getIdentifier("checkbook1chap3", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap4)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-4"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 4
            } else if (check.id == getResources().getIdentifier("checkbook1chap4", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap5)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-5"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 5
            } else if (check.id == getResources().getIdentifier("checkbook1chap5", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap6)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-6"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 6
            } else if (check.id == getResources().getIdentifier("checkbook1chap6", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap7)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-7"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 7
            } else if (check.id == getResources().getIdentifier("checkbook1chap7", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap8)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-8"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 8
            } else if (check.id == getResources().getIdentifier("checkbook1chap8", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap9)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-9"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 9
            } else if (check.id == getResources().getIdentifier("checkbook1chap9", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap10)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-10"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 10
            } else if (check.id == getResources().getIdentifier("checkbook1chap10", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap11)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-11"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 11
            } else if (check.id == getResources().getIdentifier("checkbook1chap11", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap12)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-12"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 12
            } else if (check.id == getResources().getIdentifier("checkbook1chap12", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap13)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-13"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 13
            } else if (check.id == getResources().getIdentifier("checkbook1chap13", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap14)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-14"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 14
            } else if (check.id == getResources().getIdentifier("checkbook1chap14", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap15)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-15"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 15
            } else if (check.id == getResources().getIdentifier("checkbook1chap15", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap16)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-16"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 16
            } else if (check.id == getResources().getIdentifier("checkbook1chap16", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap17)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-17"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 17
            } else if (check.id == getResources().getIdentifier("checkbook1chap17", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap18)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-18"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 18
            } else if (check.id == getResources().getIdentifier("checkbook1chap18", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap19)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-19"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 19
            } else if (check.id == getResources().getIdentifier("checkbook1chap19", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap20)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-20"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 20
            } else if (check.id == getResources().getIdentifier("checkbook1chap20", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap21)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-21"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 21
            } else if (check.id == getResources().getIdentifier("checkbook1chap21", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap22)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-22"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 22
            } else if (check.id == getResources().getIdentifier("checkbook1chap22", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap23)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-23"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 23
            } else if (check.id == getResources().getIdentifier("checkbook1chap23", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap24)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-24"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 24
            } else if (check.id == getResources().getIdentifier("checkbook1chap24", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap25)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-25"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 25
            } else if (check.id == getResources().getIdentifier("checkbook1chap25", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap26)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-26"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 26
            } else if (check.id == getResources().getIdentifier("checkbook1chap26", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap27)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-27"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 27
            } else if (check.id == getResources().getIdentifier("checkbook1chap27", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap28)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-28"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 28
            } else if (check.id == getResources().getIdentifier("checkbook1chap28", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap29)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-29"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 29
            } else if (check.id == getResources().getIdentifier("checkbook1chap29", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap30)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-30"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 30
            } else if (check.id == getResources().getIdentifier("checkbook1chap30", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap31)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-31"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 31
            } else if (check.id == getResources().getIdentifier("checkbook1chap31", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap32)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-32"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 32
            } else if (check.id == getResources().getIdentifier("checkbook1chap32", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap33)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-33"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 33
            } else if (check.id == getResources().getIdentifier("checkbook1chap33", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap34)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-34"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 34
            } else if (check.id == getResources().getIdentifier("checkbook1chap34", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap35)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-35"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 35
            } else if (check.id == getResources().getIdentifier("checkbook1chap35", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap36)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-36"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 36
            } else if (check.id == getResources().getIdentifier("checkbook1chap36", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap37)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-37"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 37
            } else if (check.id == getResources().getIdentifier("checkbook1chap37", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap38)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-38"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 38
            } else if (check.id == getResources().getIdentifier("checkbook1chap38", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap39)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-39"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 39
            } else if (check.id == getResources().getIdentifier("checkbook1chap39", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap40)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-40"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 40
            } else if (check.id == getResources().getIdentifier("checkbook1chap40", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap41)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-41"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 41
            } else if (check.id == getResources().getIdentifier("checkbook1chap41", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap42)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-42"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 42
            } else if (check.id == getResources().getIdentifier("checkbook1chap42", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap43)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-43"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 43
            } else if (check.id == getResources().getIdentifier("checkbook1chap43", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap44)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-44"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 44
            } else if (check.id == getResources().getIdentifier("checkbook1chap44", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap45)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-45"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 45
            } else if (check.id == getResources().getIdentifier("checkbook1chap45", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap46)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-46"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 46
            } else if (check.id == getResources().getIdentifier("checkbook1chap46", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap47)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-47"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 47
            } else if (check.id == getResources().getIdentifier("checkbook1chap47", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap48)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-48"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 48
            } else if (check.id == getResources().getIdentifier("checkbook1chap48", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap49)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-49"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 49
            } else if (check.id == getResources().getIdentifier("checkbook1chap49", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap50)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-50"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 50
            } else if (check.id == getResources().getIdentifier("checkbook1chap50", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap51)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-51"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 51
            } else if (check.id == getResources().getIdentifier("checkbook1chap51", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap52)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-52"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 52
            } else if (check.id == getResources().getIdentifier("checkbook1chap52", "id", packageName)) {
                val book2View = findViewById<RelativeLayout>(R.id.book1chap53)

                book2View.visibility = View.VISIBLE

                val filename = "Progress"
                val fileContents = "1-53"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 1
                progress.chapter = 53
            } else if (check.id == getResources().getIdentifier("checkbook1chap53", "id", packageName)) {
                val filename = "Progress"
                val fileContents = "2-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }
                progress.book = 2
                progress.chapter = 0
            }
        } else {
            val chapViews = arrayOf(findViewById(R.id.book1chapP), findViewById(R.id.book1chap1),
                    findViewById<RelativeLayout>(R.id.book1chap2), findViewById<RelativeLayout>(R.id.book1chap3), findViewById<RelativeLayout>(R.id.book1chap4),
                    findViewById<RelativeLayout>(R.id.book1chap5), findViewById<RelativeLayout>(R.id.book1chap6), findViewById<RelativeLayout>(R.id.book1chap7),
                    findViewById<RelativeLayout>(R.id.book1chap8), findViewById<RelativeLayout>(R.id.book1chap9), findViewById<RelativeLayout>(R.id.book1chap10),
                    findViewById<RelativeLayout>(R.id.book1chap11), findViewById<RelativeLayout>(R.id.book1chap12), findViewById<RelativeLayout>(R.id.book1chap13),
                    findViewById<RelativeLayout>(R.id.book1chap14), findViewById<RelativeLayout>(R.id.book1chap15), findViewById<RelativeLayout>(R.id.book1chap16),
                    findViewById<RelativeLayout>(R.id.book1chap17), findViewById<RelativeLayout>(R.id.book1chap18), findViewById<RelativeLayout>(R.id.book1chap19),
                    findViewById<RelativeLayout>(R.id.book1chap20), findViewById<RelativeLayout>(R.id.book1chap21), findViewById<RelativeLayout>(R.id.book1chap22),
                    findViewById<RelativeLayout>(R.id.book1chap23), findViewById<RelativeLayout>(R.id.book1chap24), findViewById<RelativeLayout>(R.id.book1chap25),
                    findViewById<RelativeLayout>(R.id.book1chap26), findViewById<RelativeLayout>(R.id.book1chap27), findViewById<RelativeLayout>(R.id.book1chap28),
                    findViewById<RelativeLayout>(R.id.book1chap29), findViewById<RelativeLayout>(R.id.book1chap30), findViewById<RelativeLayout>(R.id.book1chap31),
                    findViewById<RelativeLayout>(R.id.book1chap32), findViewById<RelativeLayout>(R.id.book1chap33), findViewById<RelativeLayout>(R.id.book1chap34),
                    findViewById<RelativeLayout>(R.id.book1chap35), findViewById<RelativeLayout>(R.id.book1chap36), findViewById<RelativeLayout>(R.id.book1chap37),
                    findViewById<RelativeLayout>(R.id.book1chap38), findViewById<RelativeLayout>(R.id.book1chap39), findViewById<RelativeLayout>(R.id.book1chap40),
                    findViewById<RelativeLayout>(R.id.book1chap41), findViewById<RelativeLayout>(R.id.book1chap42), findViewById<RelativeLayout>(R.id.book1chap43),
                    findViewById<RelativeLayout>(R.id.book1chap44), findViewById<RelativeLayout>(R.id.book1chap45), findViewById<RelativeLayout>(R.id.book1chap46),
                    findViewById<RelativeLayout>(R.id.book1chap47), findViewById<RelativeLayout>(R.id.book1chap48), findViewById<RelativeLayout>(R.id.book1chap49),
                    findViewById<RelativeLayout>(R.id.book1chap50), findViewById<RelativeLayout>(R.id.book1chap51), findViewById<RelativeLayout>(R.id.book1chap52),
                    findViewById<RelativeLayout>(R.id.book1chap53))

            val checkViews = arrayOf(findViewById<CheckBox>(R.id.checkbook1chapP), findViewById<CheckBox>(R.id.checkbook1chap1),
                    findViewById<CheckBox>(R.id.checkbook1chap2), findViewById<CheckBox>(R.id.checkbook1chap3), findViewById<CheckBox>(R.id.checkbook1chap4),
                    findViewById<CheckBox>(R.id.checkbook1chap5), findViewById<CheckBox>(R.id.checkbook1chap6), findViewById<CheckBox>(R.id.checkbook1chap7),
                    findViewById<CheckBox>(R.id.checkbook1chap8), findViewById<CheckBox>(R.id.checkbook1chap9), findViewById<CheckBox>(R.id.checkbook1chap10),
                    findViewById<CheckBox>(R.id.checkbook1chap11), findViewById<CheckBox>(R.id.checkbook1chap12), findViewById<CheckBox>(R.id.checkbook1chap13),
                    findViewById<CheckBox>(R.id.checkbook1chap14), findViewById<CheckBox>(R.id.checkbook1chap15), findViewById<CheckBox>(R.id.checkbook1chap16),
                    findViewById<CheckBox>(R.id.checkbook1chap17), findViewById<CheckBox>(R.id.checkbook1chap18), findViewById<CheckBox>(R.id.checkbook1chap19),
                    findViewById<CheckBox>(R.id.checkbook1chap20), findViewById<CheckBox>(R.id.checkbook1chap21), findViewById<CheckBox>(R.id.checkbook1chap22),
                    findViewById<CheckBox>(R.id.checkbook1chap23), findViewById<CheckBox>(R.id.checkbook1chap24), findViewById<CheckBox>(R.id.checkbook1chap25),
                    findViewById<CheckBox>(R.id.checkbook1chap26), findViewById<CheckBox>(R.id.checkbook1chap27), findViewById<CheckBox>(R.id.checkbook1chap28),
                    findViewById<CheckBox>(R.id.checkbook1chap29), findViewById<CheckBox>(R.id.checkbook1chap30), findViewById<CheckBox>(R.id.checkbook1chap31),
                    findViewById<CheckBox>(R.id.checkbook1chap32), findViewById<CheckBox>(R.id.checkbook1chap33), findViewById<CheckBox>(R.id.checkbook1chap34),
                    findViewById<CheckBox>(R.id.checkbook1chap35), findViewById<CheckBox>(R.id.checkbook1chap36), findViewById<CheckBox>(R.id.checkbook1chap37),
                    findViewById<CheckBox>(R.id.checkbook1chap38), findViewById<CheckBox>(R.id.checkbook1chap39), findViewById<CheckBox>(R.id.checkbook1chap40),
                    findViewById<CheckBox>(R.id.checkbook1chap41), findViewById<CheckBox>(R.id.checkbook1chap42), findViewById<CheckBox>(R.id.checkbook1chap43),
                    findViewById<CheckBox>(R.id.checkbook1chap44), findViewById<CheckBox>(R.id.checkbook1chap45), findViewById<CheckBox>(R.id.checkbook1chap46),
                    findViewById<CheckBox>(R.id.checkbook1chap47), findViewById<CheckBox>(R.id.checkbook1chap48), findViewById<CheckBox>(R.id.checkbook1chap49),
                    findViewById<CheckBox>(R.id.checkbook1chap50), findViewById<CheckBox>(R.id.checkbook1chap51), findViewById<CheckBox>(R.id.checkbook1chap52),
                    findViewById<CheckBox>(R.id.checkbook1chap53))


            if (check.id == getResources().getIdentifier("checkbook1chapP", "id", packageName)) {

                makegone(1, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("checkbook1chap1", "id", packageName)) {


                makegone(2, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-1"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 1
            } else if (check.id == getResources().getIdentifier("checkbook1chap2", "id", packageName)) {


                makegone(3, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-2"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 2
            } else if (check.id == getResources().getIdentifier("checkbook1chap3", "id", packageName)) {


                makegone(4, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-3"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 3
            } else if (check.id == getResources().getIdentifier("checkbook1chap4", "id", packageName)) {


                makegone(5, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-4"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 4
            } else if (check.id == getResources().getIdentifier("checkbook1chap5", "id", packageName)) {


                makegone(6, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-5"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 5
            } else if (check.id == getResources().getIdentifier("checkbook1chap6", "id", packageName)) {


                makegone(7, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-6"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 6
            } else if (check.id == getResources().getIdentifier("checkbook1chap7", "id", packageName)) {


                makegone(8, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-7"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 7
            } else if (check.id == getResources().getIdentifier("checkbook1chap8", "id", packageName)) {


                makegone(9, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-8"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 8
            } else if (check.id == getResources().getIdentifier("checkbook1chap9", "id", packageName)) {


                makegone(10, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-9"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 9
            } else if (check.id == getResources().getIdentifier("checkbook1chap10", "id", packageName)) {


                makegone(11, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-10"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 10
            } else if (check.id == getResources().getIdentifier("checkbook1chap11", "id", packageName)) {


                makegone(12, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-11"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 11
            } else if (check.id == getResources().getIdentifier("checkbook1chap12", "id", packageName)) {


                makegone(13, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-12"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 12
            } else if (check.id == getResources().getIdentifier("checkbook1chap13", "id", packageName)) {


                makegone(14, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-13"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 13
            } else if (check.id == getResources().getIdentifier("checkbook1chap14", "id", packageName)) {


                makegone(15, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-14"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 14
            } else if (check.id == getResources().getIdentifier("checkbook1chap15", "id", packageName)) {


                makegone(16, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-15"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 15
            } else if (check.id == getResources().getIdentifier("checkbook1chap16", "id", packageName)) {


                makegone(17, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-16"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 16
            } else if (check.id == getResources().getIdentifier("checkbook1chap17", "id", packageName)) {


                makegone(18, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-17"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 17
            } else if (check.id == getResources().getIdentifier("checkbook1chap18", "id", packageName)) {


                makegone(19, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-18"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 18
            } else if (check.id == getResources().getIdentifier("checkbook1chap19", "id", packageName)) {


                makegone(20, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-19"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 19
            } else if (check.id == getResources().getIdentifier("checkbook1chap20", "id", packageName)) {


                makegone(21, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-20"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 20
            } else if (check.id == getResources().getIdentifier("checkbook1chap21", "id", packageName)) {


                makegone(22, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-21"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 21
            } else if (check.id == getResources().getIdentifier("checkbook1chap22", "id", packageName)) {


                makegone(23, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-22"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 22
            } else if (check.id == getResources().getIdentifier("checkbook1chap23", "id", packageName)) {


                makegone(24, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-23"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 23
            } else if (check.id == getResources().getIdentifier("checkbook1chap24", "id", packageName)) {


                makegone(25, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-24"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 24
            } else if (check.id == getResources().getIdentifier("checkbook1chap25", "id", packageName)) {


                makegone(26, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-25"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 25
            } else if (check.id == getResources().getIdentifier("checkbook1chap26", "id", packageName)) {


                makegone(27, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-26"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 26
            } else if (check.id == getResources().getIdentifier("checkbook1chap27", "id", packageName)) {


                makegone(28, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-27"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 27
            } else if (check.id == getResources().getIdentifier("checkbook1chap28", "id", packageName)) {


                makegone(29, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-28"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 28
            } else if (check.id == getResources().getIdentifier("checkbook1chap29", "id", packageName)) {


                makegone(30, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-29"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 29
            } else if (check.id == getResources().getIdentifier("checkbook1chap30", "id", packageName)) {


                makegone(31, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-30"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 30
            } else if (check.id == getResources().getIdentifier("checkbook1chap31", "id", packageName)) {


                makegone(32, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-31"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 31
            } else if (check.id == getResources().getIdentifier("checkbook1chap32", "id", packageName)) {


                makegone(33, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-32"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 32
            } else if (check.id == getResources().getIdentifier("checkbook1chap33", "id", packageName)) {


                makegone(34, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-33"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 33
            } else if (check.id == getResources().getIdentifier("checkbook1chap34", "id", packageName)) {


                makegone(35, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-34"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 34
            } else if (check.id == getResources().getIdentifier("checkbook1chap35", "id", packageName)) {


                makegone(36, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-35"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 35
            } else if (check.id == getResources().getIdentifier("checkbook1chap36", "id", packageName)) {


                makegone(37, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-36"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 36
            } else if (check.id == getResources().getIdentifier("checkbook1chap37", "id", packageName)) {


                makegone(38, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-37"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 37
            } else if (check.id == getResources().getIdentifier("checkbook1chap38", "id", packageName)) {


                makegone(39, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-38"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 38
            } else if (check.id == getResources().getIdentifier("checkbook1chap39", "id", packageName)) {


                makegone(40, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-39"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 39
            } else if (check.id == getResources().getIdentifier("checkbook1chap40", "id", packageName)) {


                makegone(41, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-40"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 40
            } else if (check.id == getResources().getIdentifier("checkbook1chap41", "id", packageName)) {


                makegone(42, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-41"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 41
            } else if (check.id == getResources().getIdentifier("checkbook1chap42", "id", packageName)) {


                makegone(43, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-42"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 42
            } else if (check.id == getResources().getIdentifier("checkbook1chap43", "id", packageName)) {


                makegone(44, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-43"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 43
            } else if (check.id == getResources().getIdentifier("checkbook1chap44", "id", packageName)) {


                makegone(45, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-44"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 44
            } else if (check.id == getResources().getIdentifier("checkbook1chap45", "id", packageName)) {


                makegone(46, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-45"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 45
            } else if (check.id == getResources().getIdentifier("checkbook1chap46", "id", packageName)) {


                makegone(47, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-46"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 46
            } else if (check.id == getResources().getIdentifier("checkbook1chap47", "id", packageName)) {


                makegone(48, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-47"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 47
            } else if (check.id == getResources().getIdentifier("checkbook1chap48", "id", packageName)) {


                makegone(49, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-48"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 48
            } else if (check.id == getResources().getIdentifier("checkbook1chap49", "id", packageName)) {


                makegone(50, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-49"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 49
            } else if (check.id == getResources().getIdentifier("checkbook1chap50", "id", packageName)) {


                makegone(51, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-50"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 50
            } else if (check.id == getResources().getIdentifier("checkbook1chap51", "id", packageName)) {


                makegone(52, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-51"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 51
            } else if (check.id == getResources().getIdentifier("checkbook1chap52", "id", packageName)) {


                makegone(53, chapViews, checkViews)
                val filename = "Progress"
                val fileContents = "1-52"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 52
            } else if (check.id == getResources().getIdentifier("checkbook1chap53", "id", packageName)) {


                val filename = "Progress"
                val fileContents = "1-53"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 53
            }
        }
        var guideView = findViewById<LinearLayout>(R.id.Book1layout)
        guideView.invalidate();
    }
    fun launchP(view: View){
        var intent = Intent(view.context, BookPageP::class.java)
        view.context.startActivity(intent)
    }
    fun launch1(view: View){
        var intent = Intent(view.context, BookPage1::class.java)
        view.context.startActivity(intent)
    }
    fun launch2(view: View){
        var intent = Intent(view.context, BookPage2::class.java)
        view.context.startActivity(intent)
    }
    fun launch3(view: View){
        var intent = Intent(view.context, BookPage3::class.java)
        view.context.startActivity(intent)
    }
    fun launch4(view: View){
        var intent = Intent(view.context, BookPage4::class.java)
        view.context.startActivity(intent)
    }
    fun launch5(view: View){
        var intent = Intent(view.context, BookPage5::class.java)
        view.context.startActivity(intent)
    }
    fun launch6(view: View){
        var intent = Intent(view.context, BookPage6::class.java)
        view.context.startActivity(intent)
    }
    fun launch7(view: View){
        var intent = Intent(view.context, BookPage7::class.java)
        view.context.startActivity(intent)
    }
    fun launch8(view: View){
        var intent = Intent(view.context, BookPage8::class.java)
        view.context.startActivity(intent)
    }
    fun launch9(view: View){
        var intent = Intent(view.context, BookPage9::class.java)
        view.context.startActivity(intent)
    }
    fun launch10(view: View){
        var intent = Intent(view.context, BookPage10::class.java)
        view.context.startActivity(intent)
    }
}
fun makegone(start: Int, views: Array<RelativeLayout>, checks: Array<CheckBox>)
{
    for (num in start..53)
    {
        views[num].visibility = View.GONE
        checks[num].isChecked = false
    }
}