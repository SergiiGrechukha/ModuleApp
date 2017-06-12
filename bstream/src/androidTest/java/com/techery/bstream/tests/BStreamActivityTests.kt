package com.techery.bstream.tests

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.android.androidActivityScope
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.scopedSingleton
import com.techery.bstream.BStreamActivity
import com.techery.bstream.rules.KodeinRule
import com.techery.bstream.R
import com.techery.core.SomethingUseful
import org.hamcrest.CoreMatchers.containsString
import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain
import org.junit.rules.TestRule
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class BStreamActivityTests {

    val MOCK_TEXT = "I am Mock"

    var mockModule: Kodein.Module

    init {
        MockitoAnnotations.initMocks(this)

        val mockSomething = Mockito.mock(SomethingUseful::class.java)
        `when`(mockSomething.getSomethingUseful()).thenReturn(MOCK_TEXT)
        mockModule = Kodein.Module {

            bind<SomethingUseful>() with scopedSingleton(androidActivityScope) {
                mockSomething
            }
        }
    }

    val kodeinRule = KodeinRule(InstrumentationRegistry.getTargetContext(), mockModule)

    private val mActivityRule = ActivityTestRule<BStreamActivity>(BStreamActivity::class.java, false, false)

    @Rule @JvmField
    var chain: TestRule = RuleChain.outerRule(kodeinRule).around(mActivityRule)

    private fun launchActivity() {
        mActivityRule.launchActivity(null)
    }

    @Test
    fun bStreamActivityMockSomething() {

        launchActivity()

        onView(withId(R.id.streamText)).check(matches(withText(containsString(MOCK_TEXT))))
    }
}

