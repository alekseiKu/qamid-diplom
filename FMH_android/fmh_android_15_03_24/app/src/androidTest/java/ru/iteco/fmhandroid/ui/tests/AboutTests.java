package ru.iteco.fmhandroid.ui.tests;

import static androidx.test.espresso.Espresso.pressBack;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.pages.AuthorizationPage;
import ru.iteco.fmhandroid.ui.steps.AboutSteps;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.NewsSteps;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)

public class AboutTests {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Before
    public void authorizationCheck() {
        AuthorizationSteps.authorization();
    }

    @AfterClass
    public static void exit() {
        AuthorizationPage.clickButtonExit(AuthorizationPage.getAuthorizationPageButtonExit());
        AuthorizationSteps.clickButtonLogOut();
    }

    @Test
    public void transitionPrivacyPolicy() {
        performTransitionTest(AboutSteps::clickButtonPrivacyPolicy);
    }

    @Test
    public void transitionTermsOfUse() {
        performTransitionTest(AboutSteps::clickButtonTermsOfUse);
    }

    private void performTransitionTest(Runnable transitionAction) {
        NewsSteps.clickButtonMainMenu();
        AboutSteps.clickButtonAbout();
        transitionAction.run();
        pressBack();
    }
}