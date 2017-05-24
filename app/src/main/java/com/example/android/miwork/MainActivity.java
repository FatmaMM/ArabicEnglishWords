package com.example.android.miwork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openNumbersActivity(View view){
        Intent numbersIntent=new Intent(this,NumbersActivity.class);
        startActivity(numbersIntent);
    }

    public void openColorsActivity(View view) {
        Intent colorsActivity=new Intent(this,ColorsActivity.class);
        startActivity(colorsActivity);
    }

    public void openFamilyActivity(View view) {
        Intent familyActivity=new Intent(this,FamilyActivity.class);
        startActivity(familyActivity);
    }

    public void openPhrasesActivity(View view) {
        Intent phrasesActivity=new Intent(this,PhrasesActivity.class);
        startActivity(phrasesActivity);
    }

    public void openDaysActivity(View view) {
        Intent intent=new Intent(MainActivity.this,DaysOfWeek.class);
        startActivity(intent);
    }

    public void openMonthsActivity(View view) {
        Intent intent=new Intent(MainActivity.this,MonthsActivity.class);
        startActivity(intent);
    }

    public void openAnimalsActivity(View view) {
        Intent intent=new Intent(MainActivity.this,Animals.class);
        startActivity(intent);
    }
}
