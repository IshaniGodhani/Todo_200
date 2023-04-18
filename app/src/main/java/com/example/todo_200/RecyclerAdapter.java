package com.example.todo_200;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Activity activity;
    ArrayList<DataModel> list;
    public RecyclerAdapter(Activity activity, ArrayList<DataModel> list) {
        this.activity=activity;
        this.list=list;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.item_file,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        DataModel dataModel=list.get(position);

        int uid= dataModel.getUserid();
        int id= dataModel.getId();
        String title=dataModel.getTitle();
        String complete=dataModel.getCompleted();

        holder.Userid.setText(""+uid);
        holder.Id.setText(""+id);
        holder.Title.setText(""+title);
        holder.Complete.setText(""+complete);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Userid,Id,Title,Complete;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Userid=itemView.findViewById(R.id.item_uid);
            Id=itemView.findViewById(R.id.item_id);
            Title=itemView.findViewById(R.id.item_title);
            Complete=itemView.findViewById(R.id.item_completed);
        }
    }
}
