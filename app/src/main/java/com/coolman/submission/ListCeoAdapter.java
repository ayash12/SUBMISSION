package com.coolman.submission;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCeoAdapter extends RecyclerView.Adapter<ListCeoAdapter.ListViewHolder>{
    private ArrayList<Ceo> listCeo;


    public ListCeoAdapter(ArrayList<Ceo>list){
        this.listCeo = list;
    }

    private OnItemClickCallback onItemClickCallback;



    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_ceo,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Ceo ceo = listCeo.get(position);

        Glide.with(holder.itemView.getContext())
                .load(ceo.getPhoto())
                .apply(new RequestOptions().override(100, 100))
                .into(holder.imgPhoto);

        holder.tvName.setText(ceo.getName());
        holder.tvDetail.setText(ceo.getDetail());
        holder.tvCekDetail.setText(ceo.getCekdetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listCeo.get(holder.getAdapterPosition()));
            }
        });


    }

    @Override
    public int getItemCount() {
        return listCeo.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvCekDetail;
        CardView cardView;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvCekDetail = itemView.findViewById(R.id.tv_item_cekdetail);
        }
}
    public interface OnItemClickCallback{
        void onItemClicked(Ceo data);
    }
}