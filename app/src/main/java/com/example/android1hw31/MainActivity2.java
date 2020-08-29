package com.example.android1hw31;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    public final static String EXTRA_KEY = "KEY";

    private TextView textView;
    private EditText editText1;
    private EditText editText2;

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


            public void sendResult(){
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                 String message = editText1.getText().toString() ;
                intent.putExtra(EXTRA_KEY, message);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}