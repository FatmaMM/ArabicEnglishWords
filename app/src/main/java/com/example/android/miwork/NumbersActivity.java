package com.example.android.miwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity{
    ListView listView;
    ArrayList<ArabicWord> arabicWords;
    ArabicAdapter arabicWordArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        arabicWords = new ArrayList<>();
        arabicWords.add(new ArabicWord("One", "واحد", R.drawable.number_one));
        arabicWords.add(new ArabicWord("Two", "إثنين", R.drawable.number_two));
        arabicWords.add(new ArabicWord("Three", "ثلاثة", R.drawable.number_three));
        arabicWords.add(new ArabicWord("Four", "أربعة", R.drawable.number_four));
        arabicWords.add(new ArabicWord("Five", "خمسة", R.drawable.number_five));
        arabicWords.add(new ArabicWord("Six", "ستة", R.drawable.number_six));
        arabicWords.add(new ArabicWord("Seven", "سبعة", R.drawable.number_seven));
        arabicWords.add(new ArabicWord("Eight", "ثمانية", R.drawable.number_eight));
        arabicWords.add(new ArabicWord("Nine", "تسعة", R.drawable.number_nine));
        arabicWords.add(new ArabicWord("Ten", "عشرة", R.drawable.number_ten));

        arabicWordArrayAdapter = new ArabicAdapter(NumbersActivity.this, arabicWords, R.color.category_numbers);
        listView = (ListView) findViewById(R.id.NumbersList);
        listView.setAdapter(arabicWordArrayAdapter);

    }
}
