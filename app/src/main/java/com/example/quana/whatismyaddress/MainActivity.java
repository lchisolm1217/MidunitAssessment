package com.example.quana.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        private Button button01;
        private EditText emailaddress;

        final SharedPreferences preferences = getSharedPreferences("address_shared_preference",MODE_PRIVATE);
            String key = "";
        String value = preferences.getString(key,null);

        final EditText emailaddress = (EditText) findViewById(R.id.emailaddress);
        final Button button01 = (Button) findViewById(R.id.Button01);
        Button button02 = (Button) findViewById(R.id.Button02);


        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = preferences.edit();
                if (button01.setOnClickListener()) {
                    editor.putString("emailaddress", button01.setText().toString(""));
                    editor.commit();
                } else {
                    editor.putString(emailaddress);
                    editor.commit();
                }

                Intent i = new Intent(MainActivity.this, RecyclerActivity.class);
                String keyIdentifer = null;
                i.putExtra("sharedpref",MODE_PRIVATE);
                startActivity(i);

            }
        });


    }
}
