package com.example.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.MyViewHolder> {


    //giving list of presidents
    List <President> presidentList;
    Context context;


    //constructor
    public RecyclerViewAdapter(List<President> presidentList, Context context) {
        this.presidentList = presidentList;
        this.context = context;
    }



    //contructor of above RecyclerView Adapter, below 3 of them
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.one_line_president, parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_president_Name.setText(presidentList.get(position).getName());
        holder.tv_president_Election_Date.setText(String.valueOf(presidentList.
                get(position).getDateOfElection()));


        //get the image from the prsident list and from the each position, then set that image into holder (model)
        Glide.with(this.context).load (presidentList.get(position).
                getImageURL()).into(holder.iv_president_Picture);




    }

    @Override
    public int getItemCount() {
        return presidentList.size();
    }






    //reference to the one line layout (model)
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_president_Picture;
        TextView tv_president_Name;
        TextView tv_president_Election_Date;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_president_Picture = itemView.findViewById(R.id.iv_presidentPicture);
            tv_president_Name = itemView.findViewById(R.id.tv_presidentName);
            tv_president_Election_Date = itemView.findViewById(R.id.tv_dateElection);

        }




    }
}
