package com.techery.bstream

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.conf.ConfigurableKodein
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.with
import com.techery.core.SomethingModule
import com.techery.core.SomethingUseful
import kotlinx.android.synthetic.main.activity_b_stream.*

class BStreamActivity : AppCompatActivity(), KodeinAware {

    override val kodein = ConfigurableKodein()

    private val injector = KodeinInjector()
    private val somethingUseful: SomethingUseful by injector.with(this).instance<SomethingUseful>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_stream)

        injectDeps()
        setUpUI()
    }

    private fun setUpUI() {
        streamText.text = "ModuleName: ${BuildConfig.APPLICATION_ID}\ncore: ${somethingUseful.getSomethingUseful()}"
    }

    @SuppressLint("WrongConstant")
    private fun injectDeps() {
        kodein.addImport(SomethingModule().coreModule)
        injector.inject(kodein)
        val kodeinMain = (application.getSystemService("Kodein") as ConfigurableKodein?)
        if (kodeinMain != null) {
            kodeinMain.addExtend(kodein)
            injector.inject(kodeinMain)
        }
    }
}
