package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button login ;
    EditText user , password ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.bt_login);
        user = findViewById(R.id.ed_user);
        password = findViewById(R.id.ed_pass);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login:
                Intent intent =new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
                break;
        }
    }
}
