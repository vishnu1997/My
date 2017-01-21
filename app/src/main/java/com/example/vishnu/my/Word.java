package com.example.vishnu.my;

import android.widget.ArrayAdapter;

/**
 * Created by vishnu on 1/17/17.
 */

public class Word  {
    private String miwokTranslation;
    private String englishTranslation;


    public Word (String miwokTransaltion, String englishTransalation) {
        this.miwokTranslation = miwokTransaltion;
        this.englishTranslation = englishTransalation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }
}
