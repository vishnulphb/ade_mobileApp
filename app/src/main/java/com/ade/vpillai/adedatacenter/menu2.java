package com.ade.vpillai.adedatacenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class menu2 extends ActionBarActivity {

    private Button homeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        homeButton = (Button)findViewById(R.id.Home);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu2.this,home.class);
                startActivity(intent);

                Toast.makeText(menu2.this,"This is the Home Screen!", Toast.LENGTH_LONG).show();
            }
        });
    }



}
