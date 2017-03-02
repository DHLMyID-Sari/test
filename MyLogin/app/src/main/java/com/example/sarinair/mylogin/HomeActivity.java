package com.example.sarinair.mylogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        EditText name=(EditText)findViewById(R.id.editText);
        TextView name1 = (TextView)findViewById(R.id.textView2);
        //String txtname = name.getText().toString();
        String myname = getIntent().getStringExtra("name");

        name1.setText(myname);
       //name.setText(arr1);
    }
}
