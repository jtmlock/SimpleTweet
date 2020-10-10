package com.codepath.apps.restclienttemplate;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TweetsAdapter extends  RecyclerView.Adapter<TweetsAdapter.ViewHolder>{

    Context conte
    //Pass in the context and list of tweets

    // For each row, inflate the layout
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    // Bind values based on the position of the element
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    // Define a viewholder
    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivProfileImage;
        TextView tvBody;
        TextView tvScreenName;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivProfileImage = itemView.findViewById(R.id.ivProfileImage);
            tvBody = itemView.findViewById(R.id.tvBody);
            tvScreenName = itemView.findViewById(R.id.tvScreenName);
        }
    }

}
