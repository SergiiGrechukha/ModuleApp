package com.techery.moduleapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import routing.StreamRouting

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

        setUpUI()
    }

    private fun setUpUI() {

        val router = StreamRouting()

        btnStreamA.setOnClickListener({
            router.launchStreamA(this)
        })

        btnStreamB.setOnClickListener({
            router.launchStreamB(this)
        })

        currentFlavor.text = getCurrentFlavor()
    }

     fun getCurrentFlavor() = "Current flavor: ${BuildConfig.FLAVOR}"
}
