package com.example.android.miwork;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    ListView listView;
    ArabicAdapter arabicAdapter;
    ArrayList<ArabicWord> arrayList;
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        arrayList = new ArrayList<>();
        arrayList.add(new ArabicWord("GrandFather", "جد", R.drawable.family_grandfather));
        arrayList.add(new ArabicWord("GrandMother", "جده", R.drawable.family_grandmother));
        arrayList.add(new ArabicWord("Father", "أب", R.drawable.family_father));
        arrayList.add(new ArabicWord("Mother", "أم", R.drawable.family_mother));
        arrayList.add(new ArabicWord("Brother", "أخ", R.drawable.family_younger_brother));
        arrayList.add(new ArabicWord("Sister", "أخت", R.drawable.family_younger_sister));
        arrayList.add(new ArabicWord("Aunt", "عمة،خالة", R.drawable.family_older_sister));
        arrayList.add(new ArabicWord("Uncle", "عم،خال", R.drawable.family_younger_brother));

        arabicAdapter = new ArabicAdapter(this, arrayList, R.color.category_family);
        listView = (ListView) findViewById(R.id.FamilyList);
        listView.setAdapter(arabicAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                ArabicWord str = (ArabicWord) parent.getAdapter().getItem(position);
//                Bundle t = new Bundle();
//                String utteranceId = this.hashCode() + "";
//                t.putString(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "");
//                tts.speak(str.getEnglishText(), TextToSpeech.QUEUE_FLUSH, t,utteranceId);
//            }
//        });

    }

//    @Override
//    public void onInit(int status) {
//        if (status == TextToSpeech.SUCCESS) {
//            // Locale lang = tts.;
//            int result = tts.setLanguage(Locale.ENGLISH);
//            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
//                Log.e("TTS", "this language is not supported");
//            }
//
//        } else {
//            Log.e("TTS", "initialization failed");
//        }
//    }
}
