package com.example.uitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class newActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent intent=getIntent();
        String email=intent.getStringExtra("EMAIL");
        String subject=intent.getStringExtra("EMAIL_SUB");
        String body=intent.getStringExtra("EMAIL_BODY");
        TextView text1=(TextView) findViewById(R.id.textView1);
        TextView text2=(TextView) findViewById(R.id.textView2);
        TextView text3=(TextView) findViewById(R.id.textView3);
        text1.setText("welcome! " + email);
        text2.setText("subject: " + subject);
        text3.setText(body);
    }
}