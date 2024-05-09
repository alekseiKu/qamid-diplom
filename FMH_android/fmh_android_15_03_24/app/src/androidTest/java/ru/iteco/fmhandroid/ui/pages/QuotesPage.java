package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.ui.steps.NewsSteps.withIndex;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class QuotesPage {

    public static Matcher<View> getQuotesPageButton() {
        return allOf(withId(R.id.our_mission_image_button));
    }

    public static Matcher<View> getQuotesPageButtonExpand() {
        return allOf(withIndex(withId(R.id.our_mission_item_open_card_image_button), 0));
    }

    public static Matcher<View> getQuotesPageDescription() {
        return allOf(withIndex(withId(R.id.our_mission_item_description_text_view), 0));
    }
}