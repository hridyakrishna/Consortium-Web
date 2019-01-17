package com.example.happybirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class nextactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextactivity);
    }
    public void Main3Activity (View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}
