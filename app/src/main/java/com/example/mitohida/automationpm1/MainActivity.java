package com.example.mitohida.automationpm1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
    Button button_kwh = (Button)findViewById(R.id.button_kwh);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View view){
        Intent intent = new Intent(MainActivity.this,Monitoring_Kwh.class);
        startActivity(intent);
    }
}
