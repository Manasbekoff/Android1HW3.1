package com.example.android1hw31;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android1hw31.MainActivity2.EXTRA_KEY;

public class MainActivity extends AppCompatActivity {

    public final static int SECOND_ACTIVITY_REQUEST_CODE = 100;

    private Button btnTwo;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        summary();

    }

    private void summary() {
        Button btnOne = findViewById(R.id.btnOne);
        textView = findViewById(R.id.txtView);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE);
                finish();
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == SECOND_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK && data != null) {
                String returnResult = data.getStringExtra(MainActivity2.EXTRA_KEY);
                textView.setText(returnResult);
            }

        }
    }
