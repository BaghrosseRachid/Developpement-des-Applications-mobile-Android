package com.example.td5_les_listes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import com.example.td5_les_listes.controllers.ContactAdapter;
import com.example.td5_les_listes.models.Contact;



public class ContactActivity extends AppCompatActivity {

    List<Contact> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        // Pointer vers le RecyleView
        RecyclerView rvContacts = findViewById(R.id.rvContacts);

        // Initialisation des contacts
        contactList.add(new Contact("BAGHROSSE", "Rachid", "https://www.linkpicture.com/q/rachid-link.jpg"));
        contactList.add(new Contact("AKOUCH", "Oumayma", "https://cdn.pixabay.com/photo/2015/07/09/00/29/woman-837156_960_720.jpg"));
        contactList.add(new Contact("Assilia", "Zineb", "https://cdn.pixabay.com/photo/2018/01/17/07/06/laptop-3087585_960_720.jpg"));

        contactList.add(new Contact("BAGHROSSE", "Achraf", "https://cdn.pixabay.com/photo/2020/03/02/02/51/children-4894710_960_720.jpg"));
        contactList.add(new Contact("BAGHROSSE", "Abdelilah", "https://cdn.pixabay.com/photo/2015/08/13/19/39/children-887393_960_720.jpg"));
        contactList.add(new Contact("BAGHROSSE", "Taoufik", "https://cdn.pixabay.com/photo/2016/01/03/09/33/boys-1119222__340.jpg"));
        contactList.add(new Contact("BAGHROSSE", "Abdellah", "https://cdn.pixabay.com/photo/2017/09/21/01/04/father-2770301_960_720.jpg"));
        contactList.add(new Contact("Elon", "Mask", "https://cdn.pixabay.com/photo/2016/10/08/22/34/tesla-1724773_960_720.jpg"));
        contactList.add(new Contact("CR", "Renaldo", "https://cdn.pixabay.com/photo/2016/08/24/23/08/cristiano-ronaldo-1618341_960_720.jpg"));
        contactList.add(new Contact("Last", "Person", "https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_960_720.jpg"));



        // creation d'un adapter
        ContactAdapter adapter = new ContactAdapter(contactList);
        // Notifier Recycle view
        rvContacts.setAdapter(adapter);
        // declarer le layout Manger
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

    }
}