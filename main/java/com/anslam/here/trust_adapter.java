package com.anslam.here;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class trust_adapter extends RecyclerView.Adapter<trust_adapter.MyViewHolder> {

    Context context;
    ArrayList<trust_storage>trustStorages;


    public trust_adapter(Context context, ArrayList<trust_storage>trustStorages){
        this.context = context;
        this.trustStorages = trustStorages;
    }

     @NonNull
     @Override
     public trust_adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         LayoutInflater layoutInflater = LayoutInflater.from(context);
         View view = layoutInflater.inflate(R.layout.trust_recycler, parent, false);
         return new trust_adapter.MyViewHolder(view);
     }

     @Override
     public void onBindViewHolder(@NonNull trust_adapter.MyViewHolder holder, int position) {
         screenresolution scn = new screenresolution(context, 1);
         int dataheight = scn.heightvalue();

        holder.iv1.setImageResource(trustStorages.get(position).getImage());
        holder.string.setText(trustStorages.get(position).getS());
         LinearLayout.LayoutParams layoutParams15 = (LinearLayout.LayoutParams) holder.string.getLayoutParams();
         layoutParams15.setMargins(0, 0, dataheight/4, 0);
     }

     @Override
     public int getItemCount() {
         return trustStorages.size();
     }

     public static class MyViewHolder extends  RecyclerView.ViewHolder{

         ImageView iv1;
         TextView string;

         public MyViewHolder(@NonNull View itemView) {
             super(itemView);

             iv1 = itemView.findViewById(R.id.imv1);
             string = itemView.findViewById(R.id.txt);
         }
     }
 }
