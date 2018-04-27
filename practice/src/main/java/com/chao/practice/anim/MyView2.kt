package com.chao.practice.anim

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyView2(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    private val RADIUS = 70F
    private var mPaint: Paint? = null
    private var color: String? = null
        set(value) {
            field = value
            mPaint = Paint(Color.parseColor(value))
            invalidate()
        }

    init {
        mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mPaint!!.color = Color.BLUE
    }

    override fun onDraw(canvas: Canvas?) {
        canvas!!.drawCircle(500f, 500f, RADIUS, mPaint)
    }
}