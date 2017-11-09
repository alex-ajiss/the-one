package com.example.lenovo.theone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lenovo on 2017/11/9.
 */

public class TalkerAdapter extends ArrayAdapter<Talker>{
    private int resourceId;
    public TalkerAdapter(Context context, int textViewResourceId, List<Talker> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        Talker talker = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView talkerImage = (ImageView) view.findViewById(R.id.talker_image);
        TextView talkerName = (TextView) view.findViewById(R.id.talker_name);
        talkerImage.setImageResource(talker.getImageId());
        talkerName.setText(talker.getName());
        return view;
    }
}
