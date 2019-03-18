package com.example.u0450254.wheeloftimecompanion.Locations.Maps

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.u0450254.wheeloftimecompanion.Locations.MapView
import com.example.u0450254.wheeloftimecompanion.R
import android.view.ScaleGestureDetector
import android.widget.ImageView
import android.text.method.Touch.onTouchEvent
import android.view.MotionEvent
import android.widget.LinearLayout

/*
 * Created by u0450254 on 6/14/2018.
 */
class EmondsFieldMap : AppCompatActivity() {


    private var mScaleGestureDetector: ScaleGestureDetector? = null
    private var mScaleFactor = 1.0f
    private var mImageView: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        var mImageView = findViewById<MapView>(R.id.mapView)

        mImageView.setMap(R.drawable.edmonds_field_map)

        mImageView.setImageResource(R.drawable.edmonds_field_map)
        var mScaleGestureDetector = ScaleGestureDetector(this, ScaleListener())
        mImageView.setImageResource(R.drawable.aessedaiicon)

    }

    override fun onTouchEvent(motionEvent: MotionEvent): Boolean {
        mScaleGestureDetector!!.onTouchEvent(motionEvent)
        return true
    }

    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScale(scaleGestureDetector: ScaleGestureDetector): Boolean {
            mScaleFactor *= scaleGestureDetector.scaleFactor
            mScaleFactor = Math.max(1.0f, Math.min(mScaleFactor, 10.0f))
            mImageView!!.setScaleX(mScaleFactor)
            mImageView!!.setScaleY(mScaleFactor)
            return true
        }
    }
}