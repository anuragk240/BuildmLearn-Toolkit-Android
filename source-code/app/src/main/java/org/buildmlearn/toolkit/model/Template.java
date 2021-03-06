package org.buildmlearn.toolkit.model;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

import org.buildmlearn.toolkit.R;
import org.buildmlearn.toolkit.templates.ComprehensionTemplate;
import org.buildmlearn.toolkit.templates.FlashTemplate;
import org.buildmlearn.toolkit.templates.InfoTemplate;
import org.buildmlearn.toolkit.templates.LearnSpellingTemplate;
import org.buildmlearn.toolkit.templates.QuizTemplate;
import org.buildmlearn.toolkit.templates.VideoCollectionTemplate;

/**
 * @brief Enum for the templates that are included into toolkit application.
 *
 * Created by Abhishek on 23-05-2015.
 */
public enum Template {

    BASIC_M_LEARNING(R.string.basic_m_learning_title, R.string.basic_m_learning_description, R.drawable.basic_m_learning, R.string.info_template, InfoTemplate.class, R.string.info_assets_name),
    LEARN_SPELLING(R.string.learn_spellings_title, R.string.learn_spellings_description, R.drawable.basic_m_learning, R.string.spelling_type, LearnSpellingTemplate.class, R.string.spelling_assets_name),
    QUIZ(R.string.quiz_title, R.string.quiz_description, R.drawable.basic_m_learning, R.string.quiz_type, QuizTemplate.class, R.string.quiz_assets_name),
    FLASH_CARD(R.string.flash_card_title, R.string.flash_card_description, R.drawable.basic_m_learning, R.string.flash_card_template, FlashTemplate.class, R.string.flash_assets_name),
    VIDEO_COLLECTION(R.string.video_collection_title, R.string.video_collection_description, R.drawable.video_collection, R.string.video_collection_template, VideoCollectionTemplate.class, R.string.video_assets_name),
    COMPREHENSION(R.string.comprehension_title, R.string.comprehension_description, R.drawable.comprehension, R.string.comprehension_template, ComprehensionTemplate.class, R.string.comprehension_assets_name);

    @StringRes
    final
    int type;
    private
    @DrawableRes
    final
    int image;
    private
    @StringRes
    final
    int title;
    private
    @StringRes
    final
    int description;
    private final Class<? extends TemplateInterface> templateClass;

    private
    @StringRes
    final
    int assetsName;

    Template(@StringRes int title, @StringRes int description, @DrawableRes int image, @StringRes int type, Class<? extends TemplateInterface> templateClass, @StringRes int assetsName) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.type = type;
        this.templateClass = templateClass;
        this.assetsName = assetsName;
    }

    public int getImage() {
        return image;
    }

    public int getTitle() {
        return title;
    }

    public int getDescription() {
        return description;
    }

    public Class<? extends TemplateInterface> getTemplateClass() {
        return templateClass;
    }

    public int getType() {
        return type;
    }

    public int getAssetsName() {
        return assetsName;
    }
}
