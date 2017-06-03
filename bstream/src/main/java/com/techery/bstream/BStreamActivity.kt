package com.techery.bstream

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.techery.bstream.di.StreamBCommon
import com.techery.core.SomethingUseful
import kotlinx.android.synthetic.main.activity_b_stream.*

class BStreamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_stream)

        injectDeps()
        setUpUI()
    }

    private fun setUpUI() {
        streamText.text = "ModuleName: ${BuildConfig.APPLICATION_ID}\ncore: ${SomethingUseful().getSomethingUseful()}"
    }

    @SuppressLint("WrongConstant")
    private fun injectDeps() {
        val component = (application.getSystemService("Dagger") as StreamBCommon?)
        if (component != null) {
            component.streamBComponent().build().inject(this)
        }
    }
}
