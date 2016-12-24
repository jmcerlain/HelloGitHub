package com.example.teameprop.hellogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Context;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnClicked(View v){
        Context content = getApplicationContext();
        CharSequence text = "Button Clicked!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(content, text, duration);
        toast.show();
    }
}
