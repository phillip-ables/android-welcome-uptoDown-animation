package com.example.techtron.welcome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayoutTop, linearLayoutBottom;
    Button buttonCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCheck = (Button) findViewById(R.id.buttonCheck);
        linearLayoutTop = (LinearLayout) findViewById(R.id.linearLayoutTop);
        linearLayoutBottom = (LinearLayout) findViewById(R.id.linearLayoutBottom);
    }
}
