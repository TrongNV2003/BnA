package vn.edu.usth.moodle.mainHome.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import vn.edu.usth.moodle.R;
import vn.edu.usth.moodle.mainHome.BookDetails.BookDetails;

import vn.edu.usth.moodle.mainHome.RecentsData.SpecializedBookData;

import java.util.List;

public class SpecializedBookAdapter extends RecyclerView.Adapter<SpecializedBookAdapter.SpecializedBookViewHolder> {

    Context context;
    List<SpecializedBookData> specializedBookDataList;

    public SpecializedBookAdapter(Context context, List<SpecializedBookData> specializedBookDataList) {
        this.context = context;
        this.specializedBookDataList = specializedBookDataList;
    }

    @NonNull
    @Override
    public SpecializedBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.home_item, parent, false);

        return new SpecializedBookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpecializedBookViewHolder holder, int position) {

        holder.bookName.setText(specializedBookDataList.get(position).getBookName());
        holder.bookImage.setImageResource(specializedBookDataList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context, BookDetails.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return specializedBookDataList.size();
    }

    public static final class SpecializedBookViewHolder extends RecyclerView.ViewHolder{

        ImageView bookImage;
        TextView bookName;

        public SpecializedBookViewHolder(@NonNull View itemView) {
            super(itemView);

            bookImage = itemView.findViewById(R.id.book_image);
            bookName = itemView.findViewById(R.id.book_name);


        }
    }
}
