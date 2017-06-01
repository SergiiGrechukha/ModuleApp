package com.techery.bstream

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.techery.core.SomethingUseful
import kotlinx.android.synthetic.main.activity_b_stream.*

class BStreamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_stream)

        setUpUI()
    }

    private fun setUpUI() {
        streamText.text = "ModuleName: ${BuildConfig.APPLICATION_ID}\ncore: ${SomethingUseful().getSomethingUseful()}"
    }
}
