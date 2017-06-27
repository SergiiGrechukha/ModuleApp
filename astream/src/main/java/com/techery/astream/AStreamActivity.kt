package com.techery.astream

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.conf.ConfigurableKodein
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.with
import com.techery.astream.di.aStreamModule
import com.techery.core.SomethingUseful
import com.techery.core.addModule
import com.techery.core.iNeedSomeKodein
import com.techery.core.routing.Router
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
    }

    @SuppressLint("WrongConstant")
    private fun injectDeps() {
        application addModule aStreamModule
        injector.inject(this.iNeedSomeKodein())
    }
}
