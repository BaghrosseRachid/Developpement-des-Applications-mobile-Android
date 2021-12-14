package com.example.appels_reseaux;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RepositoryAdapter extends RecyclerView.Adapter<RepositoryAdapter.ViewHolder> {

    private final List<Repo> items;

    public RepositoryAdapter(List<Repo> items) {
        this.items = items;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nameTextView;
        public TextView fullNameTextView;
        public TextView htmlUrlTextView;

        public ViewHolder(View itemView){
            super(itemView);
            nameTextView = (TextView)itemView.findViewById(R.id.name);
            fullNameTextView = (TextView)itemView.findViewById(R.id.fullName);
            htmlUrlTextView =  (TextView) itemView.findViewById(R.id.htmlUrl);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater =LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_repository,parent,false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Repo repo =items.get(position);
        Context context = holder.itemView.getContext();
        TextView nameTextView = holder.nameTextView;
        nameTextView.setText(repo.getName());
        TextView fullNameTextView = holder.fullNameTextView;
        fullNameTextView.setText(repo.getFull_name());
        TextView htmlUrlTextView = holder.htmlUrlTextView;
        htmlUrlTextView.setText(repo.getHtml_url());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}