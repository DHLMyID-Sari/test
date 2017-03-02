package com.example.sarinair.myaddapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstnumber;
    EditText secondnumber;
    TextView addtext;
    Button addbtn;
    double num1,num2,sum;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnumber=(EditText)findViewById(R.id.editText);
        secondnumber=(EditText)findViewById(R.id.editText2);
        addtext = (TextView)findViewById(R.id.editText3);
        addbtn =(Button) findViewById(R.id.button);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Double.parseDouble(firstnumber.getText().toString());
                num2 = Double.parseDouble(secondnumber.getText().toString());
                sum = num1 + num2;
                addtext.setText(Double.toString(sum));
            }
        });

    }

}
