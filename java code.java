package com.example.mathstables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView ;//= findViewById(R.id.);
    ListView listView;
    SeekBar seekbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView2);
        listView = findViewById(R.id.listView);
        seekbar = findViewById(R.id.seekBar);

        seekbar.setMax(30);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(MainActivity.this, "Hello Bachhooo ! " +
                        "It is a table of " + i, Toast.LENGTH_SHORT);
                populate(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    public void populate(int number)
    {
        ArrayList<String> tablemulti = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            tablemulti.add(number + " X " + i + " = " + number*i);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);
        listView.setAdapter(arrayAdapter);
        textView.setText("Multiplication Table of " + number);

    }
}

