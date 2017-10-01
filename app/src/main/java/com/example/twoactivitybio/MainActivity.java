package com.example.twoactivitybio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void sendInfo(View view){
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        EditText editText6 = (EditText) findViewById(R.id.editText6);

        String First = editText2.getText().toString();
        String Last = editText3.getText().toString();
        String School = editText4.getText().toString();
        String Major = editText5.getText().toString();
        String Degree = spinner.getSelectedItem().toString();
        String interests = editText6.getText().toString();

        String bio = (First + " " + Last + " is persuing a " + Degree + " in " +
                Major +  " at " + School + ".  " + First + "'s interests are " + interests);
        Intent intent = new Intent(MainActivity.this, GenerateBio.class);
        intent.putExtra("bio", bio);
        startActivity(intent);

    }
}

