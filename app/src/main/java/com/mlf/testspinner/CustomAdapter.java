package com.mlf.testspinner;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CustomItem>
{
    private final Context context;

    public CustomAdapter(@NonNull Context context, ArrayList<CustomItem> items)
    {
        super(context, 0, items);
        this.context = context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Log.e("AppLog", "getView " + position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_item, parent, false);
        }
        CustomItem item = getItem(position);
        ImageView icon = convertView.findViewById(R.id.itemIcon);
        TextView text = convertView.findViewById(R.id.itemText);
        ImageView arrow = convertView.findViewById(R.id.itemArrow);
        if(item != null)
        {
            icon.setImageResource(item.getImage());
            text.setText(item.getText());
            arrow.setImageResource(R.drawable.ic_arrow);
            arrow.setVisibility(View.VISIBLE);
        }
        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Log.e("AppLog", "getDropDownView " + position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_item, parent, false);
        }
        CustomItem item = getItem(position);
        ImageView icon = convertView.findViewById(R.id.itemIcon);
        TextView text = convertView.findViewById(R.id.itemText);
        ImageView arrow = convertView.findViewById(R.id.itemArrow);
        if(item != null)
        {
            icon.setImageResource(item.getImage());
            text.setText(item.getText());
            arrow.setVisibility(View.GONE);
        }
        return convertView;
    }
}
