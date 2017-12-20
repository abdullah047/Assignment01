package com.example.abdullah.assignment01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Contact {

    private String name;
    private String phone;
    private boolean gender;

    public Contact(String name, boolean gender) {
        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return isGender();
    }

    public void setGender(boolean mail) {
        boolean isGender = mail;
    }

    @Override
    public String toString() {
        boolean isGender = false;
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + isGender +
                '}';
    }
}
