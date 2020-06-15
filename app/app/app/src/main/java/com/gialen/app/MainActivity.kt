package com.gialen.app

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playSplashAnimation()
    }
    fun playSplashAnimation() {
        animation_view.setAnimation("splash_animate.json")
        animation_view.addAnimatorListener(object : AnimatorListener {
            override fun onAnimationStart(animation: Animator) {}
            override fun onAnimationEnd(animation: Animator) {
            }

            override fun onAnimationCancel(animation: Animator) {}
            override fun onAnimationRepeat(animation: Animator) {}
        })
        animation_view.playAnimation()
    }
}
