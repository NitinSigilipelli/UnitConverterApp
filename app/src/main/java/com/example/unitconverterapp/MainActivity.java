package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcome_text,unit_cm;
    EditText text_cm;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcome_text = findViewById(R.id.textView2);
        unit_cm = findViewById(R.id.textView);
        text_cm = findViewById(R.id.editText);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cm_entered = Float.parseFloat(text_cm.getText().toString());
                unit_cm.setText(""+cm_to_feet(cm_entered)+"feet");
            }
        });
    }

    public float cm_to_feet(float cm){
        System.out.println(cm);
        float result = (float) ((cm)/30.48);
        System.out.println(result);
        return result;
    }
}