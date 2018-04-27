package com.chao.practice.anim

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    private val RADIUS: Float = 70f
    private var current: Point? = null
    private var mPaint: Paint? = null

    init {
        mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mPaint!!.color = Color.BLUE
    }

    override fun onDraw(canvas: Canvas?) {
        if (current == null) {
            current = Point(RADIUS, RADIUS)
            canvas!!.drawCircle(current!!.x, current!!.y, RADIUS, mPaint)
            val startPoint = Point(RADIUS, RADIUS)
            val endPoint = Point(700f, 1000f)
            val animation = ValueAnimator.ofObject(PointEvaluator(), startPoint, endPoint)
            animation.duration = 3000
            animation.addUpdateListener {
                current = it.animatedValue as Point?
                invalidate()
            }
            animation.start()
        } else {
            canvas!!.drawCircle(current!!.x, current!!.y, RADIUS, mPaint)
        }
    }
}