package com.example.appels_reseaux;

import java.util.List;

public class Repositories {
    private List<Repo> items;

    public Repositories(List<Repo> items) {
        this.items = items;
    }

    public List<Repo> getItems() {
        return items;
    }

    public void setItems(List<Repo> items) {
        this.items = items;
    }
}
