package com.example.a4_9_1_kotlin

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.a4_9_1_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding!!.getRoot()
        setContentView(view)


        initviews()

    }

    fun initviews() {
        binding!!.bounceBt.setOnClickListener(View.OnClickListener {
            val animation = AnimationUtils.loadAnimation(
                applicationContext, R.anim.bounce
            )
            binding!!.csGo.startAnimation(animation)
        })
    }
}