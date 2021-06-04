package com.example.customelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class myAdapter extends BaseAdapter {


    int[] image;
    String[] text;
    Context context;
    LayoutInflater layoutInflater;

    public myAdapter(Context context ,int[] image , String[] text){
        this.context = context;
        this.image = image;
        this.text = text;
        layoutInflater = (LayoutInflater.from(context));

    }

    @Override
    public int getCount() {


        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.row_list , null);

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView textView = convertView.findViewById(R.id.text);

        imageView.setImageResource(image[position]);
        textView.setText(text[position]);
        return convertView;
    }
}
