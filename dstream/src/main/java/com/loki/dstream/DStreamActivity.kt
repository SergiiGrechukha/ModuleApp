package com.loki.dstream

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.loki.dstream.stubs.SampleClass6000

class DStreamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG1", SampleClass6000().className)
    }
}
