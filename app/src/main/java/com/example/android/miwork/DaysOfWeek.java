package com.example.android.miwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DaysOfWeek extends AppCompatActivity{
    ListView listView;
    ArabicAdapter adapter;
    ArrayList<ArabicWord> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_of_week);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        arrayList = new ArrayList<>();
        arrayList.add(new ArabicWord("Saturday", "السبت"));
        arrayList.add(new ArabicWord("Sunday", "الأحد"));
        arrayList.add(new ArabicWord("Monday", "الإ ثنين"));
        arrayList.add(new ArabicWord("Tuesday", "الثلاثاء"));
        arrayList.add(new ArabicWord("Wednesday", "الأربعاء"));
        arrayList.add(new ArabicWord("Thursday", "الخميس"));
        arrayList.add(new ArabicWord("Friday", "الجمعة"));
        adapter = new ArabicAdapter(this, arrayList, R.color.category_days);
        listView = (ListView) findViewById(R.id.daysList);
        listView.setAdapter(adapter);

    }
}
