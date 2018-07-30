package com.example.beyzabudak.phmeter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class signup extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        Button geri=(Button)findViewById(R.id.signu);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }
        });
    }
}