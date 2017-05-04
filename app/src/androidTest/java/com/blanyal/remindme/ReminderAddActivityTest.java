package com.blanyal.remindme;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ReminderAddActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> menuActivityTestRule =
            new ActivityTestRule<>(MainActivity.class, true, true);

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void saveReminderWithoutName() {
        //locate and click on the add_reminder button, then the save_reminder button
        onView(withId(R.id.add_reminder)).perform(click());
        onView(withId(R.id.save_reminder)).perform(click());

        //check if an error message is displayed
        onView(withId(R.id.reminder_title)).check(matches(hasErrorText("Reminder Title cannot be blank!")));
    }



}