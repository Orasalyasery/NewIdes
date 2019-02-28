package com.example.newides;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Value extends AppCompatActivity {
private TextView textI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value);


        textI = (TextView) findViewById(R.id.textView4);

        Bundle extras = getIntent().getExtras();

        int i = extras.getInt("keyd");
        textI.setText(String.valueOf(i));
    }
}
