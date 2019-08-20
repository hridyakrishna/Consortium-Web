package com.hridyakr.cs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class TailoringActivity extends AppCompatActivity {
    private static final String TAG = "TailoringActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_login);
        Log.d(TAG, "onCreate: started.");

    }

    public void nextactivity (View view){
        Intent intent = new Intent (this, Nextactivity.class);
        startActivity(intent);
    }
}
