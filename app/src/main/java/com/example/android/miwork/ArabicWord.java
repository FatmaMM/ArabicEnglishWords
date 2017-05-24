package com.example.android.miwork;


public class ArabicWord {
    String EnglishText;
    String ArabicText;
    int imageId;
    static final int NO_IMAGE = -1;

    public ArabicWord(String englishText, String arabicText) {
        this.EnglishText = englishText;
        this.ArabicText = arabicText;
        this.imageId=-1;
    }

    public ArabicWord(String englishText, String arabicText, int image) {
        this.EnglishText = englishText;
        this.ArabicText = arabicText;
        this.imageId = image;
    }

    public String getEnglishText() {
        return EnglishText;
    }


    public String getArabicText() {
        return ArabicText;
    }


    public int getImageResourceId() {
        return imageId;
    }

    public boolean hasImage() {
        return imageId != NO_IMAGE;
    }
}
