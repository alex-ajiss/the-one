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
        View view;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.talkerImage = (ImageView) view.findViewById(R.id.talker_image);
            viewHolder.talkerName = (TextView) view.findViewById(R.id.talker_name);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.talkerName.setText(talker.getName());
        viewHolder.talkerImage.setImageResource(talker.getImageId());
        return view;
    }
    class ViewHolder{
        ImageView talkerImage;
        TextView talkerName;
    }
}
