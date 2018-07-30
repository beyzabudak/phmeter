package com.example.beyzabudak.phmeter.Activities;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

import com.example.beyzabudak.phmeter.R;
import com.example.beyzabudak.phmeter.signup;

public class Login extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button signup=(Button)findViewById(R.id.signu);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i=new Intent(Login.this,signup.class);
                startActivity(i);
            }
        });
    }  }


