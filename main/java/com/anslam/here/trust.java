package com.anslam.here;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class trust extends AppCompatActivity {
    ArrayList<trust_storage>trustStorages = new ArrayList<>();

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trust);

        screenresolution scn = new screenresolution(this, 1);
        int dataheight = scn.heightvalue();

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        update();

        trust_adapter trustAdapter = new trust_adapter(this, trustStorages);
        recyclerView.setAdapter(trustAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LinearLayout.LayoutParams layoutParams15 = (LinearLayout.LayoutParams) recyclerView.getLayoutParams();
        layoutParams15.setMargins(0, dataheight/8, 0, 0);

    }

    private void update(){
       /* int dad = R.drawable.ic_launcher_background;
        String dadtext = "Dad";

        int mom = R.drawable.ic_launcher_background;
        String momtext = "Mom";

        int brother = R.drawable.ic_launcher_background;
        String brothertext = "Brother";

        int susan = R.drawable.ic_launcher_background;
        String susantext = "Susan";

        int jennifer = R.drawable.ic_launcher_background;
        String jennifertext = "Jennifer";

        int sam = R.drawable.ic_launcher_background;
        String samtext = "Sam";

        int mike = R.drawable.ic_launcher_background;
        String miketext = "Mike";


        trustStorages.add(new trust_storage(dad, dadtext));*/
    }
}
