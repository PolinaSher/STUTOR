package com.example.stutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button student, tutor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        student = (Button)findViewById(R.id.student);
        tutor = (Button)findViewById(R.id.tutor);

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Entrys.class));
            }
        });

        tutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Entryt.class));
            }
        });
    }
//    @Override
//    protected void onPause(){
//        super.onPause();
//    }
//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//    }
//    @Override
//    protected void onStop(){
//        super.onStop();
//    }
//    @Override
//    protected void onResume(){
//        super.onResume();
//    }
//    @Override
//    protected void onStart(){
//        super.onStart();
//    }
}
