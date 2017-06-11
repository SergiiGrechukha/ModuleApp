package com.techery.bstream

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import com.techery.bstream.mock.BStreamMockModule
import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain
import org.junit.rules.TestRule

class BStreamActivityTests {

    val kodeinRule = KodeinRule(InstrumentationRegistry.getTargetContext(), BStreamMockModule().mockModule)

    private val mActivityRule = ActivityTestRule<BStreamActivity>(BStreamActivity::class.java, false, false)

    @Rule @JvmField
    var chain: TestRule = RuleChain.outerRule(kodeinRule).around(mActivityRule)

    private fun launchActivity() {
        mActivityRule.launchActivity(null)
    }

    @Test
    fun bStreamActivityMockSomething(){

        launchActivity()

        onView(withId(R.id.streamText)).check(matches(isDisplayed()))
    }
}

