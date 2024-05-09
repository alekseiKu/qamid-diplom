package ru.iteco.fmhandroid.ui.tests;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.pages.AuthorizationPage;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)

public class AuthorizationTests {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Before
    public void authorizationVerification() {
        try {
            AuthorizationPage.textAuthorization();
        } catch (NoMatchingViewException e) {
            logout();
        }
    }

    @Test
    public void successfulAuthorization() {
        performAuthorizationTest(AuthorizationSteps::clickLoginField);
    }

    @Test
    public void loginFieldUnregisteredUser() {
        performAuthorizationTest(AuthorizationSteps::clickLoginFieldUnregisteredUser);
    }

    @Test
    public void loginFieldIsEmpty() {
        performAuthorizationTest(AuthorizationSteps::clickLoginEmpty);
    }

    @Test
    public void passwordFieldIsEmpty() {
        performAuthorizationTest(AuthorizationSteps::clickLoginField, AuthorizationSteps::clickPasswordFieldIsEmpty);
    }

    @Test
    public void loginFieldWithSpecialCharacters() {
        performAuthorizationTest(AuthorizationSteps::clickLoginFieldWithSpecialCharacters);
    }

    private void performAuthorizationTest(Runnable loginAction, Runnable passwordAction) {
        AuthorizationSteps.textAuthorization();
        loginAction.run();
        passwordAction.run();
        AuthorizationPage.clickButton(AuthorizationPage.getAuthorizationPageButton());
    }

    private void performAuthorizationTest(Runnable loginAction) {
        performAuthorizationTest(loginAction, AuthorizationSteps::clickPasswordField);
    }

    private void logout() {
        AuthorizationPage.clickButtonExit(AuthorizationPage.getAuthorizationPageButtonExit());
        AuthorizationSteps.clickButtonLogOut();
    }
}