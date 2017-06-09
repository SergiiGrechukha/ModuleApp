package com.techery.moduleapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.github.salomonbrys.kodein.*
import com.techery.moduleapp.di.CommonKodein
import com.techery.moduleapp.routing.Router
import kotlinx.android.synthetic.main.activity_main.*
import di.common.CommonComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var router: Router

    private val injector = KodeinInjector()


    private val routerKodein : Router by injector.instance<Router>()

    private val kodein by injector.kodein()

    fun whenReady(kodein: Kodein) = injector.inject(kodein)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDeps()
        setUpUI()

        whenReady(CommonKodein().kodein)

    }

    @SuppressLint("WrongConstant")
    private fun injectDeps() {
        val component = (application.getSystemService("Dagger") as CommonComponent?)
        if (component != null) {
            component.shellSubComponent().build().inject(this)
        }
    }

    private fun setUpUI() {

        btnStreamA.setOnClickListener({
//            router.launchStreamA(this)
            routerKodein.launchStreamA(this)
        })

        btnStreamB.setOnClickListener({
            router.launchStreamB(this)
        })

        currentFlavor.text = getCurrentFlavor()
    }

    fun getCurrentFlavor() = "Current flavor: ${BuildConfig.FLAVOR}"
}
