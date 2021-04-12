package com.example.uitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent1=new Intent(Intent.ACTION_SENDTO);
//        Intent intent1=new Intent(Intent.ACTION_VIEW);    for open a website
//        intent1.setData(Uri.parse("https://codeforces.com/problemset/status"));
        EditText email =(EditText)findViewById(R.id.editTextTextPersonName);
        EditText subject=(EditText)findViewById(R.id.editTextTextPersonName1);
        EditText body=(EditText)findViewById(R.id.editTextTextPersonName2);



        Button btnq=findViewById(R.id.button2);

        btnq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailaddr =email.getText().toString();
                String emailsub =subject.getText().toString();
                String emailbody =body.getText().toString();

                intent1.setData(Uri.parse("mailto:"));
                intent1.putExtra(Intent.EXTRA_EMAIL,new String[] {emailaddr}); //EXTRA_EMAIL to a key value for another activity
                intent1.putExtra(Intent.EXTRA_SUBJECT,emailsub);
                intent1.putExtra(Intent.EXTRA_TEXT,emailbody);


                startActivity(intent1);
            }
        });

    }






}