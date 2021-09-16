package com.example.roomtorc.rc;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomtorc.R;
import com.example.roomtorc.room.DataEntity;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<DataEntity> dataEntities;

    public Adapter(ArrayList<DataEntity> dataEntities) {
        this.dataEntities = dataEntities;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(dataEntities.get(position));
    }

    @Override
    public int getItemCount() {
        return dataEntities.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        void onBind(DataEntity dataEntity){
            TextView textView = itemView.findViewById(R.id.tv_text);
            //Nampilin isi data pake method getData() di DAO karena tipe datanya disini bentuknye udeh object DataEntity, jdi
            //make getter buat ngambil datanye
            textView.setText(dataEntity.getData());
        }

    }
}
