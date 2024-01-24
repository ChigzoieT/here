package com.anslam.here;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.anslam.here.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //heremobilapp123@gmailcom here123456  here@123->ID
        //startActivity(new Intent(getApplicationContext(), signin.class));
        startActivity(new Intent(getApplicationContext(), accountdetails.class));

        //startActivity(new Intent(getApplicationContext(), locationupdates.class));
       //startActivity(new Intent(getApplicationContext(), trust.class));
    }
}