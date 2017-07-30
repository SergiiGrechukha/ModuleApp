package com.techery.cstream

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.techery.cstream.stubs.SampleClass4000

class CStreamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", SampleClass4000().className)
    }
}
