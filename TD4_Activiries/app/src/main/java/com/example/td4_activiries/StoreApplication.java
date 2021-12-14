package com.example.td4_activiries;

import android.app.Application;

public class StoreApplication extends Application {

    // Pour tester le login
    private String user_name_correct = "BAGHROSSERachid";
    private String password_correct = "Eilco2022";
    private String pseudo;

    @Override
    public void onCreate() {
        super.onCreate();
        this.pseudo = null;
    }

    public String getUser_name_correct() {
        return user_name_correct;
    }

    public String getPassword_correct() {
        return password_correct;
    }

    public void setUser_name_correct(String username) {
        this.user_name_correct = username;
    }

    public void setPassword_correct(String password) {
        this.password_correct = password;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
