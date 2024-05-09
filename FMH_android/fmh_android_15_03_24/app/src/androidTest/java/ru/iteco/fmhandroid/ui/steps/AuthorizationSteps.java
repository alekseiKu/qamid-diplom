package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.ui.pages.AuthorizationPage.getAuthorizationPageButtonLogOut;
import static ru.iteco.fmhandroid.ui.pages.AuthorizationPage.getAuthorizationPageLoginField;
import static ru.iteco.fmhandroid.ui.pages.AuthorizationPage.getAuthorizationPagePasswordField;
import static ru.iteco.fmhandroid.ui.pages.AuthorizationPage.getAuthorizationPageTextAuthorization;
import static ru.iteco.fmhandroid.ui.pages.WaitId.waitFor;
import static ru.iteco.fmhandroid.ui.pages.WaitId.waitUntilPage;

import androidx.test.espresso.NoMatchingViewException;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.pages.AuthorizationPage;

public class AuthorizationSteps {

    public static void authorization() {
        try {
            AuthorizationPage.textAuthorization();
        } catch (NoMatchingViewException e) {
            return;
        }
        AuthorizationSteps.clickLoginField();
        AuthorizationSteps.clickPasswordField();
        AuthorizationPage.clickButton(AuthorizationPage.getAuthorizationPageButton());
    }

    public static void clickLoginField() {
        Allure.step("В поле логин ввести: login2");
        waitUntilPage(R.id.login_text_input_layout);
        onView(getAuthorizationPageLoginField())
                .perform(replaceText("login2"), closeSoftKeyboard())
                .check(matches(isDisplayed()));
    }

    public static void clickButton(Integer resourceId) {
        Allure.step("Нажать на кнопку 'Войти'");
        waitUntilPage(R.id.enter_button);
        onView(withId(resourceId))
                .perform(click());
    }


    public static void clickPasswordField() {
        Allure.step("В поле пароль ввести: password2");
        waitUntilPage(R.id.password_text_input_layout);
        onView(getAuthorizationPagePasswordField())
                .perform(replaceText("password2"), closeSoftKeyboard())
                .check(matches(isDisplayed()));
    }

    public static void clickButtonExit(Integer resourceId) {
        Allure.step("Нажать на кнопку 'Выход'");
        waitUntilPage(R.id.authorization_image_button);
        waitFor(5);
        onView(withId(resourceId))
                .perform(click());
    }

    public static void clickLoginFieldWithSpecialCharacters() {
        Allure.step("Ввести в поле Логин спецсимволы");
        onView(getAuthorizationPageLoginField())
                .perform(replaceText("$^@#!@"), closeSoftKeyboard());
        onView(allOf(withContentDescription("Wrong login or password"), isDisplayed()));
    }


    public static void clickPasswordFieldIsEmpty() {
        Allure.step("Поле Пароль оставить пустым");
        onView(getAuthorizationPagePasswordField())
                .perform(replaceText(" "), closeSoftKeyboard())
                .check(matches(isDisplayed()));
        onView(allOf(withContentDescription("Wrong login or password"), isDisplayed()));
    }

    public static void clickButtonLogOut() {
        Allure.step("Нажать на кнопку 'Log out'");
        waitUntilPage(android.R.id.title);
        onView(getAuthorizationPageButtonLogOut())
                .perform(click());
    }

    public static void textAuthorization() {
        Allure.step("Отобразилаcь страница Авторизации");
        waitUntilPage(R.id.nav_host_fragment);
        waitFor(5);
        onView(getAuthorizationPageTextAuthorization())
                .check(matches(isDisplayed()));
    }

    public static void clickLoginEmpty() {
        Allure.step("Не заполнять поле логин");
        onView(getAuthorizationPageLoginField())
                .perform(replaceText("   "), closeSoftKeyboard());
        onView(allOf(withContentDescription("Login and password cannot be empty"), isDisplayed()));
    }

    public static void clickLoginFieldUnregisteredUser() {
        Allure.step("Ввести в поле логин выдуманные данные");
        onView(getAuthorizationPageLoginField())
                .perform(replaceText("logggggg"), closeSoftKeyboard());
        onView(allOf(withContentDescription("Wrong login or password"), isDisplayed()));
    }


}