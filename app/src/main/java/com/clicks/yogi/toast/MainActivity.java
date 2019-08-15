package com.clicks.yogi.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button btn1;
TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView)findViewById(R.id.TextToastId);
        btn1 = (Button)findViewById(R.id.ButtonToastId);







    }

    public void Hello(View view) {

// Type 2 Toast with positioning...
        Toast toast = Toast.makeText(MainActivity.this,"Hello TextView",
                Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM|Gravity.LEFT,0,0);
        toast.show();

    }

}