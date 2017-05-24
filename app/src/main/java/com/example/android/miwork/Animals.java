package com.example.android.miwork;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class Animals extends AppCompatActivity {

    ListView listView;
    ArrayList<ArabicWord> arrayList;
    ArabicAdapter adapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        arrayList = new ArrayList<>();
        arrayList.add(new ArabicWord("Bee", "نحله", R.drawable.bee));
        arrayList.add(new ArabicWord("Cat", "قطة", R.drawable.cat));
        arrayList.add(new ArabicWord("Chicken", "فرخة", R.drawable.chicken));
        arrayList.add(new ArabicWord("Cow", "بقره", R.drawable.cow));
        arrayList.add(new ArabicWord("Deer", "غزال", R.drawable.deer));
        arrayList.add(new ArabicWord("Duck", "بطه", R.drawable.duck));
        arrayList.add(new ArabicWord("Elephant", "فيل", R.drawable.elephant));
        arrayList.add(new ArabicWord("Fish", "سمكة", R.drawable.fish));
        arrayList.add(new ArabicWord("Fox", "ثعلب", R.drawable.fox));
        arrayList.add(new ArabicWord("Goat", "معز", R.drawable.goat));
        arrayList.add(new ArabicWord("Lion", "أسد", R.drawable.lion));
        arrayList.add(new ArabicWord("Monkey", "قرد", R.drawable.monkey));
        arrayList.add(new ArabicWord("Mouse", "فأر", R.drawable.rat));
        arrayList.add(new ArabicWord("Penguin", "بطريق", R.drawable.penguin));
        arrayList.add(new ArabicWord("Rabbit", "أرنب", R.drawable.rabbit));
        arrayList.add(new ArabicWord("Sheep", "خروف", R.drawable.sheep));
        arrayList.add(new ArabicWord("Snake", "ثعبان", R.drawable.snack));
        arrayList.add(new ArabicWord("turtle", "سلحفاة", R.drawable.turtle));

        listView = (ListView) findViewById(R.id.animalsList);
        adapter = new ArabicAdapter(this, arrayList, R.color.category_Animals);
        listView.setAdapter(adapter);
    }
}
