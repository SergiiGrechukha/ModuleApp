package com.techery.astream

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.techery.astream.di.StreamACommon
import com.techery.core.SomethingUseful
import kotlinx.android.synthetic.main.activity_a_stream.*
import javax.inject.Inject

class AStreamActivity : AppCompatActivity() {

    @Inject lateinit var somethingUseful: SomethingUseful

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_stream)

        injectDeps()
        setUpUI()
    }

    private fun setUpUI() {
        streamText.text = "ModuleName: ${BuildConfig.APPLICATION_ID}\ncore: ${somethingUseful.getSomethingUseful()}"
    }

    @SuppressLint("WrongConstant")
    private fun injectDeps() {
        val component = (application.getSystemService("Dagger") as StreamACommon?)
        if (component != null) {
            component.streamAComponent().build().inject(this)

        }
    }
}
