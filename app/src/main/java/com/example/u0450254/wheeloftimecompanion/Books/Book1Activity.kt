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

        var file = File("/data/data/com.example.u0450254.wheeloftimecompanion/files/Progress")

         var progressFile = openFileInput("Progress")

         val inputString = progressFile.bufferedReader().use { it.readText() }

         val splits = inputString.split("-")

        progress = Progress(splits[0].toInt(), splits[1].toInt())


            val chapPView = findViewById<RelativeLayout>(R.id.book1chapP)
            val chap1View = findViewById<RelativeLayout>(R.id.book1chap1)
            val chap2View = findViewById<RelativeLayout>(R.id.book1chap2)
            val chap3View = findViewById<RelativeLayout>(R.id.book1chap3)
            val chap4View = findViewById<RelativeLayout>(R.id.book1chap4)
            val chap5View = findViewById<RelativeLayout>(R.id.book1chap5)
            val chap6View = findViewById<RelativeLayout>(R.id.book1chap6)
            val chap7View = findViewById<RelativeLayout>(R.id.book1chap7)
            val chap8View = findViewById<RelativeLayout>(R.id.book1chap8)
            val chap9View = findViewById<RelativeLayout>(R.id.book1chap9)
            val chap10View = findViewById<RelativeLayout>(R.id.book1chap10)
            val chap11View = findViewById<RelativeLayout>(R.id.book1chap11)
            val chap12View = findViewById<RelativeLayout>(R.id.book1chap12)
            val chap13View = findViewById<RelativeLayout>(R.id.book1chap13)
            val chap14View = findViewById<RelativeLayout>(R.id.book1chap14)
            val chap15View = findViewById<RelativeLayout>(R.id.book1chap15)
            val chap16View = findViewById<RelativeLayout>(R.id.book1chap16)
            val chap17View = findViewById<RelativeLayout>(R.id.book1chap17)
            val chap18View = findViewById<RelativeLayout>(R.id.book1chap18)
            val chap19View = findViewById<RelativeLayout>(R.id.book1chap19)
            val chap20View = findViewById<RelativeLayout>(R.id.book1chap20)
            val chap21View = findViewById<RelativeLayout>(R.id.book1chap21)
            val chap22View = findViewById<RelativeLayout>(R.id.book1chap22)
            val chap23View = findViewById<RelativeLayout>(R.id.book1chap23)
            val chap24View = findViewById<RelativeLayout>(R.id.book1chap24)
            val chap25View = findViewById<RelativeLayout>(R.id.book1chap25)
            val chap26View = findViewById<RelativeLayout>(R.id.book1chap26)
            val chap27View = findViewById<RelativeLayout>(R.id.book1chap27)
            val chap28View = findViewById<RelativeLayout>(R.id.book1chap28)
            val chap29View = findViewById<RelativeLayout>(R.id.book1chap29)
            val chap30View = findViewById<RelativeLayout>(R.id.book1chap30)
            val chap31View = findViewById<RelativeLayout>(R.id.book1chap31)
            val chap32View = findViewById<RelativeLayout>(R.id.book1chap32)
            val chap33View = findViewById<RelativeLayout>(R.id.book1chap33)
            val chap34View = findViewById<RelativeLayout>(R.id.book1chap34)
            val chap35View = findViewById<RelativeLayout>(R.id.book1chap35)
            val chap36View = findViewById<RelativeLayout>(R.id.book1chap36)
            val chap37View = findViewById<RelativeLayout>(R.id.book1chap37)
            val chap38View = findViewById<RelativeLayout>(R.id.book1chap38)
            val chap39View = findViewById<RelativeLayout>(R.id.book1chap39)
            val chap40View = findViewById<RelativeLayout>(R.id.book1chap40)
            val chap41View = findViewById<RelativeLayout>(R.id.book1chap41)
            val chap42View = findViewById<RelativeLayout>(R.id.book1chap42)
            val chap43View = findViewById<RelativeLayout>(R.id.book1chap43)
            val chap44View = findViewById<RelativeLayout>(R.id.book1chap44)
            val chap45View = findViewById<RelativeLayout>(R.id.book1chap45)
            val chap46View = findViewById<RelativeLayout>(R.id.book1chap46)
            val chap47View = findViewById<RelativeLayout>(R.id.book1chap47)
            val chap48View = findViewById<RelativeLayout>(R.id.book1chap48)
            val chap49View = findViewById<RelativeLayout>(R.id.book1chap49)
            val chap50View = findViewById<RelativeLayout>(R.id.book1chap50)
            val chap51View = findViewById<RelativeLayout>(R.id.book1chap51)
            val chap52View = findViewById<RelativeLayout>(R.id.book1chap52)
            val chap53View = findViewById<RelativeLayout>(R.id.book1chap53)


            if (progress.chapter > 0) {
                var check = findViewById<CheckBox>(R.id.checkbook1chapP)
                var rel = findViewById<RelativeLayout>(R.id.book1chap1)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 1) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap1)
                var rel = findViewById<RelativeLayout>(R.id.book1chap2)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 2) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap2)
                var rel = findViewById<RelativeLayout>(R.id.book1chap3)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 3) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap3)
                var rel = findViewById<RelativeLayout>(R.id.book1chap4)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 4) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap4)
                var rel = findViewById<RelativeLayout>(R.id.book1chap5)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 5) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap5)
                var rel = findViewById<RelativeLayout>(R.id.book1chap6)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 6) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap6)
                var rel = findViewById<RelativeLayout>(R.id.book1chap7)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 7) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap7)
                var rel = findViewById<RelativeLayout>(R.id.book1chap8)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 8) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap8)
                var rel = findViewById<RelativeLayout>(R.id.book1chap9)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 9) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap9)
                var rel = findViewById<RelativeLayout>(R.id.book1chap10)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 10) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap10)
                var rel = findViewById<RelativeLayout>(R.id.book1chap11)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 11) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap11)
                var rel = findViewById<RelativeLayout>(R.id.book1chap12)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 12) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap12)
                var rel = findViewById<RelativeLayout>(R.id.book1chap13)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 13) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap13)
                var rel = findViewById<RelativeLayout>(R.id.book1chap14)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 14) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap14)
                var rel = findViewById<RelativeLayout>(R.id.book1chap15)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 15) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap15)
                var rel = findViewById<RelativeLayout>(R.id.book1chap16)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 16) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap16)
                var rel = findViewById<RelativeLayout>(R.id.book1chap17)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 17) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap17)
                var rel = findViewById<RelativeLayout>(R.id.book1chap18)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 18) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap18)
                var rel = findViewById<RelativeLayout>(R.id.book1chap19)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 19) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap19)
                var rel = findViewById<RelativeLayout>(R.id.book1chap20)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 20) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap20)
                var rel = findViewById<RelativeLayout>(R.id.book1chap21)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 21) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap21)
                var rel = findViewById<RelativeLayout>(R.id.book1chap22)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 22) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap22)
                var rel = findViewById<RelativeLayout>(R.id.book1chap23)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 23) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap23)
                var rel = findViewById<RelativeLayout>(R.id.book1chap24)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 24) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap24)
                var rel = findViewById<RelativeLayout>(R.id.book1chap25)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 25) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap25)
                var rel = findViewById<RelativeLayout>(R.id.book1chap26)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 26) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap26)
                var rel = findViewById<RelativeLayout>(R.id.book1chap27)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 27) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap27)
                var rel = findViewById<RelativeLayout>(R.id.book1chap28)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 28) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap28)
                var rel = findViewById<RelativeLayout>(R.id.book1chap29)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 29) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap29)
                var rel = findViewById<RelativeLayout>(R.id.book1chap30)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 30) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap30)
                var rel = findViewById<RelativeLayout>(R.id.book1chap31)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 31) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap31)
                var rel = findViewById<RelativeLayout>(R.id.book1chap32)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 32) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap32)
                var rel = findViewById<RelativeLayout>(R.id.book1chap33)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 33) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap33)
                var rel = findViewById<RelativeLayout>(R.id.book1chap34)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 34) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap34)
                var rel = findViewById<RelativeLayout>(R.id.book1chap35)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 35) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap35)
                var rel = findViewById<RelativeLayout>(R.id.book1chap36)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 36) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap36)
                var rel = findViewById<RelativeLayout>(R.id.book1chap37)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 37) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap37)
                var rel = findViewById<RelativeLayout>(R.id.book1chap38)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 38) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap38)
                var rel = findViewById<RelativeLayout>(R.id.book1chap39)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 39) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap39)
                var rel = findViewById<RelativeLayout>(R.id.book1chap40)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 40) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap40)
                var rel = findViewById<RelativeLayout>(R.id.book1chap41)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 41) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap41)
                var rel = findViewById<RelativeLayout>(R.id.book1chap42)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 42) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap42)
                var rel = findViewById<RelativeLayout>(R.id.book1chap43)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 43) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap43)
                var rel = findViewById<RelativeLayout>(R.id.book1chap44)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 44) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap44)
                var rel = findViewById<RelativeLayout>(R.id.book1chap45)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 45) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap45)
                var rel = findViewById<RelativeLayout>(R.id.book1chap46)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 46) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap46)
                var rel = findViewById<RelativeLayout>(R.id.book1chap47)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 47) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap47)
                var rel = findViewById<RelativeLayout>(R.id.book1chap48)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 48) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap48)
                var rel = findViewById<RelativeLayout>(R.id.book1chap49)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 49) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap49)
                var rel = findViewById<RelativeLayout>(R.id.book1chap50)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 50) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap50)
                var rel = findViewById<RelativeLayout>(R.id.book1chap51)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 51) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap51)
                var rel = findViewById<RelativeLayout>(R.id.book1chap52)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }
            if (progress.chapter > 52) {
                var check = findViewById<CheckBox>(R.id.checkbook1chap52)
                var rel = findViewById<RelativeLayout>(R.id.book1chap53)
                check.isChecked = true
                rel.visibility = View.VISIBLE
            }

    }
    fun boxClick(boxview: View) {
        var check = findViewById<CheckBox>(boxview.id)

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
            var chapViews = arrayOf(findViewById<RelativeLayout>(R.id.book1chapP), findViewById<RelativeLayout>(R.id.book1chap1),
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


            if (check.id == getResources().getIdentifier("checkbook1chapP", "id", packageName)) {

                makegone(1, chapViews)
                val filename = "Progress"
                val fileContents = "1-0"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 0
            } else if (check.id == getResources().getIdentifier("checkbook1chap1", "id", packageName)) {


                makegone(2, chapViews)
                val filename = "Progress"
                val fileContents = "1-1"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 1
            } else if (check.id == getResources().getIdentifier("checkbook1chap2", "id", packageName)) {


                makegone(3, chapViews)
                val filename = "Progress"
                val fileContents = "1-2"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 2
            } else if (check.id == getResources().getIdentifier("checkbook1chap3", "id", packageName)) {


                makegone(4, chapViews)
                val filename = "Progress"
                val fileContents = "1-3"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 3
            } else if (check.id == getResources().getIdentifier("checkbook1chap4", "id", packageName)) {


                makegone(5, chapViews)
                val filename = "Progress"
                val fileContents = "1-4"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 4
            } else if (check.id == getResources().getIdentifier("checkbook1chap5", "id", packageName)) {


                makegone(6, chapViews)
                val filename = "Progress"
                val fileContents = "1-5"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 5
            } else if (check.id == getResources().getIdentifier("checkbook1chap6", "id", packageName)) {


                makegone(7, chapViews)
                val filename = "Progress"
                val fileContents = "1-6"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 6
            } else if (check.id == getResources().getIdentifier("checkbook1chap7", "id", packageName)) {


                makegone(8, chapViews)
                val filename = "Progress"
                val fileContents = "1-7"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 7
            } else if (check.id == getResources().getIdentifier("checkbook1chap8", "id", packageName)) {


                makegone(9, chapViews)
                val filename = "Progress"
                val fileContents = "1-8"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 8
            } else if (check.id == getResources().getIdentifier("checkbook1chap9", "id", packageName)) {


                makegone(10, chapViews)
                val filename = "Progress"
                val fileContents = "1-9"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 9
            } else if (check.id == getResources().getIdentifier("checkbook1chap10", "id", packageName)) {


                makegone(11, chapViews)
                val filename = "Progress"
                val fileContents = "1-10"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 10
            } else if (check.id == getResources().getIdentifier("checkbook1chap11", "id", packageName)) {


                makegone(12, chapViews)
                val filename = "Progress"
                val fileContents = "1-11"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 11
            } else if (check.id == getResources().getIdentifier("checkbook1chap12", "id", packageName)) {


                makegone(13, chapViews)
                val filename = "Progress"
                val fileContents = "1-12"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 12
            } else if (check.id == getResources().getIdentifier("checkbook1chap13", "id", packageName)) {


                makegone(14, chapViews)
                val filename = "Progress"
                val fileContents = "1-13"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 13
            } else if (check.id == getResources().getIdentifier("checkbook1chap14", "id", packageName)) {


                makegone(15, chapViews)
                val filename = "Progress"
                val fileContents = "1-14"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 14
            } else if (check.id == getResources().getIdentifier("checkbook1chap15", "id", packageName)) {


                makegone(16, chapViews)
                val filename = "Progress"
                val fileContents = "1-15"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 15
            } else if (check.id == getResources().getIdentifier("checkbook1chap16", "id", packageName)) {


                makegone(17, chapViews)
                val filename = "Progress"
                val fileContents = "1-16"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 16
            } else if (check.id == getResources().getIdentifier("checkbook1chap17", "id", packageName)) {


                makegone(18, chapViews)
                val filename = "Progress"
                val fileContents = "1-17"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 17
            } else if (check.id == getResources().getIdentifier("checkbook1chap18", "id", packageName)) {


                makegone(19, chapViews)
                val filename = "Progress"
                val fileContents = "1-18"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 18
            } else if (check.id == getResources().getIdentifier("checkbook1chap19", "id", packageName)) {


                makegone(20, chapViews)
                val filename = "Progress"
                val fileContents = "1-19"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 19
            } else if (check.id == getResources().getIdentifier("checkbook1chap20", "id", packageName)) {


                makegone(21, chapViews)
                val filename = "Progress"
                val fileContents = "1-20"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 20
            } else if (check.id == getResources().getIdentifier("checkbook1chap21", "id", packageName)) {


                makegone(22, chapViews)
                val filename = "Progress"
                val fileContents = "1-21"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 21
            } else if (check.id == getResources().getIdentifier("checkbook1chap22", "id", packageName)) {


                makegone(23, chapViews)
                val filename = "Progress"
                val fileContents = "1-22"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 22
            } else if (check.id == getResources().getIdentifier("checkbook1chap23", "id", packageName)) {


                makegone(24, chapViews)
                val filename = "Progress"
                val fileContents = "1-23"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 23
            } else if (check.id == getResources().getIdentifier("checkbook1chap24", "id", packageName)) {


                makegone(25, chapViews)
                val filename = "Progress"
                val fileContents = "1-24"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 24
            } else if (check.id == getResources().getIdentifier("checkbook1chap25", "id", packageName)) {


                makegone(26, chapViews)
                val filename = "Progress"
                val fileContents = "1-25"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 25
            } else if (check.id == getResources().getIdentifier("checkbook1chap26", "id", packageName)) {


                makegone(27, chapViews)
                val filename = "Progress"
                val fileContents = "1-26"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 26
            } else if (check.id == getResources().getIdentifier("checkbook1chap27", "id", packageName)) {


                makegone(28, chapViews)
                val filename = "Progress"
                val fileContents = "1-27"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 27
            } else if (check.id == getResources().getIdentifier("checkbook1chap28", "id", packageName)) {


                makegone(29, chapViews)
                val filename = "Progress"
                val fileContents = "1-28"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 28
            } else if (check.id == getResources().getIdentifier("checkbook1chap29", "id", packageName)) {


                makegone(30, chapViews)
                val filename = "Progress"
                val fileContents = "1-29"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 29
            } else if (check.id == getResources().getIdentifier("checkbook1chap30", "id", packageName)) {


                makegone(31, chapViews)
                val filename = "Progress"
                val fileContents = "1-30"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 30
            } else if (check.id == getResources().getIdentifier("checkbook1chap31", "id", packageName)) {


                makegone(32, chapViews)
                val filename = "Progress"
                val fileContents = "1-31"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 31
            } else if (check.id == getResources().getIdentifier("checkbook1chap32", "id", packageName)) {


                makegone(33, chapViews)
                val filename = "Progress"
                val fileContents = "1-32"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 32
            } else if (check.id == getResources().getIdentifier("checkbook1chap33", "id", packageName)) {


                makegone(34, chapViews)
                val filename = "Progress"
                val fileContents = "1-33"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 33
            } else if (check.id == getResources().getIdentifier("checkbook1chap34", "id", packageName)) {


                makegone(35, chapViews)
                val filename = "Progress"
                val fileContents = "1-34"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 34
            } else if (check.id == getResources().getIdentifier("checkbook1chap35", "id", packageName)) {


                makegone(36, chapViews)
                val filename = "Progress"
                val fileContents = "1-35"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 35
            } else if (check.id == getResources().getIdentifier("checkbook1chap36", "id", packageName)) {


                makegone(37, chapViews)
                val filename = "Progress"
                val fileContents = "1-36"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 36
            } else if (check.id == getResources().getIdentifier("checkbook1chap37", "id", packageName)) {


                makegone(38, chapViews)
                val filename = "Progress"
                val fileContents = "1-37"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 37
            } else if (check.id == getResources().getIdentifier("checkbook1chap38", "id", packageName)) {


                makegone(39, chapViews)
                val filename = "Progress"
                val fileContents = "1-38"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 38
            } else if (check.id == getResources().getIdentifier("checkbook1chap39", "id", packageName)) {


                makegone(40, chapViews)
                val filename = "Progress"
                val fileContents = "1-39"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 39
            } else if (check.id == getResources().getIdentifier("checkbook1chap40", "id", packageName)) {


                makegone(41, chapViews)
                val filename = "Progress"
                val fileContents = "1-40"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 40
            } else if (check.id == getResources().getIdentifier("checkbook1chap41", "id", packageName)) {


                makegone(42, chapViews)
                val filename = "Progress"
                val fileContents = "1-41"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 41
            } else if (check.id == getResources().getIdentifier("checkbook1chap42", "id", packageName)) {


                makegone(43, chapViews)
                val filename = "Progress"
                val fileContents = "1-42"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 42
            } else if (check.id == getResources().getIdentifier("checkbook1chap43", "id", packageName)) {


                makegone(44, chapViews)
                val filename = "Progress"
                val fileContents = "1-43"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 43
            } else if (check.id == getResources().getIdentifier("checkbook1chap44", "id", packageName)) {


                makegone(45, chapViews)
                val filename = "Progress"
                val fileContents = "1-44"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 44
            } else if (check.id == getResources().getIdentifier("checkbook1chap45", "id", packageName)) {


                makegone(46, chapViews)
                val filename = "Progress"
                val fileContents = "1-45"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 45
            } else if (check.id == getResources().getIdentifier("checkbook1chap46", "id", packageName)) {


                makegone(47, chapViews)
                val filename = "Progress"
                val fileContents = "1-46"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 46
            } else if (check.id == getResources().getIdentifier("checkbook1chap47", "id", packageName)) {


                makegone(48, chapViews)
                val filename = "Progress"
                val fileContents = "1-47"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 47
            } else if (check.id == getResources().getIdentifier("checkbook1chap48", "id", packageName)) {


                makegone(49, chapViews)
                val filename = "Progress"
                val fileContents = "1-48"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 48
            } else if (check.id == getResources().getIdentifier("checkbook1chap49", "id", packageName)) {


                makegone(50, chapViews)
                val filename = "Progress"
                val fileContents = "1-49"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 49
            } else if (check.id == getResources().getIdentifier("checkbook1chap50", "id", packageName)) {


                makegone(51, chapViews)
                val filename = "Progress"
                val fileContents = "1-50"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 50
            } else if (check.id == getResources().getIdentifier("checkbook1chap51", "id", packageName)) {


                makegone(52, chapViews)
                val filename = "Progress"
                val fileContents = "1-51"
                openFileOutput(filename, Context.MODE_PRIVATE).use {
                    it.write(fileContents.toByteArray())
                }

                progress.book = 1
                progress.chapter = 51
            } else if (check.id == getResources().getIdentifier("checkbook1chap52", "id", packageName)) {


                makegone(53, chapViews)
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
        guideView.postInvalidate()
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
fun makegone(start: Int, views: Array<RelativeLayout>)
{
    for (num in start..53)
    {
        views[num].visibility = View.GONE
    }
}