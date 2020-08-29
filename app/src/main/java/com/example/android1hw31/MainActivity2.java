package com.example.android1hw31;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    public final static String EXTRA_KEY = "KEY";

    private EditText editText1;
    private EditText editText2;
    int one;
    int two;
    String sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        summary();

    }
    private void summary(){
        editText1 = findViewById(R.id.edtText1);
        editText2 = findViewById(R.id.edtText2);
        Button btnActivity = findViewById(R.id.btnActivity);
        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          /*      Intent mIntent = getIntent();
                if (mIntent != null) {
                    String text = mIntent.getStringExtra(EXTRA_KEY);
                    textView.setText(text);*/
                    sendResult();


                }


            @SuppressLint("SetTextI18n")
            public void sendResult(){
                Intent intent = new Intent();
                one = Integer.parseInt(editText1.getText().toString());
                two = Integer.parseInt(editText2.getText().toString());
                sum=(String.valueOf(one + two));
                intent.putExtra(EXTRA_KEY, sum);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}