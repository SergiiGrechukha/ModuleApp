package com.techery.bstream.rules

import android.content.Context
import com.github.salomonbrys.kodein.Kodein
import com.techery.bstream.BStreamTestApp
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement


class KodeinRule(private val mContext: Context, val moduleMockKodein: Kodein.Module) : TestRule {

    override fun apply(base: Statement, description: Description): Statement {
        return object : Statement() {
            @Throws(Throwable::class)
            override fun evaluate() {
                val application = mContext.applicationContext as BStreamTestApp
                application.mockModule = moduleMockKodein
                base.evaluate()
                // Clears the component once the waiting_animator finishes so it would use the default one.
            }
        }
    }
}