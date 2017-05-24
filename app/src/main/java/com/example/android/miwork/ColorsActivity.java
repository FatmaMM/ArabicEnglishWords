package com.example.android.miwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    ListView colorsList;
    ArabicAdapter arabicAdapter;
    ArrayList<ArabicWord> arabicWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        arabicWords = new ArrayList<>();
        arabicWords.add(new ArabicWord("Red", "أحمر", R.drawable.color_red));
        arabicWords.add(new ArabicWord("Yellow", "أصفر", R.drawable.color_mustard_yellow));
        arabicWords.add(new ArabicWord("Green", "أخضر", R.drawable.color_green));
        arabicWords.add(new ArabicWord("Gray", "رمادي", R.drawable.color_gray));
        arabicWords.add(new ArabicWord("Brown", "بني", R.drawable.color_brown));
        arabicWords.add(new ArabicWord("Black", "أسود", R.drawable.color_black));
        arabicWords.add(new ArabicWord("White", "أبيض", R.drawable.color_white));

        arabicAdapter = new ArabicAdapter(this, arabicWords, R.color.category_colors);
        colorsList = (ListView) findViewById(R.id.ColorsList);
        colorsList.setAdapter(arabicAdapter);
    }
}
