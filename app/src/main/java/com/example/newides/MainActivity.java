package com.example.newides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.AdapterView;

import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity implements



        AdapterView.OnItemSelectedListener {

   private ListView listView;
    private TextView textView;
    String[] listItem;


    String[] EmployeeName = { "أختر الموظف","زياد عماد رشيد", "واثق هاني لفته", "أحمد عصام بدر", "قاسم رفعت حبيب" , "محمد فائق عبدالجبار"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        listView=(ListView)findViewById(R.id.ListView);
        textView=(TextView)findViewById(R.id.textView);
        listItem = getResources().getStringArray(R.array.array_technology);
        listItem = getResources().getStringArray(R.array.array_technology);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

            }
        });

        //Creating the ArrayAdapter instance having the employeeName list

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,EmployeeName);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position != 0) {
            Intent intent = new Intent(MainActivity.this, AppInfo.class);
            intent.putExtra("key",position);
            startActivity(intent);
            }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
