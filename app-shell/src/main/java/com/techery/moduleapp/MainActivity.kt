package com.techery.moduleapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.instance
import com.techery.core.addModule
import com.techery.core.iNeedSomeKodein
import com.techery.moduleapp.di.mainActivityModule
import com.techery.core.routing.Router
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val injector = KodeinInjector()
    private val routerKodein: Router by injector.instance<Router>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDeps()
        setUpUI()
    }

    @SuppressLint("WrongConstant")
    private fun injectDeps() {
        application addModule mainActivityModule
        injector.inject(this.iNeedSomeKodein())
    }

    private fun setUpUI() {

        btnStreamA.setOnClickListener({
            routerKodein.launchStreamA(this)
        })

        btnStreamB.setOnClickListener({
            routerKodein.launchStreamB(this)
        })

        currentFlavor.text = getCurrentFlavor()
    }

    fun getCurrentFlavor() = "Current flavor: ${BuildConfig.FLAVOR}"
}
