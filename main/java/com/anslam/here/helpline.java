package com.anslam.here;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anslam.here.databinding.HelplineBinding;

import java.util.ArrayList;


public class helpline extends AppCompatActivity
{

    RecyclerView hl;
    private HelplineBinding binding;
    int image = R.drawable.ic_launcher_background;
    int image1 = R.drawable.ic_launcher_foreground;
    String s = "new data";
    ArrayList datastorage;

    helplinerecycler hll;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

       hl =  binding.hl;

        datastorage = new ArrayList<>();
        datastorage.add(new helplinestorage(image, image1));
        hll = new helplinerecycler(this, datastorage);
        hl.setAdapter(hll);
        hl.setLayoutManager(new LinearLayoutManager(this));
        hl.setNestedScrollingEnabled(false);

    }
}

