package com.example.td5_les_listes.controllers;

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

import com.example.td5_les_listes.R;
import com.example.td5_les_listes.models.Contact;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private final List<Contact> contactList;

    public ContactAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*
         * déclarer le xml de la vue d’un item
         */
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_contact, parent, false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        /*
        * afficher les données passées en paramètres de l’adapter
        * */
        Contact contact = contactList.get(position);

        TextView nom = holder.nomTextView;
        nom.setText(contact.getNom());

        TextView prenom = holder.prenomTextView;
        prenom.setText(contact.getPrenom());

        ImageView imageView = holder.photoImageView;
        Glide.with(holder.itemView)
                .load(contact.getImageUrl())
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageView);
    }

    @Override
    public int getItemCount() {
        /*
        * déterminer le nombre d’éléments dans la liste
        * */
        return contactList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nomTextView;
        public TextView prenomTextView;
        public ImageView photoImageView;

        public ViewHolder(View itemView) {
            super(itemView);

            this.nomTextView = itemView.findViewById(R.id.txvNomContact);
            this.prenomTextView = itemView.findViewById(R.id.txvPrenomContact);
            this.photoImageView = itemView.findViewById(R.id.imgContact);
        }

    }
}
