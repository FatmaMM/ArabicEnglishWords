package com.example.android.miwork;

import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by lenovo on 30/04/2017.
 */
//extends TextToSpeech.OnInitListener,OnClickListener
public class ArabicAdapter extends ArrayAdapter<ArabicWord> implements TextToSpeech.OnInitListener {
    int ColorResourseID;
    TextToSpeech tts;
    private static final String LOG_TAG = ArabicAdapter.class.getSimpleName();

    public ArabicAdapter(@NonNull Context context, @NonNull ArrayList<ArabicWord> objects, int colorResource) {
        super(context, 0, objects);
        this.ColorResourseID = colorResource;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        View item = convertView;
        if (item == null) {
            item = LayoutInflater.from(getContext()).inflate(R.layout.arabicapp, parent, false);
        }

        final ArabicWord currentWord = getItem(position);

        tts = new TextToSpeech(getContext(), this);
        TextView Arabic = (TextView) item.findViewById(R.id.arabic);
        Arabic.setText(currentWord.getArabicText());

        TextView English = (TextView) item.findViewById(R.id.english);
        English.setText(currentWord.getEnglishText());

        item.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Bundle bundle=new Bundle();
          String utteranceId = getContext().hashCode() + "";
          bundle.putString(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "");

          tts.speak(currentWord.getEnglishText().toString(), TextToSpeech.QUEUE_FLUSH, bundle, utteranceId);
      }
  });


        //find ImageView in arabicapp.xml layout with ID
        ImageView iconView = (ImageView) item.findViewById(R.id.image);
        //check if the list item has an image or not
        if (currentWord.hasImage())
        {// Get the image resource ID from the current ArabicWord object and
            // set the image to iconView
            iconView.setImageResource(currentWord.getImageResourceId());
            //make sure that the image is visible
            iconView.setVisibility(View.VISIBLE);

        } else

        {
            //otherWise hide the imageView
            iconView.setVisibility(View.GONE);
        }

        View textContainer = item.findViewById(R.id.textContenair);
        int color = ContextCompat.getColor(getContext(), ColorResourseID);
        textContainer.setBackgroundColor(color);

        return item;
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            int result = tts.setLanguage(Locale.ENGLISH);
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "this language is not supported");
            }
        } else {
            Log.e("TTS", "initialization failed");

        }

    }
}
