package com.example.beyzabudak.phmeter;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Intent;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread acilisekrani = new Thread(){
            public void run(){
                try { sleep(3000);
                    Intent intent = new Intent(MainActivity.this,splash.class);
                    startActivity(intent);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                finally{
                    finish();
                }
            }
        };
        acilisekrani.start();
    }
}