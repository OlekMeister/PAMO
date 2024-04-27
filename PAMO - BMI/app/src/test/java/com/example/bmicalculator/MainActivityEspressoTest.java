package com.example.bmicalculator;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
public class MainActivityEspressoTest {

    @Rule
    public ActivityScenarioRule
    @Test
    public void calculateBMICorrectly() {
        Espresso.onView(ViewMatchers.withId(R.id.weight)).perform(ViewActions.typeText("92"));
        Espresso.onView(ViewMatchers.withId(R.id.height)).perform(ViewActions.typeText("190"));

        Espresso.onView(ViewMatchers.withId(R.id.btnSubmit)).perform(ViewActions.click());

        Espresso.onView(withId(R.id.result)).check(matches(withText("Your BMI: 25.484766")));
    }
