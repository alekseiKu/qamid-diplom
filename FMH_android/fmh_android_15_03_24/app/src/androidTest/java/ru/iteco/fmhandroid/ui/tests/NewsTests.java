package ru.iteco.fmhandroid.ui.tests;

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
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.NewsSteps;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class NewsTests {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule = new ActivityScenarioRule<>(AppActivity.class);

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
    public void viewingNewsControlPanel() {
        navigateToNewsControlPanel();
        NewsSteps.clickClickNews();
    }

    @Test
    public void creationNewsInControlPanel() {
        navigateToNewsControlPanel();
        fillAndSaveNewsDetails();
    }

    @Test
    public void sortingNewsControlPanel() {
        navigateToNewsControlPanel();
        NewsSteps.clickButtonSorting();
    }

    @Test
    public void editNewsControlPanel() {
        navigateToNewsControlPanel();
        NewsSteps.clickClickNews();
        editAndSaveNews();
    }

    @Test
    public void deletingActiveNews() {
        navigateToNewsControlPanel();
        NewsSteps.clickClickNews();
        NewsSteps.clickButtonDeleteNews();
        NewsSteps.clickOkDeleteNews();
    }

    @Test
    public void statusChangeNews() {
        navigateToNewsControlPanel();
        NewsSteps.clickClickNews();
        NewsSteps.clickButtonEditNews();
        NewsSteps.clickButtonSwitcher();
        NewsSteps.clickButtonSaveEditingNews();
    }

    @Test
    public void filterNewsByCriterionActive() {
        navigateToNewsControlPanel();
        NewsSteps.clickFilterNewsControlPanel();
        NewsSteps.clickRemoveCheckBoxActive();
        NewsSteps.clickButtonFilterNewsControlPanel();
    }

    private void navigateToNewsControlPanel() {
        NewsSteps.clickButtonMainMenu();
        NewsSteps.clickButtonNews();
        NewsSteps.clickButtonControlPanel();
    }

    private void fillAndSaveNewsDetails() {
        NewsSteps.clickAddNews();
        NewsSteps.clickButtonCategoryCreatingNews();
        NewsSteps.clickButtonTitleCreatingNews();
        NewsSteps.clickButtonDateCreatingNews();
        NewsSteps.clickButtonOkDateCreatingNews();
        NewsSteps.clickButtonTimeCreatingNews();
        NewsSteps.clickButtonOkTimeCreatingNews();
        NewsSteps.clickDescriptionCreatingNews();
        NewsSteps.clickButtonSaveCreatingNews();
    }

    private void editAndSaveNews() {
        NewsSteps.clickButtonEditNews();
        NewsSteps.clickButtonTitleNewsControlPanel();
        NewsSteps.clickButtonSaveEditingNews();
    }
}
