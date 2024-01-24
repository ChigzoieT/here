package com.anslam.here;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.io.IOException;
import java.util.List;
import java.util.Locale;


public class locationupdates extends AppCompatActivity implements LocationListener {
    private final static int PERMISSION_REQUEST_CODE = 123;

    LocationManager locationManager;
    TextView tv;

    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationupdate);
        tv = findViewById(R.id.textview);

        requestLocationupdates();

    }


    @Override
    public void onLocationChanged(@NonNull Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        String data = "hi";
       Toast.makeText(this, ""+location.getLatitude()+","+location.getLongitude(), Toast.LENGTH_LONG).show();
        try {
            Geocoder geocoder = new Geocoder(this, Locale.getDefault());
            List<Address> Addresses = null;
            try {
                Addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String address = Addresses.get(0).getAddressLine(0);
            data = address;
        } catch (Exception e){
            e.printStackTrace();
        }

        tv.setText(data);

    }

    @SuppressLint("MissingPermission")
    private void requestLocationupdates(){
        if (checkpermission()) {
            LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

            if(locationManager!=null){
                try {
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 5, this);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }else {
            requestpermission();
        }
    }

    private boolean checkpermission(){
        int  finelocation = ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION);
        int coarselocation =  ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION);
        return finelocation == PackageManager.PERMISSION_GRANTED && coarselocation ==PackageManager.PERMISSION_GRANTED;
    }





    private void requestpermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            ActivityCompat.requestPermissions(
                    locationupdates.this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},
                    PERMISSION_REQUEST_CODE
            );
        }
    }


    private void startLocationUpdates() {
        if (locationManager != null) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                    && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
        }
    }





    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case PERMISSION_REQUEST_CODE:
                boolean isfinelocation = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                boolean iscoarselocation = grantResults[1] == PackageManager.PERMISSION_GRANTED;

                if(isfinelocation && iscoarselocation){
                    Toast.makeText(this, "permission granted", Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(this, "not granted", Toast.LENGTH_LONG).show();
                }

        }
    }


}
