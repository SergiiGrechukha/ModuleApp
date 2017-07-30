package com.loki.astream

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.conf.ConfigurableKodein
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.with
import com.loki.astream.di.aStreamModule
import com.loki.astream.stubs.SampleClass0
import com.loki.core.SomethingUseful
import com.loki.core.addModule
import com.loki.core.iNeedSomeKodein
import com.loki.core.routing.Router
import kotlinx.android.synthetic.main.activity_a_stream.*

class AStreamActivity : AppCompatActivity(), KodeinAware {

    override val kodein = ConfigurableKodein()

    private val injector = KodeinInjector()
    private val somethingUseful: SomethingUseful by injector.with(this).instance<SomethingUseful>()
    private val routerKodein: Router by injector.instance<Router>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_stream)

        injectDeps()
        setUpUI()
    }

    private fun setUpUI() {
        streamText.text = "ModuleName: ${BuildConfig.APPLICATION_ID}\ncore: ${somethingUseful.getSomethingUseful()}"
        streamText.setOnClickListener({
            routerKodein.launchStreamB(this)
        })
        Log.d("TAG", SampleClass0().className)
    }

    @SuppressLint("WrongConstant")
    private fun injectDeps() {
        application addModule aStreamModule
        injector.inject(this.iNeedSomeKodein())
    }
}
