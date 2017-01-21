package com.example.vishnu.my;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vishnu on 1/17/17.
 */

public class NumberAdapter extends ArrayAdapter<Word> {
    public NumberAdapter(Activity context, ArrayList<Word> list) {
        super(context,0,list);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView miw = (TextView) listItemView.findViewById(R.id.miwok);

        miw.setText(currentWord.getMiwokTranslation());

        TextView eng = (TextView) listItemView.findViewById(R.id.english);

        eng.setText(currentWord.getEnglishTranslation());
        return listItemView;
    }
}
