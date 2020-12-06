package com.example.examhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button adminLoginButtn,tescherLoinButt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adminLoginButtn =findViewById(R.id.admin_login_id_Bttn);
        tescherLoinButt = findViewById(R.id.teacher_login_id_Bttn);

        adminLoginButtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DialogClass dialogClass = new DialogClass();
                dialogClass.show(getSupportFragmentManager(),"Dialog Class");

            }
        });
    }
}