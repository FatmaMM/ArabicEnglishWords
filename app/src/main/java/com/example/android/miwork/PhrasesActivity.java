package com.example.android.miwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity{
    ListView list;
    ArrayList<ArabicWord> arrayList;
    ArabicAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        arrayList = new ArrayList<>();
        arrayList.add(new ArabicWord("Hello", "اهلا"));
        arrayList.add(new ArabicWord("Welcome", "مرجبا"));
        arrayList.add(new ArabicWord("Thanks", "شكرا"));
        arrayList.add(new ArabicWord("How are you?", "كيف حالك"));
        arrayList.add(new ArabicWord("I am fine", "أنا بخير"));
        arrayList.add(new ArabicWord("What's your name ?", "ما اسمك ؟"));
        arrayList.add(new ArabicWord("My name is ...", "إسمي ..."));
        arrayList.add(new ArabicWord("Where are you from ?", "من اين انت ؟"));
        arrayList.add(new ArabicWord("I am from ...", "أنا من ..."));
        arrayList.add(new ArabicWord("It's very nice.", "إنه جميل جدا"));
        arrayList.add(new ArabicWord("I like it.", "احببته"));
        arrayList.add(new ArabicWord("I love you  for the sake of Allah", "انا احبك في الله "));
        arrayList.add(new ArabicWord("Pilgrimage is justified and guilt is forgiven", "حج مبرور وذنب مغفور "));
        arrayList.add(new ArabicWord("As you like","كما تحب"));

        list = (ListView) findViewById(R.id.phrasesList);
        adapter = new ArabicAdapter(this, arrayList, R.color.category_phrases);
        list.setAdapter(adapter);

    }
}
