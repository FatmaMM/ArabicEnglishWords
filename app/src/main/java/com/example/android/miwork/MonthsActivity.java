package com.example.android.miwork;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MonthsActivity extends AppCompatActivity {
ListView listView;
    ArabicAdapter adapter;
    ArrayList<ArabicWord> arrayList;
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        arrayList = new ArrayList<>();
        arrayList.add(new ArabicWord("January", "يناير"));
        arrayList.add(new ArabicWord("February", "فبراير"));
        arrayList.add(new ArabicWord("March", "مارس"));
        arrayList.add(new ArabicWord("April", "ابريل"));
        arrayList.add(new ArabicWord("May", "مايو"));
        arrayList.add(new ArabicWord("June", "يونيو"));
        arrayList.add(new ArabicWord("July", "يوليه"));
        arrayList.add(new ArabicWord("August", "أغسطس"));
        arrayList.add(new ArabicWord("September", "سبتمبر"));
        arrayList.add(new ArabicWord("October", "أكتوبر"));
        arrayList.add(new ArabicWord("November", "نوفمبر"));
        arrayList.add(new ArabicWord("December","ديسمبر"));
        listView=(ListView)findViewById(R.id.months);
        adapter=new ArabicAdapter(this,arrayList, R.color.category_Months);
        listView.setAdapter(adapter);
    }
}
