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

import vn.edu.usth.moodle.mainHome.RecentsData.ScienceBookData;

import java.util.List;

public class ScienceBookAdapter extends RecyclerView.Adapter<ScienceBookAdapter.ScienceBookViewHolder> {

    Context context;
    List<ScienceBookData> scienceBookDataList;

    public ScienceBookAdapter(Context context, List<ScienceBookData> scienceBookDataList) {
        this.context = context;
        this.scienceBookDataList = scienceBookDataList;
    }

    @NonNull
    @Override
    public ScienceBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.home_item, parent, false);

        return new ScienceBookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScienceBookViewHolder holder, int position) {

        holder.bookName.setText(scienceBookDataList.get(position).getBookName());
        holder.bookImage.setImageResource(scienceBookDataList.get(position).getImageUrl());

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
        return scienceBookDataList.size();
    }

    public static final class ScienceBookViewHolder extends RecyclerView.ViewHolder{

        ImageView bookImage;
        TextView bookName;

        public ScienceBookViewHolder(@NonNull View itemView) {
            super(itemView);

            bookImage = itemView.findViewById(R.id.book_image);
            bookName = itemView.findViewById(R.id.book_name);


        }
    }
}
