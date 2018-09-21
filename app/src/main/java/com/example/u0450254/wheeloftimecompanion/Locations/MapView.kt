package com.example.u0450254.wheeloftimecompanion.Locations

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.graphics.drawable.Drawable
import com.example.u0450254.wheeloftimecompanion.R


class MapView : AppCompatImageView {

    constructor(context: Context, map:Int): super(context)
    constructor(context: Context, attrs: AttributeSet): super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr)

    private val detector = ScaleGestureDetector(context, ScaleListener())

    private var startX = 0f
    private var startY = 0f

    private val NONE = 0
    private val DRAG = 1
    private val ZOOM = 2

    private var translateX = 0f
    private var translateY = 0f

    private var previousTranslateX = 0f
    private var previousTranslateY = 0f
    private var dragged = false

    private var mode: Int = 0

    private var scaleFactor = 1f

    private val MIN_ZOOM = 0.1f
    private val MAX_ZOOM = 5f

    private var beginning = true

    private var map = 0

    fun setMap(newMap: Int){
        map = newMap
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action and MotionEvent.ACTION_MASK) {
            MotionEvent.ACTION_DOWN -> {
                mode = DRAG

                startX = event.x - previousTranslateX
                startY = event.y - previousTranslateY
            }
            MotionEvent.ACTION_MOVE -> {
                translateX = event.x - startX
                translateY = event.y - startY

                val distance = Math.sqrt(Math.pow((event.x - (startX + previousTranslateX)).toDouble(), 2.0) + Math.pow((event.y - (startY + previousTranslateY)).toDouble(), 2.0)
                )
                if (distance > 0) {
                    dragged = true
                }
            }
            MotionEvent.ACTION_POINTER_DOWN -> mode = ZOOM
            MotionEvent.ACTION_UP -> {
                mode = NONE
                dragged = false
                previousTranslateX = translateX
                previousTranslateY = translateY
            }
            MotionEvent.ACTION_POINTER_UP -> {
                mode = DRAG
                previousTranslateX = translateX
                previousTranslateY = translateY
            }
        }
        detector.onTouchEvent(event)
        if (mode == DRAG && scaleFactor != 1f && dragged || mode == ZOOM) {
            invalidate()
        }
        return true
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        if (beginning) {
        beginning = false
        }

        canvas.save()
        canvas.scale(scaleFactor, scaleFactor)

        var d = resources.getDrawable(map, null)

        var scaledWidth = d.intrinsicWidth * scaleFactor
        var scaledHeight = d.intrinsicHeight * scaleFactor

        //        System.out.println("TX: "+translateX);
        //        System.out.println("TX2: "+scaledWidth);

        // TEST ------------------------------------------------------------


        println("sw: "+scaledWidth)
        println("cw: "+canvas.width)
        println("sh: "+scaledHeight)
        println("ch: "+canvas.height)
        if (scaledWidth < canvas.width) {
            // If the map is more narrow than the view, don't allow it to move past the edges
            if (translateX < 0) {
                translateX = 0f
            } else if (translateX + scaledWidth > canvas.width) {
                translateX = canvas.width - scaledWidth
            }
        } else {
            // If the map is wider than the view, don't allow the edge to move into the view
            if (translateX > 0) {
                translateX = 0f
            } else if (translateX + scaledWidth < canvas.width) {
                translateX = canvas.width - scaledWidth
            }
        }

        if (scaledHeight < canvas.height) {
            // If the map is shorter than the view, don't allow it to move past the edges
            if (translateY < 0) {
                translateY = 0f
            } else if (translateY + scaledHeight > canvas.height) {
                translateY = canvas.height - scaledHeight
            }
        } else {
            // If the map is taller than the view, don't allow its edge to move into the view
            if (translateY > 0) {
                translateY = 0f
            } else if (translateY + scaledHeight < canvas.height) {
                translateY = canvas.height - scaledHeight
            }
        }

        // TEST --------------------------------------------------------------

        /*if (translateX > 0) {
            translateX = 0;
        }
        else if (translateX + scaledWidth < canvas.getWidth()){
            translateX = canvas.getWidth() - scaledWidth;
        }
        if (translateY > 0) {
            translateY = 0;
        }
        else if (scaledHeight < canvas.getHeight() && (translateY + scaledHeight + (canvas.getHeight() - scaledHeight)) < canvas.getHeight())
        {

        }
        else if ((translateY + scaledHeight) > canvas.getHeight()){
            translateY = canvas.getHeight() - scaledHeight;
        }*/

        canvas.translate(translateX / scaleFactor, translateY / scaleFactor)

        //Drawable d = getResources().getDrawable(R.drawable.testfloor);
        //Bitmap B = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.testfloor);

        //canvas.drawCircle(500.0f, 500.0f, 20.0f, paint);

        var B = BitmapFactory.decodeResource(getContext().getResources(),  map);
        canvas.drawBitmap(B, 0f, 0f, null)
        canvas.restore()
    }


    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScale(detector: ScaleGestureDetector): Boolean {

            scaleFactor *= detector.scaleFactor

            scaleFactor = Math.max(MIN_ZOOM, Math.min(scaleFactor, MAX_ZOOM))

            return true
        }
    }
}
