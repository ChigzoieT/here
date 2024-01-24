package com.anslam.here;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class helplinerecycler  extends RecyclerView.Adapter<helplinerecycler.MyViewHolder> {
    Context context;
    ArrayList<helplinestorage> datastorage;

    public helplinerecycler(Context context, ArrayList<helplinestorage> datastorage) {
        this.context = context;
        this.datastorage= datastorage;
    }

    @NonNull
    @Override
    public helplinerecycler.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater lf = LayoutInflater.from(context);
        View view = lf.inflate(R.layout.helplinerecycler,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull helplinerecycler.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(datastorage.get(position).getImage());
        holder.imageView1.setImageResource(datastorage.get(position).getImage1());
    }

    @Override
    public int getItemCount() {
        return datastorage.size();
    }

    public  static  class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        ImageView imageView1;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.momimage);

            imageView = itemView.findViewById(R.id.callmom);
        }
    }


}
