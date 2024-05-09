package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import static ru.iteco.fmhandroid.ui.pages.QuotesPage.getQuotesPageButton;
import static ru.iteco.fmhandroid.ui.pages.QuotesPage.getQuotesPageButtonExpand;
import static ru.iteco.fmhandroid.ui.pages.QuotesPage.getQuotesPageDescription;


import static ru.iteco.fmhandroid.ui.pages.WaitId.waitFor;
import static ru.iteco.fmhandroid.ui.pages.WaitId.waitUntilPage;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;

public class QuotesSteps {

    public static void clickButtonQuote(){
        Allure.step("Нажать на кнопку Тематические цитаты");
        waitUntilPage(R.id.our_mission_image_button);
        onView(getQuotesPageButton())
                .perform(click());
    }

    public static void clickButtonExpandQuote(){
        Allure.step("Развернуть тематическую цитату");
        waitUntilPage(R.id.our_mission_item_open_card_image_button);
        onView(getQuotesPageButtonExpand())
                .perform(click());
    }

    public static void checkDescriptionQuote(){
        Allure.step("Проверить наличие содержимого цитаты");
        waitUntilPage(R.id.our_mission_item_description_text_view);
        onView(getQuotesPageDescription())
                .check(matches(isDisplayed()));
    }
}