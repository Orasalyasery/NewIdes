package com.example.newides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AppInfo extends AppCompatActivity {
private TextView  txtName ,  txtAppName , txtAboute ;
private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_info);


        txtName = (TextView) findViewById(R.id.txt1);
        txtAppName = (TextView) findViewById(R.id.txt2);
        txtAboute = (TextView) findViewById(R.id.txt3);
        editText = (EditText) findViewById(R.id.editText);



        Bundle extras = getIntent().getExtras();

        int position = extras.getInt("key");



        switch (position) {
            case 1:
                txtName.setText("  زياد عماد رشيد");
                txtAppName.setText("  حفظ معلومات");
                txtAboute.setText("   يقوم هذا البرنامج بحفظ المعلومات ");
                editText.setText("http//www.google.iq");

                break;

            case 2:
                txtName.setText("  واثق هاني لفته");
                txtAppName.setText("  البحث عن الناخب");
                txtAboute.setText("  يقوم هذا البرنامج بالبحث عن الناخب عن طريق رقم الناخب ويعرض بياناته وصورته ");
                editText.setText("http//www.google.iq");
            break;

            case 3:
                txtName.setText("  أحمد عصام بدر");
                txtAppName.setText("  تحليل الشخصية");
                txtAboute.setText("  يقوم هذا البرنامج بطرح أسئلة ومعرفة الاجابات وارسالها الى دكتور نفسي لمعرفة شخصية الشخص ");
                editText.setText("http//www.google.iq");

                break;
            case 4:
                txtName.setText("  قاسم رفعت حبيب");
                txtAppName.setText("  متجر الموبايلات");
                txtAboute.setText("  يقوم هذا البرنامج بأختيار اختيار نوع الموبايل وسعره ");
                editText.setText("http//www.google.iq");
                break;

            case 5:
                txtName.setText("  محمد فائق عبدالجبار");
                txtAppName.setText("  عدة التحقق الالكترونية");
                txtAboute.setText("  يقوم هذا البرنامج بالتحقق من الناخب وأهليته ");
                editText.setText("http//www.google.iq");
                break;


        }


    }
    public void Back (View v){ Intent intent = new Intent(AppInfo.this, MainActivity.class);


        startActivity(intent);}


}

