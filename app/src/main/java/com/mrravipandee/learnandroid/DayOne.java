package com.mrravipandee.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DayOne extends AppCompatActivity {

    TextView TextView;
    EditText EditText;
    Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_one);

        TextView = findViewById(R.id.tV);
        EditText = findViewById(R.id.editText);
        Btn = findViewById(R.id.btn);

        TextView.setText("1. Body Massage\n2. Head Massage\n3. Shoulder Massage");

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editTextValue = EditText.getText().toString();
                int option = Integer.parseInt(editTextValue);

                switch (option) {
                    case 1:
                        TextView.setText("Price Rs. 800");
                        break;

                    case 2:
                        TextView.setText("Price Rs. 200");
                        break;

                    case 3:
                        TextView.setText("Price Rs. 300");
                        break;

                    default:
                        TextView.setText("Please selected given option!");

                }

            }
        });

    }
}