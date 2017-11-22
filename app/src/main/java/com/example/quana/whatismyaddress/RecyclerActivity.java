package com.example.quana.whatismyaddress;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecyclerActivity {
    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.RecyclerActivity);
            EditText emailaddress = (TextView)findViewById(R.id.emailaddress);
            Intent intent = getIntent();
            intent.putExtra("sharedpref",preference);


}
