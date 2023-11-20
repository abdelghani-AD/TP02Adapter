package com.example.tp2_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClassAdapter extends BaseAdapter {
    ArrayList<Map.Entry<String,Integer>> data ;
    Context context;
    public ClassAdapter(HashMap<String,Integer> data , Context context){
        this.data = new ArrayList<>(data.entrySet());
        this.context = context;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object  getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.myressource,null);
            TextView textKey = convertView.findViewById(R.id.textK);
            TextView textValue = convertView.findViewById(R.id.textV);
            Map.Entry<String,Integer> entry = data.get(position);
            textKey.setText(entry.getKey());
            textValue.setText(entry.getValue().toString());
//            TextView tv = convertView.findViewById(android.R.id.text1);
//            String txt=getItem(position).toString();
//            tv.setText(txt);
        }
        return convertView;
    }
}

