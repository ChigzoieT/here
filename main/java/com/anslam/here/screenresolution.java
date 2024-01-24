package com.anslam.here;


import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

public class screenresolution {
    int position;
    Context context;
    public  screenresolution(Context context, int position){
        this.context = context;
        this.position = position;
    }

    public int returnheight(){
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        Log.d("MyAppTag", "This is a log message with an integer value: " + size.y);
        return size.y;
    }


    public int returnwidth(){
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
       return size.y;
    }

    public int heightvalue(){
        int hh =0;
        if(position == 1){
            hh = returnheight()/2;
        } else if (position == 2) {
            hh = returnheight()/5;
        }
        return hh;
    }

    public int widthvalue() {
        int xx = 0;
        if (position == 4) {
            xx = returnwidth() / 2;
        }
     return  xx;
    }

}
