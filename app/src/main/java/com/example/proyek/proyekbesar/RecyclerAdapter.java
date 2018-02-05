package com.example.proyek.proyekbesar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Hudha on 1/15/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecycleViewHolder>{
    //deklarasi variable context
    private final Context context;

    String [] name={"Level 1","Level 2","Level 3","Level 4"};


    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_list, parent, false);
        RecycleViewHolder viewHolder=new RecycleViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);

    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//member aksi saat cardview diklik berdasarkan posisi tertentu
            RecycleViewHolder vholder = (RecycleViewHolder) v.getTag();

            int position = vholder.getPosition();


            if(position==0&&position<getItemCount()){
                Intent intent=new Intent(context, Level1.class);
                context.startActivity(intent);}

            if(position==1&&position<getItemCount()){
                Intent intent1=new Intent(context, Level2.class);
                context.startActivity(intent1);}

            if (position==2&&position<getItemCount()){
                Intent intent2=new Intent(context, Level3.class);
                context.startActivity(intent2);}

            if(position==3&&position<getItemCount()){
                Intent intent1=new Intent(context, Level4.class);
                context.startActivity(intent1);}

        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
