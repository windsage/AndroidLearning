package com.chao.practice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.animation.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread(Runnable { Thread.sleep(3000) }).start()
        btn.setOnClickListener { Log.e(TAG, "btn is click") }
        val animationFromRes = AnimationUtils.loadAnimation(this, R.anim.translate_animation)
        val scaleAnimationFromRes = AnimationUtils.loadAnimation(this, R.anim.scale_animation)
        val rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation)
        val alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_animation)

        val animationSet = AnimationUtils.loadAnimation(this,R.anim.multi_anim)

        btn.startAnimation(animationSet)
    }


    private fun createTranslateAnim(): Animation {
        val translateAnimation: Animation = TranslateAnimation(0F, 500F, 0F, 500F)
        translateAnimation.duration = 2000
        translateAnimation.fillAfter = true
        translateAnimation.repeatCount = 10
        return translateAnimation
    }

    private fun createScaleAnim(): Animation {
        val scaleAnimation = ScaleAnimation(0.0F, 2.0f, 0.0f, 2.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        scaleAnimation.duration = 2000
        scaleAnimation.repeatCount = 3
        return scaleAnimation
    }

    private fun createRotateAnim(): Animation {
        val rotateAnimation = RotateAnimation(0f, 270f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        rotateAnimation.duration = 3000
        rotateAnimation.repeatCount = 2
        rotateAnimation.repeatMode = Animation.REVERSE
        return rotateAnimation
    }

    private fun createAlphaAnim(): Animation {
        val alphaAnimation = AlphaAnimation(0.0f, 1.0f)
        alphaAnimation.repeatCount = 5
        alphaAnimation.duration = 3000
        return alphaAnimation
    }


    private fun createAnimSet():AnimationSet{
        val animationSet = AnimationSet(true)
        animationSet.addAnimation(createRotateAnim())
        animationSet.addAnimation(createAlphaAnim())
        animationSet.addAnimation(createScaleAnim())
        animationSet.addAnimation(createTranslateAnim())
        return animationSet
    }
}
