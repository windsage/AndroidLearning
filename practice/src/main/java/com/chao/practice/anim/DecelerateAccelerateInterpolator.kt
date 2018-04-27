package com.chao.practice.anim

import android.view.animation.Interpolator

class DecelerateAccelerateInterpolator : Interpolator {
    override fun getInterpolation(input: Float): Float {
        return 0f
    }
}
