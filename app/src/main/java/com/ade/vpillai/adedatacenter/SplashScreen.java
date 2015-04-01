package com.ade.vpillai.adedatacenter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class SplashScreen extends Activity {

    private Thread mSplashThread;

    final SplashScreen splashScreen = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mSplashThread = new Thread()
        {
            public void run(){
                try {
                    synchronized(this){
                        // Wait given period of time or exit on touch
                        wait(3000);
                    }
                }
                catch(InterruptedException ex){
                    Toast.makeText(SplashScreen.this,"Sorry! There has been a problem.", Toast.LENGTH_LONG).show();
                }

                finish();

                // Run next activity
                Intent intent = new Intent();
                intent.setClass(splashScreen, menu2.class);
                startActivity(intent);

            }
        };

        mSplashThread.start();
    }
    }




