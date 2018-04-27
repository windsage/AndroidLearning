package com.chao.practice.anim

import android.animation.TypeEvaluator

/**
 * implements TypeEvaluator
 */
class PointEvaluator : TypeEvaluator<Point> {
    override fun evaluate(fraction: Float, startValue: Point?, endValue: Point?): Point {
        val x = startValue!!.x + fraction * (endValue!!.x - startValue.x)
        val y = startValue.y + fraction * (endValue.y - endValue.y)
        return Point(x, y)
    }

}
