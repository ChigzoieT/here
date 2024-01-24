package com.anslam.here;

import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.anslam.here.databinding.SigninActivityBinding;

public class signin extends AppCompatActivity {
    LinearLayout ll, ll2,ll11, ll15;
    TextView password, welcome, registerhere, forgetpassword;
    EditText ed1, ed2;
    Button loginclick;


   @Override
   public void onBackPressed() {
       super.onBackPressed();
       finishAffinity();
   }


    @Override

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        com.anslam.here.databinding.SigninActivityBinding binding = SigninActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        screenresolution scn = new screenresolution(this, 1);
        int dataheight = scn.heightvalue();

        ll15 = binding.ll15;
        LinearLayout.LayoutParams layoutParams15 = (LinearLayout.LayoutParams) ll15.getLayoutParams();
        layoutParams15.height = dataheight/8;
        layoutParams15.width = dataheight-75;
        layoutParams15.setMargins(0, dataheight/ 20, 0, 0);


        ll = binding.topheight;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ll.getLayoutParams();
        layoutParams.height = dataheight;

        ll2 = binding.ll2;
        LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams) ll2.getLayoutParams();
        layoutParams1.height = dataheight;

        welcome = binding.welcome;
        welcome.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float) dataheight/30);
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) welcome.getLayoutParams();
       lp.setMargins(0,dataheight/10, 0, 0);

      /* username = binding.username;
       LinearLayout.LayoutParams lp2 = (LinearLayout.LayoutParams) username.getLayoutParams();
       username.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float) dataheight/70);
       lp2.setMargins(dataheight/30, dataheight/ 20, 0, 0);*/

       ed1 = binding.ed1;
       LinearLayout.LayoutParams lp3 = (LinearLayout.LayoutParams) ed1.getLayoutParams();
       lp3.height = dataheight/8;
       lp3.width = dataheight-75;
        lp3.leftMargin = dataheight/19;

      /*  password = binding.password;
        LinearLayout.LayoutParams lp5 = (LinearLayout.LayoutParams) password.getLayoutParams();
        password.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float) dataheight/70);
        lp5.setMargins(dataheight/30, dataheight/ 20, 0, 0);*/

        ed2 = binding.ed2;
        LinearLayout.LayoutParams lp4 = (LinearLayout.LayoutParams) ed2.getLayoutParams();
        lp4.height = dataheight/9;
        lp4.width = dataheight-200;
        lp4.leftMargin = dataheight/19;

        ll11 = binding.ll11;
        LinearLayout.LayoutParams layoutParams11 = (LinearLayout.LayoutParams) ll11.getLayoutParams();
        layoutParams11.height = dataheight/8;
        layoutParams11.width = dataheight-75;
        layoutParams11.setMargins(0, dataheight/ 20, 0, 0);


        loginclick = binding.loginclick;
        LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) loginclick.getLayoutParams();
        layoutParams12.height = dataheight/9;
        layoutParams12.width = dataheight-75;
        layoutParams12.setMargins(0, dataheight/ 20, 0, 0);

        /*forgetpassword = binding.forgetpassword;
        LinearLayout.LayoutParams lp6 = (LinearLayout.LayoutParams) forgetpassword.getLayoutParams();
        forgetpassword.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float) dataheight/70);
        lp6.setMargins(dataheight/30, dataheight/ 20, 0, 0);*/


        /*registerhere = binding.registerhere;
        LinearLayout.LayoutParams lp7 = (LinearLayout.LayoutParams) forgetpassword.getLayoutParams();
        registerhere.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float) dataheight/70);
        lp7.setMargins(dataheight/30, dataheight/ 20, 0, 0);*/

   }

}
