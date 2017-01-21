package com.example.vishnu.my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Lutte","one"));
        words.add(new Word("Lutte","two"));
        words.add(new Word("Lutte","one"));
        words.add(new Word("Lutte","one"));
        words.add(new Word("Lutte","six"));
        words.add(new Word("Lutte","seven"));
        words.add(new Word("Lutte","eight"));
        words.add(new Word("Lutte","nine"));
        words.add(new Word("Lutte","ten"));

        /*int index = 0;
        LinearLayout root = (LinearLayout)findViewById(R.id.rootView);
        while (index<words.size()) {
            TextView word = new TextView(this);
            word.setText(words.get(index));
            root.addView(word);
            index++;
        }*/

        NumberAdapter itemsAdapter = new NumberAdapter(this,words);
        GridView listview = (GridView)findViewById(R.id.rootView);
        listview.setAdapter(itemsAdapter);
    }
}
