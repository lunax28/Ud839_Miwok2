package com.example.android.ud839_miwok;

/**
 * Created by albus on 21-May-17.
 */

public class Word {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mSoundResourceId;


    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int SoundResource) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mSoundResourceId = SoundResource;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int ImageResourceId, int SoundResource) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = ImageResourceId;
        this.mSoundResourceId = SoundResource;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmSoundResourceId() {
        return mSoundResourceId;
    }


}
