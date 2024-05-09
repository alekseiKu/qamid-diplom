package ru.iteco.fmhandroid.ui.steps;

import android.view.View;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;

import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsButtonMainMenu;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonSaveEditingNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonSorting;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonSwitcher;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonTimeCreatingNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonTitleCreatingNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonTitleNewsControlPanel;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageDescriptionCreatingNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageFilterNewsControlPanel;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageRemoveCheckBoxActive;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageElementsAddNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonCategoryCreatingNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonClickNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonControlPanel;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonDateCreatingNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonDeleteNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonEditNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonFilterNewsControlPanel;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonOkDateCreatingNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonOkDeleteNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonOkTimeCreatingNews;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsPageButtonSaveCreatingNews;

import static ru.iteco.fmhandroid.ui.pages.NewsPage.getNewsElementsButtonNews;
import static ru.iteco.fmhandroid.ui.pages.WaitId.waitFor;
import static ru.iteco.fmhandroid.ui.pages.WaitId.waitUntilPage;


public class NewsSteps {

    public static void clickButtonMainMenu() {
        Allure.step("Нажать на кнопку Главное меню");
        waitUntilPage(R.id.main_menu_image_button);
        waitFor(2);
        onView(getNewsButtonMainMenu())
                .perform(click());
    }

    public static void clickButtonNews() {
        Allure.step("Нажать на кнопку Новости на главной странице");
        waitUntilPage(android.R.id.title);
        onView(getNewsElementsButtonNews())
                .perform(click());
    }

    public static void clickButtonControlPanel() {
        Allure.step("Нажать на кнопку Панель управления");
        waitUntilPage(R.id.edit_news_material_button);
        onView(getNewsPageButtonControlPanel())
                .perform(click());
    }

    public static void clickButtonSorting() {
        Allure.step("Нажать на кнопку сортировки новостей");
        waitUntilPage(R.id.sort_news_material_button);
        onView(getNewsPageButtonSorting())
                .perform(click());
    }

    public static void clickButtonDeleteNews() {
        Allure.step("Нажать на кнопку удалить новость");
        waitUntilPage(R.id.delete_news_item_image_view);
        onView(getNewsPageButtonDeleteNews())
                .perform(click());
    }

    public static void clickClickNews() {
        Allure.step("Нажать на кнопку новости на главной странице мобильного приложения");
        waitUntilPage(R.id.news_item_material_card_view);
        onView(getNewsPageButtonClickNews())
                .perform(click());
    }

    public static void clickOkDeleteNews() {
        Allure.step("Нажать на кнопку OK удалить новость");
        waitUntilPage(android.R.id.button1);
        onView(getNewsPageButtonOkDeleteNews())
                .perform(click());
    }


    public static void clickButtonEditNews() {
        Allure.step("Нажать на кнопку редактировать новость");
        waitUntilPage(R.id.edit_news_item_image_view);
        onView(getNewsPageButtonEditNews())
                .perform(click());
    }

    public static void clickButtonTitleNewsControlPanel() {
        Allure.step("Отредактировать название новости");
        waitUntilPage(R.id.news_item_title_text_input_edit_text);
        onView(getNewsPageButtonTitleNewsControlPanel())
                .perform(clearText(), replaceText("Отредактированный текст новости"), closeSoftKeyboard());
    }

    public static void clickButtonSaveEditingNews() {
        Allure.step("Нажать на кнопку сохранить редактирование");
        waitUntilPage(R.id.save_button);
        onView(getNewsPageButtonSaveEditingNews())
                .perform(click());
    }

    public static void clickButtonSwitcher() {
        Allure.step("Сменить статус");
        waitUntilPage(R.id.switcher);
        onView(getNewsPageButtonSwitcher())
                .perform(click());
    }

    public static void clickFilterNewsControlPanel() {
        Allure.step("Нажать на кнопку фильтровать Новости");
        waitUntilPage(R.id.filter_news_material_button);
        onView(getNewsPageFilterNewsControlPanel())
                .perform(click());
    }

    public static void clickButtonFilterNewsControlPanel() {
        Allure.step("Нажать на кнопку фильтровать");
        waitUntilPage(R.id.filter_button);
        onView(getNewsPageButtonFilterNewsControlPanel())
                .perform(click());
    }

    public static void clickRemoveCheckBoxActive() {
        Allure.step("Снять флажок с чекбокса");
        waitUntilPage(R.id.filter_news_active_material_check_box);
        onView(getNewsPageRemoveCheckBoxActive())
                .perform(click());
    }

    public static void clickAddNews() {
        Allure.step("Нажать на кнопку добавить новость");
        waitUntilPage(R.id.add_news_image_view);
        onView(getNewsPageElementsAddNews())
                .perform(click());
    }

    public static void clickButtonCategoryCreatingNews() {
        Allure.step("Выбрать категорию для создания новости");
        waitUntilPage(R.id.news_item_category_text_auto_complete_text_view);
        onView(getNewsPageButtonCategoryCreatingNews())
                .perform(click());
    }

    public static void clickButtonCategoryCreatingNew() {
        Allure.step("Выбрать категорию для создания новости");
        waitUntilPage(R.id.news_item_category_text_auto_complete_text_view);
        onView(getNewsPageButtonCategoryCreatingNews())
                .perform(click(), replaceText("Зарплата"), closeSoftKeyboard());
    }

    public static void clickButtonCategoryCreatingNewsEmpty() {
        Allure.step("Ввести в поле Категория собственное название категории");
        waitUntilPage(R.id.news_item_category_text_auto_complete_text_view);
        onView(getNewsPageButtonCategoryCreatingNews())
                .perform(click(), replaceText("Выдуманное название"), closeSoftKeyboard());
    }


    public static void clickButtonTitleCreatingNews() {
        Allure.step("Ввести в поле Заголовок название новости");
        waitUntilPage(R.id.news_item_title_text_input_edit_text);
        onView(getNewsPageButtonTitleCreatingNews())
                .perform(click(), clearText(), replaceText("Выдуманный текст"), closeSoftKeyboard());
    }

    public static void clickButtonDateCreatingNews() {
        Allure.step("В поле Дата публикации выбрать дату по календарю");
        waitUntilPage(R.id.news_item_publish_date_text_input_edit_text);
        onView(getNewsPageButtonDateCreatingNews())
                .perform(click());
    }


    public static void clickButtonOkDateCreatingNews() {
        Allure.step("Нажать кнопку ОК Дата");
        waitUntilPage(android.R.id.button1);
        onView(getNewsPageButtonOkDateCreatingNews())
                .perform(click());
    }

    public static void clickButtonTimeCreatingNews() {
        Allure.step("В поле Время выбрать время");
        waitUntilPage(R.id.news_item_publish_time_text_input_edit_text);
        onView(getNewsPageButtonTimeCreatingNews())
                .perform(click());
    }

    public static void clickDescriptionCreatingNews() {
        Allure.step("Ввести в поле Описание описание новости");
        waitUntilPage(R.id.news_item_description_text_input_edit_text);
        onView(getNewsPageDescriptionCreatingNews())
                .perform(replaceText("Какой-то текст описания"), closeSoftKeyboard());
    }

    public static void clickButtonOkTimeCreatingNews() {
        Allure.step("Нажать кнопку ОК Время");
        waitUntilPage(android.R.id.button1);
        onView(getNewsPageButtonOkTimeCreatingNews())
                .perform(click());
    }

    public static void clickButtonSaveCreatingNews() {
        Allure.step("Нажать на кнопку Сохранить новость");
        waitUntilPage(R.id.save_button);
        onView(getNewsPageButtonSaveCreatingNews())
                .perform(scrollTo(), click());
    }


public static Matcher<View> withIndex(final Matcher<View> matcher, final int index) {
    return new TypeSafeMatcher<View>() {
        int currentIndex = 0;

        @Override
        public void describeTo(Description description) {
            description.appendText("with index: ");
            description.appendValue(index);
            matcher.describeTo(description);
        }

        @Override
        public boolean matchesSafely(View view) {
            if (matcher.matches(view) && currentIndex++ == index) {
                return true;
            }
            return false;
        }
    };
}
}