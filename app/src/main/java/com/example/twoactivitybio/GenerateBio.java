package com.example.twoactivitybio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class GenerateBio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_bio);

        Intent callingIntent = getIntent();
        String bio = callingIntent.getStringExtra("bio");

        EditText editText7 = (EditText) findViewById(R.id.editText7);

        editText7.setText(bio);

    }
}
