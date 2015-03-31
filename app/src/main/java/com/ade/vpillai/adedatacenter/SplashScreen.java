package com.ade.vpillai.adedatacenter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class SplashScreen extends Activity {

    private Thread mSplashThead;

    final SplashScreen splashScreen = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mSplashThead = new Thread()
        {
            public void run(){
                try {
                    synchronized(this){
                        // Wait given period of time or exit on touch
                        wait(5000);
                    }
                }
                catch(InterruptedException ex){
                    Toast.makeText(SplashScreen.this,"Sorry! There has been a problem.", Toast.LENGTH_LONG).show();
                }

                finish();

                // Run next activity
                Intent intent = new Intent();
                intent.setClass(splashScreen, MainMenu.class);
                startActivity(intent);

            }
        };

        mSplashThead.start();
    }
    }




