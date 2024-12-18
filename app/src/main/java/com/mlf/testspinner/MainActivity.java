package com.mlf.testspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    // Spinner
    private Spinner spinner;
    private ArrayList<CustomItem> spinnerItems;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        adapter = new CustomAdapter(this, getSpinnerItems());
        spinner.setAdapter(adapter);
    }

    public ArrayList<CustomItem> getSpinnerItems()
    {
        spinnerItems = new ArrayList<>();
        spinnerItems.add(new CustomItem(getString(R.string.item_ok), R.drawable.ic_ok));
        spinnerItems.add(new CustomItem(getString(R.string.item_warning), R.drawable.ic_warning));
        spinnerItems.add(new CustomItem(getString(R.string.item_error), R.drawable.ic_error));
        return spinnerItems;
    }
}