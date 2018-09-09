package winetime.winetime

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.intent.rule.IntentsTestRule
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val espresso = IntentsTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun displaysWines() {
        childHasText("Chardonnay")
        childHasText("Cabernet Franc")
        childHasText("Pinot Noir")
    }

    private fun childHasText(text: String) {
        onView(withId(R.id.recycler_view)).check(matches(hasDescendant(withText(text))))
    }
}
