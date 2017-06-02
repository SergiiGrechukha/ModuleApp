package com.techery.moduleapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.techery.moduleapp.di.common.CommonComponent
import com.techery.moduleapp.routing.Router
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var router: Router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDeps()
        setUpUI()
    }

    @SuppressLint("WrongConstant")
    private fun injectDeps() {
        val component = (application.getSystemService("Dagger") as CommonComponent?)
        if (component != null) {
            component.shellSubComponent().build().inject(this)
        }
//        (application as App).commonComponent.shellSubComponent().build().inject(this)
    }

    private fun setUpUI() {

        btnStreamA.setOnClickListener({
            router.launchStreamA(this)
        })

        btnStreamB.setOnClickListener({
            router.launchStreamB(this)
        })

        currentFlavor.text = getCurrentFlavor()
    }

    fun getCurrentFlavor() = "Current flavor: ${BuildConfig.FLAVOR}"
}
