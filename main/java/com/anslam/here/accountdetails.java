package com.anslam.here;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.Editable;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.anslam.here.databinding.AccountdetailsBinding;
import  com.google.firebase.database.DatabaseReference;

public class accountdetails extends AppCompatActivity {



    Button regclick;

    String number = "080233830";
    String message = "This is an emergency, please contact me.";


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accountdetails);

        EditText ed1, ed2, ed3, ed4, ed5;

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("users");

        ed1 = findViewById(R.id.e1);
        ed2 = findViewById(R.id.e2);
        ed3 = findViewById(R.id.e3);
        ed4 = findViewById(R.id.e4);
        ed5 = findViewById(R.id.e5);

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(number,null, message, null, null);



        regclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable e1 = ed1.getText();
                Editable e2 = ed1.getText();
                Editable e3 = ed1.getText();
                Editable e4 = ed1.getText();
                Editable e5 = ed1.getText();

                databasereference.child("name").value(ed1);
                databasereference.child("name").value(ed2);
                databasereference.child("name").value(ed3);
                databasereference.child("name").value(ed4);
                databasereference.child("name").value(ed5);


            }
        });

    }
}
