package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.steps.NewsSteps;

public class NewsPage extends NewsSteps {

    public static Matcher<View> getNewsButtonMainMenu() {
        return allOf(withId(R.id.main_menu_image_button));
    }

    public static Matcher<View> getNewsElementsButtonNews() {
        return allOf(withId(android.R.id.title), withText("News"));
    }

    public static Matcher<View> getNewsPageButtonControlPanel() {
        return allOf(withId(R.id.edit_news_material_button));
    }

    public static Matcher<View> getNewsPageButtonClickNews() {
        return allOf(withIndex(withId(R.id.news_item_material_card_view), 0));
    }

    public static Matcher<View> getNewsPageButtonDeleteNews() {
        return allOf(withIndex(withId(R.id.delete_news_item_image_view), 0));
    }

    public static Matcher<View> getNewsPageButtonSorting() {
        return allOf(withId(R.id.sort_news_material_button));
    }

    public static Matcher<View> getNewsPageButtonOkDeleteNews() {
        return allOf(withId(android.R.id.button1));
    }

    public static Matcher<View> getNewsPageButtonEditNews() {
        return  allOf(withIndex(withId(R.id.edit_news_item_image_view), 0));
    }

    public static Matcher<View> getNewsPageButtonTitleNewsControlPanel() {
        return allOf(withId(R.id.news_item_title_text_input_edit_text));
    }

    public static Matcher<View> getNewsPageButtonSaveEditingNews() {
        return allOf(withId(R.id.save_button));
    }

    public static Matcher<View> getNewsPageButtonSwitcher() {
        return allOf(withId(R.id.switcher));
    }

    public static Matcher<View> getNewsPageFilterNewsControlPanel() {
        return allOf(withId(R.id.filter_news_material_button));
    }


    public static Matcher<View> getNewsPageButtonFilterNewsControlPanel() {
        return allOf(withId(R.id.filter_button));
    }

    public static Matcher<View> getNewsPageRemoveCheckBoxActive() {
        return allOf(withId(R.id.filter_news_active_material_check_box));
    }

    public static Matcher<View> getNewsPageElementsAddNews() {
        return allOf(withId(R.id.add_news_image_view));
    }

    public static Matcher<View> getNewsPageButtonCategoryCreatingNews() {
        return allOf(withId(R.id.news_item_category_text_auto_complete_text_view));
    }

    public static Matcher<View> getNewsPageButtonTitleCreatingNews() {
        return allOf(withId(R.id.news_item_title_text_input_edit_text));
    }

    public static Matcher<View> getNewsPageButtonDateCreatingNews() {
        return allOf(withId(R.id.news_item_publish_date_text_input_edit_text));
    }

    public static Matcher<View> getNewsPageButtonOkDateCreatingNews() {
        return allOf(withId(android.R.id.button1));
    }

    public static Matcher<View> getNewsPageButtonTimeCreatingNews() {
        return allOf(withId(R.id.news_item_publish_time_text_input_edit_text));
    }

    public static Matcher<View> getNewsPageDescriptionCreatingNews() {
        return allOf(withId(R.id.news_item_description_text_input_edit_text));
    }

    public static Matcher<View> getNewsPageButtonOkTimeCreatingNews() {
        return allOf(withId(android.R.id.button1));
    }

    public static Matcher<View> getNewsPageButtonSaveCreatingNews() {
        return allOf(withId(R.id.save_button));
    }
}