package ch.hsr.mge.gadgeothek;

import android.content.ComponentName;
import android.os.SystemClock;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.intent.Intents;
import android.support.test.espresso.intent.matcher.IntentMatchers;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.hsr.mge.gadgeothek.ui.GadgeothekActivity;
import ch.hsr.mge.gadgeothek.ui.RegisterActivity;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class RegisterTest {

    @Rule
    public ActivityTestRule<RegisterActivity> activityTestRule = new ActivityTestRule<RegisterActivity>(RegisterActivity.class);

    @Test
    public void showRegisterActivity() {
        // Button Register (View) kontrollieren, ob sie angezeigt wird
        Espresso.onView(ViewMatchers.withId(R.id.registerButton)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Textfeld Name (View) mit dem Wert "Reto Infanger" befüllen
        Espresso.onView(ViewMatchers.withId(R.id.name)).perform(ViewActions.typeText("Reto Infanger"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.email)).perform(ViewActions.typeText("reto.infanger@hsr.ch"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.matrikelnr)).perform(ViewActions.typeText("123456"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.password)).perform(ViewActions.typeText("qwert1234"), ViewActions.closeSoftKeyboard());

        // Keyboard schliessen => Espresso.closeSoftKeyboard()
        // Warten
        // SystemClock.sleep(5000);

        // Button Register (View) klicken
        // Espresso.onView(ViewMatchers.withId(R.id.registerButton)).perform(ViewActions.click());

        // Intents.intended(IntentMatchers.hasComponent(new ComponentName(InstrumentationRegistry.getTargetContext(), GadgeothekActivity.class)));


    }
}
